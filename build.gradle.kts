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
            entryPoint("main")
        }
    }
    sourceSets {
        val wasm32Main by getting
    }
}
