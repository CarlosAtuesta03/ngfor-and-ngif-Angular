import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class shot here.
 * 
 * @author (Carlos Atuesta) 
 * @version (a version number or a date)
 */
public class disparonave extends Actor
{
    /**
     * Act - do whatever the shot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int shotImage=1;
    int speedShot=2;
    int position;
    
    public disparonave(int direction){
        position=direction;
    }
    public void act() 
    {
        // Add your action code here.
        
        setImage("bala/bala "+shotImage+".png");
        switch(position){
            case 0:           
                setImage ("bala2.png");
                setLocation(getX(),getY()-speedShot);
            break;
            case 1:setImage ("bala6.png");
                setLocation(getX(),getY()+speedShot);
            break;
            case 2:  
                setImage ("bala4.png");
                setLocation(getX()+speedShot,getY());
            break;
            case 3:
                setImage ("bala8.png");
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
        shotImage=1;}
        /*
        Actor barco =getOneObjectAtOffset(0,0,barco.class);
        if(barco!=null)
        {
       escenario2 w=(escenario2)getWorld();
        getWorld().removeObject(barco);
        w.vidasbarco.decrementar();
        getWorld().addObject(new barco (),50,150);
        if(w.vidasbarco.obtenerValor()==0){
             game_over g=new game_over();
             getWorld().addObject(g,((getWorld().getWidth()/2)+30),((getWorld().getHeight()/2)+0));
             
           }

        }*/
    }
}
   