package com.bdev.contacts_list

import com.bdev.contacts_list.data.Contact
import com.bdev.contacts_list.interactors.contacts.ContactsProviderInteractorImpl
import com.bdev.contacts_list.interactors.contacts.ContactsStorageInteractor
import org.junit.Assert.assertEquals
import org.junit.Test
import org.mockito.Mockito

class ContactsProviderInteractorImplTest {
    @Test
    fun `test that existing contact can be found by id`() {
        val contactsStorageInteractorMock = Mockito.mock(ContactsStorageInteractor::class.java)

        Mockito.`when`(contactsStorageInteractorMock.getContacts()).thenReturn(
            listOf(
                Contact(id = 1, name = "test name 1", phone = "test phone 1"),
                Contact(id = 2, name = "test name 2", phone = "test phone 2"),
                Contact(id = 3, name = "test name 3", phone = "test phone 3")
            ).map { it.id to it }.toMap()
        )

        val contactsProviderInteractor = ContactsProviderInteractorImpl(
            contactsStorageInteractor = contactsStorageInteractorMock
        )

        assertEquals(
            Contact(id = 1, name = "test name 1", phone = "test phone 1"),
            contactsProviderInteractor.getContact(id = 1)
        )
    }
}