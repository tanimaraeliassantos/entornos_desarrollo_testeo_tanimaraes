import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BibliotecaTest {

    private Biblioteca biblioteca;
    private Libro libro1;
    private Libro libro2;

    @BeforeEach
    void setUp() {
        biblioteca = new Biblioteca();
        libro1 = new Libro("El principito", "Antoine de Saint-Exupery", 1943);
        libro2 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 1605);
    }

    @Test
    void testAgregarLibro() {
        assertTrue(biblioteca.agregarLibro(libro1));
        assertTrue(biblioteca.getLibros().contains(libro1));
    }

    @Test
    void testEliminarLibro() {
        biblioteca.agregarLibro(libro1);
        assertTrue(biblioteca.eliminarLibro(libro1));
        assertFalse(biblioteca.getLibros().contains(libro1));
    }

    @Test
    void testEncuentraLibrosPorAutor_AutorExiste() {
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(new Libro("Orgullo y prejuicio", "Jane Austen", 1813));
        List<Libro> librosEncontrados = biblioteca.encuentraLibrosPorAutor("Jane Austen");
        assertNotNull(librosEncontrados);
    }

    @Test
    void testEncuentraLibrosPorAutor_AutorNoExiste() {
        List<Libro> librosEncontrados = biblioteca.encuentraLibrosPorAutor("Jorge Amado");
        assertNull(librosEncontrados);
    }
}
