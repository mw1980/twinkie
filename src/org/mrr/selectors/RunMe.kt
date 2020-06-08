package org.mrr.selectors

val uiElements = listOf(
        UiElement("userName", SelectorInfo(SelectorType.HTML_ID, "thiName")),
        UiElement("userPassword", SelectorInfo(SelectorType.CSS, "thiPassword")),
        UiElement("submitButton", SelectorInfo(SelectorType.XPATH, "submitForm"))
)

fun main() {

    println("----------------------------")
    uiElements.forEach(
            fun(uiElement) = println(" [${uiElement.name}, ${uiElement.selectorInfo.type}, ${uiElement.selectorInfo.value}]")
    )

    println("----------------------------")
    uiElements.forEach(fun(uiElement) =
            println(" [\"${uiElement.name}\" --> \"${selector(puppeteerFactory)(uiElement)}\"]"))
}
