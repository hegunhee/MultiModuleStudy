plugins {
    id ("com.android.application")
    id ("org.jetbrains.kotlin.android")
    id ("kotlin-kapt")
    id ("kotlin-android")
    id ("dagger.hilt.android.plugin")
}

android {
    compileSdk = 32

    defaultConfig {
        applicationId = "com.example.multimodulestudy"
        minSdk = 21
        targetSdk = 32
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release"){
            isMinifyEnabled = false

        }
    }
    compileOptions {
        sourceCompatibility (JavaVersion.VERSION_1_8)
        targetCompatibility (JavaVersion.VERSION_1_8)
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation(project(":domain2"))
    implementation(project(":data"))

    implementation(libs.core.ktx)
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.constraint)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso)

    implementation(libs.activity.ktx)
    implementation(libs.fragment.ktx)
//
//    implementation ("androidx.core:core-ktx:1.7.0")
//    implementation ("androidx.appcompat:appcompat:1.5.1")
//    implementation ("com.google.android.material:material:1.6.1")
//    implementation ("androidx.constraintlayout:constraintlayout:2.1.4")
//    testImplementation ("junit:junit:4.13.2")
//    androidTestImplementation ("androidx.test.ext:junit:1.1.3")
//    androidTestImplementation ("androidx.test.espresso:espresso-core:3.4.0")
//
//    implementation ("androidx.activity:activity-ktx:1.4.0")
//    implementation ("androidx.fragment:fragment-ktx:1.4.0")

    implementation(libs.bundles.viewmodel.lifecycle)

    implementation(libs.bundles.hilt)
    kapt(libs.hilt.compiler)
}
kapt {
    correctErrorTypes = true
}
hilt {
    enableAggregatingTask = true
}