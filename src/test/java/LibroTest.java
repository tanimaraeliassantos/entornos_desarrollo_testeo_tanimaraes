import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibroTest {

    private Libro libro;

    @BeforeEach
    void setUp() {
        libro = new Libro("Cien años de soledad", "Gabriel García Marquez",1967);
    }

    @Test
    void testConstructor() {
        assertEquals("Cien años de soledad", libro.getTitulo());
        assertEquals(1967, libro.getAnioPublicacion());
        assertEquals("Gabriel García Marquez", libro.getAutor());
    }

    @Test
    void testGetTitulo() {
       assertEquals("Cien años de soledad", libro.getTitulo());
    }

    @Test
    void testSetTitulo() {
        libro.setTitulo("Título cambio");
        assertEquals("Título cambio", libro.getTitulo());
    }
}
