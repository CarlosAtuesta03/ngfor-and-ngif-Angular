import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class nave here.
 * 
 * @author (Carlos Atuesta) 
 * @version (a version number or a date)
 */
public class soldado2 extends Actor
{
    public static final int UP=0;
    public static final int DOWN=1;     // para tener direcion 
    public static final int a=2;
    public static final int d=3;
    int directionShot=2;
    private int xMin=25; 
    private int xMax=270;
    
    private int vSpeed=0;
    private int aceleracion=1;      //codigo de salto 
    private int jumpHeight= -5;
    
    private int dirant = 0;
    private int diract = 0;
    private int liminf = 0;
    private int limsup = 3;
    
    private int tiempo = 0;

    private GreenfootImage[] images= new GreenfootImage[8];
    public int A=10,num=0,vel=30;    
    //animacion de movimiento 
    public void addedToWorld(World MyWorld)
    {   
        for(int i=0;i<images.length;i++)
        {
            images[i]=new GreenfootImage("s"+(i+1)+".png");//animacion de movimiento
        }   
        setImage(images[0]);
    } 
    
    boolean isShot=false;
    
    public soldado2()
    {
    setImage ("s1.png");
    }
    
    private void fall()
    {
    setLocation(getX(),getY()+ vSpeed);   //parte del codigo de salto
    vSpeed=vSpeed+aceleracion;
    }
    public void act() 
    {  
        int y = getY();
        int x = getX();
        
       
        if(Greenfoot.isKeyDown("a"))
        {   diract=1; 
          //  setdireccion(LEFT);
        if( xMin < x -2)
          { x=x - 2;}
        directionShot=3;
       }
        
        
        if(Greenfoot.isKeyDown("d"))
        {diract=0; 
          //  setdireccion(RIGHT);
        if( xMax > x +2)
        {  x=x + 2; }
        directionShot=2;}
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
                 
                }tiempo = 0;}
            }
        setLocation(x,y); 
        
        tiempo++;
        
        moveAlrededor();
        checkFalling(); //parte de codigo salto
        
        comer (); 

    }    
    
    public void moveAlrededor()//codigo de salto
    {

    if(Greenfoot.isKeyDown("w")) 
    {
     vSpeed=jumpHeight;
     fall();
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
    if(isShot && Greenfoot.isKeyDown ("q"))
    {Greenfoot.playSound("disparo.mp3");
    disparoj2 s1=new disparoj2(direction);
    getWorld().addObject(s1,getX(),getY());
    isShot=false;
    
      //GreenfootSound musica =  new GreenfootSound("disparo.mp3");
    }
    if(!isShot && !Greenfoot.isKeyDown("q"))
    {
    isShot=true;
    
    //musica.playLoop();
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
        case a:
         //setRotation(180);

        break;
        case d:
        // setRotation(1);

        break;
        }
    }
    
    public void comer()
    {
    Actor disparoj1;
    Actor Disparo;
    disparoj1 =getOneObjectAtOffset(0,0,disparoj1.class);
    Disparo =getOneObjectAtOffset(0,0,Disparo.class);
    
    if(Disparo != null)
    {escenario1 w=(escenario1)getWorld();
    //w.puntoss2.incrementar();
    World x;
    x= getWorld();
     x.removeObject(disparoj1);
     x.removeObject(Disparo); 
     setLocation(160,200);
    w.vidass2.decrementar();
    if(w.vidass2.obtenerValor()==0){
             game_over g=new game_over();
             getWorld().addObject(g,((getWorld().getWidth()/2)+0),((getWorld().getHeight()/2)+0));
             escenario1 pantalla = getWorldOfType(escenario1.class);
             pantalla.detenerMusica();
             setImage ("muerto.png");
             setLocation(60,360);
             Greenfoot.stop();
             
             //sound.stop();
           }
    }
    
    if(disparoj1 !=null  )
    {
     World x;
     escenario1 w=(escenario1)getWorld();
     x= getWorld();
     x.removeObject(disparoj1);
     x.removeObject(Disparo); 
     setLocation(160,200);
     w.vidass2.decrementar();
     w.puntoss1.incrementar();
     
     if(w.vidass2.obtenerValor()==0){
             game_over g=new game_over();
             getWorld().addObject(g,((getWorld().getWidth()/2)+0),((getWorld().getHeight()/2)+0));
             escenario1 pantalla = getWorldOfType(escenario1.class);
             pantalla.detenerMusica();
             setImage ("muerto.png");
             setLocation(60,360);
             Greenfoot.stop();
           }
     //Greenfoot.playSound("comer.way");
    }
    }
    

    
}
