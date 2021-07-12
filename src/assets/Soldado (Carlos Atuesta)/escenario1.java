import greenfoot.*; 
import javax.swing.*; 
import java.util.*; 
/**
 * Write a description of class MyWorld here.
 * 
 * @author (Carlos Atuesta) 
 * @version (a version number or a date)
 */

public class escenario1 extends greenfoot.World
{
    //Puntaje pun=new Puntaje();
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    //GreenfootSound musica =  new GreenfootSound("escenario1.mp3");
    public static GreenfootSound musica =  new GreenfootSound("escenario1.mp3");

    public vidas objLife;
    public vidas2 objLife2;
    //public puntoss1 puntoss1;
    //public puntoss1 puntoss1;
    public salir salir;
    game_over GAMER_OVER = new game_over(); 
    tablero4 puntoss1;
    tablero3 puntoss2;
    tablero3 vidass1;
    tablero4 vidass2;
    

    /**
     * Encargado de mostrar en pantalla que se ha ganado el juego
     */

    public escenario1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(560, 410, 1); 
        setPaintOrder(game_over.class,Tablero.class,nave.class);
        soldado2 n1=new soldado2(); 
        addObject (n1, 50, 350);

        salir = new salir();
        addObject(salir, 280, 30);
        
        soldado1 n2=new soldado1(); 
        addObject (n2, 500, 350);

        plataforma n3=new plataforma(); 
        addObject (n3, 47, 408);
        plataforma n4=new plataforma(); 
        addObject (n4, 100, 408);
        plataforma n5=new plataforma(); 
        addObject (n5, 160, 408);
        plataforma n6=new plataforma(); 
        addObject (n6, 240, 408);
        plataforma n26=new plataforma(); 
        addObject (n26, 280, 408);
        plataforma n7=new plataforma(); 
        addObject (n7, 370, 408);
        plataforma n8=new plataforma(); 
        addObject (n8, 460, 408);
        plataforma n9=new plataforma(); 
        addObject (n9, 520, 408);
        //plataformas suspendidas
        plataforma n10=new plataforma(); 
        addObject (n10, 46, 300);
        plataforma n11=new plataforma(); 
        addObject (n11, 168, 250);
        plataforma n12=new plataforma(); 
        addObject (n12, 46, 200);
        //plataforma n13=new plataforma(); 
        //addObject (n13, 168, 150);
        //plataforma n14=new plataforma(); 
        //addObject (n14, 46, 100);
        //plataformas suspendidas2
        plataforma n15=new plataforma(); 
        addObject (n15, 518, 300);
        plataforma n16=new plataforma(); 
        addObject (n16, 405, 250);
        plataforma n17=new plataforma(); 
        addObject (n17, 518, 200);
        //plataforma n18=new plataforma(); 
        //addObject (n18, 405, 150);
        //plataforma n19=new plataforma(); 
        //addObject (n19, 518, 100);

        //crearroca (4);
        //crearastronauta (4);
        objLife=new vidas();
        objLife2=new vidas2();

        puntoss2=new tablero3(0,"Puntaje: ");
        vidass2=new tablero4(3,"Vidas jugador 2: ");

        addObject(puntoss2,115,105);
        addObject(vidass2,115,85);

        puntoss1=new tablero4(0,"Puntaje: ");
        vidass1=new tablero3(3,"Vidas jugador 1: ");

        addObject(puntoss1,480,105);
        addObject(vidass1,480,85);

        // salir = new salir();
        // addObject(salir, 510, 385);
        //prepare();

        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Enemigo enemigo = new Enemigo();
        addObject(enemigo,452,61);
    }
    public void detenerMusica(){
        musica.stop();
    }
    protected void musicaDeFondo() {

        musica.playLoop();

    }
    
    public void act(){
        musicaDeFondo();
        //detenerMusica();
    }
    
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
   
    