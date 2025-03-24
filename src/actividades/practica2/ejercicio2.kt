package actividades.practica2

/*
    Descripción: Clase Producto que gestiona precio y descuento.
    Autor: Josué Carlos Alberto Ramos Suyoc
    Fecha de creación: 23 de marzo de 2025
    Fecha última modificación: 24 de marzo de 2025
*/

class Producto(private var precio: Double, private var descuento: Double) {

    fun getPrecio(): Double {
        return precio
    }

    fun setPrecio(nuevoPrecio: Double) {
        if (nuevoPrecio >= 0) {
            precio = nuevoPrecio
        } else {
            println("El precio no puede ser negativo.")
        }
    }

    fun getDescuento(): Double {
        return descuento
    }

    fun setDescuento(nuevoDescuento: Double) {
        if (nuevoDescuento in 0.0..100.0) {
            descuento = nuevoDescuento
        } else {
            println("El descuento debe estar entre 0 y 100.")
        }
    }

    fun calcularPrecioFinal(): Double {
        return precio - (precio * descuento / 100)
    }
}

fun main() {
    val producto = Producto(200.0, 10.0)
    println("Precio inicial: ${producto.getPrecio()}")
    println("Descuento aplicado: ${producto.getDescuento()}%")
    println("Precio final: ${producto.calcularPrecioFinal()}")
}