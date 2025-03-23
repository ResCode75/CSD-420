module mod1_2_assignment {
    requires javafx.controls;
    requires javafx.fxml;

    opens displaycards to javafx.fxml;
    exports displaycards;
}
