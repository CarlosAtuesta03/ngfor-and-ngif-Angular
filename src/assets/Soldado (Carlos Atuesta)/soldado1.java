import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class nave here.
 * 
 * @author (Carlos Atuesta) 
 * @version (a version number or a date)
 */
public class soldado1 extends Actor
{
    public static final int UP=0;
    public static final int DOWN=1;     // para tener direcion 
    public static final int LEFT=2;
    public static final int RIGHT=3;
    int directionShot=2;
    
    private int xMin=270; 
    private int xMax=525;               //para poner limites de escenario 
    private int yMin=75;  //175        100
    private int yMax=100;
    
    private int tiempo = 0;

    
    private int vSpeed=0;
    private int aceleracion=1;      //codigo de salto 
    private int jumpHeight= -5;
    
    private int dirant = 0;
    private int diract = 0;
    private int liminf = 0;
    private int limsup = 3;
    
    

    private GreenfootImage[] images= new GreenfootImage[8];
    public int a=10,num=0,vel=30;    
    //animacion de movimiento 
    public void addedToWorld(World MyWorld)
    {   
        for(int i=0;i<images.length;i++)
        {
            images[i]=new GreenfootImage("p"+(i+1)+".png");//animacion de movimiento
        }   
        setImage(images[0]);
    } 
    boolean isShot=false;
    
    private void fall()
    {
    setLocation(getX(),getY()+ vSpeed);   //parte del codigo de salto
    vSpeed=vSpeed+aceleracion;
    }
    
    public void act() 
    {  
        int y = getY();
        int x = getX();
   
        
        if(Greenfoot.isKeyDown("right"))
        {diract=0; 
            setdireccion(RIGHT);
        if( xMax > x +2)
        {  x=x + 2; }
        directionShot=2;}
        
        if(Greenfoot.isKeyDown("left"))
        {   diract=1; 
            setdireccion(LEFT);
        if( xMin < x -2)
          { x=x - 2;}
        directionShot=3;
       }
        
        
        
        setShot(directionShot);
        
        if(diract != dirant)
        {
            dirant=diract;
            if(diract == 0){
                setImage(images[0]);
                num=0;
               
                liminf=0;
                limsup=3;
            }
            if(diract == 1)
                {
                setImage(images[4]);
                num=4;
         
                liminf=4;
                limsup=7;
            }
            
        }
        else{
            
          if (tiempo >= 10){  
            if(num<limsup)
             {
            num++;
            setImage(images[num]);
              }
            else{
             num=liminf;
            setImage(images[num]);
                 
                }
                tiempo = 0;
            }
            
        } 
        
        tiempo++;
        setLocation(x,y); 
         
        moveAlrededor();
        checkFalling(); //parte de codigo salto
        comer();

    }    
    
    public void moveAlrededor()//codigo de salto
    {int y = getY();
        int x = getX();

    if(Greenfoot.isKeyDown("up")) 
    {
       if( yMin < y -2)
              {vSpeed=jumpHeight;
     fall();}
    }
    
    }
    
    boolean sobreplataforma()//codigo de salto
    {
    Actor debajo = getOneObjectAtOffset(0, getImage().getHeight()/2,plataforma.class);
    return debajo !=null;
    }
    
    public void checkFalling()//codigo de salto
    {
     if(sobreplataforma()== false)
     {
        fall();
     }
 
    }
    
    public void setShot(int direction)
    {
    if(isShot && Greenfoot.isKeyDown ("p"))
    {Greenfoot.playSound("disparo.mp3");
    disparoj1 s1=new disparoj1(direction);
    getWorld().addObject(s1,getX(),getY());
    isShot=false;
    
    }
    if(!isShot && !Greenfoot.isKeyDown("p"))
    {//Greenfoot.playSound("disparo.mp3");
    isShot=true;
     
    }
    }
    public void setdireccion(int direccion)
    {
        switch(direccion)
        {
        case UP:
        //setRotation(270);

        break;
        case DOWN:
         setRotation(90);

        break;
        case LEFT:
         //setRotation(180);

        break;
        case RIGHT:
        // setRotation(1);

        break;
        }
    }
    
    public void comer()
    {
    Actor disparoj2;
    Actor Disparo;
    disparoj2 =getOneObjectAtOffset(0,0,disparoj2.class);
    Disparo =getOneObjectAtOffset(0,0,Disparo.class);
    if(Disparo != null)
    {escenario1 w=(escenario1)getWorld();
    //w.puntoss2.incrementar();
    World x;
    x= getWorld();
     x.removeObject(disparoj2);
     x.removeObject(Disparo); 
     setLocation(500,200);
    w.vidass1.decrementar();
    if(w.vidass1.obtenerValor()==0){
             game_over2 g=new game_over2();
             getWorld().addObject(g,((getWorld().getWidth()/2)+0),((getWorld().getHeight()/2)+0));
             escenario1 pantalla = getWorldOfType(escenario1.class);
             pantalla.detenerMusica();
             setImage ("muerto.png");
             setLocation(500,360);
             Greenfoot.stop();
             
             //sound.stop();
           }
    }
    if(disparoj2 !=null   )//|| Disparo != null
    {
     World x;
     //world x2;
     escenario1 w=(escenario1)getWorld();
     x= getWorld();
     x.removeObject(disparoj2);
     x.removeObject(Disparo); 
     setLocation(500,200);
     w.vidass1.decrementar();
     w.puntoss2.incrementar();
     if(w.vidass1.obtenerValor()==0){
             game_over2 g=new game_over2();
             getWorld().addObject(g,((getWorld().getWidth()/2)+0),((getWorld().getHeight()/2)+0));
             escenario1 pantalla = getWorldOfType(escenario1.class);
             pantalla.detenerMusica();
             setImage ("muerto.png");
             setLocation(500,360);
             Greenfoot.stop();
             //sound.stop();
           }
     //Greenfoot.playSound("comer.way");
    }
    }
    

    
}
