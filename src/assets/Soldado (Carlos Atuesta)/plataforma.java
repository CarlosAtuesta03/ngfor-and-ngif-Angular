import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class plataforma here.
 * 
 * @author (yCarlos Atuesta) 
 * @version (a version number or a date)
 */
public class plataforma extends Actor
{
    public plataforma()
    {
    getImage().scale(getImage().getWidth()*6,getImage().getHeight());
    }
    public void act() 
    {
        // Add your action code here.
        comer();
    }   
    
      public void comer()
    {
    
    Actor Disparo;
    
    Disparo =getOneObjectAtOffset(0,0,Disparo.class);
    if( Disparo != null )
    {
     World x;
     //world x2;
     escenario1 w=(escenario1)getWorld();
     x= getWorld();
     
     x.removeObject(Disparo); 
     //setLocation(500,200);
     

    }
    }
}
