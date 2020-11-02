/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoparcial2;

import java.awt.Graphics;
import javax.swing.JPanel;
/**
 *
 * @author Manuel_2
 */
public class Lienzo extends JPanel{
    private BinaryTree arbol;
    public static final int DIAMETRO = 30;
    public static final int RADIO = DIAMETRO/2;
    public static final int ANCHO = 50;
    
    public void setArbol( BinaryTree arbol){
        this.arbol = arbol;
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        pintar(g, getWidth()/2,20,arbol.root);
    }
    
    private void pintar(Graphics g, int x, int y, Node n){
        if(n== null){
            
        }
        else{
            int EXTRA = n.nodosCompletos(n) * (ANCHO/2);
            g.drawOval(x, y, DIAMETRO, DIAMETRO);
            g.drawString(n.getData(), x+12, y+18);
            if(n.getLeft() != null){
                g.drawLine(x+RADIO-10, y+RADIO+5, x-ANCHO-EXTRA+RADIO+10, y+ANCHO+RADIO-10);
            }
            if(n.getRight()!= null){
                g.drawLine(x+RADIO+10, y+RADIO+5, x+ANCHO+EXTRA+RADIO-10, y+ANCHO+RADIO-10);
            }
            pintar(g,x-ANCHO-EXTRA, y+ANCHO,n.getLeft());
            pintar(g,x+ANCHO+EXTRA, y+ANCHO,n.getRight());
        }
    }
    
}
