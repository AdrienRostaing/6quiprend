package game.game;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class FirstpageController implements Initializable {

    @FXML
    private ImageView SoundOn;

    @FXML
    private ImageView SoundOff;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        SoundOn.setOnMouseClicked(e -> {
            SoundOn.setVisible(false);
            SoundOn.setDisable(true);
            SoundOff.setDisable(false);
            SoundOff.setVisible(true);
        });
        SoundOff.setOnMouseClicked(e -> {
            SoundOn.setVisible(true);
            SoundOn.setDisable(false);
            SoundOff.setDisable(true);
            SoundOff.setVisible(false);


        });
    }
}
