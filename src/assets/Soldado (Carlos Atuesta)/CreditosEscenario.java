import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class InstruccionesEscenario here.
 * 
 * @author (Carlos Atuesta) 
 * @version (a version number or a date)
 */
public class CreditosEscenario extends World
{
    public Atras atras;
   
    
    /**
     * Constructor for objects of class InstruccionesEscenario.
     * 
     */
    public CreditosEscenario()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        
        atras = new Atras();
        addObject(atras, 540, 570);
    }
    
    public void act()
    {
        elegirjuego.musica.playLoop();
    }
    
}
