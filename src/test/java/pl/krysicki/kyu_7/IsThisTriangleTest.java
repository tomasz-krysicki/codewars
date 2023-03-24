package pl.krysicki.kyu_7;

import org.junit.Test;

import static org.junit.Assert.*;

public class IsThisTriangleTest {

    @Test
    public void publicTests() {
        assertEquals("Incorrect answer for a=1, b=2, c=2\n", true,  IsThisTriangle.isTriangle(1,2,2));
        assertEquals("Incorrect answer for a=7, b=2, c=2\n", false, IsThisTriangle.isTriangle(7,2,2));
    }

    @Test
    public void changingSidesTest() {
        assertEquals("Incorrect answer for a=1, b=2, c=3\n", false, IsThisTriangle.isTriangle(1,2,3));
        assertEquals("Incorrect answer for a=1, b=3, c=2\n", false, IsThisTriangle.isTriangle(1,3,2));
        assertEquals("Incorrect answer for a=3, b=1, c=2\n", false, IsThisTriangle.isTriangle(3,1,2));

        assertEquals("Incorrect answer for a=1, b=2, c=5\n", false, IsThisTriangle.isTriangle(1,2,5));
        assertEquals("Incorrect answer for a=1, b=5, c=2\n", false, IsThisTriangle.isTriangle(1,5,2));
        assertEquals("Incorrect answer for a=5, b=1, c=2\n", false, IsThisTriangle.isTriangle(5,1,2));
    }

    @Test
    public void triangleTypes() {
        assertEquals("Incorrect answer for a=4, b=2, c=3\n", true, IsThisTriangle.isTriangle(4,2,3));
        assertEquals("Incorrect answer for a=5, b=1, c=5\n", true, IsThisTriangle.isTriangle(5,1,5));
        assertEquals("Incorrect answer for a=2, b=2, c=2\n", true, IsThisTriangle.isTriangle(2,2,2));
    }

    @Test
    public void NegativeTypes() {
        assertEquals("Incorrect answer for a=-1, b=2, c=3\n", false, IsThisTriangle.isTriangle(-1,2,3));
        assertEquals("Incorrect answer for a=1, b=-2, c=3\n", false, IsThisTriangle.isTriangle(1,-2,3));
        assertEquals("Incorrect answer for a=1, b=2, c=-3\n", false, IsThisTriangle.isTriangle(1,2,-3));
        assertEquals("Incorrect answer for a=-5, b=1, c=3\n", false, IsThisTriangle.isTriangle(-5,1,3));
        assertEquals("Incorrect answer for a=0, b=2, c=3\n", false, IsThisTriangle.isTriangle(0,2,3));
    }
}