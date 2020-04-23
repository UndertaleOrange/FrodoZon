package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

public class ControllerShop implements Initializable {
    public Button ButtonShow;
    public TextField TextFieldID;
    public TextField TextFieldNazov;
    public TextField TextFieldPopis;
    public Button ButtonDelete;
    public Button ButtonUpdate;
    public TextField InsertNazov;
    public TextField InsertPopis;
    public Button InsertButton;
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
    public void initialize(URL location, ResourceBundle resources) {
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
                System.out.println(rs.getString("Nazov"));
                observableList.add(new categories(CategoryID, Nazov, Popis));
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }

        tableView.setItems(observableList);
    }

    public void ShowClicked() {
        String ID = TextFieldID.getText();

        try {

            connectionClass cn = connectionClass.getInstance();
            Connection conn = cn.getConnection();
            ResultSet rs = conn.createStatement().executeQuery("select Nazov from categories where CategoryID like '" + ID + "';");
            while (rs.next()) {
                String ziskanyNazov = rs.getString("Nazov");
                TextFieldNazov.setText(ziskanyNazov);
            }

            ResultSet rs2 = conn.createStatement().executeQuery("select Popis from categories where CategoryID like '" + ID + "';");
            while (rs2.next()) {
                String ziskanyPopis = rs2.getString("Popis");
                TextFieldPopis.setText(ziskanyPopis);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    public void UpdateClicked() {

        Statement statement = null;
        try {
            statement = connection.createStatement();
            String Nazov = TextFieldNazov.getText();
            String Popis = TextFieldPopis.getText();
            String ID = TextFieldID.getText();
            //
            String insertcmd = "UPDATE categories";
            String insertcmd2 = "SET Nazov = '" + Nazov + "', Popis = '" + Popis + "' WHERE CategoryID like '" + ID + "';";
            int exec_2 = statement.executeUpdate(insertcmd + " " + insertcmd2);

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        RefreshFunction();

    }

    public void ClickedDelete() {
        String ID = TextFieldID.getText();
        try {

            connectionClass cn = connectionClass.getInstance();
            Connection conn = cn.getConnection();
            int rs = conn.createStatement().executeUpdate("delete from categories where CategoryID like '" + ID + "';");
            RefreshFunction();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void Insert(ActionEvent actionEvent) {
        Statement statement = null;
        try {
            statement = connection.createStatement();
            String Nazov = InsertNazov.getText();
            String Popis = InsertPopis.getText();
            //
            String insertcmd = "insert into categories (Nazov, Popis)";
            String insertcmd2 = "values ('" + Nazov + "','" + Popis + "');";
            int exec_2 = statement.executeUpdate(insertcmd + " " + insertcmd2);

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        RefreshFunction();
    }
    void RefreshFunction() {
        tableView.getItems().clear();

        String sql = "select * from categories;";

        try {

            Statement statement = connection.createStatement();
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
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        tableView.setItems(observableList);
        tableView.refresh();

    }


}
