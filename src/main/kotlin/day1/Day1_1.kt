package day1

// Data Types and Variables
fun main() {
	val byteNumber: Byte = 127
	val shortNumber: Short = 32767
	val intNumber: Int = 2_147_483_647
	val longNumber: Long = 9_223_372_036_854_775_807L
	val floatNumber: Float = 3.14F
	val doubleNumber: Double = 3.141592653589793

	val booleanValue: Boolean = true

	val charValue: Char = 'A'

	val stringValue: String = "Hello, Kotlin!"

	val name = "John"
	val age = 30
	val message = "Hello, my name is $name and I am $age years old."

	val immutableValue = 42 // Cannot be changed after initialization
	var mutableValue = 42 // Can be changed after initialization
	mutableValue = 43
}
