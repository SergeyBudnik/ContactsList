package com.bdev.contacts_list.interactors.contacts

import dagger.Binds
import dagger.Module
import dagger.hilt.components.SingletonComponent
import dagger.hilt.testing.TestInstallIn
import javax.inject.Singleton

@Module
@TestInstallIn(components = [SingletonComponent::class], replaces = [ContactsModule::class])
abstract class FakeContactsModule {
    @Suppress("UNUSED")
    @Singleton @Binds abstract fun bindContactsProviderInteractor(
        contactsProviderInteractor: ContactsProviderInteractorImpl
    ): ContactsProviderInteractor

    @Suppress("UNUSED")
    @Singleton @Binds abstract fun bindContactsStorageInteractor(
        contactsStorageInteractor: FakeContactsStorageInteractorImpl
    ): ContactsStorageInteractor
}