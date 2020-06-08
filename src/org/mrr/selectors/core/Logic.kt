package org.mrr.selectors.core

import org.mrr.selectors.api.SelectorType
import org.mrr.selectors.api.UiElement


val selector = fun (factory: SelectorProviderFactory): (UiElement) -> String {
    return fun(uiElement: UiElement): String {
        val selectorType = uiElement.selectorInfo.type
        return when {
            selectorType == SelectorType.XPATH -> {
                factory.xPathSelectorProvider()(uiElement.name)
            }
            selectorType == SelectorType.HTML_ID -> {
                factory.htmlIdSelectorProvider()(uiElement.name)
            }
            selectorType === SelectorType.CSS -> {
                factory.cssSelectorProvider()(uiElement.name)
            }
            else -> "unknown"
        }
    }
}

