package actividades.practica1

// Descripción: Calculadora básica que realiza operaciones de suma, resta, multiplicación y división. Incluye un menú interactivo para que el usuario seleccione la operación deseada.
// Autor: Josué Carlos Alberto Ramos Suyoc
// Fecha creación: 2025-03-16
// Fecha última modificación: 2025-03-16

fun menu() : Int {
    println("\n==== Menú ====\n" +
            "1. Suma\n" +
            "2. Resta\n" +
            "3. Multiplicación\n" +
            "4. División\n" +
            "5. Salir")
    print("Escoja la operación: ")
    var opcion = readln().toInt()
    return opcion
}

fun operar (opcion: Int, numero1: Double, numero2: Double): Double {
    var resultado : Double = 0.0
    when (opcion){
        1 -> resultado = numero1 + numero2
        2 -> resultado = numero1 - numero2
        3 -> resultado = numero1 * numero2
        4 -> resultado = numero1 / numero2
        5 -> resultado = 0.0
    }
    return resultado
}

fun solicitarNumeros(opcion: Int): Double {
    var numero1: Double = 0.0
    var numero2: Double = 0.0
    if (opcion == 1) {
        print("\nSumando 1: ")
        numero1 = readln().toDouble()
        print("Sumando 2: ")
        numero2 = readln().toDouble()
        return operar(opcion, numero1, numero2)
    } else if (opcion == 2) {
        print("\nMinuendo: ")
        numero1 = readln().toDouble()
        print("Sustraendo: ")
        numero2 = readln().toDouble()
        return operar(opcion, numero1, numero2)
    } else if(opcion == 3) {
        print("\nMultiplicando: ")
        numero1 = readln().toDouble()
        print("Multiplicador: ")
        numero2 = readln().toDouble()
        return operar(opcion, numero1, numero2)
    } else if (opcion == 4) {
        print("\nDividendo: ")
        numero1 = readln().toDouble()
        print("Divisor: ")
        numero2 = readln().toDouble()
        return operar(opcion, numero1, numero2)
    } else if (opcion == 5){
        return operar(opcion,0.0,0.0)
    } else {
        return operar(opcion,0.0,0.0)
    }
}

fun calculadoraElemental(){
    println("\u001B[1;34m/***** Realicemos operaciones básicas *****/\u001B[0m")
    do {
        var opcion = menu()
        if (opcion in 1..4){
            println("\n\u001B[32mResultado: ${solicitarNumeros(opcion)}\u001B[0m")
            break
        } else if (opcion == 5){
            print("\u001B[35m\nSaliendo del programa...\u001B[0m")
            break
        } else {
            println("\u001B[31m\nIngrese una opción válida!\u001B[0m")
        }
    } while (opcion !in 1..5)
}