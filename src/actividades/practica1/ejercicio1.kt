/*package actividades.practica1

fun pedirDatos(): Pair<Int,Int>{
    println("Salario del trabajador: ")
    var salario = readln().toInt()

    println("Puntuación del trabajador: ")
    var puntuacion = readln().toInt()

    return  Pair(salario,puntuacion)
}

fun calcularDineroRecibido(salario:Int, puntuacion:Int): Int{
    val dineroRecibido:Int = salario * puntuacion / 10
    return dineroRecibido
}

fun darResultados(puntuacion:Int, dineroRecibido:Int) {
    when (puntuacion) {
        in 0..3 -> print("Nivel de rendimiento Inaceptable. Cantidad de dinero recibido $$dineroRecibido.")
        in 4..6 -> print("Nivel de rendimiento Aceptable. Cantidad de dinero recibido $$dineroRecibido.")
        in 7..10 -> print("Nivel de rendimiento Meritorio. Cantidad de dinero recibido $$dineroRecibido.")
        else -> print("Puntuacion inválida.")
    }
}

fun main(){
    val (salario, puntuacion) = pedirDatos()
    val dineroRecibido = calcularDineroRecibido(salario, puntuacion)
    darResultados(puntuacion, dineroRecibido)
}
 */