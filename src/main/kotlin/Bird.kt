open class Bird(
    species: String,
    age: Int,
    val nocturnal: Boolean
) : Animal(species, age) {
    override fun makeSound(): String {
        return "${this.species} zwitschert oder singt."
    }
}