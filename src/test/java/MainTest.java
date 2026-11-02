import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void testHypothenuse() {
        Assertions.assertEquals(Main.hypotenuse(1,1),Math.sqrt(2));
        Assertions.assertEquals(
                Main.hypotenuse(10,20),
                Math.sqrt(
                        Math.pow(10,2) + Math.pow(20,2)
                )
        );
    }
}
