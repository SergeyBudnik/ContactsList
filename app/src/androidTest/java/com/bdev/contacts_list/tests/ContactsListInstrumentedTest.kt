package com.bdev.contacts_list.tests

import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.bdev.contacts_list.data.Contact
import com.bdev.contacts_list.interactors.contacts.ContactsModule
import com.bdev.contacts_list.interactors.contacts.FakeContactsStorageInteractorImpl
import com.bdev.contacts_list.steps.AutotestsStartFragmentSteps
import com.bdev.contacts_list.steps.ContactDetailsFragmentSteps
import com.bdev.contacts_list.steps.ContactsListFragmentSteps
import com.bdev.contacts_list.ui.activities.ContactsListActivity
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import dagger.hilt.android.testing.UninstallModules
import org.junit.Rule
import org.junit.Test

@HiltAndroidTest
@UninstallModules(ContactsModule::class)
class ContactsListInstrumentedTest {
    @get:Rule(order = 0) var hiltRule = HiltAndroidRule(this)
    @get:Rule(order = 1) var activityRule = ActivityScenarioRule(ContactsListActivity::class.java)

    @Test
    fun testContactDetailsIsOpenedFromContactsList() {
        FakeContactsStorageInteractorImpl.contacts = listOf(
            Contact(id = 1, name = "test name 1", phone = "test phone 1"),
            Contact(id = 2, name = "test name 2", phone = "test phone 2"),
            Contact(id = 3, name = "test name 3", phone = "test phone 3")
        ).map { it.id to it }.toMap()

        AutotestsStartFragmentSteps.clickStart()

        ContactsListFragmentSteps.clickListItem(position = 1)

        ContactDetailsFragmentSteps.verifyName("test name 2")
    }
}