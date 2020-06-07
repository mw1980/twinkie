package org.mrr.selectors

val selectorsFactory = puppeteerSelectorsFactory

val maskElements = mapOf(
        "userName" to Pair(SelectorType.HTML_ID, "thiName"),
        "userPassword" to Pair(SelectorType.CSS, "thiPassword"),
        "submitButton" to Pair(SelectorType.XPATH, "submitForm")
)

fun main() {
    maskElements.forEach(
            fun(maskElement) = println(" [${maskElement.key}, ${maskElement.value.first}, ${maskElement.value.second}]")
    )

    println("----------------------------")
    maskElements.forEach(fun(maskElement) =
            println(" [\"${maskElement.key}\" --> \"${selectorsFactory[maskElement.value.first]?.invoke(maskElement.value.second)}\"]"))

    println("----------------------------")
    println("The selector for element: userPassword is ${selectorInputForElement("""userPassword""", maskElements)}")
}
