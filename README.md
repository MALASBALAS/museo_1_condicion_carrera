# MUSEO — demostración de condición de carrera

## Descripción

Proyecto pequeño que simula entradas y salidas a una sala (aforo). Su objetivo es demostrar cómo, sin mecanismos de sincronización, las operaciones concurrentes sobre un mismo recurso pueden provocar condiciones de carrera y resultados no deterministas.

## Funcionamiento

1. Cada hilo de tipo `Entrada` incrementa el aforo de la sala.
2. Cada hilo de tipo `Salida` decrementa el aforo de la sala.
3. Las operaciones sobre `aforo` se realizan sin sincronización deliberadamente para mostrar la condición de carrera.

## Cómo ejecutar

1. Compilar el proyecto:

```bash
mvn package
```

2. Ejecutar:

```bash
java -cp target/classes es.tgpbalas.museo_condicion_carrera.Main
```

## Notas y recomendaciones

En mis pruebas he puesto totales altos para ver la condicion de carrera
