
package com.sweet.iva

/**
 * This is shared between :app and :benchmarks module to provide configurations type safety.
 */
enum class ProjectBuildTypes(val applicationIdSuffix: String? = null) {
    DEBUG(".debug"),
    RELEASE(".release"),
    BENCHMARK(".benchmark"),
}
