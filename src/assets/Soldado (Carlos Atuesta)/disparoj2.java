import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class shot here.
 * 
 * @author (Carlos Atuesta) 
 * @version (a version number or a date)
 */
public class disparoj2 extends Actor
{
    /**
     * Act - do whatever the shot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int shotImage=1;
    int speedShot=3;
    int position;
    
    
    public disparoj2(int direction){
        position=direction;
    }
    public void act() 
    {
        // Add your action code here.
        
        setImage("dis/dis "+shotImage+".png");
        switch(position){
            case 0:           
                //setImage ("bala1.png");
                //setLocation(getX(),getY()-speedShot);
            break;
            case 1:
                //setImage ("disparo1.png");
                //setLocation(getX(),getY()+speedShot);
            break;
            case 2:  
                setImage ("dis 2.png");
                setLocation(getX()+speedShot,getY());
            break;
            case 3:
                setImage ("dis 1.png");
                setLocation(getX()-speedShot,getY());
            break;
        }
       /* Actor roca=getOneObjectAtoffset (0,0,roca.class);
        if(roca!=null)
        {
        MyWorld wo=(MyWorld)getWorld();
        getWorld().removeObject(roca);
        }*/
        if((getX()>=getWorld().getWidth()-5 || (getX()<=5)))
        {getWorld().removeObject(this);}
        else
        {
        if((getY()>=getWorld().getHeight()-5 || (getY()<=5)))
        {getWorld().removeObject(this);}
        
        else
        if(shotImage<1)
        shotImage++;
        else
        shotImage=2;}
        
        
        /*
        Actor soldado1 =getOneObjectAtOffset(0,0,soldado1.class);
        if(soldado1!=null)
        {
       escenario1 w=(escenario1)getWorld();
        getWorld().removeObject(soldado1);
        w.vidass1.decrementar();
        getWorld().addObject(new soldado1 (),500,200);//primero es de izquierda a derecha 
        if(w.vidass1.obtenerValor()==0){
             game_over2 g=new game_over2();
             getWorld().addObject(g,((getWorld().getWidth()/2)+30),((getWorld().getHeight()/2)+0));
             
           }

        }*/
    }

}

