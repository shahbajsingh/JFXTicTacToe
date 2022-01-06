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

    private int counter = 0; // turn counter

    @FXML
    void handleButtons(ActionEvent event)
    {
        if (event.getSource().equals(btn1))
        {
            if(isXturn())
            {
                x1.setVisible(true);
            }
            else
            {
                o1.setVisible(true);
            }

            pushTurn();
        }
        if (event.getSource().equals(btn2))
        {
            if(isXturn())
            {
                x2.setVisible(true);
            }
            else
            {
                o2.setVisible(true);
            }

            pushTurn();
        }
        if (event.getSource().equals(btn3))
        {
            if(isXturn())
            {
                x3.setVisible(true);
            }
            else
            {
                o3.setVisible(true);
            }

            pushTurn();
        }
        if (event.getSource().equals(btn4))
        {
            if(isXturn())
            {
                x4.setVisible(true);
            }
            else
            {
                o4.setVisible(true);
            }

            pushTurn();
        }
        if (event.getSource().equals(btn5))
        {
            if(isXturn())
            {
                x5.setVisible(true);
            }
            else
            {
                o5.setVisible(true);
            }

            pushTurn();
        }
        if (event.getSource().equals(btn6))
        {
            if(isXturn())
            {
                x6.setVisible(true);
            }
            else
            {
                o6.setVisible(true);
            }

            pushTurn();
        }
        if (event.getSource().equals(btn7))
        {
            if(isXturn())
            {
                x7.setVisible(true);
            }
            else
            {
                o7.setVisible(true);
            }

            pushTurn();
        }
        if (event.getSource().equals(btn8))
        {
            if(isXturn())
            {
                x8.setVisible(true);
            }
            else
            {
                o8.setVisible(true);
            }

            pushTurn();
        }
        if (event.getSource().equals(btn9))
        {
            if(isXturn())
            {
                x9.setVisible(true);
            }
            else
            {
                o9.setVisible(true);
            }

            pushTurn();
        }
    }

    boolean isXturn()
    {
        return ((counter % 2) == 0);
    }

    void pushTurn()
    {
        counter++;
    }

}
