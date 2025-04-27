module fourcircles {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    opens fourcircles to javafx.fxml;
    exports fourcircles;
}
