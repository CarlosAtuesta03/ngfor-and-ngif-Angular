import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pantalladeinicio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class elegirjuego extends World
{
    public Atras atras;
    private juego1 inicio1;
    private juego2 inicio2;
    private Instruccion instrucciones;
    private Creditos Creditos;
    private control1 control1;
    private control2 control2;
    
    public static GreenfootSound musica =  new GreenfootSound("Intro.mp3");
    
    
    /**
     * Constructor for objects of class PantallaDeInicio.
     * 
     */
    public elegirjuego()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 

        //Agrega el Iniciar
        //inicio = new iniciar();
        //addObject(inicio, 300 , 305);  //le primero as de lado y el segundo de abajo a arriba

        inicio1 = new juego1();
        addObject(inicio1, 150 , 305);
        
        inicio2 = new juego2();
        addObject(inicio2, 450 , 305);
        //Agrega las instrucciones
        //instrucciones = new Instruccion();
        //addObject(instrucciones, 298, 400);
        
        control1 = new control1();
        addObject(control1, 298, 400);
        
        control2 = new control2();
        addObject(control2, 298, 480);
        
        atras = new Atras();
        addObject(atras, 540, 570);

        prepare();
    }

    /**
     * Este método permite detener la música de inicio del juego, 
     * cuando se ha dado empezado el juego.
     * <b> Pre-Condición: <b/> Ninguna <br>
     * <b> Pos-Condición: <b/> Detiene la música de fondo del juego.
     * 
     * (Carlos Atuesta)
     */
    public void detenerMusica(){
        musica.stop();
    }

    /**
  
     * 
     * (Carlos Atuesta)
     * 
     * 
     */
    protected void musicaDeFondo() {

        musica.playLoop();

    }

    public void act(){
        musicaDeFondo();
        //detenerMusica();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}
