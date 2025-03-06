import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Esta clase contiene tests unitarios para la clase Libro.
 */
public class LibroTest {

    private Libro libro;

    /**
     * Configura un objeto Libro antes de cada test.
     */
    @BeforeEach
    void setUp() {
        libro = new Libro("Cien años de soledad", "Gabriel García Marquez", 1967);
    }

    /**
     * Test para el constructor de la clase Libro.
     * Verifica que el constructor inicializa correctamente los atributos del libro.
     */
    @Test
    void testConstructor() {
        assertEquals("Cien años de soledad", libro.getTitulo());
        assertEquals(1967, libro.getAnioPublicacion());
        assertEquals("Gabriel García Marquez", libro.getAutor());
    }

    /**
     * Test para el método getTitulo() de la clase Libro.
     * Verifica que el método devuelve el título correcto del libro.
     */
    @Test
    void testGetTitulo() {
        assertEquals("Cien años de soledad", libro.getTitulo());
    }

    /**
     * Test para el método setTitulo() de la clase Libro.
     * Verifica que el método actualiza correctamente el título del libro.
     */
    @Test
    void testSetTitulo() {
        libro.setTitulo("Título cambio");
        assertEquals("Título cambio", libro.getTitulo());
    }
}
