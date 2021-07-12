import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GAMER_OVER here.
 * 
 * @author (Carlos Atuesta) 
 * @version (a version number or a date)
 */
public class game_over extends Actor
{
    public salir salir;
    //GreenfootSound musica =  new GreenfootSound("escenario1.mp3");
    public game_over()
    {
     setImage(new GreenfootImage("El ganador es el jugador 1", 48, Color.BLUE, Color.WHITE));
    // setImage(new GreenfootImage("El ganador es: ", 48, Color.BLUE, Color.WHITE));
     
    }
    /**
     * Act - do whatever the GAMER_OVER wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       // Add your action code here.
    }    
}