public class Streamer extends Gamer{
    
    private String organization, platform;

    /**Constructor for taking values for each field of Streamer and Gamer class
     * @param name value to store in name
     * @param currentResidence value to store in currentResidence
     * @param primaryGame value to store in primaryGame
     * @param age value to store in age
     * @param organization value to store in organization
     * @param platform value to store in platform
     */
    public Streamer(String name, String currentResidence, String primaryGame, int age, String organization,
            String platform) {
        super(name, currentResidence, primaryGame, age);
        this.organization = organization;
        this.platform = platform;
    }

    /**
     * NO-arg constructor
     */
    public Streamer() {
        organization = "Unknown";
        platform = "Unknown";
    }

    /**Gets value stored in organization
     * @return value stored in organization
     */
    public String getOrganization() {
        return organization;
    }

    /**Sets the value passed as are to organization
     * @param organization value to store in organization
     */
    public void setOrganization(String organization) {
        this.organization = organization;
    }

    /**Gets value stored in platform
     * @return value stored in platform
     */
    public String getPlatform() {
        return platform;
    }

    /**Sets value passed as arg to platform
     * @param platform value to store in platform
     */
    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * Class specific toString implementation
     */
    @Override
    public String toString() {
        return "Streamer [Name: " + this.getName() + " | Current Residence: " + this.getCurrentResidence() 
        + " | Current Primary Game: " + this.getPrimaryGame() + " | Age: " + this.getAge() + " | Organization: " 
        + organization + " | Platform: " + platform + "]";
    }
}
