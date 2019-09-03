package Presentation;

import BusinessLogic.Bola;
import BusinessLogic.Circulo;
import BusinessLogic.Raqueta;
import java.awt.event.KeyEvent;
import java.util.Observable;
import javax.swing.JLabel;


public class DodgeBallModel extends Observable {
    public Raqueta raqueta;
    public Circulo circulo;
    public Bola bola;

     public DodgeBallModel(){
         raqueta = new Raqueta(0,0,15,15, 190, 60);
         circulo = new Circulo(479, 67, 952);
         bola = new Bola(110,350,400,8,8);
     }   
     

     
    @Override
    public void addObserver(java.util.Observer o) {
        //Permite que interfaz conozca cuando hay un cambio
        super.addObserver(o);
        setChanged();
        notifyObservers(null); // parametro no usado por ahora
    }
   
    public void keyMove(KeyEvent e) {
        int key = e.getKeyCode();
        switch (key) {
            case KeyEvent.VK_UP:
                if (raqueta.getY() <= 20) {
                    this.raqueta.setY(this.raqueta.getY() - 0);
                    this.raqueta.getIcon().setLocation(raqueta.getX(), raqueta.getY());
                } 
                else {
                    this.raqueta.setY(this.raqueta.getY() - this.raqueta.getDy());
                    this.raqueta.getIcon().setLocation(raqueta.getX(), raqueta.getY());
                    //no necesario en proyecto solo una flag 
                    //para ver si esta sirviendo
                    //luego se quita
                    System.out.println(this.raqueta.getIcon().getLocation());
                }
                break;
            case KeyEvent.VK_DOWN:
                if (this.raqueta.getY() >= 905) {
                    this.raqueta.setY(this.raqueta.getY() + 0);
                    this.raqueta.getIcon().setLocation(raqueta.getX(), raqueta.getY());
                } else {
                    this.raqueta.setY(this.raqueta.getY() + this.raqueta.getDy());
                    this.raqueta.getIcon().setLocation(raqueta.getX(), raqueta.getY());
                    this.raqueta.getIcon().repaint();
                    System.out.println(this.raqueta.getIcon().getLocation());
                }
                break;
            case KeyEvent.VK_RIGHT:
                if (this.raqueta.getX() >= 1235) {
                    this.raqueta.setY(this.raqueta.getY() + 0);
                    this.raqueta.getIcon().setLocation(raqueta.getX(), raqueta.getY());
                } else {

                    this.raqueta.setX(this.raqueta.getX() + this.raqueta.getDx());
                    this.raqueta.getIcon().setLocation(raqueta.getX(), raqueta.getY());
                    System.out.println(this.raqueta.getIcon().getLocation());
                }
                break;
            case KeyEvent.VK_LEFT:
                if (this.raqueta.getX() <= 470) {
                    this.raqueta.setY(this.raqueta.getY() - 0);
                    this.raqueta.getIcon().setLocation(raqueta.getX(), raqueta.getY());
                }                
                else {
                    this.raqueta.setX(this.raqueta.getX() - this.raqueta.getDx());
                    this.raqueta.getIcon().setLocation(raqueta.getX(), raqueta.getY());
                    System.out.println(this.raqueta.getIcon().getLocation());
                }
                break;
        }
        setChanged();
        notifyObservers(null);
    }
    
    public int getX(){
        return raqueta.getX();
    }
    
    public int getY(){
        return raqueta.getY();
    }
    
    public int getXbola() {
        return bola.getX();
    }

    public int getYbola() {
        return bola.getY();
    }
    
    
    
    
    public void setIcon(JLabel icon){
        this.raqueta.setIcon(icon);
    }
    
    public void setBola(JLabel icon) {
        this.bola.setIcon(icon);
    }
    
    public void step() {
        bola.mover(this);
        this.setChanged();
        this.notifyObservers();
        System.out.println(this.bola.getIcon().getLocation());
    }
    
    
    
    public void start() {
        final int delay = 10;
        Runnable code = new Runnable() {
            @Override
            public void run() {
                while (true) {
                    step();
                    setChanged();
                    notifyObservers();
                    try {
                        Thread.sleep(delay);
                    } catch (InterruptedException ex) {
                    }
                }
            }
        };
        Thread thread = new Thread(code);
        thread.start();
    }
    
    
    
    
    
}
