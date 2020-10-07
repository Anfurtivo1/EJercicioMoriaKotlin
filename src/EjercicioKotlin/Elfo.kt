package EjercicioKotlin

class Elfo : Personajes(){
    private var flechas : Int =20

    fun getCarcaj():Int{
        return flechas
    }

    fun recargarCarcaj(flechas : Int):Unit{
        this.flechas=flechas
    }

    fun lanzarFlecha(): Unit {
        this.flechas--
    }

}