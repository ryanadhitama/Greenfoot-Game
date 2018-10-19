import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nyawa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nyawa extends World
{

    /**
     * Constructor for objects of class Nyawa.
     * 
     */
    static int jumlah_nyawa = 3;
    public Nyawa()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
    }
    
    /**
     * Constructor for objects of class Skor.
     * 
     */
  
     public static void nyawa_berkurang()
    {    
         jumlah_nyawa--;
        if(jumlah_nyawa <= 0){
              Greenfoot.setWorld(new Over());
        }
        
    }
}
