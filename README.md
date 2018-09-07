# operacionesRecursivas
***** README IN ENGLISH *****
This repository contains a folder called "operations" which
It contains some files developed in Java, which correspond to what the title of the repository refers to (recursive operations).
the path of the files is: OperacionesRecursivas / Operaciones / src / Recursividad /

The files are:

Resta.java		      (subtraction)
Multiplicaion.java 	(multiplication)
Division.java 		  (dividing)
Factorial.java		  (factorial)		
Raiz.java     		  (square)
Potencia.java		    (pow)
  
These files contain lines of code that will make what alludes their respective names. But with one characteristic, the
which is that, each mathematical operation will be developed recursively and not iteratively (use of repetitive cycles).

[IF YOU ALREADY KNOW WHAT RESURSIVITY IS, DO NOT READ THIS SECTION]

*** RECURSIVITY *****


Recursivity is a programming technique that is used to make a call to a
function from itself, hence its name. The most used example for its easy understanding is
the calculation of factorial numbers. The factorial of 0 is, by definition, 1. The factorials of numbers
greater are calculated by multiplying 1 * 2 * ..., increasing the number of 1 in 1
until you reach the number for which the factorial is being calculated.

A recursive algorithm is an algorithm that expresses the solution of a problem in terms of
a call to himself. The call to itself is known as recursive or recurrent call.

***** SOURCE OF THE MEANING OF RESURSIVITY: http://webdelprofesor.ula.ve/nucleotrujillo/jalejandro/Prog2/Unidad3.pdf *****

***** DESIGN OF A RECURSIVE ALGORITHM *****

For a function or recursive procedure to work, it must be fulfilled that:

-It exists a non-recursive output of the procedure or function and works correctly in that case.
-Every call to the procedure or function refers to a smaller case of it.
-Facts the entire procedure or function correctly.

In order to build any recursive routine taking into account the above, we can use the following method:

-First, get an exact definition of the problem.
- Next, determine the size of the complete problem to solve. This will determine the values of the
parameters in the initial call to the procedure or function.
-Third, solve the base case in which the problem can be expressed not recursively. This will ensure that point 1 of the test is met
previous.
-Finally, correctly solve the general case, in terms of a smaller case of the same problem (a recursive call).
This will ensure compliance with points 2 and 3 of the test.

When the problem has a formal definition, possibly mathematical, the algorithm derives directly and is easily implementable
in other cases we must find the most convenient solution.

***** SOURCE OF THE DESIGN OF AN ALGORITHM: https://www.monografias.com/trabajos104/larecursividad/larecursividad.shtml *****

***** COMMENTARY *****

The crucial thing in this type of something is to define the base case, that is. The minimum expression at which the mathematical process is reached.
For example :

In multiplication, one of the base cases would be when an "A" number is multiplied by 0 or vice versa, a "B" number is multiplied by 0.
the result of any of those 2 cases would be 0. Another base case of serious multiplication in which an "A" number is multiplied by 1,
or when a number "B" is multiplied by 1. The result of any of those 2 cases will give the same number "A" or the same number "B".
Having defined the base cases, we proceed to create a call of the method that we created within the same method, with the difference that
Within that call, you must specify a decrease argument to reach the base case.

[END OF THE COMMENT]
[END OF THE SECTION]

IMPORTANT!

THE FILES :

FACTORIAL.JAVA
POTENCIACION.JAVA
MULTIPLICACION.JAVA


THEY ARE FULLY FUNCTIONAL ... THE OTHER NOT.
SO THE REST LEAVES THEM INTENTIONALLY IN THE REPOSITORY, FOR THE STUDY OF THESE THEMSELVES.

----------------------------------------------------------------------------------------------------------------------------------------

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

Estos archivos contienen lineas de codigo que realizaran a lo que hace alusion sus respectivos nombres. Pero con una caracterisitca, la 
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
