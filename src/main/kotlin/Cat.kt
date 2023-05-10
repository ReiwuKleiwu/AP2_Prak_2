class Cat(
     species: String,
     age: Int,
     owner: String,
     name: String
): Pet(species, age, owner, name) {
    override fun makeSound(): String {
        return "${super.makeSound()} Miau"
    }

    fun scratchFurniture(): String {
        return "${this.name} kratzt an den Möbeln von ${this.owner} 🐈😼"
    }
}
