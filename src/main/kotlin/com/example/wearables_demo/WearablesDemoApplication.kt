package com.example.wearables_demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import kotlin.random.Random

@SpringBootApplication
class WearablesDemoApplication

fun generateCompliment(name: String): String {

	val compliments = listOf(
		"You're smarter than a writing robot!",
		"You write code so clean, even your keyboard is impressed :D!",
		"Your logic is so sound, Spock would nod in approval.",
		"You debug with the elegance of a ballet dancer.",
		"You're the Kotlin King/Queen!",
		"If Stack Overflow were a game, you'd be the final boss."
	)

	val randomIndex = Random.nextInt(compliments.size)
	val compliment = compliments[randomIndex]

	return "Hey $name! $compliment"
}

fun main(args: Array<String>) {
	runApplication<WearablesDemoApplication>(*args)
	println(generateCompliment("Code Wizard"))
}
