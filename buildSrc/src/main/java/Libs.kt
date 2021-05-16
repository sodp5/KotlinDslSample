interface Libs {
    fun getDependencies(): List<DependencyType>

    object Kotlin : Libs {
        private const val STDLIB = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.KOTLIN_STDLIB}"

        override fun getDependencies() = listOf(
            DependencyType.Implementation(STDLIB)
        )
    }

    object Android : Libs {
        private const val CORE_KTX = "androidx.core:core-ktx:${Versions.ANDROID_CORE_KTX}"
        private const val APPCOMPAT = "androidx.appcompat:appcompat:${Versions.ANDROID_APPCOMPAT}"
        private const val MATERIAL = "com.google.android.material:material:${Versions.ANDROID_MATERIAL}"
        private const val CONSTRAINT = "androidx.constraintlayout:constraintlayout:${Versions.ANDROID_CONSTRAINT}"

        override fun getDependencies() = listOf(
            DependencyType.Implementation(CORE_KTX),
            DependencyType.Implementation(APPCOMPAT),
            DependencyType.Implementation(MATERIAL),
            DependencyType.Implementation(CONSTRAINT)
        )
    }

    object Room : Libs {
        private const val CORE = "androidx.room:room-runtime:${Versions.ROOM}"
        private const val KTX = "androidx.room:room-ktx:${Versions.ROOM}"
        private const val COMPILER = "androidx.room:room-compiler:${Versions.ROOM}"

        override fun getDependencies() = listOf(
            DependencyType.Implementation(CORE),
            DependencyType.Implementation(KTX),
            DependencyType.Kapt(COMPILER)
        )
    }

    object JUnit : Libs {
        private const val JUNIT = "junit:junit:${Versions.TEST_JUNIT}"
        private const val ANDROID_JUNIT = "androidx.test.ext:junit:${Versions.ANDROID_TEST_JUNIT}"

        override fun getDependencies() = listOf(
            DependencyType.TestImplementation(JUNIT),
            DependencyType.AndroidTestImplementation(ANDROID_JUNIT)
        )
    }


    object AndroidTest : Libs {
        private const val ESPRESSO = "androidx.test.espresso:espresso-core:${Versions.ANDROID_TEST_ESPRESSO}"

        override fun getDependencies() = listOf(
            DependencyType.AndroidTestImplementation(ESPRESSO)
        )
    }
}