class UnlimitedAdoption(val name: String) : Adoption {
    override val days: Int = Int.MAX_VALUE
    override val price: Double = 1000.0
    override val benefits: List<String> =
        listOf("Besuchen", "Füttern", "Streicheln", "Gedenktafel mit Namen der Person am Gehege")
}