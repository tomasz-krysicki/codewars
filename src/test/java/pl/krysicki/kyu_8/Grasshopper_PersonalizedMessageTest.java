package pl.krysicki.kyu_8;

import org.junit.Test;
import pl.krysicki.kyu_8.Grasshopper_PersonalizedMessage;

import static org.junit.Assert.assertEquals;

public class Grasshopper_PersonalizedMessageTest {

    @Test
    public void basicTests() {
        assertEquals("For inputs \"Daniel\" and \"Daniel\"", "Hello boss", Grasshopper_PersonalizedMessage.greet("Daniel", "Daniel"));
        assertEquals("For inputs \"Greg\" and \"Daniel\"", "Hello guest", Grasshopper_PersonalizedMessage.greet("Greg", "Daniel"));
    }
}
