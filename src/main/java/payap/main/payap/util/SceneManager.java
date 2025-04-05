package payap.main.payap.util;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import payap.main.payap.HelloApplication;

import java.io.IOException;
import java.util.Objects;

public class SceneManager {
    private static Stage stage;
    private static final String ICON_PATH = "/payap/main/payap/Payap.png";

    public static void setStage(Stage stage) {
        SceneManager.stage = stage;
    }

    public static void switchScene(String fxmlPath) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(fxmlPath));
            Scene scene = new Scene(fxmlLoader.load());
            stage.setScene(scene);
            setIcon();
            stage.centerOnScreen();
            stage.setResizable(false);
        } catch (IOException e) {
            System.err.println("Error loading scene: " + fxmlPath);
            e.printStackTrace();
        }
    }

    public static void switchScene(String fxmlPath, double width, double height) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(fxmlPath));
            Scene scene = new Scene(fxmlLoader.load(), width, height);
            stage.setScene(scene);
            setIcon();
            stage.centerOnScreen();
            stage.setResizable(false);
        } catch (IOException e) {
            System.err.println("Error loading scene: " + fxmlPath);
            e.printStackTrace();
        }
    }

    private static void setIcon() {
        try {
            Image icon = new Image(Objects.requireNonNull(HelloApplication.class.getResourceAsStream(ICON_PATH)));
            stage.getIcons().clear();
            stage.getIcons().add(icon);
        } catch (Exception e) {
            System.err.println("Error loading icon: " + ICON_PATH);
            e.printStackTrace();
        }
    }
}