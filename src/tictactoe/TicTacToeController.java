package tictactoe;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class TicTacToeController {

    @FXML
    private JFXButton btn1, btn2, btn3, btn4,
    btn5, btn6, btn7, btn8, btn9;

    @FXML
    private Label o1, o2, o3, o4, o5, o6, o7,
    o8, o9, x1, x2, x3, x4, x5, x6, x7, x8, x9;

    private int counter; // turn counter

    @FXML
    void handleButtons(ActionEvent event)
    {

    }

}
