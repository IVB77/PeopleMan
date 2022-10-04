import kotlin.random.Random

fun main() {
        val likes = Random.nextInt(0, 500)
        val relevance: String = if (likes % 10 == 1 && likes != 11) "человеку" else "людям"
        println("Моя программа понравилась $likes $relevance")
}