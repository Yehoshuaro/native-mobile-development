fun main() {
    val sword = Weapon("Excalibur", 7500)
    sword.use()
}
data class Weapon(val name: String, val damage: Int){
    fun use() {
        println("The weapon $name hit $damage damage")
    }
}
