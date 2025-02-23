# Análisis del algoritmo

## Análisis de la estructura principal

```java
while (onJourney) {  // Bucle principal
    days++;
    // Cálculos aleatorios y ajustes - O(1)
    marcoVelocity = Math.random() * 5 + 10;
    marcoTime = Math.random() * 2 + 8;
    // ... más cálculos O(1)
    remainingDistance = remainingDistance - marcoAdvance + MOTHER_ADVANCE;
    // Impresiones - O(1)
}
```

## Patrones

- Un único bucle principal.
- Operaciones constantes dentro del bucle.
- La condición de parada depende de una distancia que se reduce.

## Análisis de complejidad

### Temporal

- Sea n la distancia inicial (350 km)
- En cada iteración:
  - Marco avanza una distancia variable (media ≈ 12.5 km/h * 9 h = 112.5 km/día)
  - La madre avanza 80 km/día
  - Avance neto ≈ 32.5 km/día en condiciones ideales
- Complejidad: O(n) donde n es la distancia inicial

### Espacial

- Variables fijas independientes de la entrada.
- No hay estructuras de datos que crezcan.
- Complejidad: O(1).

## Consideraciones especiales

- La aleatoriedad afecta el número de iteraciones pero no la complejidad.
- Las constantes (velocidades, tiempos) afectan el rendimiento práctico.
- La complejidad teórica sigue siendo lineal respecto a la distancia.
