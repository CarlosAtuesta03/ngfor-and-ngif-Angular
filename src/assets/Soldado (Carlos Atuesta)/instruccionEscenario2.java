import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class InstruccionesEscenario here.
 * 
 * @author (Carlos Atuesta)
 * @version (a version number or a date)
 */
public class instruccionEscenario2 extends World
{
    public atras2 atras2;
   
    
    /**
     * Constructor for objects of class InstruccionesEscenario.
     * 
     */
    public instruccionEscenario2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        
        atras2 = new atras2();
        addObject(atras2, 540, 570);
    }
    
    public void act()
    {
        elegirjuego.musica.playLoop();
    }
    
}
