package juego1;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Tablero1 extends JPanel {

    Palero1 balon = new Palero1();
    Raqueta p = new Raqueta(350, 415);
    private int puntaje = 0;
    private boolean juegoEnCurso = true;
    private int contadorToques = 0;
    private int toquesParaAumentarVelocidad = 5;
    private int vidas = 3;

    public Tablero1() {
        setBackground(Color.BLACK);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.WHITE);
        dibujar(g2);
        actualizar();
    }

    public void dibujar(Graphics2D g) {
        g.fill(Palero1.getShape());
        g.fill(p.getRaqueta());
        g.drawString("Puntaje: " + puntaje, 10, 20);
        g.drawString("Vidas: " + vidas, 300, 20);
    }

    public void actualizar() {
        balon.moverPelota(getBounds(), colisionp1(p.getRaqueta()));
        p.moverR1(getBounds());
        if (colisionp1(p.getRaqueta())) {
            balon.moverPelota(getBounds(), true);
            puntaje++;
            contadorToques++;
        }
        if (contadorToques >= toquesParaAumentarVelocidad) {
            balon.aumentarVelocidad();
            contadorToques = 0;
        }
        if (Palero1.getShape().getMaxY() >= getHeight()) {
            juegoEnCurso = false;
            vidas--;
            if (vidas == 0) {
                JOptionPane.showMessageDialog(this, "¡Juego perdido!\nPuntaje: " + puntaje, "Game Over",
                        JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            }
        }
    }

    public void iterar() {
        while (juegoEnCurso) {
            try {
                repaint();
                Thread.sleep(7);
            } catch (InterruptedException ex) {
                Logger.getLogger(Tablero1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private boolean colisionp1(Rectangle2D r) {
        return Palero1.getShape().intersects(r);
    }
}
