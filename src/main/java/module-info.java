
module java.jfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires  AnimateFX;
    opens top.luckilyq.jfx to javafx.fxml;
    opens top.luckilyq.jfx.ctrl to javafx.fxml;
    exports top.luckilyq.jfx;
    exports top.luckilyq.jfx.ctrl;
}