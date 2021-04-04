package com.bdev.contacts_list.ui.fragments.contacts_list.adapter

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bdev.contacts_list.data.Contact
import com.bdev.contacts_list.ui.fragments.contacts_list.views.ContactsListItemView

class ContactsListAdapter(
    private val contacts: List<Contact>,
    private val itemClickAction: (Contact) -> Unit
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ContactsListAdapterViewHolder(
            view = ContactsListItemView(parent.context),
            itemClickAction = itemClickAction
        )
    }

    override fun getItemCount(): Int = contacts.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as ContactsListAdapterViewHolder).bind(
            contact = contacts[position]
        )
    }
}

class ContactsListAdapterViewHolder(
    view: View,
    private val itemClickAction: (Contact) -> Unit
): RecyclerView.ViewHolder(view) {
    fun bind(contact: Contact) {
        (itemView as ContactsListItemView).bind(
            contact = contact,
            clickAction = itemClickAction
        )
    }
}

