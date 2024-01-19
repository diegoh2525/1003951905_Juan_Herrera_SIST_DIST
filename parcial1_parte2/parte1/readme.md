Parte 1: Proporcione un README
asociado que explica la implementación de estos principios y destaca la
independencia de las clases.
--Se usa SRP para tener una clase principal que no tenga razon de cambio y OCP con la labor de Extender el codigo y dejarlo cerrado para su modificacion


Parte 3: Responda a:        
Define el propósito de la clase base FiguraGeometrica y explica cómo contribuye a la
aplicación del Principio de Abierto/Cerrado (OCP). 
--Se deja una clase definida que alimentara a las demas donde se va evidenciando su extensio con cada figura


¿Cómo se aplica el Principio de Responsabilidad Única (SRP) en cada clase derivada
(cuadrado, triángulo, circunferencia) en relación con el cálculo del área?    
--Estas clases fueron creadas con la unica funcion de realizar la tarea que se le pidio, y no tiene porque cambiar.


Imagina que se desea agregar una nueva figura geométrica, un hexágono, al sistema.
¿Cómo podrías implementar esta adición siguiendo el Principio de
Abierto/Cerrado (OCP)?
--Se crearia otra clase heredando los objetos de la principal para asi extender el mismo codigo y pueda realizar su tarea.