package com.bdev.contacts_list.ui.fragments.autotests

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.bdev.contacts_list.R
import com.bdev.contacts_list.ui.fragments.BaseFragment
import kotlinx.android.synthetic.main.fragment_autotests_start.*

class AutotestsStartFragment : BaseFragment(R.layout.fragment_autotests_start) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        autotestsStartButtonView.setOnClickListener {
            findNavController().navigate(
                AutotestsStartFragmentDirections.actionAutotestsStartToContactsList()
            )
        }
    }
}