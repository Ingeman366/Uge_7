package opgave4test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciGeneratorTest {
    @Test
    public void fibTest1(){
        FibonacciGenerator f1 = new FibonacciGenerator();
        int[] arr = f1.generate(4);
        assertArrayEquals(new int[]{0,1,1,2},arr);
    }

}