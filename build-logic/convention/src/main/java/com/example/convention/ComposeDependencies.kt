package com.example.convention

import org.gradle.api.Project
import org.gradle.kotlin.dsl.DependencyHandlerScope

fun DependencyHandlerScope.addUILayerDependencies(project: Project) {
    add("implementation", project.libs.findBundle("compose").get())
    add("debugImplementation", project.libs.findBundle("compose.debug").get())
    add("androidTestImplementation", project.libs.findLibrary("androidx.compose.ui.test.junit4").get())
    //add("implementation", project.libs.findBundle("nav3").get())
}