package aplication;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Controller {
    @FXML
    private Circle myCircle;
    private double x;
    private double y;

    //GETTER SETTER

    //@METHOD
    public void up(ActionEvent e){
        System.out.println("UP"); 
        myCircle.setCenterY(y-=2);   
        myCircle.setStroke(Color.RED);
    }
    public void down(ActionEvent e){
        System.out.println("DOWN");
        myCircle.setCenterY(y+=2);
        myCircle.setStroke(Color.GREEN);
    }
    public void left(ActionEvent e){
        System.out.println("LEFT");
        myCircle.setCenterX(x-=2);
        myCircle.setStroke(Color.BLUE);
    }
    public void right(ActionEvent e){
        System.out.println("RIGHT");
        myCircle.setCenterX(x+=2);
        myCircle.setStroke(Color.YELLOW);
    }
}
