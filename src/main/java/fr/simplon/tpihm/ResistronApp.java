package fr.simplon.tpihm;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;

import java.io.IOException;

/**This class is where our main method is found, <br />
 * where the magic happens.
 */
public class ResistronApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("resistron-view.fxml"));
        Stage stage = loader.load();
        stage.show();
    }
}
