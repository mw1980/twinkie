package org.mrr.selectors

enum class SelectorType {
    HTML_ID,
    CSS,
    XPATH
}


fun selectorInputForElement(elementName: String, elements: Map<String, Pair<SelectorType, String>>): Pair<SelectorType, String>? {
    return elements
            .filter { (key, _) -> elementName == key }
            .map { (_, value) -> value }
            .firstOrNull()
}
