package cn.mccraft.uge;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("UMCGUIEditor");

        Scene scene = new Scene(new MainUI());
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
