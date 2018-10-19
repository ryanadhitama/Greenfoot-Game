import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Credit_background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Credit_background extends World
{

    /**
     * Constructor for objects of class Credit_background.
     * 
     */
    public Credit_background()
    {    
        super(885,600, 1); 
        prepare();
    }
    public void prepare(){
        Back Kembali = new Back();
        addObject(Kembali, 170,130);
       // Kembali.setLocation(170,130);
    }
}
