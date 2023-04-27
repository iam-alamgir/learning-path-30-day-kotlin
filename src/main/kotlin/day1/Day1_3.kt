package day1

// Loops
fun main() {
	var counter = 5
	while (counter > 0) {
		println("Counter: $counter")
		counter--
	}

	counter = 5
	do {
		println("Counter: $counter")
		counter--
	} while (counter > 0)

	// Iterate over a range
	for (i in 1..5) {
		println("Iteration $i")
	}

	for (i in 1 until 5) {
		println("Iteration $i")
	}

	// Iterate over a collection
	val names = listOf("Alice", "Bob", "Charlie")
	for (name in names) {
		println("Hello, $name")
	}
}
