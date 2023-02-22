package junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyUnitClassTest {
    @Test
    public void testAddNumbers(){
        MyUnitClass test = new MyUnitClass();
        int result = test.addNumbers(1,5);
        assertEquals(6,result);
    }

    @Test
    public void testAddString(){
        MyUnitClass test1 = new MyUnitClass();
        assertEquals("AndersAnd",test1.addString("Anders","And"));
    }

}