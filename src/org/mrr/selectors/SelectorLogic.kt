package org.mrr.selectors

fun selector(selectorFactory: SelectorFactory): (UiElement) -> String {
    return fun(uiElement: UiElement): String {
        val selectorType = uiElement.selectorInfo.type
        return when {
            selectorType == SelectorType.XPATH -> {
                selectorFactory.selectorForXPath()(uiElement.name)
            }
            selectorType == SelectorType.HTML_ID -> {
                selectorFactory.selectorForHtmlId()(uiElement.name)
            }
            selectorType === SelectorType.CSS -> {
                selectorFactory.selectorForCss()(uiElement.name)
            }
            else -> "unknown"
        }
    }
}
