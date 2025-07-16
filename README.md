# Registro de Empleados - Herencia en Java

Este proyecto es una extensión del sistema de registro de empleados desarrollado en la Unidad 2. En esta versión, se implementa el concepto de **herencia** en Java, reutilizando y extendiendo la clase base `Empleado`.

## 👨‍🏫 Objetivo

Demostrar el uso de herencia mediante clases derivadas que comparten atributos y métodos de una clase base, y que además agregan comportamiento propio.

## 🧱 Estructura de Clases

### Clase base: `Empleado`
Contiene atributos comunes:
- `nombre`
- `edad`
- `salario`

También incluye el método:
- `mostrarInformacion()`

### Subclases creadas:

#### ✅ `Gerente` (extends Empleado)
- Atributo nuevo: `departamento`
- Método sobrescrito: `mostrarInformacion()`
- Método adicional: `aprobarPresupuesto()`

#### ✅ `Tecnico` (extends Empleado)
- Atributo nuevo: `especialidad`
- Método sobrescrito: `mostrarInformacion()`
- Método adicional: `realizarMantenimiento()`

## 💻 Ejemplo de uso en `Main.java`

```java
Gerente gerente = new Gerente("Laura", 40, 50000, "Recursos Humanos");
Tecnico tecnico = new Tecnico("Carlos", 30, 30000, "Redes");

gerente.mostrarInformacion();
gerente.aprobarPresupuesto();

tecnico.mostrarInformacion();
tecnico.realizarMantenimiento();
