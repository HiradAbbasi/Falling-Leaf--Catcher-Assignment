import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * The Leaf Constructor will add the Leaf with random speed and wind
 * speed to the world. The constructor also randomizes the different 
 * types of leaves. 
 * 
 * @author Hirad Abbasi
 * @version November 2nd
 */
public class Leaf  extends Actor
{
    
    
    private GreenfootImage leaf0 = new GreenfootImage("cutoutleaf0.png");
    private GreenfootImage leaf1 = new GreenfootImage("cutoutleaf1.png");
    private GreenfootImage leaf2 = new GreenfootImage("cutoutleaf2.png");
    private GreenfootImage leaf3 = new GreenfootImage("cutoutleaf3.png");

    private int speed; 
    private int wind;
    public Leaf()
    {
        /* Change the image of the leaf depending on whether the random
         * number is 0, 1, 2, or 3. 
         */ 
        speed= Greenfoot.getRandomNumber(1)+4;
        wind= Greenfoot.getRandomNumber(1)+1;
        
        int foodType = Greenfoot.getRandomNumber(4);
        
        if( foodType == 0 )
        {
            setImage("cutoutleaf0.png");
        } 
        else if( foodType == 1 )
        {
            setImage("cutoutleaf1.png");
        } 
        else if( foodType == 2 ) 
        {
            setImage("cutoutleaf2.png");
        }
        else 
        {
            setImage("cutoutleaf3.png");
        }
    }
    
    /**
     * act- the act method is responsible for the randomized speed 
     * moving down and  random speed for the wind. The act method also
     * removes the Leaf it raches the edge of the world.
     * 
     * @param None There are no parameters 
     * @return Nothing is returned
     */
    
    public void act()   
    {
        moveDown();
        randomWind();

        if(isAtEdge() == true)
        {
        getWorld().removeObject(this);
        }
    } 
    
    /**
     * moveDown- Makes the Leaf object move downwards at 
     * randomized speeds.
     * 
     * @param None There are no parameters 
     * @return Nothing is returned
     */
    public void moveDown()
    {
        turn(5);
        setLocation(getX(), getY()+speed);
    }
    
    /**
     * randomWind- Makes the Leaft object move Left and Right at 
     * randomized speeds.
     * 
     * @param None There are no parameters 
     * @return Nothing is returned
     */
    public void randomWind()
    {
        setLocation(getX()+wind, getY());
    }
    
    
}
