package se.su;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application {
    public void start(Stage stage) {
        Label label = new Label("StudyFlow");
        Scene scene = new Scene(new StackPane(label), 400, 300);

        stage.setScene(scene);
        stage.setTitle("StudyFlow");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
