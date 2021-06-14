import attractions.Park;
import attractions.RollerCoaster;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;
import stalls.IceCreamStall;
import stalls.ParkingSpot;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    Park park;
    IceCreamStall iceCreamStall;
    RollerCoaster rollerCoaster;
    Visitor visitor;

    @Before
    public void setUp() throws Exception {
        themePark = new ThemePark();
        park = new Park("Summers Rest", 3);
        iceCreamStall = new IceCreamStall("Mama's IceCream", "Mama", ParkingSpot.A1, 3);
        rollerCoaster = new RollerCoaster("Edge", 5);
        visitor = new Visitor(14, 125, 40.0);


    }

    @Test
    public void canAddAttraction() {
        themePark.addAttraction(park);
        assertEquals(1, themePark.getAttractionsCount());
    }

    @Test
    public void canAddStall() {
        themePark.addStall(iceCreamStall);
        assertEquals(1, themePark.getStallsCount());
    }

    @Test
    public void canGetAllReviewed() {
        themePark.addAttraction(park);
        themePark.addStall(iceCreamStall);
        themePark.addAttraction(rollerCoaster);
        assertEquals(3, themePark.getAllReviewed().size());
    }

    @Test
    public void canVisit() {
        themePark.visit(visitor, rollerCoaster);
        assertEquals(1, rollerCoaster.getVisitCount());
    }

}
