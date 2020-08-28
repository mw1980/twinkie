package org.mrr.selectors.puppeteer

import org.mrr.selectors.core.SelectorProviderFactory

private val puppeteerHtmlIdSelector  = fun (htmlId: String): String = "[id=\"$htmlId\"]"
private val puppeteerCssSelector  = fun (css: String): String = "[css=\"$css\"]"
private val puppeteerXPathSelector  = fun (xPath: String): String = "[xpath=\"$xPath\"]"
private val puppeteerDataTestIdSelector  = fun (dataTestId: String): String = "[data-testid==\"$dataTestId\"]"

class PuppeteerSelectorProviderFactory : SelectorProviderFactory {
    override fun htmlIdSelectorProvider(): (String) -> String {
        return puppeteerHtmlIdSelector
    }

    override fun cssSelectorProvider(): (String) -> String {
        return puppeteerCssSelector
    }

    override fun xPathSelectorProvider(): (String) -> String {
        return puppeteerXPathSelector
    }

    override fun dataTestIdSelectorProvider(): (String) -> String {
        return puppeteerDataTestIdSelector
    }
}