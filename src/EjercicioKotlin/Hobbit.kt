package EjercicioKotlin

/**
 * Clase Hobbit
 */
class Hobbit :Personajes(){
    private var anillo : Boolean=false

    /**
     * Se pone el anillo
     */
    fun ponerseAnillo(): Unit {
        this.anillo=true
    }

    /**
     * Se quita el anillo
     */
    fun quitarseAnillo(): Unit {
        this.anillo=false
    }

}