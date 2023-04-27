package day1

// Control Structures
fun main() {
	val a = 10
	val b = 20
	if (a > b) {
		println("a is greater than b")
	} else if (a < b) {
		println("a is less than or equal to b")
	} else {
		println("a is equal to b")
	}

	// or as returning value
	val ifReturned = if (a > b) {
		"a is greater than b"
	} else if (a < b) {
		"a is less than or equal to b"
	} else {
		"a is equal to b"
	}

	println(ifReturned)

	val number = 5
	when (number) {
		1 -> println("One")
		2 -> println("Two")
		3 -> println("Three")
		4 -> println("Four")
		5 -> println("Five")
		else -> println("Number not in the list")
	}

	// or as returning value
	val whenReturned = when (number) {
		1 -> "One"
		2 -> "Two"
		3 -> "Three"
		4 -> "Four"
		5 -> "Five"
		else -> "Number not in the list"
	}

	println(whenReturned)
}
