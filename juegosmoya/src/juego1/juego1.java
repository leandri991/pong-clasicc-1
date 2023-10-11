package juego1;

import javax.swing.JFrame;

import juego1.Hilo1;
import juego1.Tablero1;
import juego1.eventoteclado1;

public class juego1 extends JFrame{
    private final int ancho=500, alto=500;
    private Tablero1 Tablero1 ;
    private Hilo1 Hilo1;
    public juego1(){
        
        setTitle("pong");
        setSize(ancho,alto);
        setLocationRelativeTo(null);
        setResizable(false);
         Tablero1 = new Tablero1();
         add(Tablero1);
         addKeyListener(new eventoteclado1());
          setVisible(true);
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
       Hilo1= new Hilo1 (Tablero1);
       Hilo1.start();

    }
    
}
