package com.example.praktikum1


fun withoutParameter() {
    println("== withoutParameter ==")
    println("Hello, World!")
}

fun withParameter(name: String) {
    println("== withParameter ==")
    println("Hello, $name!")
}

// named argument (memanggil fungsi dengan menyebutkan nama parameter)
fun withNamedArgument(name: String, age: Int) {
    println("== withNamedArgument ==")
    println("Hello, $name! You are $age years old.")
}

// default parameter value (memberikan nilai default pada parameter fungsi)
fun withDefaultParameter(name: String = "Indra", age: Int) {
    println("== withDefaultParameter ==")
    println("Hello, $name! You are $age years old.")
}

fun withReturn(panjang: Int, lebar: Int): Int {
    return panjang * lebar
}

fun main() {
    withoutParameter()
    withParameter("John")
    withNamedArgument(name = "John", age = 30)
    withDefaultParameter(age = 25)
}