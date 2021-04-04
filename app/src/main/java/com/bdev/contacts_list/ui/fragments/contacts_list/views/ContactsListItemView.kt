package com.bdev.contacts_list.ui.fragments.contacts_list.views

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.RelativeLayout
import com.bdev.contacts_list.R
import com.bdev.contacts_list.data.Contact
import kotlinx.android.synthetic.main.view_contacts_list_item.view.*

class ContactsListItemView : RelativeLayout {
    constructor(context: Context) : super(context) {
        View.inflate(context, R.layout.view_contacts_list_item, this)
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        View.inflate(context, R.layout.view_contacts_list_item, this)
    }

    fun bind(contact: Contact, clickAction: (Contact) -> Unit) {
        contactsListItemRootView.setOnClickListener {
            clickAction(contact)
        }

        contactsListItemNameView.text = contact.name
    }
}