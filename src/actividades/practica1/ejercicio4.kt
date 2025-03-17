package actividades.practica1

// Descripción: Juego en el que el usuario debe adivinar un número aleatorio entre 1 y 30 en un máximo de 5 intentos.
// Proporciona pistas indicando si el número es mayor o menor.
// Autor: Josué Carlos Alberto Ramos Suyoc
// Fecha creación: 2025-03-16
// Fecha última modificación: 2025-03-16

// Genera un número aleatorio entre 1 y 30
fun generarNumeroAleatorio(): Int{
    val numAleatorio = (1..30).random()
    return numAleatorio
}

// Lógica principal del juego: pide al usuario que adivine el número
fun adivinarNumero(numeroAleatorio:Int) {
    println("\u001B[35mAdivine el número(entre 1 y 30)! Tiene 5 intentos!\u001B[0m")
    var entrada: Int = 0
    var intentos: Int = 5
    do {
        print("\u001B[34mPronóstico: \u001B[0m")
        entrada = readln().toInt()

        // Validación de que el número esté dentro del rango permitido
        if (entrada !in 1..30){
            intentos++
            println("\u001B[36mEscoge un número entre 1 y 30!\u001B[0m" + " Te quedan ${intentos-1} intentos")
        }
        // Pistas según la comparación con el número aleatorio
        else if (entrada != numeroAleatorio && entrada > numeroAleatorio) {
            println("El número es menor!" + " Te quedan ${intentos-1} intentos")
        } else if (entrada != numeroAleatorio && entrada < numeroAleatorio) {
            println("El número es mayor!" + " Te quedan ${intentos-1} intentos")
        } else {
            println("\u001B[32mEncontraste el número! Muy bien!\u001B[0m")
            break
        }
        intentos--
    } while (intentos >= 1)

    // Mensaje en caso de quedarse sin intentos
    if (intentos == 0) {
        println("\u001B[31mSe terminó el juego! Se acabaron los intentos!\u001B[0m")
    }
}

// Función principal que inicia el juego
fun adivinaNumero(){
    println("\u001B[1;34m/***** Intenta adivinar el número secreto en 5 intentos *****/\u001B[0m\n")
    adivinarNumero(generarNumeroAleatorio())
}