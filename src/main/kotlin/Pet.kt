open class Pet(
    species: String,
    age: Int,
    val owner: String,
    val name: String
) : Animal(species, age) {
    override fun makeSound(): String {
        return "${this.name} sagt etwas."
    }
}
