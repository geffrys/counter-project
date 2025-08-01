# Casos de Uso de la Aplicación

# Registro de Usuario
## Descripción
Permitir al usuario iniciar sesion o registrarse en la aplicacion. Las posibles maneras de registro seran:
- Con una cuenta de Google
- Con una cuenta de Facebook
- Con una cuenta de Apple
La gestion de usuarios se delegara a algun servicio de terceros, como Firebase Authentication.
Solo se necesitara un nombre de usuario por temas de familiaridad en la aplicacion y un userId para identificar al usuario en la base de datos.
## Requisitos
- El usuario debe poder registrarse con una cuenta de Google, Facebook o Apple.
- El usuario debe poder iniciar sesión con una cuenta de Google, Facebook o Apple.
- El usuario debe poder recuperar su contraseña si la olvida.
- El usuario debe poder cambiar su nombre de usuario.
- El usuario debe poder eliminar su cuenta.
- El usuario debe poder ver su perfil.
- El usuario debe poder ver su historial de contadores.

# Contador
## Descripción
**premisas**: El usuario debe estar registrado e iniciar sesión en la aplicación.
La pantalla principal del usuario sera un contador de dias, que se ira incrementando a medida que pasan los dias sin PMO. El contador se reiniciara si el usuario tiene un episodio de PMO.
## Requisitos
- El usuario debe poder ver su contador de días. (se guardara la fecha inicial del contador en base de datos y posteriormente la fecha final.)
- El usuario debe poder reiniciar su contador de días si tiene un episodio de PMO.
- El usuario debe poder ver su historial de contadores.
- El usuario debe poder establecer un objetivo de días sin PMO.
- El usuario debe poder ver su progreso hacia su objetivo de días sin PMO.

