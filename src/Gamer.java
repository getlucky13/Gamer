import java.util.ArrayList;

public class Gamer {

    private String name, currentResidence, primaryGame;
    private int age;

    public Gamer() {
        this.name = "Unknown";
        this.currentResidence = "Unknown";
        this.primaryGame = "None";
        this.age = 0;
    }

    public Gamer(String name, String currentResidence, String primaryGame, int age) {
        this.name = name;
        this.currentResidence = currentResidence;
        this.primaryGame = primaryGame;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCurrentResidence() {
        return currentResidence;
    }

    public void setCurrentResidence(String currentResidence) {
        this.currentResidence = currentResidence;
    }

    public String getPrimaryGame() {
        return primaryGame;
    }

    public void setPrimaryGame(String primaryGame) {
        this.primaryGame = primaryGame;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

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

    
    public static ArrayList<String> stringToArrayList(String input) {
        ArrayList<String> output = new ArrayList<>();
        output.add(input);
        return output;
    }



    @Override
    public String toString() {
        return "Gamer [Name: " + name + " | Current Residence: " + currentResidence 
        + " | Current Primary Game: " + primaryGame + " | Age: " + age + "]";
    }
}
