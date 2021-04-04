package com.bdev.contacts_list.interactors.contacts

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class ContactsModule {
    @Suppress("UNUSED")
    @Singleton @Binds abstract fun bindContactsProviderInteractor(
        contactsProviderInteractor: ContactsProviderInteractorImpl
    ): ContactsProviderInteractor

    @Suppress("UNUSED")
    @Singleton @Binds abstract fun bindContactsStorageInteractor(
        contactsStorageInteractor: ContactsStorageInteractorImpl
    ): ContactsStorageInteractor
}