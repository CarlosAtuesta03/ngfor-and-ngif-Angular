import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Instrucciones here.
 * 
 * @author (Carlos Atuesta) 
 * @version (a version number or a date)
 */
public class informacion extends Actor
{
/**
     * 
     * 
     * <b> Pre-condición: <b/> Ninguna <br>
     * <b> Pos-Condición: <b/> Cambia de escenario y detiene la música inicial de la 
     * pantalla de inicio. <br>
     * 
     * @Carlos Atuesta
     */
    public void iniciarinformacion() {
        if(seDioClick()) {
            Pantalladeinicio pantalla = getWorldOfType(Pantalladeinicio.class);
            cargarinformacion();
        }
    }

    /**
     * Este método permite cambiar cambiar de escenario, iniciando el Escenario de Instrucciones.
     * <b> Pre-condición: <b/> Ninguna <br>
     * <b> Pos-condición: <b/> Inicia un nuevo escenario. <br>
     * 
     * @Carlos Atuesta
     */
    private void cargarinformacion() {
        Greenfoot.setWorld(new informatio1());
    }

    /**
     * Este método verifica si se dio clic sobre el menu Instrucciones.
     * <b> Pre-condición: <b/> Ninguna <br>
     * <b> Pos-Condición: <b/> Ninguna <br>
     * 
     * @return true si se dio clic, false en caso contrario.
     * @Carlos Atuesta
     */
    private boolean seDioClick() {
        return Greenfoot.mouseClicked(this);
    }

    public void act() {
        iniciarinformacion();
    }    
}




