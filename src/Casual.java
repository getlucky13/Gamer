import java.util.ArrayList;

public class Casual extends Gamer {

    private ArrayList<String> systems;

    /**
     * No-arg constructor
     */
    public Casual() {
        systems = stringToArrayList("Unknown");
    }

    /**Constructor for taking args for all necessary fields
     * @param name value to store in name
     * @param currentResidence value to store in currentResidence
     * @param primaryGame value to store in primaryGame
     * @param age value to store in age
     * @param systems String ArrayList to store in systems
     */
    public Casual(String name, String currentResidence, String primaryGame, int age, ArrayList<String> systems) {
        super(name, currentResidence, primaryGame, age);
        this.systems = systems;
    }

    /**Constructor for taking a String instead of a String ArrayList for systems field
     * @param name value to store in name
     * @param currentResidence value to store in currentResidence
     * @param primaryGame value to store in primaryGame
     * @param age value to store in age
     * @param system value to store in systems
     */
    public Casual(String name, String currentResidence, String primaryGame, int age, String system) {
        super(name, currentResidence, primaryGame, age);
        systems = stringToArrayList(system);
    }

    /**Gets ArrayList stored in systems
     * @return ArrayList stored in systems
     */
    public ArrayList<String> getSystems() {
        return systems;
    }

    /**Sets systems field to input ArrayList
     * @param systems ArrayList to store in systems
     */
    public void setSystems(ArrayList<String> systems) {
        this.systems = systems;
    }
    
    /**Adds value to ArrayList stored in systems
     * @param system value to add
     */
    public void addSystem(String system) {
        systems.add(system);
    }

    /**Removes value from ArrayList stored in systems
     * @param system
     */
    public void removeSystem(String system) {
        systems.remove(system);
    }

    /**
     * Override method for toString()
     **/
    @Override
    public String toString() {
        return "Casual [Name: " + this.getName() + " | Current Residence: " + this.getCurrentResidence() 
        + " | Current Primary Game: " + this.getPrimaryGame() + " | Age: " + this.getAge() + " | Systems: "
        + arrayListToString(systems) + "]";
    }
}
