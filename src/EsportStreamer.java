import java.util.ArrayList;

public class EsportStreamer extends EsportsAthlete {
    private String platform, priority;

    /**Constructor that takes values for each field in EsportStreamer and parent classes
     * @param name value to store in name
     * @param currentResidence value to store in currentResidence
     * @param primaryGame value to store in primaryGame
     * @param age value to store in age
     * @param team value to store in team
     * @param role value to store in role
     * @param character value to store in character
     * @param accolades value to store in accolades
     * @param stillActive value to store in stillActive
     * @param platform value to store in platform
     * @param priority value to store in priority
     */
    public EsportStreamer(String name, String currentResidence, String primaryGame, int age, String team, String role,
            String character, ArrayList<Accolade> accolades, boolean stillActive, String platform, String priority) {
        super(name, currentResidence, primaryGame, age, team, role, character, accolades, stillActive);
        this.platform = platform;
        this.priority = priority;
    }

    /**
     * No-arg constructore
     */
    public EsportStreamer() {
        platform = "None";
        priority = "Unknown";
    }

    /**Gets value stored in platform
     * @return value stored in platform
     */
    public String getPlatform() {
        return platform;
    }

    /**Sets platform to value passed as arg
     * @param platform value to store in platform
     */
    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**Gets value stored in priority
     * @return value stored in priority
     */
    public String getPriority() {
        return priority;
    }

    /**Sets priority to value passed as arg
     * @param priority value to store in priority
     */
    public void setPriority(String priority) {
        this.priority = priority;
    }

    /**
     * Class specific toString method
     */
    @Override
    public String toString() {
        return "EsportsStreamer [Name: " + this.getName() + " | Current Residence: " + this.getCurrentResidence() 
        + " | Current Primary Game: " + this.getPrimaryGame() + "| Age: " + this.getAge() + " | Team: " + this.getTeam() 
        + " | Role: " + this.getRole() + " | Character: " + this.getCharacter() + " | Accolades: [" 
        + accoladesToString(this.getAccolades()) + "] Still Active? " + (this.isStillActive() ? "Yes" : "No") + " | Platform: " 
        + platform + " | Priority: " + priority +"]";
    }
}
