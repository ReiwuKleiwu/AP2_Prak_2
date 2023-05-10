class Parrot(
    species: String,
    age: Int,
    nocturnal: Boolean = false,
    val knownWords: List<String>
) : Bird(species, age, nocturnal) {
    override fun makeSound(): String {
        return "${this.species} ahmt Wörter nach: ${this.knownWords.joinToString()}"
    }
}