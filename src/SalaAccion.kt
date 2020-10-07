class SalaAccion {
    private val flechasSuelo = 10

    fun SalaAccion(poderMaligno: Int) {
        //super(poderMaligno)
    }

    fun getFlechasSuelo(): Int {
        return flechasSuelo
    }


    /**
     * @param legolas
     * @param flechas
     * @param sala
     * @return Si viven(true) o si mueren(false)
     */
    fun matarEnemigos(sala: Salas, legolas: Elfo): Boolean {
        val numeroEnemigos = sala.getNumeroEnemigos()
        val porcentaje: Double
        val aux: Int
        for (i in 0 until numeroEnemigos) {
            legolas.lanzarFlecha()
            if (legolas.getCarcaj() == 0) {
                porcentaje = Math.floor(Math.random() * 101)
                aux = porcentaje.toInt()
                return aux > 80
            }
        }
        return true
    }
}