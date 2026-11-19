package clinic;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        Label statusLabel = new Label("Test UI");
        Button testButton = new Button("Button");

        testButton.setOnAction(e -> statusLabel.setText("Button Pressed!"));

        VBox root = new VBox(15, statusLabel, testButton);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(25));

        Scene scene = new Scene(root, 420, 220);
        stage.setTitle("Clinic Triage & Resource Simulator");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}