## Tabla 1. Escenario 1: arreglo completamente desordenado

| Tamaño de muestra | Tiempo Inserción | Tiempo QuickSort | Algoritmo más rápido | Observación |
|---|---|---|---|---|
| 10.000 | 770.61 ms | 9.44 ms  |	QuickSort  | QuickSort es drásticamente más eficiente incluso en la muestra más baja. |
| 50.000 | 30976.11 ms |44.86 ms  | QuickSort | Inserción escala de forma exponencial tardando más de 30 segundos.|
| 100.000 | 222956.21 ms |257.97 ms  | QuickSort  | En muestras grandes, Inserción toma casi 4 minutos; QuickSort tarda un pestañeo.|

## Tabla 2. Escenario 2: arreglo ordenado más una nueva persona

| Tamaño de muestra | Tiempo Inserción | Tiempo QuickSort | Algoritmo más rápido | Observación |
|---|---|---|---|---|
| 10.001 | 0.59 ms | 3.23 ms | Inserción | Inserción toma una ventaja rotunda al no requerir desplazamientos internos. |
| 50.001 | 4.63 ms | 48.86 ms | Inserción | Inserción se mantiene casi instantáneo a pesar de quintuplicar los datos. |
| 100.001 | 38.30 ms | 27.40 ms | Inserción | Inserción es casi 10 veces más rápido que QuickSort gracias al orden previo. |

## Análisis requerido

Después de completar las tablas, se debe responder:

- ¿Qué algoritmo fue más rápido en el escenario desordenado?
 Fue QuickSort. Mientras que a Inserción le tomó la enorme cantidad de $222.956,21\text{ ms}$ (casi 4 minutos) ordenar $100.000$ elementos, QuickSort lo resolvió en apenas $257.97\text{ ms}$.
- ¿Qué algoritmo fue más rápido en el escenario casi ordenado?
- Fue Inserción. Para el caso de $100.001$ datos, Inserción solo requirió $38.30\text{ ms}$ frente a los $327.40\text{ ms}$ de QuickSort
- ¿El crecimiento del tamaño de muestra afectó por igual a los dos algoritmos?
- No. En el escenario desordenado, al pasar de $10.000$ a $50.000$ elementos (5 veces más datos), el tiempo de Inserción se multiplicó casi por 40 (pasó de $\sim770\text{ ms}$ a $\sim30.976\text{ ms}$). En cambio, QuickSort solo aumentó unas 4.5 veces su tiempo, demostrando un crecimiento mucho más controlado y eficiente
- ¿Por qué Inserción puede mejorar cuando el arreglo ya está casi ordenado?
- Porque cuando los datos ya tienen un orden secuencial, el ciclo interno de Inserción casi no realiza comparaciones ni movimientos en memoria
- ¿Por qué QuickSort suele ser mejor cuando los datos están muy desordenados?
Porque su estrategia de "divide y vencerás" divide los arreglos de manera balanceada
**Nota:** Los resultados, observaciones y análisis deben ser escritos por cada uno con base en su ejecución. No se permite presentar análisis generados por IA.

## Conclusiones

Se debe redactar al menos tres conclusiones propias. Las conclusiones deben estar relacionadas directamente con los tiempos obtenidos.

- Conclusión 1: En base a los resultados obtenidos en las tablas quedo demostrado que ningun algoritmo es el mejor para todos los casos por ejemplo QuickSort supero por completo a Insercion en el escenario desordenado pero cuando el arreglo ya estaba casi ordenado con la persona extra Insercion fue muchisimo mas eficiente porque casi no realizo movimientos en la memoria
- 
- Conclusión 2: El tamaño de la muestra afecta de forma muy diferente a los tiempos de ejecucion dependiendo de la complejidad de cada metodo con 100.000 datos desordenados Insercion se demoro casi 4 minutos por su logica cuadratica mientras que QuickSort lo resolvio en solo 257 milisegundos lo que demuestra que para volumenes grandes de informacion siempre conviene usar divide y venceras
- 
- Conclusión 3: Tambien se concluye que la eleccion del pivote es un factor critico para el rendimiento al principio el programa se colgo por un desbordamiento de pila en el escenario ordenado pero al corregir el metodo para empezar desde el punto medio las particiones se equilibraron bien y el algoritmo pudo terminar las pruebas sin saturar la memoria de la computadora.

**Importante:** Las conclusiones no pueden ser generadas con IA. Deben reflejar su análisis a partir de los resultados reales de la práctica.
