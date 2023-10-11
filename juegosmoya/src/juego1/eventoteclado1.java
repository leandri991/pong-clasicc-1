/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juego1;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 *
 * @author Alumno
 */
public class eventoteclado1 extends KeyAdapter{
    static boolean a,d,right,left,u;
    
    @Override
     public void keyPressed(KeyEvent e){
     
         int id= e.getKeyCode();
         
         if(id ==  KeyEvent.VK_U){
             u = true;
         }
     
         if(id ==  KeyEvent.VK_A){
             a = true;
         }
          if(id == KeyEvent.VK_D){
             d = true;
         }
           if(id == KeyEvent.VK_LEFT){
             left = true;
         }
            if(id == KeyEvent.VK_RIGHT){
             right = true;
         }
             
         }
     
     @Override
     public void keyReleased(KeyEvent e){
     
         int id= e.getKeyCode();
         
         if(id ==  KeyEvent.VK_U){
             u = false;
         }
     
         if(id ==  KeyEvent.VK_A){
             a = false;
         }
          if(id == KeyEvent.VK_D){
             d = false;
         }
           if(id == KeyEvent.VK_LEFT){
             left = false;
         }
            if(id == KeyEvent.VK_RIGHT){
             right = false;
         }
             
         }
     
}
