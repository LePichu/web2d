plugins {
    kotlin("multiplatform") version "1.7.0"
}

group = "dev.remod"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    wasm32 {
        binaries.executable {
            entryPoint("Main")
        }
    }

    js(IR) {
        binaries.executable()
        browser {
            commonWebpackConfig {
                cssSupport.enabled = true
            }
        }
    }
    sourceSets {
        val jsMain by getting
        val commonMain by getting
        val wasm32Main by getting
    }
}
