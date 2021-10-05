package top.luckilyq.jfx.ctrl;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;

/**
 * @program: java-jfx
 * @description:
 * @author: luckilyq
 * @create: 2021-10-05-18-44
 **/
public class TestCtrl {
    public Button btn;
    public DatePicker datePicker;

    public void onBtnClick(ActionEvent actionEvent) {
        datePicker.setVisible(!datePicker.isVisible());
    }
}
