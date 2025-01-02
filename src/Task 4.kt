fun main() {
    val weapon2 = Weapon("Demon Slayer Sword", 3000)
    val humanHero = HumanCharacter("Tanjiro", 10000, true, weapon2)

    humanHero.introduce()
}

open class AnimeCharacter2(
    val name: String,
    val powerLevel: Int,
    val isHero: Boolean
) {
    open fun introduce() {
        if (isHero) {
            println("Hello. I'm $name, a hero with a power level of $powerLevel")
        } else {
            println("I'm $name, a villain with a power level of $powerLevel")
        }
    }
}

class HumanCharacter(
    name: String,
    powerLevel: Int,
    isHero: Boolean,
    val weapon: Weapon
) : AnimeCharacter2(name, powerLevel, isHero) {
    override fun introduce() {
        super.introduce()
        weapon?.let {
            println("I wield a weapon called ${it.name} that deals ${it.damage} damage")
        }
    }
}




