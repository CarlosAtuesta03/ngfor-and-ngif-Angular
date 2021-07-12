import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pantalladeinicio here.
 * 
 * @author (Carlos Atuesta)
 * @version (a version number or a date)
 */
public class Pantalladeinicio extends World
{
    //private iniciar inicio;
    private Instruccion instrucciones;
    private Creditos Creditos;
    private juegos juegos;
    private informacion informacion;
    ;

   // public static GreenfootSound musica =  new GreenfootSound("Intro.mp3");
    /**
     * Constructor for objects of class PantallaDeInicio.
     * 
     */
    public Pantalladeinicio()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 

        //Agrega el Iniciar
        //inicio = new iniciar();
        //addObject(inicio, 300 , 305);  //le primero as de lado y el segundo de abajo a arriba

        //Agrega las instrucciones
        informacion = new informacion();
        addObject(informacion, 298, 400);
        
        Creditos = new Creditos();
        addObject(Creditos, 300, 530);
        
        juegos = new juegos();
        addObject(juegos, 300, 305);

        prepare();
    }

    /**
     * Este método permite detener la música de inicio del juego, 
     * cuando se ha dado empezado el juego.
     * <b> Pre-Condición: <b/> Ninguna <br>
     * <b> Pos-Condición: <b/> Detiene la música de fondo del juego.
     * 
     *(Carlos Atuesta)
     */
    /*
    public void detenerMusica(){
        musica.stop();
    }*/

    /**
     * Este método reproduce una melodia de fondo.
     * <b> Pre-condición: <b/> Ninguna <br>
     * <b> Pos-condición: <b/> Reproduce la música ambiente del juego.
     * 
     * (Carlos Atuesta)
     * 
     * 
     */
    /*protected void musicaDeFondo() {

        musica.playLoop();

    }*/

    /*public void act(){
        musicaDeFondo();
        //detenerMusica();
    }*/

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }

    public void act()
    {
        elegirjuego.musica.playLoop();
    }
}
