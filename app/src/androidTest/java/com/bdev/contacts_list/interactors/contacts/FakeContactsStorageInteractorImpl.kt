package com.bdev.contacts_list.interactors.contacts

import com.bdev.contacts_list.data.Contact
import javax.inject.Inject

class FakeContactsStorageInteractorImpl @Inject constructor(): ContactsStorageInteractor {
    companion object {
        var contacts: Map<Int, Contact> = emptyMap()
    }

    override fun getContacts(): Map<Int, Contact> {
        return contacts
    }
}