**Definición:**
Las excepciones de Java son eventos que interrumpen la ejecución normal de un programa. Indica anomalías que pueden ocurrir durante la ejecución, como errores de entrada/salida, aritmética o manipulación de datos. 
Java proporciona un mecanismo de manejo de excepciones que permite detectar, propagar y manejar estos eventos de manera controlada.

**Tipos comunes de excepciones en Java:**

-NullPointerException: se produce al intentar acceder u operar en un objeto que aún no se ha inicializado (es decir, un objeto con un valor nulo). 

-ArrayIndexOutOfBoundsException: se produce al intentar acceder a un índice fuera del rango válido de la matriz.

-Excepción aritmética: se produce cuando se produce un error aritmético, como dividir por cero. 

-NumberFormatException: esta excepción ocurre cuando intenta convertir una cadena en un número, pero la cadena no tiene el formato correcto para representar un número. 

-IOException: se produce cuando se produce un error en una operación de entrada/salida, como leer o escribir un archivo. 

-FileNotFoundException: una subclase de IOException que se lanza cuando se intenta acceder a un archivo que no existe. 

-InterruptedException: se lanza cuando un subproceso de ejecución se interrumpe en estado de espera, suspensión o espera. 

-ClassCastException: se produce cuando se intenta utilizar la conversión de tipos (conversión) para convertir un objeto de una manera incompatible. 

-UnsupportedOperationException: esta excepción se lanza para indicar que la operación no es compatible ni implementada. 

-IllegalArgumentException: se produce si se pasan argumentos ilegales o inapropiados al método.
