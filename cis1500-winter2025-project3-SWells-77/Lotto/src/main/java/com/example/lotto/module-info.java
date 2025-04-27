module com.example.lotto {
    requires javafx.fxml;
    requires javafx.controls; // Add other required modules as necessary
    // Add any exports or opens if needed
}

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private Label resultsLabel;

    @FXML
    protected void onHelloButtonClick() {
        resultsLabel.setText("Welcome to the Lotto Application!");
    }
}