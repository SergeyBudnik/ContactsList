package com.bdev.contacts_list.steps

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.bdev.contacts_list.R

object ContactDetailsFragmentSteps {
    fun verifyName(name: String) {
        onView(withId(R.id.contactDetailsNameView)).check(matches(withText(name)))
    }
}