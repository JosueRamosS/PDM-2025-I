package actividades.practica1

fun computadoraDecide():Int {
    val numeroAleatorio = (1..3).random()
    return numeroAleatorio
}

fun decidir():String {
    lateinit var decision:String
    when(opcion) {
        1 -> decision = "PIEDRA"
        2 -> decision = "PAPEL"
        3 -> decision = "TIJERA"
        else -> println("Opcion inválida.")
    }
    return decision
}

fun main(){
    var decision = computadoraDecide()
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
    } else {
        if (decisionComputadora == "PIEDRA"){
            println("COMPUTADORA GANA")
        } else if (decisionComputadora == "PAPEL"){
            println("USUARIO GANA")
        } else {
            println("EMPATE")
        }
    }
}