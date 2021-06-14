package stalls;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.*;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    Visitor under18;
    Visitor is18;
    Visitor over18;

    @Before
    public void setUp() throws Exception {
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1, 4);
        under18 = new Visitor(17, 175, 30);
        is18 = new Visitor(18, 175, 30);
        over18 = new Visitor(25, 185, 50);
    }

    @Test
    public void hasName() {
        assertEquals("Jacks Drum", tobaccoStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Jack Jarvis", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(ParkingSpot.B1, tobaccoStall.getParkingSpot());
    }

    @Test
    public void cantSellToUnder18() {
        assertFalse(tobaccoStall.isAllowedTo(under18));
    }

    @Test
    public void cantSellTo18YearOld() {
        assertTrue(tobaccoStall.isAllowedTo(is18));
    }

    @Test
    public void canSellToOver18() {
        assertTrue(tobaccoStall.isAllowedTo(over18));
    }
}
