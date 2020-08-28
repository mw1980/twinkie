package org.mrr.interpreters.api


interface Interpreter {
    fun parseSpecification(specification: String, delimiter: Char = ';'): TestCase
}