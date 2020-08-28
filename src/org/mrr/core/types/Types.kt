package org.mrr.core.types

data class Either<T>(private val left: Exception, private val right: T)