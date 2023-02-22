package opgave1test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringReverserTest {
    @Test
    public void testStringReverser1(){
        StringReverser s1 = new StringReverser();
        assertEquals("gfedcba",s1.stringReverser("abcdefg"));
    }
    @Test
    public void testStringReverser2(){
        StringReverser s2 = new StringReverser();
        assertEquals("d",s2.stringReverser(String.valueOf("abcdefg".charAt(3))));
    }
    @Test
    public void testStringReverser3(){
        StringReverser s3 = new StringReverser();
        assertEquals("e l l O H",s3.stringReverser("H O l l e"));
    }

}