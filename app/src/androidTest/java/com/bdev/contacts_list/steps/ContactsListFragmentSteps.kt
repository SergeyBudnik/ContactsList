package com.bdev.contacts_list.steps

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.bdev.contacts_list.R
import com.bdev.contacts_list.ui.fragments.contacts_list.adapter.ContactsListAdapterViewHolder

object ContactsListFragmentSteps {
    fun clickListItem(position: Int) {
        onView(withId(R.id.contactsListView)).perform(
            RecyclerViewActions.actionOnItemAtPosition<ContactsListAdapterViewHolder>(
                position, click()
            )
        )
    }
}