import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BugServiceTest {

    @Test
    void testAddBug() {
        BugService service = new BugService();
        assertTrue(service.addBug(1, "Bug One"));
    }

    @Test
    void testDuplicateBugId() {
        BugService service = new BugService();
        service.addBug(1, "Bug One");
        assertFalse(service.addBug(1, "Duplicate Bug"));
    }

    @Test
    void testCloseBug() {
        BugService service = new BugService();
        service.addBug(1, "Bug One");
        assertTrue(service.closeBug(1));
    }

    @Test
    void testCloseInvalidBug() {
        BugService service = new BugService();
        assertFalse(service.closeBug(99));
    }
}
