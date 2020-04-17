package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

public class ControllerShop implements Initializable {
    connectionClass cn = connectionClass.getInstance();
    Connection connection = cn.getConnection();
    ObservableList<categories> observableList = FXCollections.observableArrayList();

    @FXML
    TableView<categories> tableView = new TableView<>();
    @FXML
    TableColumn<categories, String> column_CategoryID;
    @FXML
    TableColumn<categories, String> column_Nazov;
    @FXML
    TableColumn<categories, String> column_Popis;

    @Override
    public void initialize(URL location, ResourceBundle resources){
        ObservableList<categories> observableList = FXCollections.observableArrayList();
        column_CategoryID.setCellValueFactory(new PropertyValueFactory<>("CategoryID"));
        column_Nazov.setCellValueFactory(new PropertyValueFactory<>("Nazov"));
        column_Popis.setCellValueFactory(new PropertyValueFactory<>("Popis"));

        String sql = "select * from categories;";
        try {
            Statement statement;
            statement = connection.createStatement();
            column_CategoryID = new TableColumn<>("CategoryID");
            column_Nazov = new TableColumn<>("Nazov");
            column_Popis = new TableColumn<>("Popis");


            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                int CategoryID = rs.getInt("CategoryID");
                String Nazov = rs.getString("Nazov");
                String Popis = rs.getString("Popis");

                observableList.add(new categories(CategoryID, Nazov, Popis));
            }


        } catch(SQLException e){
            e.printStackTrace();
        }

        tableView.setItems(observableList);
    }
}
