package top.luckilyq.jfx.layout;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Sphere;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class StackPaneExample extends Application {
    @Override
    public void start(Stage stage) {

        Circle circle= new Circle(300,135,100);
        circle.setFill(Color.RED);
        circle.setStroke(Color.GREEN);

        Sphere sphere = new Sphere(50);

        Text text = new Text("Hi~,我是luckilyq");
        text.setFont(Font.font(null, FontWeight.BOLD,15));
        text.setFill(Color.GRAY);
        text.setX(20);
        text.setY(50);

        StackPane stackPane = new StackPane();
        StackPane.setMargin(circle, new Insets(50, 50, 50, 50));
        stackPane.getChildren().addAll(circle, sphere, text);

        
        Scene scene = new Scene(stackPane, 400, 300);
        stage.setTitle("Stack Pane Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}




