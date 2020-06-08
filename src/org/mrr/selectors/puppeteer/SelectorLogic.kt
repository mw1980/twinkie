package org.mrr.selectors.puppeteer

import org.mrr.selectors.api.SelectorLogic
import org.mrr.selectors.api.UiElement
import org.mrr.selectors.core.SelectorProviderFactory
import org.mrr.selectors.core.selector

val puppeteerFactory: SelectorProviderFactory = PuppeteerSelectorProviderFactory()

class PuppeteerSelectorLogic: SelectorLogic {
    override fun selectorFor(uiElement: UiElement): String {
        return selector(puppeteerFactory)(uiElement)
    }
}