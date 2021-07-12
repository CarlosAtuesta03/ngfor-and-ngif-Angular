import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * 
 * 
 * @Carlos Atuesta
 * @version 2
 */
public class Disparo extends Actor
{
    private int velY =  5;
    private int frame;

    

    /**
     * Este metodo permite generar los disparos que produce el enemigo.
     * <b> Pre-Condición: <b\> Ninguna <br> 
     * <b> Pos-Condición: <b\> Elimina el disparo cuando este ha llegado a la parte 
     * inferior de la pantalla <br>
     * 
     * @Carlos Atuesta
     */
    public Disparo (String lugar){ 
        if (lugar.equals("bosque")){
            frame = Greenfoot.getRandomNumber (3)+1;
            setImage("Huevo"+frame+".png");

        }
        if (lugar.equals("espacio")){
            frame = Greenfoot.getRandomNumber (3)+1;
            setImage("HuevoEspacio_"+frame+".png");
        }
    }

 
    public Disparo() 
    {
        velY = 1;
        
    }  
       public void act(){
           
        setLocation(getX()-1, getY()+1+ velY);
        if(this.getY() > 464){
            
            this.getWorld().removeObject(this); 
               this.getWorld().removeObject(this);
            }
        } 

    }
    
