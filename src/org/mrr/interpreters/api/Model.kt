package org.mrr.interpreters.api

import org.mrr.selectors.api.UiElement

data class Step(val action: Action, val target: UiElement, val value: String?)

data class TestAction(val steps: List<Step>, val check: Check?)

enum class Action {
    CLICK,
    SELECT,
    EDIT_TEXT_FIELD
}

enum class Check {
    ELEMENT_PRESENT,
    VAlUE
}

