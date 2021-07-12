import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class shot here.
 * 
 * @author (Carlos Atuesta) 
 * @version (a version number or a date)
 */
public class disparobarco extends Actor
{
    game_over GamerOver = new game_over();
    /**
     * Act - do whatever the shot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int shotImage=1;
    int speedShot=1;
    int position;
    private GreenfootImage[] images= new GreenfootImage[4];
    public int a=10,num=0,vel=30;                //animacion de movimiento 

    public disparobarco(int direction){
        position=direction;
    }
    public void act() 
    {

         switch(position){
            case 0:
        
        for(int i=0;i<images.length;i++)
        {
            images[i]=new GreenfootImage("mina"+i+".png");//animacion de movimiento
        }   
        setImage(images[0]);
        setLocation(getX(),getY()-speedShot);
            break;
            
            
            case 1:
      for(int i=0;i<images.length;i++)
        {
            images[i]=new GreenfootImage("mina"+i+".png");//animacion de movimiento
        }   
        setImage(images[0]);
                setLocation(getX(),getY()+speedShot);
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
        if(a==0)a=10;
        
        if(a==1){
        setImage(images[num]);
        num++;
        if(num>=images.length)num=0;
          }    
        if(a>0)a--;
        
        /*Actor nave=getOneObjectAtOffset(0,0,nave.class);
      
        if(nave!=null)
        {
        escenario2 w=(escenario2)getWorld();
        getWorld().removeObject(nave);
        
        w.vidas.decrementar();
        getWorld().addObject(new nave (),50,250);
        if(w.vidas.obtenerValor()==0){
             
             game_over2 g=new game_over2();
             getWorld().addObject(g,((getWorld().getWidth()/2)+30),((getWorld().getHeight()/2)+0));
           }

        }} */ }}
    
   
    
        
