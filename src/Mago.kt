class Mago : Personajes(){
    private var poderVara :Int = 30


    fun PoderVara(): Int {
        return poderVara
    }

    fun recargarVara(sumarPoder: Int) {
        poderVara = sumarPoder
    }

}