
/**
 Rachel Shaw - Module 1.3 assignment - 3/23/2025
*/

package displaycards;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.TilePane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;



public class App extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("Display Cards");

        //create title text
        Text title = new Text();
        title.setFont(new Font(50));
        title.setText("Displaying Cards");
        title.setStroke(Color.RED);
        title.setFill(Color.RED);
        
       //create hashmap to store images
        HashMap<Integer, Image> allCards = new HashMap<>();

        //load images into hashmap
        for (int i = 1; i < 54; i ++){
            String path = ("src\\main\\java\\images\\" + String.valueOf(i)+ ".png");
            System.out.println(path);
            Image image = new Image(new FileInputStream(path));
            allCards.put(i, image);
        }

        

        //set random cards 
        ImageView card1 = new ImageView();
        card1.setImage(allCards.get((int)(Math.random() * 52) + 1));
        ImageView card2 = new ImageView();
        card2.setImage(allCards.get((int)(Math.random() * 52) + 1));
        ImageView card3 = new ImageView();
        card3.setImage(allCards.get((int)(Math.random() * 52) + 1));
        ImageView card4 = new ImageView();
        card4.setImage(allCards.get((int)(Math.random() * 52) + 1));

        //place cards in a tilepane and position them in the center
        TilePane cards = new TilePane(Orientation.HORIZONTAL);
        cards.setHgap(10);
        cards.setAlignment(Pos.CENTER);
        cards.setTileAlignment(Pos.CENTER);
        cards.setPrefColumns(4);
        cards.getChildren().add(card1);
        cards.getChildren().add(card2);
        cards.getChildren().add(card3);
        cards.getChildren().add(card4);
     
        //create button for card change
        Button changeCards = new Button("Refresh");
       
        //change cards lambada expression
        changeCards.setOnAction((actionEvent) -> {
            
            card1.setImage(allCards.get((int)(Math.random() * 53) + 1));
            
            card2.setImage(allCards.get((int)(Math.random() * 53) + 1));
            
            card3.setImage(allCards.get((int)(Math.random() * 53) + 1));
            
            card4.setImage(allCards.get((int)(Math.random() * 53) + 1));

        });

   
        Group main = new Group();
    
        //create a borderpane object that holds the labels in each area
        BorderPane bp = new BorderPane(main);
        bp.setTop(title);
        bp.setAlignment(title, Pos.CENTER);
        bp.setCenter(cards);
        bp.setAlignment(cards, Pos.CENTER);
        bp.setBottom(changeCards);
        bp.setAlignment(changeCards, Pos.CENTER);
        bp.setMargin(changeCards, new Insets(30,30,30,30));
        

        
        //initialize bp as scene
        Scene scene = new Scene(bp, 400, 400); 
        stage.setScene(scene);
        stage.show();

    }

    
    public static void main(String[] args) {
        launch();
    }

}