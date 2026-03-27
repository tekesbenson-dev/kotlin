

fun main() {
    val counties = arrayOf("Nairobi", "Mombasa", "Kisumu", "Nakuru", "Eldoret", "Machakos", "Kiambu")

    val sortedCounties = counties.sorted()

    for (county in sortedCounties) {
        println("County: $county")
    }
}