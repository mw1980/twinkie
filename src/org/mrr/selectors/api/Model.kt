package org.mrr.selectors.api

enum class SelectorType {
    HTML_ID,
    CSS,
    XPATH,
    DATA_TEST_ID,
}

data class SelectorInfo(val type: SelectorType, val value: String)

data class UiElement(val name: String, val selectorInfo: SelectorInfo)
