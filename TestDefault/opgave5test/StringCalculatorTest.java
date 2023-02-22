package opgave5test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {
    @Test
    public void testAddWitNullOrEmpty1(){
        StringCalculator s1 = new StringCalculator();
        int sum = s1.add("");
        assertEquals(0,sum);
    }
    @Test
    public void testAddWithSingleNumber1(){
        StringCalculator s2 = new StringCalculator();
        int sum = s2.add("1");
        assertEquals(1,sum);
    }
    @Test
    public void testWithMultipleNumbers1(){
        StringCalculator s2 = new StringCalculator();
        int sum = s2.add("1,2,3,4");
        assertEquals(10,sum);
    }
    @Test
    public void testAddWithDifferentDelimiter1(){
        StringCalculator s3 = new StringCalculator();
        int sum = s3.add("1.2.3.4","\\.");
        assertEquals(10,sum);
    }
}