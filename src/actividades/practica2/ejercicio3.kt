package actividades.practica2

/*
    Descripción: Implementación de una jerarquía de clases para figuras geométricas.
    Autor: Josué Carlos Alberto Ramos Suyoc
    Fecha de creación: 24 de marzo de 2025
    Fecha última modificación: 24 de marzo de 2025
*/

abstract class Shape {
    abstract fun calcularArea(): Double
    abstract fun calcularPerimetro(): Double

    fun imprimirResultados() {
        println("Área: ${calcularArea()}")
        println("Perímetro: ${calcularPerimetro()}")
    }
}

class Cuadrado(private val lado: Double) : Shape() {
    override fun calcularArea(): Double = lado * lado
    override fun calcularPerimetro(): Double = 4 * lado
}

class Rectangulo(private val base: Double, private val altura: Double) : Shape() {
    override fun calcularArea(): Double = base * altura
    override fun calcularPerimetro(): Double = 2 * (base + altura)
}

class Circulo(private val radio: Double) : Shape() {
    override fun calcularArea(): Double = Math.PI * radio * radio
    override fun calcularPerimetro(): Double = 2 * Math.PI * radio
}

fun main() {
    val cuadrado = Cuadrado(4.0)
    println("Cuadrado:")
    cuadrado.imprimirResultados()

    val rectangulo = Rectangulo(5.0, 3.0)
    println("\nRectángulo:")
    rectangulo.imprimirResultados()

    val circulo = Circulo(2.5)
    println("\nCírculo:")
    circulo.imprimirResultados()
}