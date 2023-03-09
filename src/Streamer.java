public class Streamer extends Gamer{
    private String organization, platform;

    public Streamer(String name, String currentResidence, String primaryGame, int age, String organization,
            String platform) {
        super(name, currentResidence, primaryGame, age);
        this.organization = organization;
        this.platform = platform;
    }

    public Streamer() {
        organization = "Unknown";
        platform = "Unknown";
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    @Override
    public String toString() {
        return "Streamer [Name: " + this.getName() + " | Current Residence: " + this.getCurrentResidence() 
        + " | Current Primary Game: " + this.getPrimaryGame() + " | Age: " + this.getAge() + " | Organization: " 
        + organization + " | Platform: " + platform + "]";
    }

    

    
}
