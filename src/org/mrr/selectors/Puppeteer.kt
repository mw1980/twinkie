package org.mrr.selectors

fun puppeteerHtmlIdSelector (htmlId: String): String = "[id=\"$htmlId\"]"
fun puppeteerCssSelector(css: String): String = "[css=\"$css\"]"
fun puppeteerXpathSelector(xpath: String): String =  "[xpath=\"$xpath\"]"

val puppeteerSelectorsFactory = mapOf<SelectorType, (String)-> String>(
        SelectorType.HTML_ID to ::puppeteerHtmlIdSelector,
        SelectorType.CSS to ::puppeteerCssSelector,
        SelectorType.XPATH to ::puppeteerXpathSelector
)
