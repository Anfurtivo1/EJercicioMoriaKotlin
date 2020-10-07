package EjercicioKotlin

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

    private val tipoHabilidad : Habilidad
        get() {
            return tipoHabilidad
        }

}