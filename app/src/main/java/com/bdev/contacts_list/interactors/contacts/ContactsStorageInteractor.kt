package com.bdev.contacts_list.interactors.contacts

import com.bdev.contacts_list.data.Contact
import javax.inject.Inject

interface ContactsStorageInteractor {
    fun getContacts(): Map<Int, Contact>
}

class ContactsStorageInteractorImpl @Inject constructor(): ContactsStorageInteractor {
    override fun getContacts(): Map<Int, Contact> {
        return listOf(
            Contact(id = 1, name = "Sergey Budnik", phone = "+79219236357"),
            Contact(id = 2, name = "Ekaterina Kryukova", phone = "+79130426630")
        ).map {
            it.id to it
        }.toMap()
    }
}