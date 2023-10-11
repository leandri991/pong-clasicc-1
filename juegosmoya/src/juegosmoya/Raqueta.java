
package juegosmoya;

import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author Alumno
 */
public class Raqueta {
   private int x,y;
   static final int  ancho=10,alto=40;
   
    public Raqueta(int x,int y){
        this.x=x;
        this.y=y;
 
    }
    
    public Rectangle2D getRaqueta(){
        return new Rectangle2D.Double(x, y, ancho, alto); 
    }

    public void moverR1(Rectangle limites){
        if(eventoteclado.w && y>limites.getMinY() || eventoteclado.a){
           y--; 
        }
        if(eventoteclado.s && y<limites.getMaxY()-alto){
           y++; 
        }
    
}
    
    public void moverR2(Rectangle limites){
        if(eventoteclado.up && y>limites.getMinY() || eventoteclado.a){
           y--; 
        }
        if(eventoteclado.down && y<limites.getMaxY()-alto){
           y++; 
        }
    
}
    
}
