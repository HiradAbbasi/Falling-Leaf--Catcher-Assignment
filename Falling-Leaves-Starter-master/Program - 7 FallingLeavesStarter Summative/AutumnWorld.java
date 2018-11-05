import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Name: Hirad Abbasi
 * Class: Software Development 10S
 * Teacher: Mr.Hardman
 * Last date modified: November 2nd
 */
public class AutumnWorld  extends World
{

    private Scoreboard score;
    /**
     * Constructor for objects of class AutumnWorld. The constructor adds the
     * scoreboard and Catcher to the AutumnWorld.
     * 
     */
    public AutumnWorld()
    {    
        // Create a new world with 20x20 cells with a cell size of 10x10 pixels.
        super(750, 500, 1); 
        addCatcher();
        
        //The scoreborads location on the screen
        score = new Scoreboard();
        addObject( score, 80, 10);
    }
    
    /**
     * act - The act method will add the Catcher to the lower bottom of the
     * screen. This method is called whenever the 'Act' or 'Run' button gets
     * pressed in the environment.
     * 
     * @param None There are no parameters
     * @return Nothing is returned
     */
    public void act()
    {
        addleaf();
    }
    
    /**
     * addCather will add a Cather from the actor class to the lower bottom of
     * the world.
     * 
     * @param None There are no parameters
     * @return Nothing is returned
     */
    public void addCatcher()
    {
        addObject( new Catcher(), 375, 475 );
    }
    
    /**
     * addLeaf will add leaves to random locations on top of the screen.
     * 
     * @param None There are no parameters
     * @return Nothing is returned
     */
    public void addleaf()
    {
        if(Greenfoot.getRandomNumber(100)<1)
        { 
            addObject(new Leaf(),Greenfoot.getRandomNumber(750),Greenfoot.getRandomNumber(3));
        }
    }
    /**
     * update will add the score of the Catcher collecting the leaves in 
     * the World to the scoreboard.
     * 
     * @param None There are no parameters
     * @return Nothing is returnted
     */
    public void update()
    {
        score.addToScore();
    }
}
