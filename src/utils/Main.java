package utils;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane root = (Pane) FXMLLoader.load(getClass().getResource("/view/Menu.fxml"));
        primaryStage.setTitle("Parqueo Don Pepe");
        Scene scene = new Scene(root, 607,448);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
