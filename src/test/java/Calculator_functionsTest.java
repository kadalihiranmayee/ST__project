import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class Calculator_functionsTest {
    public static Calculator_functions obj;

    @BeforeClass
    public static void setup(){obj = new Calculator_functions();}
//hiranmayee's testcase
    @Test
    public void test_add(){
        assertEquals(10,obj.add(5,5));
    }
//murtaza's testcase
    @Test
    public void test_sub() {
        assertEquals(0, obj.sub(4, 4));
    }
//umair's testcase
    @Test
    public void test_mul(){
        assertEquals(21,obj.mul(7,3));
    }
//irene's testcase
    @Test
    public void test_div(){
        assertEquals(1,obj.div(3,3));
    }
}
