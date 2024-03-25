Miembros
- Andres David Restrepo Hernandez
- JAVA
- IntelliJ Idea
- Amazon Corretto 17

Instrucciones:
Desarrolla un sistema llamado "creación de seres vivos", dividiéndolos en dos categorías principales: aquellos que pertenecen al cielo y aquellos que pertenecen a la tierra. Los seres vivos de la tierra no podrán acceder a ciertas características de los seres del cielo, excepto los humanos. Además, implementaremos el patrón de diseño Factory, utilizando una interfaz común Creator para ambos tipos de seres vivos.
Paquete BeingsOfTheEarth:
En este paquete, crea las clases relacionadas con los seres vivos que pertenecen a la tierra. Todas las clases en este paquete deben extender LivingBeing y solo pueden acceder a las interfaces y métodos relacionados con EarthBeing.
Paquete SkyBeings:
En este paquete, crea las clases relacionadas con los seres vivos que pertenecen al cielo. Todas las clases en este paquete deben extender LivingBeings y pueden acceder a las interfaces y métodos relacionados tanto con EarthBeing como con SkyBeing.
Interfaz EarthBeing:
Crea una interfaz llamada EarthBeing que contenga métodos relacionados con los seres terrestres, como nacer(), crecer(), regenerarse(), morir().
Interfaz SkyBeing:
Crea una interfaz llamada SkyBeing que contenga métodos relacionados con los seres celestiales, como volar(), cambiarDimensión(), etc.
Clase abstracta LivingBeings:
Crea una clase abstracta llamada LivingBeings que contenga métodos comunes para todos los seres vivos, como nacer(), crecer(), reproducirse(), morir().
Interfaz Creator:
Crea una interfaz llamada Creator que defina un método createLivingBeings().
Implementa esta interfaz en una clase concreta para crear instancias de seres vivos.
Clase LivingBeingCreator:
Implementa la interfaz Creator en esta clase para crear instancias de seres vivos tanto de la tierra como del cielo.

Clase Human:
En el paquete EarthBeing, crea una clase Human que extienda de LivingBeing e implemente EarthBeing y SkyBeing.
Implementa los métodos de la interfaz según corresponda para un humano.

Tareas:
• Implementa las clases, interfaces y el patrón de diseño Factory Method según los requisitos especificados y organízalos en los paquetes correspondientes.
• Crea instancias de seres vivos como humanos, animales y aves usando la clase LivingBeingCreator.
• Verifica que los seres vivos en la tierra no puedan acceder a características de los seres vivos en el cielo, excepto los humanos.

Observaciones:
Utiliza la herencia e interfaces para organizar y compartir comportamientos comunes entre diferentes tipos de seres vivos.
Utiliza la separación de paquetes y modificadores de acceso para controlar el acceso a características de criaturas del cielo desde criaturas de la tierra.
Implementa el patrón de diseño Factory utilizando la interfaz Creator para crear dinámicamente instancias de seres vivos.
