# Hello TDD

## ¿Qué es TDD?

* Es una metodología de desarrollo (**NO** de testing) cuyo objetivo es liberar de forma ágil código limpio y sostenible.
* Comenzar por los tests ayuda a pensar en el diseño (si el test es difícil, quizás el diseño no es el apropiado).
* Implementar el mínimo código de producción para cubrir nuestros requerimientos.

## Las 3 Reglas

1. No escribas ningún código de producción hasta que hayas escrito primera la prueba que falle debido a la falta de ese código.
2. Escribe de una prueba solo lo necesario para que falle o no compile. Resuelve el fallo escribiendo algo de código de producción.
3. No escribas más código de producción del que sea suficiente para pasar la prueba que falla. Primero haz que funcione, luego hazlo bien (Refactor). Una vez que pase, escribe más código de prueba.

## Ciclo de TDD

![tddredgreenrefactor.webp](doc/tdd-red-green-refactor.webp?t=1665124419749)


## Pautas

* Escribe la prueba que te obliga a escribir el código que ya sabes que quieres escribir.
* Haz que falle. Haz que pase. Refactoriza.
* No vayas a por el oro.
* Escribe la prueba mas simple, mas escecífica y más degradada que va a fallar.
* Generaliza cuando sea posible.
* Cuando el código dé la sensación de estar mal, arreglado
