package damm.exer_1

fun main() {
    val numeros = IntArray(51)

    for (i in numeros.indices) {
        numeros[i] = i * i
    }

    println(numeros.joinToString(", "))
    println("-------------------------------------------------------------")

    val numeros2 = (0..50).map { it * it }
    println(numeros2.joinToString(", "))
    println("-------------------------------------------------------------")

    val arr = IntArray(51)
    for (i in 0 until numeros.size) arr[i] = i
    println(arr.map { it * it }.joinToString(", "))
}