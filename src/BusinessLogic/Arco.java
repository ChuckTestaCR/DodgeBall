/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLogic;

/**
 *
 * @author chinc
 */
public class Arco {

    /**
     * @return the radio
     */
    public int getRadio() {
        return radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(int radio) {
        this.radio = radio;
    }

    /**
     * @return the x
     */
    public Arco(int x, int y, int start, int end, int radio){
        this.x = x;
        this.y = y;
        this.gradoStart = start;
        this.gradoEnd = end;
        this.radio = radio;
    }
    
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * @return the gradoStart
     */
    public int getGradoStart() {
        return gradoStart;
    }

    /**
     * @param gradoStart the gradoStart to set
     */
    public void setGradoStart(int gradoStart) {
        this.gradoStart = gradoStart;
    }

    /**
     * @return the gradoEnd
     */
    public int getGradoEnd() {
        return gradoEnd;
    }

    /**
     * @param gradoEnd the gradoEnd to set
     */
    public void setGradoEnd(int gradoEnd) {
        this.gradoEnd = gradoEnd;
    }
    private int x;
    private int y;
    private int gradoStart;
    private int gradoEnd;
    private int radio;
    
    
}
