package com.example.work

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview
import com.example.work.ui.theme.WorkTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            WorkTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column(modifier = Modifier.padding(innerPadding)) {
                        CharacterView()
                        CharacterManipulationView()
                        OptionalHandlingView()
                    }
                }
            }
        }
    }
}

@Composable
fun CharacterView() {
    val characters = mapOf("HP" to "Harry Potter", "RH" to "Ron Weasley", "HG" to "Hermione Granger")

    val processedData = processCharacterData(characters) {
        "${it.key}: ${it.value}"
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        processedData.forEach { data ->
            Text(text = data, style = MaterialTheme.typography.bodyLarge)
        }
    }
}

fun processCharacterData(characters: Map<String, String>, formatter: (Map.Entry<String, String>) -> String): List<String> {
    return characters.map {
        formatter(it)
    }
}

@Composable
fun CharacterManipulationView() {
    val manipulatedCharacters = manipulateCharacterArray()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        manipulatedCharacters.forEach {
                character ->
            Text(text = character, style = MaterialTheme.typography.bodyLarge)
        }
    }
}

@Composable
fun OptionalHandlingView() {
    val characterName = findCharacter("RH")

    Text(
        text = characterName,
        style = MaterialTheme.typography.bodyLarge,
        modifier = Modifier.padding(16.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    WorkTheme {
        Column {
            CharacterView()
            CharacterManipulationView()
            OptionalHandlingView()
        }
    }
}