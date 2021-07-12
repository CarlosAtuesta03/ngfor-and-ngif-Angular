import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Lining are objects at the edge of the vein.
 * Carlos Atuesta
 * image - https://pixabay.com/nl/woningen-gebouwen-stad-154839/\
 */
public class nubes extends Actor
{
    /**
     * Act - nothing to do.
     */
    public void act() 
    {
        setLocation(getX()-1, getY());
        if (getX() == 0) 
        {
            getWorld().removeObject(this);
        }
    }    
}
