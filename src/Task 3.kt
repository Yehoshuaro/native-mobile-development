fun main() {
    val warrior = CharacterClass.Warrior(armor = 750)
    val mage = CharacterClass.Mage(mana = 2000)

    warrior.description()
    mage.description()
}

sealed class CharacterClass {
    data class Warrior(val armor: Int) : CharacterClass()
    data class Mage(val mana: Int) : CharacterClass()

    fun description() {
        when (this) {
            is Warrior -> println("I am a warrior with $armor armor")
            is Mage -> println("I am a mage with $mana mana")
        }
    }
}
