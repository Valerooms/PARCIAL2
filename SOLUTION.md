
CONCEPTOS
1. ¿Cuáles son las acciones los tres momentos importantes de las excepciones?
Trhow: Se usa para lanzar una excepcion 
Propagate: Se usa para propagar una excepcion
Catch: Se usa para capturar una excepcion

2. ¿Cuál es el objetivo de cada una? 
Throw: Se lanza con el fin de comunicar al usuario acerca de un error controlado por el codigo, que se tuvo en cuenta al momento de implementar.
Propagate: Se propaga con el fin de encontrar como controlar la excepcion que fue arrojada por medio del llamado al stack
Catch: Se captura con el fin de testear para encontrar y controlar los errores mientras se ejecuta el programa haciendo 

  ¿Cómo se implementa en Java cada acción?
 Throw: Por medio de la palabra reservada throw al lado de una instancia de la excepcion
 Propagate: Por medio de la palabra reservada throws despues de la firma del metodo que va a tirar la excepcion
 Catch: Por medio de la palabra reeservada try, en donde se llama al metodo que puede lanzar la excepcion, 
 para que cuando se de una excepcion se utiliza la palabra reservada catch en donde se decide lo que se hara con la excepcion.
 
 

3. ¿Qué es sobre-escritura de métodos? ¿Por qué aplicarla? ¿Cómo impedir que se sobre-escriba un método?
La sobreescritura de un metodo es tomar un metodo ya existente y editarlo de tal forma que realice acciones personalizadas.
Para impedir que se sobre-escriba un metodo se debe utilizar la palabra final en la firma del metodo.

DISENO 
1.Summarize: "public Duration summarize():"

  /**
     * Resume informacion of the synthethizers
     *
     * @return Duration of the synthethizers
     */
2.![PARCIAL DISENO 1](https://user-images.githubusercontent.com/78030533/115094057-d9923500-9ee1-11eb-8aef-c7bfabf7ed62.png)
     
3.![DIAGRAMACLASES](https://user-images.githubusercontent.com/78030533/115094296-a69c7100-9ee2-11eb-8d0d-24abdea98e09.png)
4.GetDuration: "public Duration getDuration() throws SabanaResearchException"
/**
     * Get duration of the activity
     *
     * @return
     */

EXTENDIENDO
![EXTENDIENDO](https://user-images.githubusercontent.com/78030533/115094929-009e3600-9ee5-11eb-9f2e-7e9e4919192a.png)
1. Implemente el llamado de prerrequisitos tanto para activities como para iterations
2. No es el mas efectivo
