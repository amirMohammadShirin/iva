plugins {
    alias(libs.plugins.my.android.library)
    alias(libs.plugins.my.android.hilt)
}

android {
    namespace = "com.sweet.arch.core.cache"
}

dependencies {
    implementation(projects.core.domain)

    implementation(libs.kotlinx.coroutines.android)
    implementation(libs.gson)
}
