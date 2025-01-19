fun main() {
    println("Lesson3 - Homework 1\n Введите число: ")
    val num = readln()
    palindrom(num)
}

// Домашнее задание №1. Проверить является ли число палиндромом
fun palindrom(x : String) {
    val str1 = x.toCharArray()
    val str2 = str1.reversed()
    var result = true
    
    for (i in 0..<str1.size) {
        if (str1[i] != str2[i]) result = false
    }

    if (result) println("Число палиндром")
    else println("Число не палиндром")
}

