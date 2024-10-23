#language:es

  Característica: Validar inicio de sesion
    Como usuario ya registrado, quiero logearme en la pagina

  Escenario: El usuario inicia sesion exitosamente
    Dado que el usuario abra la url de la pagina principal y este previamente registrado
    Cuando ingresar nombre de usuario, contraseña
    Entonces en la parte superior vera un panel con el nombre del usuario y un boton para cerrar sesion