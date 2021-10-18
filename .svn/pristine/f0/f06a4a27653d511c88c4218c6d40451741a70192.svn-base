/**
 * Windows class used in the UserClient class
 * @author Jacob Christoffers
 */
public class Windows extends OperatingSystem
{
    //instance variables
    String cloud;
    String assistant;
    
    //constructor
    /**
     * constructor
     * @param name name
     * @param releaseDate release year
     * @param cost cost
     * @param use use
     * @param cloud cloud
     * @param assistant assistant 
     */
    public Windows(String name, int releaseDate, int cost, String use, String cloud, String assistant)
    {
        super.name = name;
        super.releaseDate = releaseDate;
        super.cost = cost;
        super.use = use;
        this.cloud = cloud;
        this.assistant = assistant;
    }
    
    //get methods
    /**
     * get cloud
     * @return cloud
     */
    public String getCloud()
    {
        return cloud;
    }

    /**
     * get assistant
     * @return assistant
     */
    public String getAssistant()
    {
        return assistant;
    }
    //set method
    /**
     * set new cloud
     * @param cloud cloud
     * @return new cloud
     */
    public String setCloud(String cloud)
    {
        return this.cloud;
    }

    /**
     * set new assistant
     * @param assistant assistant 
     * @return new assistant 
     */
    public String setAssistant(String assistant)
    {
        return this.assistant;
    }
    
    //toString
    @Override
    public String toString()
    {
        return "OS Name: " +getName() +"\nRelease Date: " +getReleaseDate() + "\nCost: $" +getCost() +
                "\nBest Features/Use: " +getUse() +"\nCloud Importance: " +getCloud() +"\nPersonal Assistant: " +getAssistant();
    }
}