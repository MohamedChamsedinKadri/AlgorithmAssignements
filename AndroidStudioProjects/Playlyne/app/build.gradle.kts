plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.example.playlyne"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.playlyne"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    // Jetpack Compose
    implementation ("androidx.activity:activity-compose:1.7.0")
    implementation ("androidx.compose.material3:material3:1.1.0")
    implementation ("androidx.compose.ui:ui-tooling-preview:1.5.0")
    implementation ("androidx.navigation:navigation-compose:2.7.0")

    //exoplayer
    implementation("com.google.android.exoplayer:exoplayer:2.19.1")

    //camerax
    implementation("androidx.camera:camera-camera2:1.3.0-alpha04")
    implementation("androidx.camera:camera-lifecycle:1.3.0-alpha04")
    implementation("androidx.camera:camera-view:1.3.0-alpha04")
    implementation("androidx.camera:camera-core:1.3.0")

    //iptv user
    implementation("com.github.vitalets:m3u-parser:1.0.0")

    //guide for image loading
    implementation("com.github.vitalets:m3u-parser:1.0.0")




}