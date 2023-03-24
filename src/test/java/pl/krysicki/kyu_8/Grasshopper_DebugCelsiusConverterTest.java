package pl.krysicki.kyu_8;

import org.junit.Test;
import pl.krysicki.kyu_8.Grasshopper_DebugCelsiusConverter;

import static org.junit.Assert.assertEquals;

public class Grasshopper_DebugCelsiusConverterTest {

    @Test
    public void test1() {
        assertEquals("10.0 is above freezing temperature", Grasshopper_DebugCelsiusConverter.weatherInfo(50));
    }

    @Test
    public void test2() {
        assertEquals("-5.0 is freezing temperature", Grasshopper_DebugCelsiusConverter.weatherInfo(23));
    }

}
