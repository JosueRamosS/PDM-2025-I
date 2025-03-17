package actividades.practica1

// Descripción: Juego de Piedra, Papel o Tijera donde el usuario compite contra la computadora, que elige aleatoriamente su jugada.
// Autor: Josué Carlos Alberto Ramos Suyoc
// Fecha creación: 2025-03-16
// Fecha última modificación: 2025-03-16

fun decidir(opcion:Int):String {
    var decision:String = "nada"
    when(opcion) {
        1 -> decision = "PIEDRA"
        2 -> decision = "PAPEL"
        3 -> decision = "TIJERA"
        else -> println("Opción Inválida")
    }
    return decision
}

fun computadoraDecide():String {
    val numeroAleatorio = (1..3).random()
    return decidir(numeroAleatorio)
}

fun usuarioDecide(): String {
    var opcion = readln().toInt()
    return decidir(opcion)
}

fun mostrarMenu(){
    print("1. PIEDRA\n2. PAPEL\n3. TIJERA\nEscoja la opción: ")
}

fun decidirGanador(decisionUsuario:String, decisionComputadora:String){
    if (decisionUsuario == "PIEDRA"){
        if (decisionComputadora == "TIJERA"){
            println("\u001B[32mUSUARIO GANA\u001B[0m")
        } else if (decisionComputadora == "PAPEL"){
            println("\u001B[32mCOMPUTADORA GANA\u001B[0m")
        } else {
            println("\u001B[32mEMPATE\u001B[0m")
        }
    } else if(decisionUsuario == "PAPEL"){
        if (decisionComputadora == "PIEDRA"){
            println("\u001B[32mUSUARIO GANA\u001B[0m")
        } else if (decisionComputadora == "TIJERA"){
            println("\u001B[32mCOMPUTADORA GANA\u001B[0m")
        } else {
            println("\u001B[32mEMPATE\u001B[0m")
        }
    } else if (decisionUsuario == "TIJERA"){
        if (decisionComputadora == "PIEDRA"){
            println("\u001B[32mCOMPUTADORA GANA\u001B[0m")
        } else if (decisionComputadora == "PAPEL"){
            println("\u001B[32mUSUARIO GANA\u001B[0m")
        } else {
            println("\u001B[32mEMPATE\u001B[0m")
        }
    }
}

fun piedraPapelTijera(){
    println("\u001B[1;34m/***** Juega contra la computadora y descubre si ganas *****/\u001B[0m\n")
    mostrarMenu()
    val (decisionUsuario, decisionComputadora) = Pair(usuarioDecide(), computadoraDecide())
    println("\n=== \u001B[36m(Usuario) $decisionUsuario\u001B[0m VS \u001B[35m$decisionComputadora (Computadora)\u001B[0m ===\n")
    decidirGanador(decisionUsuario, decisionComputadora)
}