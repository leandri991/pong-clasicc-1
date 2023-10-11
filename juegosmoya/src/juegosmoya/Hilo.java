/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegosmoya;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alumno
 */
public class Hilo extends Thread{
    Tablero Tablero;
    
    public Hilo(Tablero Tablero){
        this.Tablero=Tablero;
    }
    
    @Override
    public void run(){
        while(true){
          
            try {
                Thread.sleep(7);
            } catch (InterruptedException ex) {
                Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
            }
           
            Tablero.repaint();
        }
    }
    
}
