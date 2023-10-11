/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegosmoya;

import javax.swing.JFrame;

/**
 *
 * @author Alumno
 */
public class juego extends JFrame{
    private final int ancho=800, alto=500;
    private Tablero Tablero ;
    private Hilo hilo;
    public juego(){
        
        setTitle("pong");
        setSize(ancho,alto);
        setLocationRelativeTo(null);
        setResizable(false);
         Tablero = new Tablero();
         add(Tablero);
         addKeyListener(new eventoteclado());
          setVisible(true);
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
       hilo=new Hilo(Tablero);
        hilo.start();

    }
    
    
}
