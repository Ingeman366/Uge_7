package opgave3test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @Test
    public void testPerson1() {
    Person p1 = new Person("Hans", 37);
    assertEquals("Hans",p1.getName());
    assertEquals(37,p1.getAge());
    }
    @Test
    public void testPerson2(){
    Person p2 = new Person("lol",27);
    assertEquals(22,p2.getAge()-5);
    }

}