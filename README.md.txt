Práctica: Implementación de Pilas y Ofuscación con Maven
Este repositorio contiene la entrega final de la práctica de Estructura de Datos. El proyecto está dividido en dos módulos administrados con Maven.

Estructura del Repositorio
umg.edu.gt.data-structure.stack: Librería principal que contiene la lógica de la estructura de datos (Pila/Stack) y el algoritmo validador de símbolos.

stackHandler: Proyecto ejecutable que implementa la librería anterior para realizar pruebas de validación desde la consola.

Tecnologías y Herramientas
Java

Maven (para gestión de dependencias y empaquetado)

ProGuard (para ofuscación de código)

CFR (para pruebas de ingeniería inversa)

Instrucciones de Compilación
Para compilar y ofuscar ambos proyectos, ubíquese en la raíz de cada módulo y ejecute:
mvn clean package

Prueba de Regresión (Ejecución)
Para probar el correcto funcionamiento del código ofuscado desde la terminal, ejecute el siguiente comando asegurándose de tener las rutas correctas a los archivos JAR:
java -cp target\stackHandler-0.0.1-SNAPSHOT-obf.jar;..\umg.edu.gt.data-structure.stack\target\umg.edu.gt.data-structure.stack-0.0.3-SNAPSHOT-obf.jar stackHandler.handler.Main
