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
    ObservableList<product> observableList = FXCollections.observableArrayList();

    @FXML
    TableView<product> tableView = new TableView<>();
    @FXML
    TableColumn<product, String> column_id;
    @FXML
    TableColumn<product, String> column_name;
    @FXML
    TableColumn<product, String> column_price;
    @FXML
    TableColumn<product, String> column_description;

    @Override
    public void initialize(URL location, ResourceBundle resources){
        ObservableList<product> observableList = FXCollections.observableArrayList();
        column_id.setCellValueFactory(new PropertyValueFactory<>("ID"));
        column_name.setCellValueFactory(new PropertyValueFactory<>("name"));
        column_description.setCellValueFactory(new PropertyValueFactory<>("description"));
        column_price.setCellValueFactory(new PropertyValueFactory<>("price"));
        String sql = "select * from product;";
        try {
            Statement statement;
            statement = connection.createStatement();
            column_id = new TableColumn<>("ID");
            column_name = new TableColumn<>("Name");
            column_description = new TableColumn<>("Description");
            column_price = new TableColumn<>("Price");

            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt("ID");
                String name = rs.getString("name");
                String description = rs.getString("description");
                float price = rs.getFloat("price");
                observableList.add(new product(id, name, description, price));
            }


        } catch(SQLException e){
            e.printStackTrace();
        }

        tableView.setItems(observableList);
    }
}
