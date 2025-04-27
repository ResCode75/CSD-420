package fourcircles;

import java.io.IOException;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    

    @Override
    public void start(Stage stage) throws IOException {
        
        stage.setTitle("Shaw7_2");
        HBox hb = new HBox(10);
        Scene scene = new Scene(hb, 400, 400); 
        String styleSheet = this.getClass().getResource("style.css").toExternalForm();
        scene.getStylesheets().add(styleSheet);
     
        //create circles
        Circle circle1 = new Circle(50, 50, 40);
        Circle circle2 = new Circle(50, 50, 40);
        Circle circle3 = new Circle(50, 50, 40);
        Circle circle4 = new Circle(50, 50, 40);


        //create stackpanes to hold circles
        StackPane pane1 = new StackPane();
        pane1.getChildren().add(circle1);
        //add CSS styling to the pane
        pane1.getStyleClass().add("border");
        //add CSS styling to the pane
        circle1.getStyleClass().addAll("plaincircle", "circleborder");

        StackPane pane2 = new StackPane();
        pane2.getChildren().add(circle2);
        //add CSS styling to the circle
        circle2.getStyleClass().addAll("plaincircle", "circleborder");

        StackPane pane3 = new StackPane();
        pane3.getChildren().add(circle3);
        //add CSS styling to the red circle
        circle3.setId("redcircle");

        StackPane pane4 = new StackPane();
        pane4.getChildren().add(circle4);
        //add CSS styling to the green circle
        circle4.setId("greencircle");



        //create an hbox object to contain stackpanes
        hb.getChildren().addAll(pane1, pane2, pane3, pane4);  
        hb.setAlignment(Pos.CENTER);
        
    
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch();
    }

}