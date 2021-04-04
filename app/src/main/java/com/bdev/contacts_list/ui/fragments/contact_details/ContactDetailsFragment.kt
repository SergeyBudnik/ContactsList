package com.bdev.contacts_list.ui.fragments.contact_details

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.navArgs
import com.bdev.contacts_list.R
import com.bdev.contacts_list.interactors.contacts.ContactsProviderInteractor
import com.bdev.contacts_list.ui.fragments.BaseFragment
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_contact_details.*
import javax.inject.Inject

@AndroidEntryPoint
class ContactDetailsFragment : BaseFragment(layoutId = R.layout.fragment_contact_details) {
    @Inject lateinit var contactsProviderInteractor: ContactsProviderInteractor

    private val args: ContactDetailsFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val contact = contactsProviderInteractor.getContact(id = args.contactId)

        if (contact != null) {
            contactDetailsNameView.text = contact.name
        }
    }
}