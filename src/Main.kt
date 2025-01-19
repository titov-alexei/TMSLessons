fun main() {
    println("Lesson3 - Homework 1\n Введите число: ")
    val num = readln()

    palindrom(num)  //Задание 1. Проверка на палндром

    if (isPrime(num.toInt())) {  //Задание 2. Функция проверки, является ли число простым
        println("Число является простым!")
    } else {
        println("Число не является простым!")
    }

    var result = sum(num.toInt()) //Задание 3. Вычисление суммы циифр число до единичного разряда
    while (result >= 10) {
        result = sum(result)
    }
    println("Сумма цифр до единичного разряда равна $result")

    println("Введите высоту лесенки:") //Задание 4. Перевернутая лесенка
    val height = readln().toInt()
    ladder(height)
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


//Домашнее задание №2. Проверит является ли число простым
fun isPrime(x : Int) : Boolean {
    if (x <= 1 ) return false
    for (i in 2..9) {
        if (x % i == 0) return false
    }
    return true
}


//Домашнее задание №3. Вычисление суммы цифр числа до единичного разряда
fun sum(number: Int): Int {
    var a = 0
    var b = number
    while (b != 0) {
        a += b % 10
        b /= 10
    }
    return a
}

//Домашнее задание №4. Перевернутая лесенка
fun ladder(input : Int) {
    for (i in input downTo 1) {
        println("#".repeat(i))
    }
}