 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Catcher  extends Actor
{
    /**
     * act- The act method is responsible for the Catchers movement(Left,Right)
     * and it also removes the leaves when the Catcher come in contact.
     * 
     * @param None There are no parameters
     * @return Nothing is returned
     */
    public void act() 
    {
        removeTouching();
         if(Greenfoot.isKeyDown("Left") == true)
        {
            setLocation(getX()-2, getY());
        }
        
        if(Greenfoot.isKeyDown("Right") == true)
        {
            setLocation(getX()+2, getY());
        }
        
        
    } 
    /**
     * Catcher will add the image in the correct scalse which is (90,90)
     */
    public Catcher()
    {
        GreenfootImage image = getImage();
        image.scale(90, 90);
        setImage(image);
    }
    
    /**
     * removeTouching is in controlling of removing Food objects on the World
     * every time the Fly comes in contact with the Food.
     * 
     * @param None There are no parameters
     * @return Nothing is returnted
     */
    private void removeTouching()
    {
        /*
        * If the fly touches a Food object, remove the Food object
        * from the world. 
        */
        if(isTouching(Leaf.class) == true )
        {
            removeTouching(Leaf.class);
            ( (AutumnWorld)getWorld() ).update();
        }   
    }
    
}
