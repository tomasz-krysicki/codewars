package pl.krysicki.kyu_8;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConvertStringToNumberTest {

    @Test
    public void test1(){
        assertEquals("stringToNumber(1234)", 1234 , ConvertStringToNumber.stringToNumber("1234"));
    }
    @Test
    public void test2(){
        assertEquals("stringToNumber(605)", 605 , ConvertStringToNumber.stringToNumber("605"));
    }
    @Test
    public void test3(){
        assertEquals("stringToNumber(1405)", 1405 , ConvertStringToNumber.stringToNumber("1405"));
    }
    @Test
    public void test4(){
        assertEquals("stringToNumber(-7)", -7 , ConvertStringToNumber.stringToNumber("-7"));
    }

    @Test
    public void test5(){
        for(int i = 0; i < 100; ++i) {
            int t = (int)Math.round(Math.random() * 500000);
            assertEquals("stringToNumber(" + t + ")", t , ConvertStringToNumber.stringToNumber(Integer.toString(t)));
        }
    }
}
