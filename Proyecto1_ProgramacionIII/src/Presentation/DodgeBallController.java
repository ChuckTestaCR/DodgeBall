/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import BusinessLogic.Raqueta;
import BusinessLogic.Circulo;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author chinc
 */
public class DodgeBallController implements MouseListener, KeyListener, ActionListener {
    
    DodgeBallView view;
    DodgeBallModel model;
    Raqueta deathstar;
    //Circulo circulo;
    //Graphics graphics;
    
    public DodgeBallController(DodgeBallModel model, DodgeBallView view) {
        this.model = model;
        this.view = view;
        this.deathstar = new Raqueta(0,0,15,15);
        //circulo = new Circulo(50, 75, 650);
        view.setModel(model);
        view.setController(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    //Se encarga de manejar cuando las direccionales son presionadas
    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        JLabel label = (JLabel)e.getSource();
        //deathstar contiene las coordenas, se construye por defecto en (0,0)
        //se debe actualizar los valores
        this.deathstar.setX(label.getX());
        this.deathstar.setY(label.getY());
        switch(key)
        {
            case KeyEvent.VK_UP:
                if (this.deathstar.getY() <= 15) {
                    this.deathstar.setY(this.deathstar.getY() - 0);
                    label.setLocation(deathstar.getX(), deathstar.getY());
                } else {
                    //this.deathstar.setDy(5);
                    this.deathstar.setY(this.deathstar.getY() - 15 - deathstar.getDy());
                    label.setLocation(deathstar.getX(), deathstar.getY());
                    //no necesario en proyecto solo una flag 
                    //para ver si esta sirviendo
                    //luego se quita
                    System.out.println(label.getLocation());
                }
                break;
            case KeyEvent.VK_DOWN:
                if (this.deathstar.getY() >= 935) {
                    this.deathstar.setY(this.deathstar.getY() + 0);
                    label.setLocation(deathstar.getX(), deathstar.getY());
                } else {
                    this.deathstar.setY(this.deathstar.getY() + 15);
                    label.setLocation(deathstar.getX(), deathstar.getY());
                    System.out.println(label.getLocation());
                }
                break;
            case KeyEvent.VK_RIGHT:               
                if (this.deathstar.getX() >= 1715) {
                    this.deathstar.setY(this.deathstar.getY() + 0);
                    label.setLocation(deathstar.getX(), deathstar.getY());
                } else {

                    this.deathstar.setX(this.deathstar.getX() + 15);
                    label.setLocation(deathstar.getX(), deathstar.getY());
                    System.out.println(label.getLocation());
                }
                break;
            case KeyEvent.VK_LEFT:
                if (this.deathstar.getX() <= 0) {
                    this.deathstar.setY(this.deathstar.getY() - 0);
                    label.setLocation(deathstar.getX(), deathstar.getY());
                } else {
                    this.deathstar.setX(this.deathstar.getX() - 15);
                    label.setLocation(deathstar.getX(), deathstar.getY());
                    System.out.println(label.getLocation());
                }
                break;
        }
    }
    

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
