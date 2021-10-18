/**
 * Linux class used in the UserClient class
 * @author Jacob Christoffers
 */
public class Linux extends OperatingSystem
{
    //instance variable
    String preinstalledApps;
    
    //constructor
    /**
     * constructor
     * @param name name
     * @param releaseDate release year
     * @param cost cost
     * @param use use
     * @param preinstalledApps preinstalled apps
     */
    public Linux(String name, int releaseDate, int cost, String use, String preinstalledApps)
    {
        super.name = name;
        super.releaseDate = releaseDate;
        super.cost = cost;
        super.use = use;
        this.preinstalledApps = preinstalledApps;
    }
    
    //get method
    /**
     * gets preinstalled apps
     * @return preinstalled apps
     */
    public String getPreinstalledApps()
    {
        return preinstalledApps;
    }
    //set method
    /**
     * sets new preinstalled apps
     * @param preinstalledApps
     * @return new preinstalled apps
     */
    public String setPreinstalledApps(String preinstalledApps)
    {
        return this.preinstalledApps;
    }
    
    //toString
    @Override
    public String toString()
    {
        return "OS Name: " +getName() +"\nRelease Date: " +getReleaseDate() + "\nCost: $" +getCost() +
                "\nBest Features/Use: " +getUse() +"\nPreinstalled Apps: " +getPreinstalledApps();
    }
}
