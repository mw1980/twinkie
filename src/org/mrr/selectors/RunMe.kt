package org.mrr.selectors

import org.mrr.selectors.api.SelectorInfo
import org.mrr.selectors.api.SelectorLogic
import org.mrr.selectors.api.SelectorType
import org.mrr.selectors.api.UiElement
import org.mrr.selectors.puppeteer.PuppeteerSelectorLogic

val uiElements = listOf(
        UiElement("userName", SelectorInfo(SelectorType.HTML_ID, "thiName")),
        UiElement("userPassword", SelectorInfo(SelectorType.CSS, "thiPassword")),
        UiElement("submitButton", SelectorInfo(SelectorType.XPATH, "submitForm"))
)

val selectorLogic: SelectorLogic = PuppeteerSelectorLogic()

fun main() {

    println("----------------------------")
    uiElements.forEach(
            fun(uiElement) = println(" [${uiElement.name}, ${uiElement.selectorInfo.type}, ${uiElement.selectorInfo.value}]")
    )

    println("----------------------------")
    uiElements.forEach(fun(uiElement) =
            println(" [\"${uiElement.name}\" --> \"${selectorLogic.selectorFor(uiElement)}\"]"))
}
