class Owl(
    species: String,
    age: Int,
    nocturnal: Boolean = true,
    val prey: List<String>
) : Bird(species, age, nocturnal) {

    fun flySilently(): String {
        return "Die ${this.age} Jahre alte Eule fliegt lautlos."
    }

    fun hunts(): String {
        return "Die Eule fliegt lautlos und jagt dabei folgende Beutetiere: ${this.prey.joinToString()}"
    }
}
