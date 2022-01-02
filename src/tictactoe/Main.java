package tictactoe;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("TicTacToePane.fxml"));
        primaryStage.setTitle("JFXCalculator");
        primaryStage.setScene(new Scene(root, 500, 500));
        primaryStage.show();
        primaryStage.setMaxWidth(500);
        primaryStage.setMaxHeight(500);

        primaryStage.setMinWidth(500);
        primaryStage.setMinHeight(500);
        primaryStage.setResizable(false);
    }

    public static void main (String[] args)
    {
        launch(args);
    }
}