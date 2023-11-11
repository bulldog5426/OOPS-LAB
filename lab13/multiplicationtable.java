import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class multiplicationtable extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Multiplication Table App");

        // Create UI elements
        Label enterLabel = new Label("Enter a number:");
        TextField numberField = new TextField();
        Button generateButton = new Button("Generate Table");
        FlowPane flowPane = new FlowPane();

        // Set properties for UI elements
        flowPane.setPadding(new Insets(10, 10, 10, 10));
        flowPane.setVgap(10);
        flowPane.setHgap(10);

        // Event handler for the button click
        generateButton.setOnAction(e -> {
            try {
                int number = Integer.parseInt(numberField.getText());
                displayMultiplicationTable(flowPane, number);
            } catch (NumberFormatException ex) {
                // Handle the case where the user enters a non-integer value
                System.out.println("Please enter a valid integer.");
            }
        });

        // Add elements to the flow pane
        flowPane.getChildren().addAll(enterLabel, numberField, generateButton);

        // Set up the scene
        Scene scene = new Scene(flowPane, 300, 200);
        primaryStage.setScene(scene);

        // Show the stage
        primaryStage.show();
    }

    private void displayMultiplicationTable(FlowPane flowPane, int number) {
        // Clear the existing content
        flowPane.getChildren().removeIf(node -> node instanceof Label);

        // Display the multiplication table
        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            Label label = new Label(number + " * " + i + " = " + result);
            flowPane.getChildren().add(label);
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
