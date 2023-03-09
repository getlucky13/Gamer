import java.util.ArrayList;

public class Casual extends Gamer {


    private ArrayList<String> systems;

    public Casual() {
        systems = stringToArrayList("Unknown");
    }

    public Casual(String name, String currentResidence, String primaryGame, int age, ArrayList<String> systems) {
        super(name, currentResidence, primaryGame, age);
        this.systems = systems;
    }

    public Casual(String name, String currentResidence, String primaryGame, int age, String system) {
        super(name, currentResidence, primaryGame, age);
        systems = stringToArrayList(system);
    }

    public ArrayList<String> getSystems() {
        return systems;
    }

    public void setSystems(ArrayList<String> systems) {
        this.systems = systems;
    }
    
    public void addSystem(String system) {
        systems.add(system);
    }

    public void removeSystem(String system) {
        systems.remove(system);
    }

    @Override
    public String toString() {
        return "Casual [Name: " + this.getName() + " | Current Residence: " + this.getCurrentResidence() 
        + " | Current Primary Game: " + this.getPrimaryGame() + " | Age: " + this.getAge() + " | Systems: "
        + arrayListToString(systems) + "]";
    }
}
