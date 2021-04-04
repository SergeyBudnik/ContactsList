package com.bdev.contacts_list.steps

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.bdev.contacts_list.R

object AutotestsStartFragmentSteps {
    fun clickStart() {
        onView(withId(R.id.autotestsStartButtonView)).perform(click())
    }
}