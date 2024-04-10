# clase inicial de kotlin

```kt
/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
fun main() {
    println("Hello, world!!!")
    var hola="hola" // variable
    var hola2:String="hola"
    val constante="hola" // constante <-- optimizaciones.
    var hola3:String?=null
    hola3=null
    println(hola2)
    val obj=MiClase() // no se usa el comando new.
    obj.campo1="hola"
    println(obj.campo1)
}
class MiClase {
    var campo1:String="";
    class MiClase constructor(Campo:String) {
        campo1=Campo;
    }
}
```
