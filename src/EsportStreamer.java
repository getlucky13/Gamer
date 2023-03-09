import java.util.ArrayList;

public class EsportStreamer extends EsportsAthlete {
    private String platform, priority;

    public EsportStreamer(String name, String currentResidence, String primaryGame, int age, String team, String role,
            String character, ArrayList<Accolade> accolades, boolean stillActive, String platform, String priority) {
        super(name, currentResidence, primaryGame, age, team, role, character, accolades, stillActive);
        this.platform = platform;
        this.priority = priority;
    }
    
    /*public EsportStreamer(String name, String currentResidence, String primaryGame, int age, String team, String role,
            String character, String accolade, boolean stillActive, String platform, String priority) {
        super(name, currentResidence, primaryGame, age, team, role, character, stringToArrayList(accolade), stillActive);
        this.platform = platform;
        this.priority = priority;
    }*/

    public EsportStreamer() {
        platform = "None";
        priority = "Unknown";
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "EsportsStreamer [Name: " + this.getName() + " | Current Residence: " + this.getCurrentResidence() 
        + " | Current Primary Game: " + this.getPrimaryGame() + "| Age: " + this.getAge() + " | Team: " + this.getTeam() 
        + " | Role: " + this.getRole() + " | Character: " + this.getCharacter() + " | Accolades: [" 
        + accoladesToString(this.getAccolades()) + "] Still Active? " + (this.isStillActive() ? "Yes" : "No") + " | Platform: " 
        + platform + " | Priority: " + priority +"]";
    }
}
