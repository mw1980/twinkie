package org.mrr.interpreters.api


data class TestCase(val steps: List<Step>, val check: Check?)

/**
 * @param target - the name of the element that is the target of the action.
 * @param value - optional, additional information needed to perform the action, like: the text to enter into an edit
 * field.
 */
data class Step(val type: StepType, val target: String, val value: String? = null)

enum class StepType {
    CLICK,
    SELECT_CHECKBOX,
    SELECT_DROPDOWN,
    TYPE_INTO_TEXT_FIELD,
    UNSELECT_CHECKBOX,
}

data class Check(val type: CheckType, val target: String, val expected: String? = null)

enum class CheckType {
    ELEMENT_PRESENT,
    VAlUE
}

