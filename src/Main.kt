fun main() {
    val hero = AnimeCharacter("Zick", 6000, false)
    val villain = AnimeCharacter("Levi", 15000, true)

    hero.introduce()
    villain.introduce()
}

class AnimeCharacter(
    val name: String,
    val powerLevel: Int,
    val isHero: Boolean
) {
    fun introduce() {
        if (isHero) {
            println("Hi! I'm $name, the humanity's strongest soldier that has $powerLevel")
        } else {
            println("Beware! I'm $name, that has $powerLevel")
        }
    }
}
