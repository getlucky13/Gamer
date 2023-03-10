public class Accolade {
    
    private String event, placement;
    private int year;

    /**
     * No-arg constructor
     */
    public Accolade() {
        event = "N/A";
        placement = "None";
        year = 0;
    }
    
    /**Constructor that takes values for each field
     * @param event value to store in event
     * @param placement value to store in placement
     * @param year value to store in year
     */
    public Accolade(String event, String placement, int year) {
        this.event = event;
        this.placement = placement;
        this.year = year;
    }

    /**Gets value stored in event
     * @return value stored in event
     */
    public String getEvent() {
        return event;
    }

    /**Sets value passed as arg to event
     * @param event value to store in event
     */
    public void setEvent(String event) {
        this.event = event;
    }

    /**Gets value stored in placement
     * @return value stored in placement
     */
    public String getPlacement() {
        return placement;
    }

    /**Sets placement to value passed as arg
     * @param placement value to store in placement
     */
    public void setPlacement(String placement) {
        this.placement = placement;
    }

    /**Gets value stored in year
     * @return value stored in year
     */
    public int getYear() {
        return year;
    }

    /**Sets year to value passed as arg
     * @param year value to store in year
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Class specific toString method
     */
    @Override
    public String toString() {
        return event + " " + year + ": " + placement;
    }

}


