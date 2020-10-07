class Elfo : Personajes(){
    private var flechas : Int =20

    fun getCarcaj():Int{
        return flechas
    }

    fun recargarCarcaj():Unit{
        this.flechas=flechas
    }

    fun lanzarFlecha(): Unit {
        this.flechas--
    }

}