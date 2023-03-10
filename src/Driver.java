import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) throws Exception {
        /**
         * Creates two Accolade objects as well as an ArrayList to hold them, adds
         * both to ArrayList
         */
        Accolade champions2020 = new Accolade("VCT Finals", "First Place", 2020);
        Accolade champions2021 = new Accolade("VCT Finals", "First Place", 2021);
        ArrayList<Accolade> accolades = new ArrayList<>();
        accolades.add(champions2020);
        accolades.add(champions2021);

        /**
         * Creates an EsportsAthlete object, demonstrates toString
         */
        EsportsAthlete ron = new EsportsAthlete("Ron Rizzo", "Philadlephia", 
        "Valorant", 31, "Fnatic", "Controller", "Omen", accolades, true);
        System.out.println(ron.toString());
        System.out.println();

        /**
         * Creates a new Accolade and adds it to accolades field of the ron EsportAthlete
         * object, runs toString to demonstrate success
         */
        Accolade champions2022 = new Accolade("VCT Finals", "First Place", 2022);
        ron.addAccolade(champions2022);
        System.out.println(ron.toString());
        
        /**
         * Creates an EsportStreamer object and prints it
         */
        EsportStreamer bob = new EsportStreamer("Bob Coccia", "Philadlephia", 
        "Valorant", 33, "100 Thieves", "Duelist", "Reyna", 
        accolades, true, "Twitch", "Streaming");
        System.out.println();
        System.out.println(bob.toString());
        System.out.println();
        
        /**
         * Removes an accolade from ron and prints ron and bob, demonstrating that even 
         * though both objects were constructed with the same ArrayList for their accolades
         * field, removing from one objects accolades field does not impact the other
         */
        ron.removeAccolade(champions2020);
        System.out.println(ron.toString());
        System.out.println();
        System.out.println(bob.toString());
        System.out.println();
        
        /**
         * Creates three new objects, one Streamer, one Casual, and one Speedrunner
         */
        Streamer drLupo = new Streamer("DrLupo", "Nebraska", "Escape From Tarkov", 
        36, "None", "YouTube");
        Casual dale = new Casual("Dale Nicklas", "Hatboro", "Overwatch 2", 
        31, "PC");
        SpeedRunner lilAggy = new SpeedRunner("LilAggy", "Unknown", "Elden Ring", 
        28, "GGTalen", "Twitch", "Fog Gate Randomizer", "1hr15min", "None");
    
        /**
         * Creates an ArrayList of Gamer objects, and adds all current objects to it
         */
        ArrayList<Gamer> gamers = new ArrayList<>();
        gamers.add(ron);
        gamers.add(bob);
        gamers.add(dale);
        gamers.add(drLupo);
        gamers.add(lilAggy);

        /**
         * Loops through gamers, printing each objects name. If the object is an instance
         * of the Streamer class or its children, prints the objects name field as well as
         * platform. 
         */
        for(Gamer person: gamers) {
            System.out.print(person.getName());
            if(person instanceof Streamer){
                System.out.println(": " + ((Streamer)person).getPlatform());
            } else {
                System.out.println();
            }
        }
    }
}


