package com.bdev.contacts_list.ui.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import com.bdev.contacts_list.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
open class ContactsListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        (supportFragmentManager.findFragmentById(R.id.contactsListNavHostFragment) as NavHostFragment)
            .navController
            .navigate(R.id.AutotestsStartFragment)
    }
}