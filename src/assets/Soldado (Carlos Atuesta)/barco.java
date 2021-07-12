import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class carro here.
 * 
 * @author (Carlos Atuesta) 
 * @version (a version number or a date)
 */
public class barco extends Actor
{
    /**
     * Act - do whatever the carro wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int directionShot=2;

    boolean isShot=false;
    private int xMin=45; 
    private int xMax=520;
  
     GreenfootSound musica =  new GreenfootSound("escenario2.mp3");
    public barco()
    {
    setImage ("barco1.png");
    }
    
    
    public void act()   
    {
        int y = getY();
        int x = getX();
        
        if(Greenfoot.isKeyDown("d"))
          { 
              
           if( xMax > x +2)
           x=x + 2;
           setImage ("barco1.png");
           directionShot=1;
           }
      
        if(Greenfoot.isKeyDown("a"))
           {
                
           if( xMin < x -2)
           x=x - 2;
           setImage ("barco2.png");
           directionShot=1;
           }
           
           
         setLocation(x,y); 
          
         setShot(directionShot); 
         comer();
        }
    
    public void setShot(int c)
    {
    if(isShot && Greenfoot.isKeyDown ("q"))
    {
    disparobarco s1=new disparobarco(c);
    getWorld().addObject(s1,getX(),getY());
    isShot=false;
    }
    if(!isShot && !Greenfoot.isKeyDown("q"))
    {
    isShot=true;
    }
    }   
    
        
  
    
    public void comer()
    {
    Actor disparonave;
    
    disparonave =getOneObjectAtOffset(0,0,disparonave.class);
    
    if(disparonave !=null  )
    {
     World x;
     escenario2 w=(escenario2)getWorld();
     x= getWorld();

     
     x.removeObject(disparonave);
     setLocation(50, 150);
     setImage ("barco1.png");
     w.vidasbarco.decrementar();
     w.puntos.incrementar();
     
     if(w.vidasbarco.obtenerValor()==0){
             game_over g=new game_over();
             getWorld().addObject(g,((getWorld().getWidth()/2)+0),((getWorld().getHeight()/2)+0));
             escenario2 pantalla = getWorldOfType(escenario2.class);
             pantalla.detenerMusica();
             setImage ("explosion.png");
             Greenfoot.stop();
             
           }
     //Greenfoot.playSound("comer.way");
    }
    }
    
    }   

  


