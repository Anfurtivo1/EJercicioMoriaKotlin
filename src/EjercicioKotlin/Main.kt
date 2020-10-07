package EjercicioKotlin
import java.io.DataOutputStream
import java.io.FileOutputStream
import java.util.*


fun main(){
        var gandalf = Mago()
        var legolas = Elfo()
        var frodo = Hobbit()
        var moria = arrayOfNulls<Salas>(37)
        var sala: Salas
        var salaA: SalaAccion
        val pila = Stack<Salas>()
        var contador = 0
        var pruebaMagica = true
        var pruebaAccion = true
        var pruebaHabilidad = true
        var poderMaligno = 0
        var pruebasNoSuperadas = 0
        var pruebasSuperadas = 0
        var sumarPoderVara = 0
        var salida: DataOutputStream? = null

        gandalf.estado=true
        frodo.estado=true
        legolas.estado=true

    for (i in 1..36){
        poderMaligno = Math.floor(Math.random() * 40).toInt()
        if(contador<=20){
            sala= Salas()
            sala.setPoderMaligno(poderMaligno)
            sala.setTiposala(TipoSala.MAGICA)
            moria[i]=sala
        }

        if (contador<=30 && contador >=20) {
            sala= Salas()
            sala.setPoderMaligno(poderMaligno)
            sala.setTiposala(TipoSala.HABILIDAD)
            moria[i]=sala
        }

        if (contador<=37 && contador>=30) {
            salaA = SalaAccion()
            salaA.setPoderMaligno(poderMaligno)
            salaA.setTiposala(TipoSala.ACCION)
            moria[i]=salaA
        }
        println( moria[i]);
        pila.add(moria[i])
        contador++
        if (moria[i]!!.getTiposala()!!.equals(TipoSala.MAGICA)) {
            println("")
            sumarPoderVara = Math.floor(Math.random() * 10).toInt()
            gandalf.recargarVara(sumarPoderVara + gandalf.PoderVara())
            pruebaMagica = moria[i]!!.comprobarPeligroMagico(gandalf.PoderVara(), moria[i]!!)
            if (pruebaMagica && gandalf.estado) {
                println("Gandalf ha realizado una sala con peligro magico y la ha superado")
                pruebasSuperadas++
            } else {
                println("Gandalf ha muerto")
                gandalf.estado=false
                pruebasNoSuperadas++
                break
            }
            pila.pop()
        }
        if (moria[i]!!.getTiposala()!!.equals(TipoSala.HABILIDAD)) {
            println("")
            pruebaHabilidad = moria[i]!!.combate(frodo)
            if (pruebaHabilidad && frodo.estado) {
                println("Frodo ha realizado una sala con peligro Habilidad y la ha superado")
                pruebasSuperadas++
            } else {
                println("Frodo ha muerto")
                frodo.estado=false
                pruebasNoSuperadas++
                break
            }
            pila.pop()
        }

        if (moria[i]!!.getTiposala()!!.equals(TipoSala.ACCION)) {
            println("")
            var aux = moria[i] as SalaAccion
            pruebaAccion = aux.matarEnemigos(aux, legolas)
            if (pruebaAccion && legolas.estado) {
                println("Legolas ha realizado una sala con peligro Accion y la ha superado")
                pruebasSuperadas++
                legolas.recargarCarcaj(aux.getFlechasSuelo() + legolas.getCarcaj())
            } else {
                println("Legolas ha muerto")
                legolas.estado=false
                pruebasNoSuperadas++
                break
            }
            pila.pop()
        }
    }




    if (pruebasNoSuperadas > 0) {
        try {
            salida = DataOutputStream(FileOutputStream("moria.txt", true))
            pruebasNoSuperadas = 36 - pruebasSuperadas
            salida.writeChar('\n'.toInt())
            System.out.println("No se ha podido atravesar Moria");
            salida.writeChars("No se ha podido atravesar Moria")
            salida.writeChar('\n'.toInt())
            System.out.println("Se han superado "+pruebasSuperadas+" pruebas");
            salida.writeChars("Se han superado $pruebasSuperadas pruebas")
            salida.writeChar('\n'.toInt())
            System.out.println("No se han podido superar "+ pruebasNoSuperadas+" pruebas");
            salida.writeChars("No se han podido superar $pruebasNoSuperadas pruebas")
            salida.writeChar('\n'.toInt())
            salida.close()
        } catch (e: Exception) {
            println("Error en $e")
        }
    }

    if (pruebasNoSuperadas == 0) {
        try {
            salida = DataOutputStream(FileOutputStream("moria.txt", true))
            salida.writeChar('\n'.toInt())
            System.out.println("************Se ha superado Moria*************");
            salida.writeChars("************Se ha superado Moria*************")
            salida.close()
        } catch (e: Exception) {
            println("Error en $e")
        }
    }
    }