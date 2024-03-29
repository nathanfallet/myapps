plugins {
    id("com.android.application")
    kotlin("android")
    id("org.jetbrains.compose")
}

android {
    namespace = "me.nathanfallet.myapps.sample"
    compileSdk = 34
    defaultConfig {
        applicationId = "me.nathanfallet.myapps.sample"
        minSdk = 21
        targetSdk = 34
        versionCode = 1
        versionName = "1.3.0"
    }
    buildFeatures {
        compose = true
        viewBinding = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.5"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_19
        targetCompatibility = JavaVersion.VERSION_19
    }
    kotlinOptions {
        jvmTarget = "19"
    }
}

dependencies {
    implementation(project(":myapps-android-compose"))
    implementation(project(":myapps-android-preferences"))
    implementation(project(":myapps-android-recyclerview"))

    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.compose.ui:ui:1.6.4")
    implementation("androidx.compose.material3:material3:1.2.1")
    implementation("androidx.datastore:datastore-preferences:1.0.0")
    implementation("androidx.preference:preference-ktx:1.2.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("com.github.JamalMulla:ComposePrefs3:1.0.4")
}
