import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Jaring here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jaring extends Actor
{
    /**
     * Act - do whatever the Jaring wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX(), getY()+5);
        jatuh();
    }    
    public void jatuh(){
        Actor kenak_jalak = getOneIntersectingObject(Jalak.class);
        if(kenak_jalak != null){
            getWorld().removeObject(this);
            Skor.skor_berkurang();
        }else if(isAtEdge()){
            getWorld().removeObject(this);
            
        }
    }  
}
