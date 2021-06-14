import attractions.Attraction;
import behaviours.IReviewed;
import people.Visitor;
import stalls.Stall;

import java.util.ArrayList;

public class ThemePark  {

    private ArrayList<Stall> stalls;
    private ArrayList<Attraction> attractions;

    public ThemePark() {
        stalls = new ArrayList<>();
        attractions = new ArrayList<>();
    }

    public int getStallsCount() {
        return stalls.size();
    }

    public int getAttractionsCount() {
        return attractions.size();
    }
    public void addAttraction(Attraction attraction) {
        this.attractions.add(attraction);
    }

    public void addStall(Stall stall) {
        this.stalls.add(stall);
    }


    public ArrayList<IReviewed> getAllReviewed() {
        ArrayList<IReviewed> reviewed = new ArrayList<>();
        reviewed.addAll(attractions);
        reviewed.addAll(stalls);
        return reviewed;
    }

    public void visit (Visitor visitor, Attraction attraction) {
        attraction.incrementVisitCount();
        visitor.addVisitedAttraction(attraction);
    }

}
