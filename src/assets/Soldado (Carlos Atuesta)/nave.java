import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class nave here.
 * 
 * @author (Carlos Atuesta)
 * @version (a version number or a date)
 */
public class nave extends Actor
{
    public static final int UP=0;
    public static final int DOWN=1;     // para tener direcion 
    public static final int LEFT=2;
    public static final int RIGHT=3;
    int directionShot=2;
    
    private int dirant = 0;
    private int diract = 0;
    private int liminf = 0;
    private int limsup = 3;
    
    private int xMin=45; 
    private int xMax=520;               //para poner limites de escenario 
    private int yMin=175; 
    private int yMax=100;

    private GreenfootImage[] images= new GreenfootImage[16];
    public int a=10,num=0,vel=10;                //animacion de movimiento 
    public void addedToWorld(World MyWorld)
    {
        for(int i=0;i<images.length;i++)
        {
            images[i]=new GreenfootImage("nave"+(i+1)+".png");//animacion de movimiento
        }   
        setImage(images[0]);
    } 
    boolean isShot=false;
    public void act() 
    {  
        int y = getY();
        int x = getX();
        
        if(Greenfoot.isKeyDown("up"))
        { diract=3;
            setdireccion (UP);
            if( yMin < y -2)
              { y=y - 2;}
            directionShot=0;}
        
        
        if(Greenfoot.isKeyDown("down"))
        {  diract=2;
            setdireccion(DOWN);
        if( yMax < y +2)
           {y=y + 2;}   
        directionShot=1;}
        
        
        if(Greenfoot.isKeyDown("left"))
        {
          diract=1;  
         
            
        setdireccion(LEFT);
        if( xMin < x -2)
          { x=x - 2;}
        directionShot=3;}
        
        
        if(Greenfoot.isKeyDown("right"))
        {
         diract=0;   
            
            
        setdireccion(RIGHT);
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
            if(diract == 2){
                setImage(images[8]);
                num=8;
                liminf=8;
                limsup=11;
            }
            if(diract == 3){
                setImage(images[12]);
                num=12;
                liminf=12;
                limsup=15;
            }
        }
        else{
            if(num<limsup)
             {
            num++;
            setImage(images[num]);
              }
            else{
             num=liminf;
            setImage(images[num]);
                 
                }
            }
        setLocation(x,y); 
        comer(); 

    }    
    public void setShot(int direction)
    {
    if(isShot && Greenfoot.isKeyDown ("p"))
    {Greenfoot.playSound("misil.mp3");
    disparonave s1=new disparonave(direction);
    getWorld().addObject(s1,getX(),getY());
    isShot=false;
    }
    if(!isShot && !Greenfoot.isKeyDown("p"))
    {
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
         //setRotation(90);

        break;
        case LEFT:
       //  setRotation(180);

        break;
        case RIGHT:
        // setRotation(1);

        break;
        }
    }
   

    public void comer()
    {
    Actor disparobarco;
    Actor Enemigo2;
    disparobarco =getOneObjectAtOffset(0,0,disparobarco.class);
    Enemigo2 =getOneObjectAtOffset(0,0,Enemigo2.class);
    
    if(Enemigo2 !=null)
    {
     World x;
     escenario2 w=(escenario2)getWorld();
     x= getWorld();
     x.removeObject(disparobarco);
     setLocation(50,380);
     w.vidas.decrementar();
     //w.puntosbarco.incrementar();
     if(w.vidas.obtenerValor()==0){
             game_over2 g=new game_over2();
             getWorld().addObject(g,((getWorld().getWidth()/2)+0),((getWorld().getHeight()/2)+0));
             escenario2 pantalla = getWorldOfType(escenario2.class);
             pantalla.detenerMusica();
             setImage ("explosion.png");
             Greenfoot.stop();
           }
    }
    
    if(disparobarco !=null   )
    {
     World x;
     escenario2 w=(escenario2)getWorld();
     x= getWorld();
     x.removeObject(disparobarco);
     setLocation(50,380);
     w.vidas.decrementar();
     w.puntosbarco.incrementar();
     if(w.vidas.obtenerValor()==0){
             game_over2 g=new game_over2();
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
