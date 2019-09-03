




package BusinessLogic;

import BusinessLogic.Agente;
import javax.swing.JLabel;

//Keeps the JLabel position, the one the player is gonna move
public class Raqueta extends Agente {

      private JLabel icon;
      int l;
      int a;
    
    public Raqueta(int x, int y, int dx, int dy, int l , int a) {
        super(x, y, dx, dy);
        this.l=l;
        this.a=a;
        JLabel icon = new JLabel();
    }
    

        public JLabel getIcon(){
        return icon;
    }
    
    public void setIcon(JLabel icon){
        this.icon = icon;
        setX(icon.getX());
        setY(icon.getY());
    }

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
    
    
    
    
    
    
}

























/*

package BusinessLogic;

//Keeps the JLabel position, the one the player is gonna move

import javax.swing.JLabel;

public class Raqueta {
    //Metodos
    public Raqueta(){
        x = 0;
        y = 0;
        dx = 15;
        dy = 15;
        JLabel icon = new JLabel();
    }
    
    public void setX(int x){
        this.x = x;
    }
    
    
    public void setY(int y){
        this.y = y;
    }
     
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }
    
    public void setDX(int dx){
        this.dx = dx;
    }
    
    public void setDY(int dy){
        this.dy = dy;
    }
    
    public int getDX(){
        return dx;
    }
    
    public int getDY(){
        return dy;
    }
    
    public JLabel getIcon(){
        return icon;
    }
    
    public void setIcon(JLabel icon){
        this.icon = icon;
        setX(icon.getX());
        setY(icon.getY());
    }
    
    //Atributos
    private int x;
    private int y;
    private int dx;
    private int dy;
    private JLabel icon;
}
*/