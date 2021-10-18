/**
 * MacOS class used in the UserClient class
 * @author Jacob Christoffers
 */
public class MacOS extends OperatingSystem
{
    //instance variable
    String updatedDesign;
    
    //constructor
    /**
     * constructor
     * @param name name
     * @param releaseDate release year
     * @param cost cost
     * @param use use
     * @param updateDesign updated design
     */
    public MacOS(String name, int releaseDate, int cost, String use, String updateDesign)
    {
        super.name = name;
        super.releaseDate = releaseDate;
        super.cost = cost;
        super.use = use;
        this.updatedDesign = updatedDesign;
    }
    
    //get method
    /**
     * get updated design
     * @return updated design
     */
    public String getUpdatedDesign()
    {
        return updatedDesign;
    }
    //set method
    /**
     * set new updated design
     * @param updatedDesign
     * @return new updated design
     */
    public String setUpdatedDesign(String updatedDesign)
    {
        return this.updatedDesign;
    }
    
    //toString
    @Override
    public String toString()
    {
        return "OS Name: " +getName() +"\nRelease Date: " +getReleaseDate() + "\nCost: $" +getCost() +
                "\nBest Features/Use: " +getUse() +"\nUpdated Design: " +getUpdatedDesign();
    }
}
