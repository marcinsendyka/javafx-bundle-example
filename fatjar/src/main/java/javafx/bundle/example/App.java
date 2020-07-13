package javafx.bundle.example;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void init() throws Exception {
        super.init();
    }

    @Override
    public void start(Stage primaryStage) {
        Label label = new Label("Hello World");
        label.setAlignment(Pos.CENTER);
        Scene scene = new Scene(label, 500, 350);

        primaryStage.setTitle("Hello World Application");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @Override
    public void stop() throws Exception {
        super.stop();
    }

    public static void main(String[] args) {
        launch(args);
    }
}