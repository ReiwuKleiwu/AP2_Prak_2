abstract class Animal (val species: String , val age: Int) {
    var adoptions: List<Adoption> = emptyList()
    open fun makeSound(): String {
        TODO()
    }

    fun addAdoption(adoption: Adoption) {
        this.adoptions += adoption
    }
}