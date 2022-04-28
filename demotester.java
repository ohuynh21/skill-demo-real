import static org.junit.Assert.*;
import org.junit.*;

public class demotester {
    @Test
    public void testShout(){
        assertEquals("Hi", demo.shout("Hi"));
    }   
}
