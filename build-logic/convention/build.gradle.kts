plugins {
    `kotlin-dsl`
}

group = "com.example.buildlogic"


dependencies {
    compileOnly(libs.android.gradlePlugin)
    compileOnly(libs.android.tools.common)
    compileOnly(libs.kotlin.gradlePlugin)
    compileOnly(libs.ksp.gradlePlugin)
}

gradlePlugin {
    plugins {
        register("androidApplication") {
            id = "example.nonggle.android.application"
            implementationClass = "AndroidApplicationConventionPlugin"
        }
    }
}
