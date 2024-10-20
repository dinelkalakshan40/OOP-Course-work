package lk.ijse.gdse.tictactoegame.util;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AppInitializer extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        primaryStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/CreatePlayer.fxml"))));
        primaryStage.setResizable(false);
        primaryStage.setTitle("Create Player");
        primaryStage.show();
        primaryStage.centerOnScreen();
    }
}
