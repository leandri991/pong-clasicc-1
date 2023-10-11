/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegosmoya;


import java.awt.geom.Rectangle2D;



/**
 *
 * @author Alumno
 */
public class Pelota {

    private static final int tamX = 15;
    private static final int tamY = 15;
    private static double x = 0;
    private static double y = 0;
    private static double dx = 1;
    private static  double dy = 1;
   
    private static Integer score1 = 5, score2 = 5;
    public static boolean finJuego = false;
  
    public static void resetGame() {
    	if(eventoteclado.a) {
    		 score1 = 5;
        score2 = 5;
        x = 0;
        y = 0;
        dx = 1;
        dy = 1;
        finJuego = false;
    	}
       
    }
    
    public Rectangle2D getShape() {
        return new Rectangle2D.Double(x, y, tamX, tamY);
    }

    
    
    public void moverPelota(Rectangle2D limites, boolean colisionR1, boolean colisionR2) {
        x += dx;
        y += dy;

        

        if (colisionR1) {
            dx = -dx;
            x = 20;
       
        }
        if (colisionR2) {
            dx = -dx;
            x = 755;

        }

        if (x < limites.getMinX()) {
        	 score1--; 
            
           
            x = limites.getCenterX();
            y = limites.getCenterY();
            dx = -dx;
           
        }

        if (x + tamX >= limites.getMaxX()) {
           
            score2--; 
            x = limites.getCenterX();
            y = limites.getCenterY();
            dx = -dx;
     
        }

        if (y < limites.getMinY()) {

            y = limites.getMinY();

            dy = -dy;
     
        }

        if (y + tamY >= limites.getMaxY()) {

            y = limites.getMaxY() - tamY;

            dy = -dy;
        
        }
        
    
        	
       
        if (score1 <= 0 || score2 <= 0) {
            if (finJuego== true) {
            dx = 0;
            dy = 0; 
            
            }
           
        }

    
    
    
        }
        
    

    public int getScore1() {
        return score1;
    }

    public int getScore2() {
        return score2;
    }

    
    
}
