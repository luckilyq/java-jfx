package top.luckilyq.jfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import top.luckilyq.jfx.config.AppConfig;
import top.luckilyq.jfx.ctrl.MusicCtrl;

import java.io.IOException;
import java.util.Objects;

/**
 * @program: java-jfx
 * @description:
 * @author: luckilyq
 * @create: 2021-10-05-21-54
 **/
public class MusicApp extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader(Objects.requireNonNull(MusicApp.class.getResource("fxml/music.fxml")));
        Parent root = loader.load();
        root.getStylesheets().add(Objects.requireNonNull(MusicApp.class.getResource("css/music.css")).toExternalForm());

        MusicCtrl controller = loader.getController();
        controller.setStage(stage);

        Scene scene = new Scene(root, AppConfig.stageWidth, AppConfig.stageHeight);
        stage.setScene(scene);
        stage.setResizable(AppConfig.stageResizable);
        stage.getIcons().add(new Image(Objects.requireNonNull(MusicApp.class.getResourceAsStream(AppConfig.icon))));

        stage.initStyle(StageStyle.TRANSPARENT);
        stage.show();
    }

    public static void main(String[] args) {
        AppConfig.init();
        launch();
    }
}

