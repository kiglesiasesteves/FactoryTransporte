# Factory Transporte

Este repositorio contiene una aplicación simple en Java para distinguir entre diferentes tipos de transporte para enviar un paquete y el coste de cada paquete dependiendo del código postal de cada lugar . La aplicación permite instanciar dos tipos de transporte: camión y bicicleta.

## Clases e Interfaces

- IComun
  
Esta interfaz proporciona un conjunto de constantes que representan diferentes tipos de embalaje y algunos códigos postales predefinidos. Además, define dos métodos que deben ser implementados por las clases que representan tipos de transporte. costeTotal calcula el coste total del envío en base al código postal de destino, mientras que tipoEmbalaje determina el tipo de embalaje requerido para un paquete en base a sus dimensiones y peso.

En la interfaz tenemos los métodos costeTotal que  recibe el código postal como parámetro y devuelve el costo total para enviar un paquete a ese código postal.

Por otro lado tenemos tipoEmbalaje que recibe las dimensiones (ancho, alto y largo) y el peso del paquete como parámetros.
Devuelve un entero que representa el tipo de embalaje adecuado:

0: Palet
1: Envoltorio de cartón
2: Caja de madera

 
- Camion

La clase Camion implementa la interfaz IComun, lo que significa que debe proporcionar una implementación para todos los métodos definidos en esa interfaz. En este caso, Camion implementa los métodos costeTotal y tipoEmbalaje según la lógica especificada en el enunciado del problema. 

El método costeTotal calcula el coste total del envío en función del código postal de destino, mientras que tipoEmbalaje determina el tipo de embalaje requerido para el paquete en base a sus dimensiones y peson implementa la interfaz IComun, lo que significa que debe proporcionar una implementación para todos los métodos definidos en esa interfaz.

En este caso, Camion implementa los métodos costeTotal y tipoEmbalaje según la lógica especificada en el enunciado del problema. El método costeTotal calcula el coste total del envío en función del código postal de destino, mientras que tipoEmbalaje determina el tipo de embalaje requerido para el paquete en base a sus dimensiones y peso.


- Bicicleta
  
La clase Bicicleta implementa la interfaz IComun, lo que significa que debe proporcionar una implementación para todos los métodos definidos en esa interfaz. En este caso, Bicicleta implementa los métodos costeTotal y tipoEmbalaje según la lógica especificada en el enunciado del problema. 

El método costeTotal calcula el coste total del envío en función del código postal de destino, mientras que tipoEmbalaje determina el tipo de embalaje requerido para el paquete en base a sus dimensiones y peso.


- TransporteFactory
  
  La clase TransporteFactory proporciona un método estático getTransporte que permite obtener instancias de diferentes tipos de transporte.

Utiliza constantes definidas para representar los diferentes tipos de transporte (CAMION y BICICLETA). Cuando se llama al método getTransporte con un tipo específico, devuelve una instancia del tipo correspondiente de objeto que implementa la interfaz IComun (en este caso, Camion o Bicicleta). Si se proporciona un tipo de transporte no válido, el método devuelve null.


- com.DAM2024.factoryTransporte.App

  La clase com.DAM2024.factoryTransporte.App es la clase principal de la aplicación. En el método main, se prueba el funcionamiento de la fábrica de transporte. Se obtiene una instancia de camión desde la fábrica utilizando el método getTransporte.

   Si se pudo obtener la instancia del camión, se realizan operaciones con él y se muestran los resultados. Si no se pudo obtener la instancia del camión, se muestra un mensaje de error.

  
  
## Resultado

El resultado de la unión de todos los códigos proporcionados es una aplicación en Java que gestiona el envío de paquetes utilizando diferentes tipos de transporte, como camiones y bicicletas. La aplicación sigue un diseño orientado a objetos y utiliza el patrón Factory para la creación de instancias de los diferentes tipos de transporte. Además, utiliza interfaces y clases abstractas para definir un conjunto común de métodos y comportamientos para los diferentes tipos de transporte.
Gracias a la utilización de esta forma de codificar podemos tener un código más limpio y ordenado de forma que podamos usar palabras declaradas como variables final así como CAMION y no tener la necesidad de utilización de números enteros para definir que variables tenemos que utilizar. Así también evitamos la duplicación de código ya que las variables están isntanciadas en la interfaz y no hay que replicarlas en la clase Camión como en la clase Bicicleta. 
