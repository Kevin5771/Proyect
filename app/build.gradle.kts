plugins {
    id ("com.android.application")
    id ("org.jetbrains.kotlin.android")
    id ("com.google.gms.google-services")
    id ("kotlin-kapt")
    id ("com.google.dagger.hilt.android")
}

android {
    namespace "com.albrodiaz.gestvet"
    compileSdk 34

    defaultConfig {
        applicationId "com.albrodiaz.gestvet"
        minSdk 26
        targetSdk 33
        versionCode 1
        versionName "1.0"

        testInstrumentationRunner "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary true
        }
    }

    buildTypes {
        release {
            minifyEnabled false
            proguardFiles getDefaultProguardFile('proguard-android-optimize.txt'), 'proguard-rules.pro'
        }
    }
    compileOptions {
        sourceCompatibility JavaVersion.VERSION_17
                targetCompatibility JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        compose true
    }
    composeOptions {
        kotlinCompilerExtensionVersion "1.4.2"
    }
    packagingOptions {
        resources {
            excludes +=   "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation('androidx.core:core-ktx:1.10.0')
    implementation('androidx.lifecycle:lifecycle-runtime-ktx:2.6.1')
    implementation('androidx.activity:activity-compose:1.7.0')
    implementation("androidx.compose.ui:ui:1.4.1")
    implementation("androidx.compose.ui:ui-tooling-preview:1.4.1")
    implementation('androidx.compose.material:material:1.4.1')
    testImplementation('junit:junit:4.13.2')
    androidTestImplementation('androidx.test.ext:junit:1.1.5')
    androidTestImplementation('androidx.test.espresso:espresso-core:3.5.1')
    androidTestImplementation("androidx.compose.ui:ui-test-junit4:1.4.1")
    debugImplementation("androidx.compose.ui:ui-tooling:1.4.1")
    debugImplementation("androidx.compose.ui:ui-test-manifest:1.4.1")
    // Material 3
    implementation("androidx.compose.material3:material3:1.1.0-beta02")
    implementation("androidx.compose.material3:material3-window-size-class:1.1.0-beta02")
    implementation("androidx.compose.material:material-icons-extended:1.4.1")
    // Lottie
    implementation("com.airbnb.android:lottie-compose:6.0.0")
    // ConstraintLayout
    implementation("androidx.constraintlayout:constraintlayout-compose:1.0.1")
    // Dagger Hilt
    implementation("com.google.dagger:hilt-android:2.44")
    implementation("androidx.hilt:hilt-navigation-compose:1.0.0")
    kapt("com.google.dagger:hilt-compiler:2.44")
    // LiveData
    implementation('androidx.lifecycle:lifecycle-runtime-ktx:2.6.1')
    implementation("androidx.compose.runtime:runtime-livedata:1.4.1")
    implementation('androidx.lifecycle:lifecycle-livedata-ktx:2.6.1')
    // Navigation
    implementation('androidx.navigation:navigation-compose:2.5.3')
    // Firebase
    implementation(platform('com.google.firebase:firebase-bom:31.2.0'))
    implementation('com.google.firebase:firebase-auth-ktx')
    implementation('com.google.firebase:firebase-firestore-ktx')

}