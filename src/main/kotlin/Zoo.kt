class Zoo() {
    val animals: MutableList<Animal> = mutableListOf()

    fun addAnimal(animal: Animal) {
        this.animals.add(animal)
    }

    fun removeAnimal(animal: Animal): Boolean {
        return this.animals.remove(animal)
    }

    fun getTotalAdoptionMoney(): Double {
        return this.animals.sumOf { animal -> animal.adoptions.sumOf { adoption -> adoption.price } }
    }

    fun getBirdsInZoo(): List<Bird> {
        return this.animals.filterIsInstance<Bird>()
    }

    fun getUnlimitedAdopters(): List<String> {
        val adoptions = this.animals.map { it.adoptions }.flatten()
        val unlimitedAdoptions = adoptions.filterIsInstance<UnlimitedAdoption>()
        return unlimitedAdoptions.map { unlimitedAdoption -> unlimitedAdoption.name }.distinct()
    }

    fun getNumberOfGreetingParrots(words: List<String>): Int {
        val parrots = this.animals.filterIsInstance<Parrot>()
        return parrots.filter { parrot -> parrot.knownWords.any { word -> word in words } }.size
    }

    fun getBabies(): List<Animal> {
        return this.animals.filter { it.age < 1 }
    }
}