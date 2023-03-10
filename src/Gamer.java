import java.util.ArrayList;
/**
 * Class to model a person who plays videogames
 */
public class Gamer {

    private String name, currentResidence, primaryGame;
    private int age;

    /**
     * No-arg constructor for handling calls to default constructor by subclasses
     */
    public Gamer() {
        this.name = "Unknown";
        this.currentResidence = "Unknown";
        this.primaryGame = "None";
        this.age = 0;
    }


    /**Constructor to take arg for each field
     * @param name value to store in name
     * @param currentResidence value to store in currentResidence
     * @param primaryGame value to store in primaryGame
     * @param age value to store in age
     */
    public Gamer(String name, String currentResidence, String primaryGame, int age) {
        this.name = name;
        this.currentResidence = currentResidence;
        this.primaryGame = primaryGame;
        this.age = age;
    }

    /**Gets value store in name field
     * @return value stored in name
     */
    public String getName() {
        return name;
    }

    /**Sets name field to value passed as arg
     * @param name value to store in name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**Gets value stored in currentResidence
     * @return value stored in currentResidence
     */
    public String getCurrentResidence() {
        return currentResidence;
    }

    /**Stores value passed as arg in currentResidence
     * @param currentResidence value to store
     */
    public void setCurrentResidence(String currentResidence) {
        this.currentResidence = currentResidence;
    }

    /**Gets value stored in primaryGame
     * @return value stored in primaryGame
     */
    public String getPrimaryGame() {
        return primaryGame;
    }

    /**Sets value passed as arg to primaryGame
     * @param primaryGame value to store
     */
    public void setPrimaryGame(String primaryGame) {
        this.primaryGame = primaryGame;
    }

    /**Gets value stored in age
     * @return value stored in age
     */
    public int getAge() {
        return age;
    }

    /**Stores value passed as arg to age 
     * @param age value to store
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**Convert an ArrayList of Strings to a formatted String
     * @param input ArrayList to convert
     * @return String containing values of input formatted as necessary
     */
    public static String arrayListToString(ArrayList<String> input) {
        String output = "";
        for(String item : input) {
            if(input.indexOf(item) == (input.size() - 1)) {
                output += item;
            } else {
                output += (item + ", ");
            }
        }
        return output;
    }

    /** Converts ArrayList of Accolades into a formatted String
     * @param accolades ArrayList to convert
     * @return String containing values of accolades formatted as necessary
     */
    public static String accoladesToString(ArrayList<Accolade> accolades) {
        String output = "";
        for(Accolade accolade : accolades) {
            if(accolades.indexOf(accolade) == (accolades.size() - 1)) {
                output += accolade.toString();
            } else {
                output += (accolade.toString() + ", ");
            }
        }
        return output;
    }

    
    /**Creates an ArrayList of Strings for storing a single string. For constructor flexibility.
     * @param input String to convert
     * @return ArrayList containing only the input String
     */
    public static ArrayList<String> stringToArrayList(String input) {
        ArrayList<String> output = new ArrayList<>();
        output.add(input);
        return output;
    }



    /**
     * Overrides the Java Object toString method
     **/
    @Override
    public String toString() {
        return "Gamer [Name: " + name + " | Current Residence: " + currentResidence 
        + " | Current Primary Game: " + primaryGame + " | Age: " + age + "]";
    }
}
