import actividades.practica1.adivinaNumero
import actividades.practica1.calculadoraElemental
import actividades.practica1.evaluacionEmpleados
import actividades.practica1.piedraPapelTijera

// Descripción: Menú para guiar al usuario a elegir los ejercicios disponibles.
// Autor: Josué Carlos Alberto Ramos Suyoc
// Fecha creación: 2025-03-16
// Fecha última modificación: 2025-03-16

fun main(){
    print("\u001B[1;32m/***** Bienvenido a la Práctica 1 *****/\n\u001B[0m" +
            "\u001B[1;35m\n1. Evaluación Empleados\n" +
            "2. Piedra, Papel, Tijera\n" +
            "3. Calculadora Elemental\n" +
            "4. Adivina Número\n\u001B[0m" +
            "\u001B[1;37m\nEscoge una opción: \u001B[0m")
    val opcion = readln().toInt()
    println(" ")
    when (opcion){
        1 -> evaluacionEmpleados()
        2 -> piedraPapelTijera()
        3 -> calculadoraElemental()
        4 -> adivinaNumero()
        else -> print("Opción inválida")
    }
}