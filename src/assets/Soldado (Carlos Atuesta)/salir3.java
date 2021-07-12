import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Volver here.
 * 
 * @author (Carlos Atuesta) 
 * @version (a version number or a date)
 */
public class salir3 extends Actor
{
    

    /**
     * 
     * 
     * <b> Pre-condición: <b/> Ninguna <br>
     * <b> Pos-Condición: <b/> Cambia de escenario y detiene la música inicial de la 
     * pantalla de inicio. <br>
     * 
     * (Carlos Atuesta).
     */
    public void volverInicio() {
        if(seDioClick()) {
            information2 pantalla = getWorldOfType(information2.class);
            pantalla.detenerMusica();
            cargarInicio();
            
        }
    }

    /**
     * Este método permite cambiar cambiar de escenario, volviendo al mundo de inicio.
     * <b> Pre-condición: <b/> Ninguna <br>
     * <b> Pos-condición: <b/> Inicia un nuevo escenario. <br>
     * 
     * @(Carlos Atuesta)
     */
    private void cargarInicio() {
        Greenfoot.setWorld(new Pantalladeinicio());
    }

    /**
     * Este método verifica si se dio clic sobre la clase atras.
     * <b> Pre-condición: <b/> Ninguna <br>
     * <b> Pos-Condición: <b/> Ninguna <br>
     * 
     * @return true si se dio clic, false en caso contrario.
     * (Carlos Atuesta)
     */
    private boolean seDioClick() {
        return Greenfoot.mouseClicked(this);
    }

    public void act() {
        volverInicio();
    }      
}
