# Proceso de creación
<!-- TODO: #1 Esquematizarlo en xQ,Q,pQ,C -->

> El viaje

Las soluciones aquí expuestas, en su mayoría, son propuestas tentativas, dado que existen diversas maneras de abordar estos problemas. Sin embargo, todas ellas se han diseñado siguiendo principios específicos para asegurar que son soluciones efectivas y coherentes con su entorno y contexto: no es lo mismo intentar resolverlo con los conocimientos adquiridos en la asignatura de Programación 1 que con los que se han acumulado cuando se está cursando Programación 2 o Ingeniería del Software 2.

Además, se hace un esfuerzo constante por documentar detalladamente el proceso creativo. Esto incluye no solo el código final, sino también los criterios considerados durante su desarrollo, la secuencia de su aplicación y cualquier debate o incertidumbre que surgiera en el camino. El objetivo es brindar una comprensión completa de cómo y por qué se llegó a la solución final.

## ¿Cómo?

Para el caso de un reto, por ejemplo el CCCF, tendríamos:

<div align=center>

|[pyCCCF](https://github.com/puntoReflex/pyCCCF)|⬅️ Página principal|
|:-:|-|
<a href="https://github.com/puntoReflex/pyCCCF/blob/main/enunciado.md"><img src="https://raw.githubusercontent.com/puntoReflex/pyCCCF/main/imagenes/shoppingCF.png" width=200></a>|⬅️ Enunciado
[**PRG1**](https://github.com/puntoReflex/pyCCCF/blob/main/src/vPRG1/README.md) / PRG2| ⬅️↙️ Propuestas de solución
[**EDA1**](https://github.com/puntoReflex/pyCCCF/blob/main/src/v000/README.md) / EDA2
BD1 / BD2
[**IdSw1**](https://github.com/puntoReflex/pyCCCF/blob/main/mdd.md) / IdSw2 
SdPp / SiC
PWeb1 / PWeb2

</div>

### Las propuestas de solución

Los [commits](https://github.com/puntoReflex/pyCCCF/commits/main/src/vPRG1/CCCF.java) de los archivos que componen la solución han de permitir situarnos en diversos estadios de su creación, de modo que pueda verse como ha ido evolucionando desde el [inicio](https://github.com/puntoReflex/pyCCCF/blob/27b17731c49bc0f0742e52dfaa5b2e593a92820e/src/vPRG1/CCCF.java) de su construcción hasta el [final](https://github.com/puntoReflex/pyCCCF/blob/b6c3ae9e96053c61efaa72df25cf466732c38946/src/vPRG1/CCCF.java). Cada commit detalla la decisión abordada, de modo que puede leerse históricamente (de abajo hacia arriba).

<div align=center>

|Commit|Commit esquema|Commit detallado|
|-|-|-|
[![](/images/commits_cccf.png)](https://github.com/puntoReflex/pyCCCF/commits/main/src/vPRG1/CCCF.java)|[![](/images/commitEsquema.png)](https://github.com/puntoReflex/.github/commits/viajeMarco/prg1/desarrollo/retos%26proyectos/viajeMarco/src/vPRG1/Marco.java)|[![](/images/commitDetalle.png)](https://github.com/puntoReflex/.github/commits/viajeMarco/prg1/desarrollo/retos%26proyectos/viajeMarco/src/vPRG1/Marco.java)|

</div>

## Convención de nombrado de ramas

Para mantener una estructura clara y organizada, se seguirá una convención específica para nombrar las ramas. Esta convención facilita la identificación del contenido de cada rama y ayuda tanto en el desarrollo como en la navegación por parte de los estudiantes.

Cada rama en este repositorio sigue el formato **nombre-del-reto/asignatura/tipo-de-trabajo**

Donde:

- **nombre-del-reto**: es el nombre del problema o reto de programación. Este nombre es un identificador único que describe el desafío general que se aborda en la rama.
- **asignatura**: representa la asignatura o el nivel del curso para el cual se está desarrollando o explicando la solución. Esto puede ser una abreviatura o un nombre corto que identifique claramente la asignatura o el módulo del curso.
- **tipo-de-trabajo**: describe el enfoque o aspecto específico del reto que se está manejando en la rama. Por ejemplo, puede ser desarrollo para el desarrollo paso a paso de la solución, solucion-final para la solución completa, o cualquier otro término que describa claramente el propósito de la rama.

Ejemplos:

**viajeMarco/prg1/desarrollo**: Rama para el desarrollo del reto "Viaje de Marco" en el curso de Programación 1.
**pyRescate/idsw/modeloDelDominio**: Rama dedicada al desarrollo del modelo del dominio para un reto sobre el sistema solar en la asignatura de Ingeniería de Software.

Esta convención ayuda a mantener un repositorio bien organizado y accesible, facilitando la localización de los recursos y ejemplos relevantes para su aprendizaje.
