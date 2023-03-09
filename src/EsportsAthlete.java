import java.util.ArrayList;

public class EsportsAthlete extends Gamer{
    private String team, role, character;
    private ArrayList<Accolade> accolades;
    private boolean stillActive;

    public EsportsAthlete(String name, String currentResidence, String primaryGame, int age, String team, String role,
            String character, ArrayList<Accolade> accolades, boolean stillActive) {
        super(name, currentResidence, primaryGame, age);
        this.team = team;
        this.role = role;
        this.character = character;
        this.accolades = accolades;
        this.stillActive = stillActive;
    }

    /*public EsportsAthlete(String name, String currentResidence, String primaryGame, int age, String team, String role,
            String character, String accolade, boolean stillActive) {
        super(name, currentResidence, primaryGame, age);
        this.team = team;
        this.role = role;
        this.character = character;
        this.accolades = stringToArrayList(accolade);
        this.stillActive = stillActive;
    }*/

    public EsportsAthlete() {
        team = "None";
        role = "Unknown";
        character = "None";
        Accolade none = new Accolade();
        accolades = new ArrayList<>();
        accolades.add(none);
        stillActive = false;        
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public ArrayList<Accolade> getAccolades() {
        return accolades;
    }

    public void setAccolades(ArrayList<Accolade> accolades) {
        this.accolades = accolades;
    }

    public boolean isStillActive() {
        return stillActive;
    }

    public void setStillActive(boolean stillActive) {
        this.stillActive = stillActive;
    }

    public void addAccolade(Accolade accolade) {
        accolades.add(accolade);
    }

    public void removeAccolade(Accolade accolade) {
        accolades.remove(accolade);
    }

    @Override
    public String toString() {
        return "EsportsAthlete [Name: " + this.getName() + " | Current Residence: " + this.getCurrentResidence() 
        + " | Current Primary Game: " + this.getPrimaryGame() + " | Age: " + this.getAge() + " | Team: " + team 
        + " | Role: " + role + " | Character: " + character + " | Accolades: [" + accoladesToString(accolades) 
        + " ] Still Active? " + (stillActive ? "Yes" : "No") + "]";
    }
}
