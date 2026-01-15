plugins {
    alias(libs.plugins.example.nonggle.android.library)
}

android {
    namespace = "com.example.navigation"
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    // navigation3
    implementation(libs.androidx.navigation3.runtime)
    //ViewModel이 백 스택의 항목으로 범위가 지정되도록 허용합니다.
    implementation(libs.androidx.lifecycle.viewModel.navigation3)
}