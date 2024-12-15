plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
    alias(libs.plugins.dagger.hilt)
    id("com.google.devtools.ksp") version "1.9.0-1.0.12" // Dodajte KSP plugin
}

android {
    namespace = "com.example.studybud"
    compileSdk = 35 //stavi na ovo zbog nekih dependencya

    defaultConfig {
        applicationId = "com.example.studybud"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
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
        isCoreLibraryDesugaringEnabled = true; //upotreba nohiv java api funkcionalnosti unesi u cgpt Desugaring
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)
    implementation("androidx.compose.ui:ui-text-google-fonts:1.7.5")

    /*BITNO ZA SKONTATI pitaj neki ai kurac
    Desugaring je proces koji omogućava korišćenje novih Java API funkcionalnosti
    (koje su uvedene u Java 8, 9, 10 i novije) na starijim verzijama Android-a.
    Ovo je korisno jer mnogi moderni Java API-ji (kao što su java.time, java.util.stream,
    default methods u interfejsima) nisu direktno podržani na uređajima sa
    starijim verzijama Android-a (API 21+).
    * */
    coreLibraryDesugaring("com.android.tools:desugar_jdk_libs:2.0.3")

    //ovo ubacujem za hilt i ksp
    implementation("com.google.dagger:hilt-android:2.48")
    ksp("com.google.dagger:hilt-compiler:2.48")

    // Room dependencies- https://developer.android.com/training/data-storage/room
        val room_version = "2.6.1"
        implementation("androidx.room:room-runtime:$room_version")
        // If this project uses any Kotlin source, use Kotlin Symbol Processing (KSP)
        // See Add the KSP plugin to your project
        ksp("androidx.room:room-compiler:$room_version")
        // No additional plugins are necessary
        annotationProcessor("androidx.room:room-compiler:$room_version")
        // optional - Kotlin Extensions and Coroutines support for Room
        implementation("androidx.room:room-ktx:$room_version")

    //šminka font
    implementation("androidx.compose.ui:ui-text-google-fonts:1.7.5")


}
