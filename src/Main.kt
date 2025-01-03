sealed class CharacterClass {
    object Warrior : CharacterClass()
    object Mage : CharacterClass()
}

class RPGCharacter(val name: String, var health: Int, val characterClass: CharacterClass, private val power: Int) {
    fun attack(opponent: RPGCharacter) {
        val damage = if (characterClass == CharacterClass.Warrior) power / 2 else power
        opponent.health -= damage
        println("$name attacks and deals $damage damage to ${opponent.name}. ${opponent.name} has ${opponent.health} health left.")
    }
}

fun fight(character1: RPGCharacter, character2: RPGCharacter) {
    while (character1.health > 0 && character2.health > 0) {
        character1.attack(character2)
        if (character2.health > 0) {
            character2.attack(character1)
        }
    }
    val winner = if (character1.health > 0) character1 else character2
    println("${winner.name} wins!")
}

fun main() {
    val warrior = RPGCharacter("Warrior", 100, CharacterClass.Warrior, 20)
    val mage = RPGCharacter("Mage", 80, CharacterClass.Mage, 30)
    fight(warrior, mage)
}