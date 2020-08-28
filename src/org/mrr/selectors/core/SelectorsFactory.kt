package org.mrr.selectors.core

interface SelectorProviderFactory {
    fun htmlIdSelectorProvider(): (String) -> String
    fun cssSelectorProvider(): (String) -> String
    fun xPathSelectorProvider(): (String) -> String
    fun dataTestIdSelectorProvider(): (String) -> String
}
