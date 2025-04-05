module payap.main.payap {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens payap.main.payap to javafx.fxml;
    opens payap.main.payap.controller.ui_controlller to javafx.fxml;
    exports payap.main.payap;
    exports payap.main.payap.controller.ui_controlller;
}