package actividades.practica2

/*
    Descripción: Clase CuentaBancaria que gestiona saldo y retiros con límite.
    Autor: Josué Carlos Alberto Ramos Suyoc
    Fecha de creación: 23 de marzo de 2025
    Fecha última modificación: 24 de marzo de 2025
*/

class CuentaBancaria(private var saldo: Double, private var limiteRetiro: Double) {

    fun getSaldo(): Double {
        return saldo
    }

    fun setSaldo(nuevoSaldo: Double) {
        if (nuevoSaldo >= 0) {
            saldo = nuevoSaldo
        } else {
            println("El saldo no puede ser negativo.")
        }
    }

    fun getLimiteRetiro(): Double {
        return limiteRetiro
    }

    fun setLimiteRetiro(nuevoLimite: Double) {
        if (nuevoLimite > 0) {
            limiteRetiro = nuevoLimite
        } else {
            println("El límite de retiro debe ser mayor a cero.")
        }
    }

    fun retirar(monto: Double) {
        if (monto > saldo) {
            println("Fondos insuficientes.")
        } else if (monto > limiteRetiro) {
            println("El monto excede el límite de retiro permitido.")
        } else {
            saldo -= monto
            println("Retiro exitoso. Nuevo saldo: $$saldo")
        }
    }
}

fun main() {
    val cuenta = CuentaBancaria(1000.0, 500.0)
    println("Saldo inicial: ${cuenta.getSaldo()}")
    cuenta.retirar(600.0)
    cuenta.retirar(400.0)
    println("Saldo final: ${cuenta.getSaldo()}")
}
