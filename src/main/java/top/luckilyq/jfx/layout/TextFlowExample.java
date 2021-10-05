package top.luckilyq.jfx.layout;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

public class TextFlowExample extends Application {
@Override
    public void start(Stage stage) {
    Text text1 = new Text("Hi");
    text1.setFont(new Font(15));
    text1.setFill(Color.BEIGE);
    Text text2 = new Text("\n我是licuilyq");
    text2.setFont(new Font(15));
    text2.setFill(Color.PURPLE);
    Text text3 = new Text("\nI like bobo");
    text3.setFont(new Font(15));
    text3.setFill(Color.GREEN);
    Text text4 = new Text("\nI also like zanzan");
    text4.setFont(new Font(15));
    text4.setFill(Color.RED);


    TextFlow textFlowPane =new TextFlow();
    textFlowPane.setTextAlignment(TextAlignment.JUSTIFY);
    textFlowPane.setPrefSize(600,300);
    textFlowPane.setLineSpacing(5.0);

    textFlowPane.getChildren().addAll(text1, text2, text3,text4);
    Scene scene = new Scene(textFlowPane, 400,300);
    stage.setTitle("textFlow Pane Example");
    stage.setScene(scene);
    stage.show();
}

    public static void main(String[] args) {
        launch(args);
    }
}