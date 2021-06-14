package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.*;

public class PlaygroundTest {
    Playground playground;
    Visitor over15;

    @Before
    public void setUp() throws Exception {
        playground = new Playground("Fun Zone", 7);
        over15 = new Visitor(17, 175, 15);
    }

    @Test
    public void hasName() {
        assertEquals("Fun Zone", playground.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(7, playground.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, playground.getVisitCount());
    }

    @Test
    public void canRestrictAccessToOver15() {
        assertFalse(playground.isAllowedTo(over15));
    }
}
