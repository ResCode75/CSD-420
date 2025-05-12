package fansinterface;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;


public class PrimaryController {
    static String url = "jdbc:mysql://localhost:3306/databasedb";
    static String user = "student1";
    static String pass = "pass";

    @FXML
    private TextField ID;
    @FXML
    private TextField idField;
    @FXML
    private TextField firstNameField;
    @FXML
    private TextField lastNameField;
    @FXML 
    private TextField favoriteTeamField;

    
    @FXML
    private void display(){
        try {
            //connect to database
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM fans WHERE ID = " + ID.getText());

            while (rs.next()){
                int id = rs.getInt("id");
                String first = rs.getString("FIRSTNAME");
                String last = rs.getString("LASTNAME");
                String favorite = rs.getString("FAVORITETEAM");

                idField.setText(String.valueOf(id));
                firstNameField.setText(first);
                lastNameField.setText(last);
                favoriteTeamField.setText(favorite);
            }
            
        } catch (SQLException e) {
            System.out.print(e);
        }

    }

    @FXML
    private void update(){
        try {
            Connection con = DriverManager.getConnection(url,user, pass);
            PreparedStatement stmt = con.prepareStatement("UPDATE fans SET FIRSTNAME = ?, LASTNAME= ?, FAVORITETEAM = ? WHERE ID = ?");
            stmt.setString(4, ID.getText());
            stmt.setString(1, firstNameField.getText());
            stmt.setString(2, lastNameField.getText());
            stmt.setString(3, favoriteTeamField.getText());

            stmt.executeUpdate();

            Alert alert = new Alert(Alert.AlertType.INFORMATION, "database updated");
            alert.show();

            idField.clear();
            firstNameField.clear();
            lastNameField.clear();
            favoriteTeamField.clear();
            ID.clear();



        } catch (Exception e) {
            System.out.print(e);
        }

    }
   

   
    
        

    
}
