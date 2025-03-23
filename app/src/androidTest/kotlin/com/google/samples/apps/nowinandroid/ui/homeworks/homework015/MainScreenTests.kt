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

package com.google.samples.apps.nowinandroid.ui.homeworks.homework015

import androidx.compose.material3.rememberSearchBarState
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import com.google.samples.apps.nowinandroid.MainActivity
import com.kaspersky.components.composesupport.config.withComposeSupport
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import com.kaspersky.kaspresso.kaspresso.Kaspresso.Builder
import kotlinx.coroutines.supervisorScope
import org.junit.Rule
import kotlin.test.Test

class MainScreenTest: TestCase(Builder.withComposeSupport()) {
    @get:Rule
    val composeTestRule = createAndroidComposeRule<MainActivity>()
    val mainScreen = MainScreen(composeTestRule)
    val searchScreen = SearchScreen(composeTestRule)

    @Test
    fun navBarVerification() {
        run {
            step("Verify Top Navigation bar title text") {
                mainScreen.titleTopBar.assertTextEquals("Now in Android")
            }

            step("Verify Top Navigation Bar Settings Icon") {
                mainScreen.settingsIcon.perform {
                    assertIsDisplayed()
//                    assertTextContains("Settings")
//                    performClick()
                }
            }
            step("Verify Top Navigation Search Bar Icon and click on it") {
                mainScreen.searchIcon.perform {
                    assertIsDisplayed()
//                    assertIsSelectable()
                    performClick()
                }
            }
            step("Ensure search icon is displayed") {
                searchScreen.searchBarIcon.perform {
                    assertIsDisplayed()
                    assertContentDescriptionEquals("Search")
                }
            }
            step("Ensure search text field is displayed and enter any text") {
                searchScreen.searchTextField.perform {
                    assertIsDisplayed()
                    performTextInput("bla-bla")
                }
            }
            step("Ensure Back button is working") {
                searchScreen.backButton.performClick()
            }
        }
    }

}