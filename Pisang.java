import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pisang here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pisang extends Actor
{
    /**
     * Act - do whatever the Pisang wants to do. This method is called whenever
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
            Skor.jumlah_skor+=3;
            Greenfoot.playSound("makan.wav");
        }else if(isAtEdge()){
            getWorld().removeObject(this);
        }
    } 
}
