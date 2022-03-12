import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class Calculator_functionsTest {
    public static Calculator_functions obj;

    @BeforeClass
    public static void setup(){obj = new Calculator_functions();}

    @Test
    public void test_add() {
        assertEquals(4,obj.add(2,2));

    }
    @Test
    public void test_sub(){
        assertEquals(3, obj.sub (6,3));
    }

    @Test
    public void test_mult(){
        assertEquals(18, obj.mult (6,3));
    }

    @Test
    public void test_div(){assertEquals(7,obj.div(21,3));}

    }
