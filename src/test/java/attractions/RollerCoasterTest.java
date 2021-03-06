package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.*;

public class RollerCoasterTest {

    RollerCoaster rollerCoaster;
    Visitor tall;
    Visitor small;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        tall = new Visitor(28, 205, 57);
        small = new Visitor(23, 137, 565);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void isVisitorAllowedOver145AndOver12() {
        assertTrue(rollerCoaster.isAllowedTo(tall));
    }

    @Test
    public void isVisitorNotAllowedUnder145AndUnder12() {
        assertFalse(rollerCoaster.isAllowedTo(small));
    }

    @Test
    public void canChargeDoubleIfOver200CmTall() {
        assertEquals(16.80, rollerCoaster.priceFor(tall), 0.00);
    }

    @Test
    public void canChargeDefaultPrice() {
        assertEquals(8.40, rollerCoaster.priceFor(small), 0.00);
    }
}
