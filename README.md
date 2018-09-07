# operacionesRecursivas
***** README IN SPANISH (LEEME EN ESPAÑOL) *****
Este repositorio contiene una carpeta llamada "operaciones" la cual
contiene unos archivos desarrollados en java que corresponden a lo que el titulo hace referencia (operaciones recursivas).
laruta de los archivos es : operacionesRecursivas/Operaciones/src/Recursividad/

Los archivos son:
Resta.java
Multiplicaion.java
Division.java
Factorial.java
Raiz.java
Potencia.java

Estos archivos contienen lineas de codigo que realizaran a lo que hace alusion sus respectivos nombres. Pero con una caracterisitca,la 
cual es que, cada operacion matematica se desarrollara de forma recursiva y no de forma iterativa (uso de cilos repetitivos).

[ SI YA SABES LO QUE ES LA RECURSIVIDAD, NO LEAS ESTE APARTADO ]

***** RECURSIVIDAD *****

Recursividad:
La recursividad es una técnica de programación que se utiliza para realizar una llamada a una
función desde ella misma, de allí su nombre. El ejemplo más utilizado por su fácil comprensión es
el cálculo de números factoriales. El factorial de 0 es, por definición, 1. Los factoriales de números
mayores se calculan mediante la multiplicación de 1 * 2 * ..., incrementando el número de 1 en 1
hasta llegar al número para el que se está calculando el factorial.

Un algoritmo recursivo es un algoritmo que expresa la solución de un problema en términos de
una llamada a sí mismo. La llamada a sí mismo se conoce como llamada recursiva o recurrente.

***** FUENTE DEL SIGNIFICADO DE RECURSIVIDAD : http://webdelprofesor.ula.ve/nucleotrujillo/jalejandro/Prog2/Unidad3.pdf *****

***** DISEÑO DE UN ALGORITMO RECURSIVO  *****

Para que una función o procedimiento recursivo funcione se debe cumplir que:

-Existe una salida no recursiva del procedimiento o función y funciona correctamente en ese caso.
-Cada llamada al procedimiento o función se refiere a un caso más pequeño del mismo.
-Funciona correctamente todo el procedimiento o función.

Para poder construir cualquier rutina recursiva teniendo en cuenta lo anterior, podemos usar el siguiente método:

-Primero, obtener una definición exacta del problema.
-A continuación, determinar el tamaño del problema completo a resolver. Así se determinarán los valores de los 
parámetros en la llamada inicial al procedimiento o función.
-Tercero, resolver el caso base en el que problema puede expresarse no recursivamente. Esto asegurará que se cumple el punto 1 del test 
anterior.
-Por último, resolver correctamente el caso general, en términos de un caso más pequeño del mismo problema (una llamada recursiva). 
Esto asegurará cumplir con los puntos 2 y 3 del test.

Cuando el problema tiene una definición formal, posiblemente matemática, el algoritmo deriva directamente y es fácilmente implementable
en otros casos debemos encontrar la solución más conveniente.

***** FUENTE DEL DISEÑO DE UN ALGORITMO : https://www.monografias.com/trabajos104/larecursividad/larecursividad.shtml *****

***** COMENTARIO *****
Lo crucial en este tipo de algoirtmo, es en definir el caso base, es decir. La expresion minima a la que se llega el proceso matematico. 
Por ejemplo : 
En la multiplicacion, uno de los casos bases seria cuando un numero "A" se multiplica por 0 o viceversa, un numero "B" se multiplica por 0. 
el resultado de cualquiera de esos 2 casos seria 0. Otro caso base de la multiplicacion seria en el que un numero "A" se multiplica por 1,
o cuando un numero "B" se multiplica por 1. El resultado de cualquiera de esos 2 casos dara elmismo numero "A" o el mismo numero "B".
Habiendo definido los casos bases se procede a crear una llamada del metodo que creamos dentro del mismo metodo, con la diferencia que
dentro de esa llamada, se debe especificar un argumento de disminucion para asi llegar al caso base.

[ FINAL DEL COMENTARIO ]
[ FINAL DEL APARTADO ]

¡IMPORTANTE!

LOS ARCHIVOS : 

FACTORIAL.JAVA
POTENCIACION.JAVA
MULTIPLICACION.JAVA


SON TOTALMENTE FUNCIONALES... LOS DEMAS NO. 
ASI QUE EL RESTO LOS DEJE INTENCIONALMENTE EN EL REPOSITORIO, PARA EL ESTUDIO DE ESTOS MISMOS.





