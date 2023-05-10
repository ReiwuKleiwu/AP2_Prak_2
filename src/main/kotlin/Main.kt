fun main() {
    val bird = Bird("Amsel", 0, false)
    val owl = Owl("Eule", 5, true, listOf("Maus", "Maulwurf"))
    val dog = Dog("Golden Retriever", 6, "Anja", "Emma", true)
    val cat = Cat("Britisch Kurzhaar ", 0, "Sascha", "Lucy")
    val parrot = Parrot(
        "Blaupapagei", 0, false, listOf(
            "Hallo", "Guten Tag", "Ich mag Pizza", "Tschüß"
        )
    )

    dog.addAdoption(UnlimitedAdoption("Sandy"))
    cat.addAdoption(LimitedAdoption(60))
    cat.addAdoption(UnlimitedAdoption("Sandy"))
    parrot.addAdoption(UnlimitedAdoption("Mario"))

    val zoo = Zoo()

    zoo.addAnimal(dog)
    zoo.addAnimal(cat)
    zoo.addAnimal(bird)
    zoo.addAnimal(owl)
    zoo.addAnimal(parrot)

    println(zoo.getTotalAdoptionMoney()) // 2300
    println(zoo.getBirdsInZoo()) // Bird , Owl , Parrot
    println(zoo.getUnlimitedAdopters()) // Sandy . Mario
    println(zoo.getNumberOfGreetingParrots(listOf("Hallo", "Guten Tag"))) // 1
    println(zoo.getBabies()) // Cat , Bird , Parrot
}
