package com.example.work

fun manipulateCharacterArray(): List<String> {
    val characters = mutableListOf("Harry Potter", "Ron Weasley", "Hermione Granger")
    characters.add("Draco Malfoy")
    characters.remove("Draco Malfoy")
    return characters.sorted()
}

fun findCharacter(characterCode: String?): String {
    val characterMap = mapOf("HP" to "Harry Potter", "RH" to "Ron Weasley", "HG" to "Hermione Granger")
    return characterCode?.let {
        characterMap[it]
    }
        ?: "Character not found"
}
