/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLogic;

/**
 *
 * @author Oscaresunmarica
 */
public class Circulo {
    
    public int x;
    public int y;
    public int radio;

    public Circulo(int x, int y, int radio) {
        this.x = x;
        this.y = y;
        this.radio = radio;
    }

    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public void setRadio(int radio) {
        this.radio = radio;
    }

    
    
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public int getRadio() {
        return radio;
    }
    
    
    
    
    
    
    
}