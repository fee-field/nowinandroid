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

import androidx.compose.ui.test.SemanticsNodeInteractionsProvider
import io.github.kakaocup.compose.node.element.ComposeScreen
import com.kaspersky.components.composesupport.core.KNode
import com.google.samples.apps.nowinandroid.core.designsystem.C

class MainScreen016(semanticProvides: SemanticsNodeInteractionsProvider) :
    ComposeScreen<MainScreen016>(semanticProvides) {

    val titleTopBar = KNode(semanticProvides) {
        hasTestTag(C.TOP_BAR_TITLE)
        useUnmergedTree = true
    }

    val searchIcon = KNode(semanticProvides) {
        hasTestTag(C.TOP_BAR_SEARCH_ICON)
        useUnmergedTree = true
    }

    val settingsIcon = KNode(semanticProvides) {
        hasTestTag(C.TOP_SETTINGS_ICON)
        useUnmergedTree = true
    }

    val interestsItemHeader = KNode(semanticProvides) {
        hasTestTag(C.INTERESTS_ITEM_HEADER)
        useUnmergedTree = true
    }

    val interestsIcon = KNode(semanticProvides) {
        hasText("Interests")
    }

    val doneButton = KNode(semanticProvides) {
        hasTestTag(C.DONE_BUTTON)
        useUnmergedTree = true
    }


}