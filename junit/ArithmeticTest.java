package junit;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArithmeticTest {

    Arithmetic a = new Arithmetic();

    @Test
    public void addition(){
        assertEquals(3, a.addition(1,2));
        assertNotEquals(4, a.addition(1, 2));
        assertNotEquals(2, a.addition(1, 2));
    }

    @Test
    public void subtract(){
        assertEquals(1, a.subtract(3, 2));
        assertNotEquals(2, a.subtract(3,2));
        assertNotEquals(0, a.subtract(3,2));
    }

}
