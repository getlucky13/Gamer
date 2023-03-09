import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) throws Exception {
        Accolade champions2020 = new Accolade("VCT Finals", "First Place", 2020);
        Accolade champions2021 = new Accolade("VCT Finals", "First Place", 2021);
        ArrayList<Accolade> accolades = new ArrayList<>();
        accolades.add(champions2020);
        accolades.add(champions2021);

        EsportsAthlete ron = new EsportsAthlete("Ron Rizzo", "Philadlephia", 
        "Valorant", 31, "Fnatic", "Controller", "Omen", accolades, true);
        System.out.println(ron.toString());
        System.out.println();

        Accolade champions2022 = new Accolade("VCT Finals", "First Place", 2022);
        ron.addAccolade(champions2022);
        System.out.println(ron.toString());
        
        EsportStreamer bob = new EsportStreamer("Bob Coccia", "Philadlephia", 
        "Valorant", 33, "100 Thieves", "Duelist", "Reyna", 
        accolades, true, "Twitch", "Streaming");
        System.out.println();
        System.out.println(bob.toString());
        System.out.println();
        
        ron.removeAccolade(champions2020);
        System.out.println(ron.toString());
        System.out.println();
        System.out.println(bob.toString());
        
    }
}

/*
 * To Do:
 *      *Documentation done for Gamer, Streamer, and Casual
 *      *go back and finish fields and overall description
 * Stretch Goals:
 *     *Class for RecordsHeld
 *          *Update Gamer with method for converting to string
 *          *Update SpeedRunner RecordsHeld field
 *     *Team interface
 *     *EsportsTeam Class
 *         *Game specific subclasses?
 *         *All games that org has teams for in same obj?
 *         *Still need to decide
 *      *Encase ArrayList prints in [] for viewing in toString methods
 *      *Maybe create a print method that is essentially toString but formatted for cmdline
 */

