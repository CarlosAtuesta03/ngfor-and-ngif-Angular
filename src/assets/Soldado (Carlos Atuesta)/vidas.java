import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lifes here.
 * 
 * @author (Carlos Atuesta) 
 * @version (a version number or a date)
 */
public class vidas extends Actor
{
    /**
     * Act - do whatever the lifes wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int c=3;
    public vidas()
    {}
    public void Disminuir() 
    {
      c--;
      if(c==0)
      {
      Greenfoot.stop();
      setImage("ganador.png");
      }
     
    }    
}
