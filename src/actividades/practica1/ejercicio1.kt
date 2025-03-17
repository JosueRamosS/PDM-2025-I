package actividades.practica1

// Descripción: Programa que evalúa el nivel de rendimiento de un empleado según su puntuación y calcula la cantidad de dinero que recibirá en base a su salario mensual.
// Autor: Josué Carlos Alberto Ramos Suyoc
// Fecha creación: 2025-03-16
// Fecha última modificación: 2025-03-16

// Solicita el salario y la puntuación del trabajador
fun pedirDatos(): Pair<Int, Int> {
    print("Salario del trabajador: ")
    val salario = readln().toInt()
    print("Puntuación del trabajador: ")
    val puntuacion = readln().toInt()
    return Pair(salario, puntuacion)
}

// Calcula el dinero recibido en base al salario y la puntuación
fun calcularDineroRecibido(salario: Int, puntuacion: Int): Int {
    return salario * puntuacion / 10
}

// Muestra el nivel de rendimiento y el dinero recibido
fun darResultados(puntuacion: Int, dineroRecibido: Int) {
    when (puntuacion) {
        in 0..3 -> print("\n\u001B[32mNivel de rendimiento Inaceptable. Cantidad de dinero recibido $$dineroRecibido.\u001B[0m")
        in 4..6 -> print("\n\u001B[32mNivel de rendimiento Aceptable. Cantidad de dinero recibido $$dineroRecibido.\u001B[0m")
        in 7..10 -> print("\n\u001B[32mNivel de rendimiento Meritorio. Cantidad de dinero recibido $$dineroRecibido.\u001B[0m")
        else -> print("Puntuacion inválida.")
    }
}

// Controla el flujo del programa
fun evaluacionEmpleados() {
    println("\u001B[1;34m/***** Calcularemos el dinero que recibirás *****/\u001B[0m\n")
    val (salario, puntuacion) = pedirDatos()
    val dineroRecibido = calcularDineroRecibido(salario, puntuacion)
    darResultados(puntuacion, dineroRecibido)
}