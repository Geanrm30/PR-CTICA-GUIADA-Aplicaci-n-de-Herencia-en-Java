# Práctica Guiada: Aplicación de Herencia en Java

Implementación de herencia en Java mediante dos sistemas desarrollados en parejas, demostrando el uso de clases padre e hijas, sobrescritura de métodos y reutilización de código.

## Ejercicio 1 - Sistema de Vehículos

Modela distintos tipos de vehículos utilizando herencia.

### Clases

- **Vehiculo** - Clase base con atributos `marca` y `modelo` y método `mostrarInfo()`
- **Carro** - Hereda de Vehiculo, agrega `numeroPuertas` y sobrescribe `mostrarInfo()`
- **Moto** - Hereda de Vehiculo, agrega `tipo` y sobrescribe `mostrarInfo()`

## Ejercicio 2 - Sistema de Empleados

Modela distintos tipos de empleados utilizando herencia.

### Clases

- **Empleado** - Clase base con atributos `nombre` y `salario` y método `calcularSalario()`
- **EmpleadoTiempoCompleto** - Hereda de Empleado, retorna salario base fijo
- **EmpleadoPorHoras** - Hereda de Empleado, agrega `horasTrabajadas` y calcula salario según horas trabajadas

## Conceptos aplicados

- Herencia con `extends`
- Llamada al constructor del padre con `super()`
- Sobrescritura de métodos con `@Override`
- Encapsulamiento con atributos privados y getters

## Estructura del proyecto

```
src/
├── sistemaVehiculos/
│   ├── Vehiculo.java
│   ├── Carro.java
│   ├── Moto.java
│   └── Main.java
│
└── sistemaEmpleados/
    ├── Empleado.java
    ├── EmpleadoTiempoCompleto.java
    ├── EmpleadoPorHoras.java
    └── Main.java
```

## Curso

Programación Orientada a Objetos - Universidad Americana (UAM)
