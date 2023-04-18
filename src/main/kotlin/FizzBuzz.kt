class FizzBuzz {

    fun main() {
        (1..100).asSequence().map { i ->
            when (Pair(i % 3 == 0, i % 5 == 0)) {
                Pair(false, false) -> i
                Pair(true, false) -> "Fizz"
                Pair(true, true) -> "Buzz"
                else -> "FizzBuzz"
            }
        }.forEach(::println)
    }

}