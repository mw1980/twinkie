package org.mrr.interpreters

import org.mrr.interpreters.api.TestAction

interface Interpreter {
    fun parseSpecification(specification: String): List<TestAction>
}