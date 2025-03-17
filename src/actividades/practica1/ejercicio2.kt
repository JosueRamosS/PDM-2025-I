/*package actividades.practica1

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
    println("Escoja la opción:\n1. PIEDRA\n2. PAPEL\n3. TIJERA")
}

fun decidirGanador(decisionUsuario:String, decisionComputadora:String){
    if (decisionUsuario == "PIEDRA"){
        if (decisionComputadora == "TIJERA"){
            println("USUARIO GANA")
        } else if (decisionComputadora == "PAPEL"){
            println("COMPUTADORA GANA")
        } else {
            println("EMPATE")
        }
    } else if(decisionUsuario == "PAPEL"){
        if (decisionComputadora == "PIEDRA"){
            println("USUARIO GANA")
        } else if (decisionComputadora == "TIJERA"){
            println("COMPUTADORA GANA")
        } else {
            println("EMPATE")
        }
    } else if (decisionUsuario == "TIJERA"){
        if (decisionComputadora == "PIEDRA"){
            println("COMPUTADORA GANA")
        } else if (decisionComputadora == "PAPEL"){
            println("USUARIO GANA")
        } else {
            println("EMPATE")
        }
    }
}
fun main(){
    mostrarMenu()
    val (decisionUsuario, decisionComputadora) = Pair(usuarioDecide(), computadoraDecide())
    println("=== \u001B[36m(Usuario) $decisionUsuario\u001B[0m VS \u001B[35m$decisionComputadora (Computadora)\u001B[0m ===")
    decidirGanador(decisionUsuario, decisionComputadora)
}
 */