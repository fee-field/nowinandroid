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

import androidx.compose.ui.semantics.SemanticsNode
import androidx.compose.ui.test.SemanticsNodeInteractionsProvider
import com.google.samples.apps.nowinandroid.core.designsystem.C
import io.github.kakaocup.compose.node.element.KNode
import io.github.kakaocup.compose.node.element.lazylist.KLazyListItemNode

class NewsFeedItems(semanticsNode: SemanticsNode,
    semanticsProvider: SemanticsNodeInteractionsProvider,
) : KLazyListItemNode<NewsFeedItems>(semanticsNode, semanticsProvider) {

    val feedItemImage = child<KNode>{
        hasTestTag(C.FEED_ICON)
    }

    val feedItemTitle = child<KNode> {
        hasTestTag(C.FEED_TITLE)
    }

    val feedItemDate = child<KNode> {
        hasTestTag(C.FEED_DATE)

    }

    val feedItemDescription = child<KNode> {
        hasTestTag(C.FEED_DESCRIPTION)
    }

}