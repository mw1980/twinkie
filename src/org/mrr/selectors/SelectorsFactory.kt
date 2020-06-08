package org.mrr.selectors

val puppeteerFactory: SelectorFactory = PuppeteerSelectorFactory()

interface SelectorFactory {
    fun selectorForHtmlId(): (String) -> String
    fun selectorForCss(): (String) -> String
    fun selectorForXPath(): (String) -> String
}

class PuppeteerSelectorFactory : SelectorFactory {
    override fun selectorForHtmlId(): (String) -> String {
        return fun(htmlId: String): String = "[id=\"$htmlId\"]"
    }

    override fun selectorForCss(): (String) -> String {
        return fun(css: String): String = "[css=\"$css\"]"
    }

    override fun selectorForXPath(): (String) -> String {
        return fun(xpath: String): String = "[xpath=\"$xpath\"]"
    }
}