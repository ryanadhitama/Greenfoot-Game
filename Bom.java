import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bom extends Actor
{
    /**
     * Act - do whatever the Bom wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       setLocation(getX(), getY()+10);
       jatuh();
    }    
    public void jatuh(){
        Actor kenak_jalak = getOneIntersectingObject(Jalak.class);
        if(kenak_jalak != null){
            getWorld().removeObject(this);
            Nyawa.nyawa_berkurang();
            Greenfoot.playSound("bom.wav");
        }else if(isAtEdge()){
            getWorld().removeObject(this);
        }
    }  
}
