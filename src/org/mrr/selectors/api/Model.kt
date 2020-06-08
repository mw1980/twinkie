package org.mrr.selectors.api

enum class SelectorType {
    HTML_ID,
    CSS,
    XPATH
}

data class SelectorInfo(val type: SelectorType, val value: String)

data class UiElement(val name: String, val selectorInfo: SelectorInfo)
