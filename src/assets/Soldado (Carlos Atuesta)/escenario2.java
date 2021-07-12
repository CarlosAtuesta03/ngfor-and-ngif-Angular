import greenfoot.*; 
import javax.swing.*; 
import java.util.*; 
/**
 * Write a description of class MyWorld here.
 * 
 * @author (Carlos Atuesta) 
 * @version (a version number or a date)
 */


public class escenario2 extends greenfoot.World
{
    //Puntaje pun=new Puntaje();
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    GreenfootSound musica =  new GreenfootSound("escenario2..mp3");
    public vidas objLife;
    public vidas2 objLife2;
    game_over GAMER_OVER = new game_over(); 
    Tablero puntos;
    Tablero vidas;
    tablero2 puntosbarco;
    tablero2 vidasbarco;
    public salir2 salir2;
    public escenario2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(560, 410, 1); 
        setPaintOrder(game_over.class,Tablero.class,tablero2.class,nave.class);
        nave n1=new nave(); 
        addObject (n1, 50, 380);
        
        //enemigo
        Enemigo2 enemigo2 = new Enemigo2();
        addObject(enemigo2,452,290);
        
        barco n3=new barco(); 
        addObject (n3, 50, 150);
        //crearroca (4);
        //crearastronauta (4);
        objLife=new vidas();
        objLife2=new vidas2();
        
        puntos=new Tablero(0,"Puntaje: ");
        vidas=new Tablero(3,"Vidas jugador 1: ");
       
       addObject(puntos,480,105);
        addObject(vidas,480,85);
        
        puntosbarco = new tablero2 (0,"Puntaje: ");
        vidasbarco = new tablero2 (3,"Vidas jugador 2: ");
        addObject(puntosbarco,115,105);
        addObject(vidasbarco,115,85);
        
        salir2 = new salir2();
        addObject(salir2,  280, 30);
      
        
        //addObject(vidas2,250,85);
        //prepare();
    }
    /* public void prepare()
     {
        addObject(pun,50,8);
     }
    *//*
    public void crearroca(int numero)
    {   for(int i=0; i<numero;i++)
        {roca r1=new roca();
        int x=Greenfoot.getRandomNumber(getWidth());
        int y=Greenfoot.getRandomNumber(getHeight());
        addObject(r1, x, y);
    }
    */
   
   public void detenerMusica(){
        musica.stop();
    }
    protected void musicaDeFondo() {

        musica.playLoop();

    }
    public void act(){
        musicaDeFondo();
        
        if (Greenfoot.getRandomNumber(100) < 1)
        {
            addObject(new nubes (), 779, 59);
        }
        //detenerMusica();
    }
    }
    /* public void crearastronauta(int numero)
    {   for(int j=0; j<numero;j++)
        {astronauta a1=new astronauta();
        int x=Greenfoot.getRandomNumber(getWidth());
        int y=Greenfoot.getRandomNumber(getHeight());
        addObject(a1, x, y);
    }*/
    //}
   // public game_over getGAMER_OVER()
    //{
      //return GAMER_OVER;
    
    
    
    
