module fansinterface {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens fansinterface to javafx.fxml;
    exports fansinterface;
}
