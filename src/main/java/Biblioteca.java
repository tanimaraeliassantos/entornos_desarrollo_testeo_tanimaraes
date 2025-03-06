import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase representa una Biblioteca que gestiona una colección de libros.
 */
public class Biblioteca {

    /**
     * Lista de libros en la biblioteca.
     */
    private final List<Libro> libros;

    /**
     * Constructor por defecto de la Biblioteca.
     * Inicializa una lista vacía de libros.
     */
    public Biblioteca() {
        libros = new ArrayList<>();
    }

    /**
     * Constructor de la Biblioteca que acepta una lista inicial de libros.
     *
     * @param libros La lista inicial de libros.
     */
    public Biblioteca(List<Libro> libros) {
        this.libros = libros;
    }

    /**
     * Agrega un libro a la biblioteca.
     *
     * @param libro El libro a agregar.
     * @return true si el libro se agregó correctamente, false en caso contrario.
     */
    public boolean agregarLibro(Libro libro) {
        return libros.add(libro);
    }

    /**
     * Elimina un libro de la biblioteca.
     *
     * @param libro El libro a eliminar.
     * @return true si el libro se eliminó correctamente, false en caso contrario.
     */
    public boolean eliminarLibro(Libro libro) {
        return libros.remove(libro);
    }

    /**
     * Obtiene la lista de libros en la biblioteca.
     *
     * @return La lista de libros.
     */
    public List<Libro> getLibros() {
        return libros;
    }

    /**
     * Busca un libro por su título en la biblioteca.
     *
     * @param titulo El título del libro a buscar.
     * @return El libro encontrado, o null si no se encuentra.
     */
    public Libro encuentraLibroPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                return libro;
            }
        }
        return null;
    }

    /**
     * Busca un libro por su autor en la biblioteca.
     *
     * @param autor El autor del libro a buscar.
     * @return El libro encontrado, o null si no se encuentra.
     * @deprecated Este método está obsoleto. Use {@link #encuentraLibrosPorAutor(String)} en su lugar.
     */
    @Deprecated
    public Libro encuentaLibroPorAutor(String autor) {
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                return libro;
            }
        }
        return null;
    }

    /**
     * Busca libros por su autor en la biblioteca.
     *
     * @param autor El autor de los libros a buscar.
     * @return Una lista de libros encontrados, o null si no se encuentra ninguno.
     * @since 2.0
     */
    public List<Libro> encuentraLibrosPorAutor(String autor) {
        List<Libro> listaLibros = null;
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                if (listaLibros == null) {
                    listaLibros = new ArrayList<>();
                }
                listaLibros.add(libro);
            }
        }
        return listaLibros;
    }
}
