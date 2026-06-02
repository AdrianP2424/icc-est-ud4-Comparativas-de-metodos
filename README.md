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
- ¿El crecimiento del tamaño de muestra afectó por igual a los dos algoritmos?
- ¿Por qué Inserción puede mejorar cuando el arreglo ya está casi ordenado?
- ¿Por qué QuickSort suele ser mejor cuando los datos están muy desordenados?

**Nota:** Los resultados, observaciones y análisis deben ser escritos por cada uno con base en su ejecución. No se permite presentar análisis generados por IA.

## Conclusiones

Se debe redactar al menos tres conclusiones propias. Las conclusiones deben estar relacionadas directamente con los tiempos obtenidos.

- Conclusión 1: ________________________________________________
- Conclusión 2: ________________________________________________
- Conclusión 3: ________________________________________________

**Importante:** Las conclusiones no pueden ser generadas con IA. Deben reflejar su análisis a partir de los resultados reales de la práctica.