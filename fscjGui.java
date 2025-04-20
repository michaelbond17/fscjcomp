import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class SimpleGUI extends Application {

    @Override
    public void start(Stage primaryStage) {
        // First button
        Button btn = new Button("Click Me");
        btn.setOnAction(e -> System.out.println("Hello, World!"));

        // Second button
        Button btn2 = new Button("No, Click Me!");
        btn2.setOnAction(e -> System.out.println("Hello, JavaFX!"));

        // Horizontal layout
        HBox root = new HBox();
        root.getChildren().addAll(btn, btn2);

        Scene scene = new Scene(root, 300, 250);
        primaryStage.setTitle("Hello World JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}