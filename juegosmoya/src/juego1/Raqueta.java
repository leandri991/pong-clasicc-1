package juego1;

import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;

import juego1.eventoteclado1;

public class Raqueta {
	  private int x,y;
	   static final int  ancho=50,alto=10;
	   
	    public Raqueta(int x,int y){
	        this.x=x;
	        this.y=y;
	 
	    }
	    
	    public Rectangle2D getRaqueta(){
	        return new Rectangle2D.Double(x, y, ancho, alto); 
	    }

	    public void moverR1(Rectangle limites){
	        if(eventoteclado1.a && x>limites.getMinY() || eventoteclado1.a){
	           x--; 
	        }
	        if(eventoteclado1.d && x<limites.getMaxY()-alto){
	           x++; 
	        }
	    
	
	    
	}
	
}
