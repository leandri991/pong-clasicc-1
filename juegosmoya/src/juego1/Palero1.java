package juego1;

import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;

import juego1.eventoteclado1;

public class Palero1 {
	
	  private static final int tamX = 15;
	    private static final int tamY = 15;
	    private static double x = 0;
	    private static double y = 0;
	    private static double dx = 1;
	    private static  double dy = 1;
	   
	    private static Integer score1 = 5;
	    public static boolean finJuego = false;
	  
	    
	    public static Rectangle2D getShape() {
	        return new Rectangle2D.Double(x, y, tamX, tamY);
	    }

	    
	    

public void moverPelota(Rectangle limites, boolean colisionp1) {
    x += dx;
    y += dy;
    
    if(colisionp1)
    {
    	dy=-dy;
    	y=400;
    }
    if (x > limites.getMaxX()) {
        dx = -dx;
    }
    if (y > limites.getMaxY()) {
        dy = -dy;
    }
    if (x < 0) {
        dx = -dx;
    }
    if (y < 0) {
        dy = -dy;
    }
}
public void aumentarVelocidad() {
    dx = 1.1;
    dy = 1.1;
}
	    

	
	 

}
