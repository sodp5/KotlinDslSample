import org.gradle.api.artifacts.dsl.DependencyHandler

fun DependencyHandler.implementationDependencies(libs: Libs) {
    libs.getDependencies().forEach { dependencyType ->
        val typeName = dependencyType.javaClass.simpleName.run {
            replace(first(), first().toLowerCase())
        }

        add(typeName, dependencyType.value)
    }
}