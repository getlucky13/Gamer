import java.util.ArrayList;

public class SpeedRunner extends Streamer{

    private String format, currentBest;
    private ArrayList<String> recordsHeld;

    public SpeedRunner() {
        format = "Unknown";
        currentBest = "None";
        recordsHeld = stringToArrayList("None");
    }

    public SpeedRunner(String name, String currentResidence, String primaryGame, int age, String organization,
            String platform, String format, String currentBest, ArrayList<String> recordsHeld) {
        super(name, currentResidence, primaryGame, age, organization, platform);
        this.format = format;
        this.currentBest = currentBest;
        this.recordsHeld = recordsHeld;
    }
    
    public SpeedRunner(String name, String currentResidence, String primaryGame, int age, String organization,
            String platform, String format, String currentBest,String record) {
        super(name, currentResidence, primaryGame, age, organization, platform);
        this.format = format;
        this.currentBest = currentBest;
        recordsHeld = stringToArrayList(record);
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getCurrentBest() {
        return currentBest;
    }

    public void setCurrentBest(String currentBest) {
        this.currentBest = currentBest;
    }

    public ArrayList<String> getRecordsHeld() {
        return recordsHeld;
    }

    public void setRecordsHeld(ArrayList<String> recordsHeld) {
        this.recordsHeld = recordsHeld;
    }

    public void addRecord(String record) {
        recordsHeld.add(record);
    }
    
    public void removeRecord(String record) {
        recordsHeld.remove(record);
    }

    @Override
    public String toString() {
        return "Streamer [Name: " + this.getName() + " | Current Residence: " + this.getCurrentResidence() 
        + " | Current Primary Game: " + this.getPrimaryGame() + " | Age: " + this.getAge() + " | Organization: " 
        + this.getOrganization() + " | Platform: " + this.getPlatform() + " | Format: " + format 
        + " | Current Best Time: " + currentBest + " | Records Held: " + arrayListToString(recordsHeld) + "]";
    }

}