import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Skor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Skor extends World
{

    /**
     * Constructor for objects of class Skor.
     * 
     */
    static int jumlah_skor = 0;
    /**
     * Constructor for objects of class Skor.
     * 
     */
    public Skor()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
    }
     public static void skor_berkurang()
    {    
        jumlah_skor-=5;
        if(jumlah_skor < 0){
             Greenfoot.setWorld(new Over());
        }
        
    }
}
