# Proyecto Biblioteca

Este proyecto consiste en la implementación de una clase `Biblioteca` que gestiona una colección de libros, representados por la clase `Libro`.

## Clases Principales

* **Libro.java:** Representa un libro con atributos como título, autor y año de publicación.
* **Biblioteca.java:** Gestiona una colección de objetos `Libro`, permitiendo agregar, eliminar y buscar libros.

## Funcionalidades

* **Libro:**
    * Constructor para inicializar un libro con título, autor y año de publicación.
    * Métodos getter y setter para acceder y modificar los atributos del libro.
* **Biblioteca:**
    * Métodos para agregar y eliminar libros de la biblioteca.
    * Métodos para buscar libros por título o autor.
    * Método para obtener la lista completa de libros en la biblioteca.

## Tests Unitarios

El proyecto incluye tests unitarios para verificar la funcionalidad de las clases `Libro` y `Biblioteca`.

* **LibroTest.java:** Tests para la clase `Libro`, verificando el constructor y los métodos getter/setter.
* **BibliotecaTest.java:** Tests para la clase `Biblioteca`, verificando los métodos de agregar, eliminar y buscar libros.

## Cómo Utilizar

1.  Clona el repositorio desde GitHub:
    ```bash
    git clone <URL_del_repositorio>
    ```
2.  Abre el proyecto en tu IDE preferido (IntelliJ IDEA, Eclipse, etc.).
3.  Ejecuta los tests unitarios para verificar la funcionalidad del proyecto.
4.  Puedes utilizar las clases `Libro` y `Biblioteca` en tus propios proyectos, importándolas y creando instancias de ellas.

## Documentación Javadoc

La documentación Javadoc se encuentra en el directorio `docs/javadoc` (o similar, dependiendo de la configuración de tu proyecto). Puedes generar la documentación ejecutando el comando `gradle javadoc` o a través de tu IDE.

### Autora

[Tanimara Elias Santos](https://github.com/tanimaraeliassantos)

### Versión

1.0.0
