module mod1examples {
    requires javafx.controls;
    requires javafx.fxml;

    opens mod1examples to javafx.fxml;
    exports mod1examples;
}
