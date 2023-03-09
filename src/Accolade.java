public class Accolade {
    private String event, placement;
    private int year;

    public Accolade() {
        event = "N/A";
        placement = "None";
        year = 0;
    }
    
    public Accolade(String event, String placement, int year) {
        this.event = event;
        this.placement = placement;
        this.year = year;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getPlacement() {
        return placement;
    }

    public void setPlacement(String placement) {
        this.placement = placement;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return event + " " + year + ": " + placement;
    }

}


