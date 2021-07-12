import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Enemigo2 extends Actor
{
    
    private double velocidad = 0.0;
    private int frame = 0;
    private int velX = 3;
    private int contador = 10;
    private int escenario = 1;
    private boolean seMueve=false;



    
    public void eliminarEnemigo (){
        if (this.getX()<300){
            this.getWorld().removeObject(this);
        }
    }

     /*
    private void disparar()
    {
        if(this.getX()<=520){
            if (contador <= 0){
                Disparo disparo = new Disparo("escenario2"); //
                this.getWorld().addObject(disparo, this.getX()-10, this.getY()); //
                contador = 125;
            }
            contador --;
        }else{
            this.getWorld().removeObject(this);
        }
    }
     */
   
    public void hacerVolar(){

        setLocation(getX() + velX, getY());
        if (this.getX()<3){
            velX = 3;
            setLocation(getX() + velX, getY());
        }

        if (velX>0){
            this.setImage("tiburon4.png");
            
        }

        if (this.getX()==500){
            velX = -3;
            setLocation(getX() + velX, getY());
            if (velX<0){
                this.setImage("tiburon1.png");
            }

        }
        
        if (velX<0){
            this.setImage("tiburon1.png");
        }
        
      
        
    }
    public void act() 
    {
        frame ++;
        if (frame > 8){
            frame = 1;
        }
            
        //disparar();
        hacerVolar();
       }
    }
