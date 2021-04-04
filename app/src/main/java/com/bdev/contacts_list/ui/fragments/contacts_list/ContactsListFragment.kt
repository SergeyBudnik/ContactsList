package com.bdev.contacts_list.ui.fragments.contacts_list

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.bdev.contacts_list.R
import com.bdev.contacts_list.interactors.contacts.ContactsProviderInteractor
import com.bdev.contacts_list.ui.fragments.BaseFragment
import com.bdev.contacts_list.ui.fragments.contacts_list.adapter.ContactsListAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_contacts_list.*
import javax.inject.Inject

@AndroidEntryPoint
class ContactsListFragment : BaseFragment(layoutId = R.layout.fragment_contacts_list) {
    @Inject lateinit var contactsProviderInteractor: ContactsProviderInteractor

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        contactsListView.layoutManager = LinearLayoutManager(
            context,
            LinearLayoutManager.VERTICAL,
            false
        )

        contactsListView.adapter = ContactsListAdapter(
            contacts = contactsProviderInteractor.getContacts(),
            itemClickAction = { contact ->
                findNavController().navigate(
                    ContactsListFragmentDirections.actionContactsListToContactDetails(
                        contactId = contact.id
                    )
                )
            }
        )
    }
}