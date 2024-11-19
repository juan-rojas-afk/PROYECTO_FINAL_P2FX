package co.edu.uniquindio.programacion2.proyectofinalp2;

import co.edu.uniquindio.programacion2.proyectofinalp2.viewController.MarketPlaceViewController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class MarketPlaceApplication extends Application {
    private static Stage primaryStage;

    public static void setRoot(String fxmlName) throws IOException {
        FXMLLoader loader = new FXMLLoader(MarketPlaceApplication.class.getResource("/co/edu/uniquindio/programacion2/proyectofinalp2/" + fxmlName + ".fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        MarketPlaceApplication.primaryStage = primaryStage;
        FXMLLoader marketplaceLoader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/programacion2/proyectofinalp2/login.fxml"));
        Scene scene = new Scene(marketplaceLoader.load());
        primaryStage.setScene(scene);
        primaryStage.setTitle("MarketPlace Application");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}