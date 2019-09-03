/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLogic;
import BusinessLogic.Agente;
import static java.lang.Math.pow;
/**
 *
 * @author Oscaresunmarica
 */
public class Bola extends Agente{
    
   private int radio;
   private int score;

    public Bola(int radio, int x, int y, int dx, int dy) {
        super(x, y, dx, dy);
        this.radio = radio;
        this.score = 0;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
    public void setScore(int score) {
        this.score = score;
    }
    
    
    public int getRadio() {
        return radio;
    }
    public int getScore() {
        return score;
    }
    
    
    
    //@Override
    //public void mover(Modelo m) {}

    //public boolean colisiona(Modelo m) {}

    public double distancia(int primero, int segundo) {
        return Math.sqrt(pow(primero, 2) + pow(segundo, 2));
    }
 
}
