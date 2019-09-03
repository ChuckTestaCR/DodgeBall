//Programacion III
//Universidad Nacional
//Esteban Chinchilla Brenes
//Oscar Alvarado Gutierrez - 116250948
//

package BusinessLogic;

//Class in charge of manage the score of the player
public class Score {
    public Score(){
        this.point = 0;
    }
    
    public void setPoint(int point){
        this.point = point;
    }
    
    public int getPoint(){
        return this.point;
    }
    
    private int point;
}
