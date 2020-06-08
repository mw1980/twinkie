package org.mrr.selectors.api

interface SelectorLogic {
    fun selectorFor(uiElement: UiElement): String
}