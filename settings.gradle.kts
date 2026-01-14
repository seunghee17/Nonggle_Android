pluginManagement {
    includeBuild("build-logic")
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "NonggleResume"
include(":app")

// core 모듈
include(":core:data")
include(":core:designsystem")

include(":presentation")
include(":presentation:home")
include(":presentation:download")
include(":presentation:setting")
include(":feature:home")
include(":core:domain")
