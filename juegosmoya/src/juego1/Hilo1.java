package juego1;

import java.util.logging.Level;
import java.util.logging.Logger;

import juego1.Hilo1;
import juego1.Tablero1;

public class Hilo1 extends Thread{
    Tablero1 Tablero1;
    
    public Hilo1(Tablero1 Tablero1){
        this.Tablero1=Tablero1;
    }
    
    @Override
    public void run(){
        while(true){
          
            try {
                Thread.sleep(7);
            } catch (InterruptedException ex) {
                Logger.getLogger(Hilo1.class.getName()).log(Level.SEVERE, null, ex);
            }
           
            Tablero1.repaint();
        }
    }
     
}
