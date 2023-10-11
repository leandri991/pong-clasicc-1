/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegosmoya;

import java.awt.*;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;



/**
 *
 * @author Alumno
 */
public class Tablero extends JPanel {

    Raqueta r1 = new Raqueta(10, 200);
    Raqueta r2 = new Raqueta(794 - 10 - Raqueta.ancho, 200);
    Pelota p = new Pelota();

    public Tablero() {
        this.setBackground(Color.BLACK);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setPaint(Color.WHITE);
        dibujarPuntaje(g2);
        dibujar(g2);

    }

    private void dibujar(Graphics2D g) {
        Line2D.Double linea = new Line2D.Double(getBounds().getCenterX(), 0, getBounds().getCenterX(), getBounds().getMaxY());

        g.draw(linea);

        g.fill(r1.getRaqueta());
        update();

        g.fill(r2.getRaqueta());
        update();

        g.fill(p.getShape());
        update();
    }


    private void update() {

        p.moverPelota(getBounds(), colision(r1.getRaqueta()), colision(r2.getRaqueta()));

        r1.moverR1(getBounds());
        r2.moverR2(getBounds());
    }


    private boolean colision(Rectangle2D r) {
        return p.getShape().intersects(r);
    }

    
    
    private void dibujarPuntaje(Graphics2D g) {
        Graphics2D g1 = g, g2 = g;

        Font score = new Font("Arial", Font.BOLD, 30);
        g.setFont(score);

        g1.drawString(Integer.toString(p.getScore1()), (float) getBounds().getCenterX() - 50, 30);
        g2.drawString(Integer.toString(p.getScore2()), (float) getBounds().getCenterX() + 25, 30);
        if (p.getScore1() == 0) {
            g.drawString("GANÓ El JUGADOR 1", (float) getBounds().getCenterX() - 180, (float) getBounds().getCenterY() - 100);
            Pelota.finJuego = true;
        }
        if (p.getScore2() == 0) {
            g.drawString("GANÓ EL JUGADOR 2", (float) getBounds().getCenterX() - 180, (float) getBounds().getCenterY() - 100);
            Pelota.finJuego = true;
        }
        if (p.finJuego==true) {
            g2.drawString("La tecla A para reiniciar.", 200, 200);
            Pelota.resetGame();
        }
        
        
    }

}