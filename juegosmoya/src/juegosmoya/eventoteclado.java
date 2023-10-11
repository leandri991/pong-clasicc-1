/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegosmoya;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 *
 * @author Alumno
 */
public class eventoteclado extends KeyAdapter{
    static boolean w,s,up,down,a;
    
    @Override
     public void keyPressed(KeyEvent e){
     
         int id= e.getKeyCode();
         
         if(id ==  KeyEvent.VK_A){
             a = true;
         }
     
         if(id ==  KeyEvent.VK_W){
             w = true;
         }
          if(id == KeyEvent.VK_S){
             s = true;
         }
           if(id == KeyEvent.VK_UP){
             up = true;
         }
            if(id == KeyEvent.VK_DOWN){
             down = true;
         }
             
         }
     
     @Override
     public void keyReleased(KeyEvent e){
     
         int id= e.getKeyCode();
         
         if(id ==  KeyEvent.VK_A){
             a = false;
         }
         if(id == KeyEvent.VK_W){
             w = false;
         }
          if(id == KeyEvent.VK_S){
             s = false;
         }
           if(id == KeyEvent.VK_UP){
             up = false;
         }
            if(id == KeyEvent.VK_DOWN){
             down = false;
         }
             
         }
     
}
