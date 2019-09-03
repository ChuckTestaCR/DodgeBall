package Presentation;

import BusinessLogic.Circulo;
import java.util.Observable;


public class DodgeBallModel extends Observable {
    
    
    
       Circulo circulo;

    public DodgeBallModel() {
         circulo = new Circulo(50, 75, 650);
    }
    
    
    
    
    
    
    
    @Override
    public void addObserver(java.util.Observer o) {
        //Permite que interfaz conozca cuando hay un cambio
        super.addObserver(o);
        setChanged();
        notifyObservers(null); // parametro no usado por ahora
    }
    
    
    
    
    public void step() {
        this.setChanged();
        this.notifyObservers();
        
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
