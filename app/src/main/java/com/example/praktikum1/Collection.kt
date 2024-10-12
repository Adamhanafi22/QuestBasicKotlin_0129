package com.example.praktikum1

fun ContohList() {
    println("=== List ===")

    //List Read-only
    val readOnlyAbjad = listOf("A","B","C")
    print(readOnlyAbjad)

    //List mutable
    val shape: MutableList<String> = mutableListOf("Circle","Square","Triangle")
    println(shape)

    //Menambahkan data ke dalam List mutable
    shape.add("Circle")
    println(shape)

    //Menghapus data dari List mutable
    shape.remove("Triangle")
    println(shape)

    //Mengubah data di dalam List mutable
    shape[0] = "Oval"
    println(shape)

    //List Read-only
    val shapeLocked: List<String> = shape
    println(shapeLocked)


}