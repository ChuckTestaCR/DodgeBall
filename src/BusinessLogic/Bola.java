
package BusinessLogic;
import BusinessLogic.Agente;
import Presentation.DodgeBallModel;
import static java.lang.Math.pow;
import javax.swing.JLabel;
/**
 *
 * @author Oscaresunmarica
 */
public class Bola extends Agente{
    
   private int radio;
   private int score;
   private JLabel icon;

    public Bola(int radio, int x, int y, int dx, int dy) {
        super(x, y, dx, dy);
        this.radio = radio;
        this.score = 0;
       JLabel icon = new JLabel();
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
    
    public void setIcon(JLabel icon) {
        this.icon = icon;
        setX(icon.getX());
        setY(icon.getY());
    }
    
    //@Override

    /**
     *
     * @param m
     */
    public void mover(DodgeBallModel m) {

    
    if (distancia(this.x-150 - (m.circulo.x+m.circulo.radio/2-250), this.y - (m.circulo.y+m.circulo.radio/2-100)) > Math.abs(this.radio - (m.circulo.radio-350))) {
            dx = dx - (dx * 2);
            dy = dy - (dy * 2);

            if (score <= 99) {
                score++;
            } else {
                score = 0;
            }
        }//-m.circulo.radio/2
        x = x + dx;
        y = y + dy;     
        m.bola.setX(x);
        m.bola.setY(y);

        if (((y + dy + this.getRadio() > m.raqueta.getY()) && y + dy + this.getRadio() < m.raqueta.getY() + m.raqueta.getL()) && x + dx > m.raqueta.getX() && x + dx < m.raqueta.getX() + m.raqueta.getA()+50) {
            dy = dy - (dy * 2);
        } 
    }

    public JLabel getIcon() {
        return icon;
    }
    
    
    //public boolean colisiona(Modelo m) {}

    public double distancia(int i, int j) {
        return Math.sqrt(pow(i, 2) + pow(j, 2));
    }
 
}