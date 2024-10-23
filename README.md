# Proyecto de Automatización de Pruebas

## Descripción del Proyecto

Este proyecto es un caso de prueba de automatización desarrollado utilizando **IntelliJ IDEA**, **Serenity** y **Cucumber** con la metodología **Page Object Model (POM)**. El objetivo principal es validar el proceso de inicio de sesión de un usuario registrado en una página web.

## Características

- **Automatización de Pruebas**: Se implementa un escenario que verifica el inicio de sesión exitoso.
- **Uso de Cucumber**: Permite definir pruebas en un lenguaje comprensible para todos los stakeholders.
- **POM**: Facilita el mantenimiento del código al separar la lógica de la interfaz de usuario.

## Escenario de Prueba

A continuación se detalla el archivo de características de Cucumber utilizado en el proyecto:

```gherkin
# language: es

Característica: Validar inicio de sesión
  Como usuario ya registrado, quiero logearme en la página

  Escenario: El usuario inicia sesión exitosamente
    Dado que el usuario abra la URL de la página principal y esté previamente registrado
    Cuando ingresar nombre de usuario, contraseña
    Entonces en la parte superior verá un panel con el nombre del usuario y un botón para cerrar sesión
```
