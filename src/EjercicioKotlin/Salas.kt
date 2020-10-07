package EjercicioKotlin

/**
 * Clase Salas
 */
open class Salas {
    private var poderMaligno = 0
    private var numeroEnemigos = 10
    var contador = 0
    private var tiposala: TipoSala? = null

    fun Salas(poderMaligno: Int) {
        this.poderMaligno = poderMaligno
    }

    /**
     * Se obtiene el poder maligno
     */
    fun getPoderMaligno(): Int {
        return poderMaligno
    }

    /**
     * Se pone un poder maligno
     */
    fun setPoderMaligno(poderMaligno: Int) {
        this.poderMaligno = poderMaligno
    }

    /**
     * Se recibe la cantidad de enemigos que hay
     */
    fun getNumeroEnemigos(): Int {
        return numeroEnemigos
    }

    /**
     * Se añade una cantidad de enemigos
     */
    fun setNumeroEnemigos(numeroEnemigos: Int) {
        this.numeroEnemigos = numeroEnemigos
    }

    /**
     * Se obtiene el tipo de sala que es
     */
    fun getTiposala(): TipoSala? {
        return tiposala
    }

    /**
     * Se añade un tipo a la sala
     */
    fun setTiposala(tiposala: TipoSala?) {
        this.tiposala = tiposala
    }


    /**
     *
     * @param poderVara
     * @param sala
     * @return Si viven(true) o si mueren(false)
     */
    fun comprobarPeligroMagico(poderVara: Int, sala: Salas): Boolean {
        var porcentaje: Double
        var aux: Int
        //Si el poder es mayor, se gana
        if (poderVara > sala.getPoderMaligno()) {
            return true
        }
        //Si el poder es igual, se gana el 60% por ciento
        if (poderVara == sala.getPoderMaligno()) {
            porcentaje = Math.floor(Math.random() * 101)
            aux = porcentaje.toInt()
            if (aux <= 60) { //Si se ha conseguido un 60%, hay un 80% de escapar
                porcentaje = Math.floor(Math.random() * 101)
                aux = porcentaje.toInt()
                if (aux <= 80) {
                    return false
                }
            } else {
                return true
            }
        }
        //Si el poder es menor, se gana el 30%
        if (poderVara < sala.getPoderMaligno()) {
            porcentaje = Math.floor(Math.random() * 101)
            aux = porcentaje.toInt()
            if (aux <= 30) { //Si se ha conseguido un 30%, hay un 80% de escapar
                porcentaje = Math.floor(Math.random() * 101)
                aux = porcentaje.toInt()
                if (aux <= 80) {
                    return false
                }
            } else {
                return true
            }
        }
        return true
    }


    /**
     *
     * @param hobbit
     * @return Si viven(true) o si mueren(false)
     */
    fun combate(hobbit: Hobbit): Boolean {
        var porcentaje: Double
        var aux: Int
        porcentaje = Math.floor(Math.random() * 101)
        aux = porcentaje.toInt()
        return if (aux <= 50) {
            hobbit.ponerseAnillo()
            porcentaje = Math.floor(Math.random() * 101)
            aux = porcentaje.toInt()
            aux <= 90
        } else {
            porcentaje = Math.floor(Math.random() * 101)
            aux = porcentaje.toInt()
            if (aux <= 20) {
                return true
            }
            aux <= 80
        }
    }


    override fun toString(): String {
        return "Salas{" + "poderMaligno=" + poderMaligno + ", numeroEnemigos=" + numeroEnemigos + '}';
    }
}