package org.mrr.interpreters.core

import org.mrr.interpreters.api.Interpreter
import org.mrr.interpreters.api.*


class DefaultInterpreter : Interpreter {
    override fun parseSpecification(specification: String, delimiter: Char): TestCase {
        return TestCase(
                tokenizeSpec(specification, delimiter).mapNotNull { parseSingleStep(it) },
                null) //check logic still missing
    }
}

/**
 * Accepts as input a specification containing the description of more test steps, separated by a delimiter.
 * It returns a list of strings, each item in the list describing a single test step.
 */
private fun tokenizeSpec(spec: String, delimiter: Char) = spec.split(delimiter)

private val parseSingleStep = fun(singleStepSpecification: String): Step? {
    val repoKey = stepsRepository.keys.firstOrNull { singleStepSpecification.contains(it) }
    val stepType  = if(repoKey !== null){ stepsRepository[repoKey] } else {null}
    val target = targetFrom(singleStepSpecification)
    val value = valueFrom(singleStepSpecification)

    return if(stepType !== null && target !== null) { Step(stepType, target, value) } else {null}
    }

// Convention, the target is the first upper-case word
private val targetFrom = fun(specification: String): String? {
    return specification.split(" ")
            .filter { it.isNotEmpty() }
            .firstOrNull { isUpperCase(it) }
}

private val isUpperCase = fun(word: String): Boolean {return word.toUpperCase() == word}

private val valueFrom = fun(specification: String): String? {
    return if(specification.contains("'")) {
        specification.split("'")[1]
    } else { null }
}


private val stepsRepository = mapOf(
        "click on button" to StepType.CLICK,
        "click on link" to StepType.CLICK,
        "click button" to StepType.CLICK,
        "click link" to StepType.CLICK,
        "select checkbox" to StepType.SELECT_CHECKBOX,
        "select in dropdown" to StepType.SELECT_DROPDOWN,
        "deselect checkbox" to StepType.UNSELECT_CHECKBOX,
        "unselect checkbox" to StepType.UNSELECT_CHECKBOX,
        "type into textfield" to StepType.TYPE_INTO_TEXT_FIELD,
        "type into text field" to StepType.TYPE_INTO_TEXT_FIELD,
        "type in textfield" to StepType.TYPE_INTO_TEXT_FIELD,
        "type in text field" to StepType.TYPE_INTO_TEXT_FIELD
)

private val checkParser = fun(checkSpecification: String) = Check(type = CheckType.ELEMENT_PRESENT, target = checkSpecification)


