//Programacion III
//Universidad Nacional
//Esteban Chinchilla Brenes
//Oscar Alvarado Gutierrez - 116250948
//




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainProject;

import Presentation.DodgeBallController;
import Presentation.DodgeBallModel;
import Presentation.DodgeBallView;

/**
 *
 * @author chinc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        DodgeBallModel model = new DodgeBallModel();
        DodgeBallView view = new DodgeBallView();

        //Unifica el resto de las capas
        DodgeBallController controller = new DodgeBallController(model, view);
        view.setVisible(true);
        //El main no forma parte del modelo de capas.
        model.start();
    }
    
}