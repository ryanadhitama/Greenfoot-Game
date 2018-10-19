import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class About here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class About extends World
{

    /**
     * Constructor for objects of class About.
     * 
     */
    public About()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(885,600, 1); 
        prepare();
    }
    public void prepare(){
        Back Kembali = new Back();
        addObject(Kembali, 140,140);
        //Kembali.setLocation(140,140);
    }
}
