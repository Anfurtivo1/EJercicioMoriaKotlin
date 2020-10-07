package EjercicioKotlin

/**
 * Clase Elfo
 */
class Elfo : Personajes(){
    private var flechas : Int =20

    fun getCarcaj():Int{
        return flechas
    }

    /**
     * Se recarga el carcaj
     */
    fun recargarCarcaj(flechas : Int):Unit{
        this.flechas=flechas
    }

    /**
     * Se lanzan flechas
     */
    fun lanzarFlecha(): Unit {
        this.flechas--
    }

}