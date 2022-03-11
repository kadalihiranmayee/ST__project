import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class Calculator_functionsTest {
    public static Calculator_functions obj;

    @BeforeClass
    public static void setup(){obj = new Calculator_functions();}

    @Test
    public void test_add() {
        assertEquals(0,obj.add(2,2));

    }
    @Test
    public void test_sub() {
        assertEquals(1,obj.sub(3,2));

    }
}
