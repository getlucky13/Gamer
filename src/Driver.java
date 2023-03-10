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
        
        Streamer drLupo = new Streamer("Ben Lupo", "Nebraska", "Escape From Tarkov", 
        36, "None", "YouTube");
        Casual dale = new Casual("Dale Nicklas", "Hatboro", "Overwatch 2", 
        31, "PC");
        SpeedRunner lilAggy = new SpeedRunner("LilAggy", "Unknown", "Elden Ring", 
        28, "GGTalen", "PC", "Fog Gate Randomizer", "1hr15min", "None");
    
        ArrayList<Gamer> gamers = new ArrayList<>();
        gamers.add(ron);
        gamers.add(bob);
        gamers.add(dale);
        gamers.add(drLupo);
        gamers.add(lilAggy);

        boolean wut = drLupo instanceof Gamer;
        if(wut == true) {
            System.out.println(drLupo.toString());
        }
        for(Gamer gamer: gamers) {
            if(gamer instanceof Streamer){
                System.out.println(gamer.toString());
            }
        }


    }
}

/*
 * To Do:
 *      *Documentation done
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

