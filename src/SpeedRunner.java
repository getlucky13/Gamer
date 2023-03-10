import java.util.ArrayList;

public class SpeedRunner extends Streamer{

    private String format, currentBest;
    private ArrayList<String> recordsHeld;

    /**
     * No-arg constructor
     */
    public SpeedRunner() {
        format = "Unknown";
        currentBest = "None";
        recordsHeld = stringToArrayList("None");
    }

    /**Constructor with params for each field of SpeedRunner and parent classes
     * @param name value to store in name
     * @param currentResidence value to store in currentResidence
     * @param primaryGame value to store in primaryGame
     * @param age value to store in age
     * @param organization value to store in organization
     * @param platform value to store in platform
     * @param format value to store in format
     * @param currentBest value to store in currentBest
     * @param recordsHeld value to store in recordsHeld
     */
    public SpeedRunner(String name, String currentResidence, String primaryGame, int age, String organization,
            String platform, String format, String currentBest, ArrayList<String> recordsHeld) {
        super(name, currentResidence, primaryGame, age, organization, platform);
        this.format = format;
        this.currentBest = currentBest;
        this.recordsHeld = recordsHeld;
    }
    
    /**Constructor with params for each field, taking a single string instead of an ArrayList of Strings,
     * for the recordsHeld field
     * @param name value to store in name
     * @param currentResidence value to store in currentResidence
     * @param primaryGame value to store in primaryGame
     * @param age value to store in age
     * @param organization value to store in organization
     * @param platform value to store in platform
     * @param format value to store in format
     * @param currentBest value to store in currentBest
     * @param record  value to store in record
     */
    public SpeedRunner(String name, String currentResidence, String primaryGame, int age, String organization,
            String platform, String format, String currentBest,String record) {
        super(name, currentResidence, primaryGame, age, organization, platform);
        this.format = format;
        this.currentBest = currentBest;
        recordsHeld = stringToArrayList(record);
    }

    /**Gets value stored in format
     * @return value stored in format
      */
    public String getFormat() {
        return format;
    }

    /**Sets format to value passed as arg
     * @param format value to store in format
     */
    public void setFormat(String format) {
        this.format = format;
    }

    /**Gets value stored in currentBest
     * @return value stored in currentBest
     */
    public String getCurrentBest() {
        return currentBest;
    }

    /**Sets currentBest to value passed as arg
     * @param currentBest value to store in currentBest
     */
    public void setCurrentBest(String currentBest) {
        this.currentBest = currentBest;
    }

    /**Gets the ArrayList stored in recordsHeld
     * @return ArrayList stored in recordsHeld
     */
    public ArrayList<String> getRecordsHeld() {
        return recordsHeld;
    }

    /**Sets recordsHeld to ArrayList passed as arg
     * @param recordsHeld ArrayList to store in recordsHeld
     */
    public void setRecordsHeld(ArrayList<String> recordsHeld) {
        this.recordsHeld = recordsHeld;
    }

    /**Adds value passed as arg to recordsHeld ArrayList
     * @param record value to store in recordsHeld
     */
    public void addRecord(String record) {
        recordsHeld.add(record);
    }
    
    /**Removes value passed as arg from recordsHeld
     * @param record value to remove from recordsHeld
     */
    public void removeRecord(String record) {
        recordsHeld.remove(record);
    }

    /**
     * Class specific toString method
     */
    @Override
    public String toString() {
        return "Streamer [Name: " + this.getName() + " | Current Residence: " + this.getCurrentResidence() 
        + " | Current Primary Game: " + this.getPrimaryGame() + " | Age: " + this.getAge() + " | Organization: " 
        + this.getOrganization() + " | Platform: " + this.getPlatform() + " | Format: " + format 
        + " | Current Best Time: " + currentBest + " | Records Held: " + arrayListToString(recordsHeld) + "]";
    }

}