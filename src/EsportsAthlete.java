import java.util.ArrayList;

public class EsportsAthlete extends Gamer{
    
    private String team, role, character;
    private ArrayList<Accolade> accolades;
    private boolean stillActive;

    /**Constructor that take values for each field of EsportsAthlete and parent class
     * @param name  value to store in name
     * @param currentResidence value to store in currentResidence
     * @param primaryGame  value to store in primaryGame
     * @param age value to store in age
     * @param team value to store in team
     * @param role value to store in role
     * @param character value to store in character
     * @param accolades value to store in accolades
     * @param stillActive value to store in stillActive
     */
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

    /**
     * NO-arg constructor
     */
    public EsportsAthlete() {
        team = "None";
        role = "Unknown";
        character = "None";
        Accolade none = new Accolade();
        accolades = new ArrayList<>();
        accolades.add(none);
        stillActive = false;        
    }

    /**Gets value stored in team
     * @return value stored in team
     */
    public String getTeam() {
        return team;
    }

    /**Sets team to value passed as arg
     * @param team value to store in team
     */
    public void setTeam(String team) {
        this.team = team;
    }

    /**Gets value stored in role
     * @return value stored in role
     */
    public String getRole() {
        return role;
    }

    /**Sets role to value passed as arg
     * @param role value to store in role
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**Gets value stored in character
     * @return value stored in character
     */
    public String getCharacter() {
        return character;
    }

    /**Sets character to value passed as arg
     * @param character value to store in arg
     */
    public void setCharacter(String character) {
        this.character = character;
    }

    /**Gets ArrayList stored in accolades
     * @return ArrayList stored in accolades
     */
    public ArrayList<Accolade> getAccolades() {
        return accolades;
    }

    /**Sets accolades to ArrayList of Accolades passed as arg
     * @param accolades ArrayList to store in accolades
     */
    public void setAccolades(ArrayList<Accolade> accolades) {
        this.accolades = accolades;
    }

    /**Returns value stored in stillActive
     * @return value stored in stillActive
     */
    public boolean isStillActive() {
        return stillActive;
    }

    /**Sets stillActive to value passed as arg
     * @param stillActive value to store in stillActive
     */
    public void setStillActive(boolean stillActive) {
        this.stillActive = stillActive;
    }

    /**Adds Accolade passed as arg to accolades
     * @param accolade Accolade to add to accolades
     */
    public void addAccolade(Accolade accolade) {
        accolades.add(accolade);
    }

    /**Removes Accolade passed as arg from accolades
     * @param accolade Accolade to remove
     */
    public void removeAccolade(Accolade accolade) {
        accolades.remove(accolade);
    }

    /**
     * Class specific toString method
     */
    @Override
    public String toString() {
        return "EsportsAthlete [Name: " + this.getName() + " | Current Residence: " + this.getCurrentResidence() 
        + " | Current Primary Game: " + this.getPrimaryGame() + " | Age: " + this.getAge() + " | Team: " + team 
        + " | Role: " + role + " | Character: " + character + " | Accolades: [" + accoladesToString(accolades) 
        + " ] Still Active? " + (stillActive ? "Yes" : "No") + "]";
    }
}
