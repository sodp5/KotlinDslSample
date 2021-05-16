sealed class DependencyType(val value: Any) {
    data class Implementation(private val notation: Any) : DependencyType(notation)
    data class TestImplementation(private val notation: Any) : DependencyType(notation)
    data class AndroidTestImplementation(private val notation: Any) : DependencyType(notation)
    data class Kapt(private val notation: Any) : DependencyType(notation)
}