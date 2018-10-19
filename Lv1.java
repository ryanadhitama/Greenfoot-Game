import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lv1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lv1 extends World
{

    /**
     * Constructor for objects of class Lv1.
     * 
     */
    public void act(){
        if(Greenfoot.getRandomNumber(600)<2){
            addObject(new Pepaya(),Greenfoot.getRandomNumber(600),10);
        }
        if(Greenfoot.getRandomNumber(500)<4){
            addObject(new Pisang(),Greenfoot.getRandomNumber(600),10);
        }
        if(Greenfoot.getRandomNumber(700)<2){
            addObject(new Jaring(),Greenfoot.getRandomNumber(600),10);
        }
        if(Greenfoot.getRandomNumber(400)<2){
            addObject(new Bom(),Greenfoot.getRandomNumber(600),10);
        }
        
    }
    public Lv1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(885,600, 1); 
        prepare();
    }
    public void prepare(){
        Jalak jalak = new Jalak();
        addObject(jalak,429,540);
    }
}
