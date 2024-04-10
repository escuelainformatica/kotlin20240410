# clase inicial de kotlin

## definicion de variables
```kotlin
    var hola="hola" // variable
    var hola2:String="hola"
```
## variables permiten nulo
```kotlin
    var hola:String?="hola"
```
## constantes
```kotlin
   val const:String="hola"
   val cliente=Cliente() // objeto
   cliente.nombre="hola" // se puede modificar los campos de un objeto aunque sea constante.
```
## objetos
```kotlin
    val objeto=Clase() // no es necesario el comando new
```

## funcion o campo

```kotlin
fun nombrefuncion(argumentos) {
    
}
fun sumar(num:Int,num2:Int):Int { // funcion que regresa un valor
    return num+num2
}
```

## ciclos
```kotlin
for(pais in paises) { // cicl que recorre el listado pais
    
}
for(i in 1..10) { // ciclo del 1 al 10
    
}

```


```kotlin
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
