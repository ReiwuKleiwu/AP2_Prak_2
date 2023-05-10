class Dog(
    species: String,
    age: Int,
    owner: String,
    name: String,
    val wagsTail: Boolean
) : Pet(species, age, owner, name) {
    override fun makeSound(): String {
        return "${super.makeSound()} Wuff"
    }

    fun fetchToy(): String {
        return if(wagsTail) "${this.name} bringt das Spielzeug zurück zu ${this.owner}! Dabei freut er sich wie verrückt! 🐕"
    else "${this.name} bringt das Spielzeug zurück zu ${this.owner}!"
    }
}