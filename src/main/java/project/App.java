package project;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(@SuppressWarnings("exports") Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/layouts/paginaPrincipal.fxml"));
        Parent root = loader.load();
        stage.setTitle("ventana principal");
        stage.setScene(new Scene(root));

        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }

}