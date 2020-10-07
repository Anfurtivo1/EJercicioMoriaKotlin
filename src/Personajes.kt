open class Personajes {
    private val nombre: String
        get() {
            TODO()
        }
    private val estado : Boolean = true
    private val tipoHabilidad : Habilidad
        get() {
            TODO()
        }

    override fun toString() : String{
        return "Personajes{" + "nombre=" + nombre + ", estado=" + estado + ", tipoHabilidad=" + tipoHabilidad + '}';
    }
}