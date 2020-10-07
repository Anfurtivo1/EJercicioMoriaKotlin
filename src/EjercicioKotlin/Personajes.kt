package EjercicioKotlin

/**
 * Clase Personajes
 */
open class Personajes() {
    private val nombre: String =""
        get() {
            return field
        }
        var estado : Boolean =true
            get() {
                return field
            }
            set(value) {
                field=value
            }

    /**
     * Se devuelve el tipo de habilidad que se tiene
     */
    private val tipoHabilidad : Habilidad
        get() {
            return tipoHabilidad
        }

}