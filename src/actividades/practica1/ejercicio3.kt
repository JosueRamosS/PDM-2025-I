package actividades.practica1

// Descripción: Calculadora básica que realiza suma, resta, multiplicación y división.
// Autor: Josué Carlos Alberto Ramos Suyoc
// Fecha creación: 2025-03-16
// Fecha última modificación: 2025-03-16

// Muestra el menú de opciones y retorna la opción elegida
fun menu(): Int {
    println("\n==== Menú ====\n" +
            "1. Suma\n" +
            "2. Resta\n" +
            "3. Multiplicación\n" +
            "4. División\n" +
            "5. Salir")
    print("Escoja la operación: ")
    return readln().toInt()
}

// Realiza la operación seleccionada
fun operar(opcion: Int, numero1: Double, numero2: Double): Double {
    return when (opcion) {
        1 -> numero1 + numero2
        2 -> numero1 - numero2
        3 -> numero1 * numero2
        4 -> numero1 / numero2
        else -> 0.0
    }
}

// Solicita los números según la operación elegida
fun solicitarNumeros(opcion: Int): Double {
    var numero1: Double
    var numero2: Double
    when (opcion) {
        1 -> {
            print("\nSumando 1: ")
            numero1 = readln().toDouble()
            print("Sumando 2: ")
            numero2 = readln().toDouble()
        }
        2 -> {
            print("\nMinuendo: ")
            numero1 = readln().toDouble()
            print("Sustraendo: ")
            numero2 = readln().toDouble()
        }
        3 -> {
            print("\nMultiplicando: ")
            numero1 = readln().toDouble()
            print("Multiplicador: ")
            numero2 = readln().toDouble()
        }
        4 -> {
            print("\nDividendo: ")
            numero1 = readln().toDouble()
            print("Divisor: ")
            numero2 = readln().toDouble()
        }
        else -> return 0.0
    }
    return operar(opcion, numero1, numero2)
}

// Controla el flujo del programa
fun calculadoraElemental() {
    println("\u001B[1;34m/***** Realicemos operaciones básicas *****/\u001B[0m")
    do {
        val opcion = menu()
        if (opcion in 1..4) {
            println("\n\u001B[32mResultado: ${solicitarNumeros(opcion)}\u001B[0m")
            break
        } else if (opcion == 5) {
            print("\u001B[35m\nSaliendo del programa...\u001B[0m")
            break
        } else {
            println("\u001B[31m\nIngrese una opción válida!\u001B[0m")
        }
    } while (opcion !in 1..5)
}