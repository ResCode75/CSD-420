package mod1examples;

import java.io.IOException;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcTo;
import javafx.scene.shape.LineTo; 
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.text.Text;
import javafx.stage.Stage; 

/**
 * JavaFX App
 */
public class PathExample extends Application {

   

    @Override
    public void start(Stage stage) throws IOException {
      

        //Create a Path 
        Path path = new Path();

        //Create custom color
      

        //create preset color
      
       
        //move to the starting point
        MoveTo moveTo = new MoveTo(160, 40); 
        //drawing first eye in smiley face
        LineTo eye1 = new LineTo(160, 100); 
        

        //move to second eye's starting point
        MoveTo moveto2 = new MoveTo(240, 40);
       
        //drawing the second eye in smiley face
        LineTo eye2 = new LineTo(240, 100);       
       
        //move to the smile's starting point
        MoveTo moveto3 = new MoveTo(100, 150);
        //draw an arc from the starting point to 300, 150
        ArcTo smile = new ArcTo();  
        smile.setX(300);
        smile.setY(150);
        //set arc radius
        smile.setRadiusX(50.0);
        smile.setRadiusY(10.0);

        //create text object 
        Text text = new Text("This is a smiley face!");
        text.setX(150);
        text.setY(20);
        //set the color to a pre-existing color (Forest Green)
        text.setFill(Color.FORESTGREEN);
        //create new instance of color for the shade of pink I want 
        Color pink = Color.rgb(243, 108, 191); 
        //set the path's stroke color to pink
        path.setStroke(pink);

    
        
        //Adding all the elements to the path -- They have to be in order --
        path.getElements().add(moveTo); 
        path.getElements().add(eye1);     
        path.getElements().add(moveto2); 
        path.getElements().add(eye2);
        path.getElements().add(moveto3); 
        path.getElements().add(smile);        
            
        //Creating a Group object  
        Group root = new Group(path, text); 
            
        //Creating a scene object 
        Scene scene = new Scene(root, 400, 200);  
        
        //Setting title to the Stage 
        stage.setTitle("Smiley Face :)");
        
        //Adding scene to the stage 
        stage.setScene(scene);
        
        //Displaying the contents of the stage 
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}