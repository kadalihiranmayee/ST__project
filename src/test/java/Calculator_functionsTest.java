import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class Calculator_functionsTest {
    public static Calculator_functions obj;

    @BeforeClass
    public static void setup(){obj = new Calculator_functions();}
    @Test
    public void test_add(){
        assertEquals(10,obj.add(5,5));
    }
    @Test
    public void integration_test1(){
        assertEquals(4,obj.mul(obj.add(1,1),obj.sub(4,2)));
    }
    @Test
    public void integration_test2(){
        assertEquals(3,obj.sub(obj.add(2,2),obj.mul(1,1)));
    }
}
