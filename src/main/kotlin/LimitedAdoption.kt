class LimitedAdoption(override val days: Int): Adoption {
    override val price: Double
        get() = days * 5.0

    override val benefits: List<String> = listOf("Besuchen", "Füttern")
}
