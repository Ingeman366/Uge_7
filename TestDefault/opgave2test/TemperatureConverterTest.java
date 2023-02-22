package opgave2test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {
    @Test
    public void testConverter1(){
        TemperatureConverter t1 = new TemperatureConverter();
        double result = t1.toCelsius(32);
        assertEquals(0,result);
    }

    @Test
    public void testConverter2(){
        TemperatureConverter t2 = new TemperatureConverter();
        double result = t2.toCelsius(-459.67);
        assertEquals(-273.15,result);
    }
    @Test
    public void testConverter3(){
        TemperatureConverter t2 = new TemperatureConverter();
        double result = t2.toCelsius(100);
        assertEquals(37.7778,result,0.0001);
    }



}