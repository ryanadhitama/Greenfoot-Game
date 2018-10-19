import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Start extends Actor
{
    /**
     * Act - do whatever the Start wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         if(Greenfoot.mousePressed(this)){
            getImage().scale((int)Math.round(getImage().getWidth() * 0.9), (int)Math.round(getImage().getHeight() * 0.9));
        }
        if (Greenfoot.mouseClicked(this)) {
            Nyawa.jumlah_nyawa = 3;
            Skor.jumlah_skor = 0;
            Greenfoot.delay(5); 
            Greenfoot.setWorld(new Lv1());
        }
    }        
}
