
module java.jfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.jfoenix;
    requires AnimateFX;
    requires javafx.web;

    opens top.luckilyq.jfx.ctrl to javafx.fxml;
    opens top.luckilyq.jfx to javafx.fxml;
    exports top.luckilyq.jfx;

    opens top.luckilyq.jfx.layout to javafx.fxml;
    exports top.luckilyq.jfx.layout;
}