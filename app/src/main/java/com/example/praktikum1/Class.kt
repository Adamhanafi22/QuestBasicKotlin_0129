package com.example.praktikum1

class Motor()

class Contact(val id: Int, var email: String)

fun main() {
    val contact = Contact(1, "mary@gmail.com")


//Print the value of the property: email
    println(contact.email)

    // Update the value of the property: email
    contact.email= "jane@gmail.com"

    // prints the new value of the property: email
    println(contact.email)
}