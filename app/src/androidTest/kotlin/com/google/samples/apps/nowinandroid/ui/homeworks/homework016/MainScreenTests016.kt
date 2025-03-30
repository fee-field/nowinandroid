/*
 * Copyright 2025 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.samples.apps.nowinandroid.ui.homeworks.homework016

import androidx.compose.ui.test.ExperimentalTestApi
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import com.google.samples.apps.nowinandroid.MainActivity
import com.google.samples.apps.nowinandroid.ui.homeworks.homework015.MainScreen
import com.google.samples.apps.nowinandroid.ui.homeworks.homework015.SearchScreen
import com.kaspersky.components.composesupport.config.withComposeSupport
import com.kaspersky.kaspresso.kaspresso.Kaspresso.Builder
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import org.junit.Rule
import kotlin.test.Test

class MainScreenTests016 : TestCase(Builder.withComposeSupport()) {
    @get:Rule
    val composeTestRule = createAndroidComposeRule<MainActivity>()
    val mainScreen = MainScreen016(composeTestRule)
    val topicScreen = TopicSelectionScreen(composeTestRule)

    @OptIn(ExperimentalTestApi::class)
    @Test
    fun navBarVerification() {
        run {
            step("Verify Top Navigation bar title text") {
                mainScreen.titleTopBar.assertTextEquals("Now in Android")
            }
            step("Ensure that Topic Selection elements are showing") {
                topicScreen.items.childAt<TopicSelectionItems>(0) {
                    topicIconImage.assertIsDisplayed()
                    topicText.assertIsDisplayed()
                    topicUncheckButton.assertIsDisplayed()
                }
            }
            step("Click Topic Selection element with index = [0]") {
                topicScreen {
                    items.childAt<TopicSelectionItems>(0) {
                        topicUncheckButton.performClick()
                    }
                }
            }
            step("Ensure that the element with index = [0] is showing") {
                topicScreen {
                    items.childAt<NewsFeedItems>(0) {
                        feedItemTitle.assertIsDisplayed()
                    }

                }
            }
        }
    }
}