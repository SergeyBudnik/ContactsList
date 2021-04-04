package com.bdev.contacts_list.interactors.contacts

import com.bdev.contacts_list.data.Contact
import javax.inject.Inject

interface ContactsProviderInteractor {
    fun getContacts(): List<Contact>
    fun getContact(id: Int): Contact?
}

class ContactsProviderInteractorImpl @Inject constructor(
    private val contactsStorageInteractor: ContactsStorageInteractor
): ContactsProviderInteractor {
    override fun getContacts(): List<Contact> {
        return contactsStorageInteractor.getContacts().values.toList()
    }

    override fun getContact(id: Int): Contact? {
        return contactsStorageInteractor.getContacts()[id]
    }
}