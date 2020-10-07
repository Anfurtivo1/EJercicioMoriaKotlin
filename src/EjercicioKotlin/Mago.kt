package EjercicioKotlin

/**
 * Clase mago
 */
class Mago : Personajes(){
    private var poderVara :Int = 30

    /**
     * Se obtiene el poder de la vara
     */
    fun PoderVara(): Int {
        return poderVara
    }

    /**
     * Se recarga la vara
     */
    fun recargarVara(sumarPoder: Int) {
        poderVara = sumarPoder
    }

}