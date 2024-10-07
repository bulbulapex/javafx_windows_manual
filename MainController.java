
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MainController {
    @FXML
    private Label label;

    @FXML
    protected void handleButtonClick() {
        label.setText("Button Clicked!");
    }
}
