package sample;
//27.2.2020 commit test
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Timer;
import java.util.TimerTask;

public class Controller {
    public ImageView RegisterButton;
    public ImageView LoginButton;
    public Rectangle loginRect;
    public Rectangle registerRect;
    public boolean registerIn;
    public boolean loginIn;
    public Label heslo2Label;
    public Label hesloLabel;
    public Label menoLabel;
    public ImageView signButton;
    public TextField heslo2Field;
    public TextField hesloField;
    public TextField menoField;
    public Rectangle signRect;
    public boolean signIn;
    public Rectangle regBackRect;
    public ImageView regBackButton;
    public boolean regBackIn = false;
    public boolean logBackIn;
    public boolean logIn = true;
    public ImageView logBackButton;
    public Rectangle logBackRect;
    public TextField nameField;
    public TextField passField;
    public Label nameLabel;
    public Label passLabel;
    public Rectangle logRect;
    public ImageView logButton;
    File namesfile = new File("C:\\Users\\frede\\IdeaProjects\\Obchod\\src\\sample\\Assets\\names.txt");
    public boolean menorepeat = false;
    public boolean onlyonce = true;
    public boolean repeat = true;
    int second = 0;


    public void RegisterEnter(MouseEvent mouseEvent) throws SQLException {

       registerIn = true;
        //if (mouseEvent.getX() > registerRect.getX() && mouseEvent.getX() < registerRect.getX()+registerRect.getWidth() && mouseEvent.getY() > registerRect.getY() && mouseEvent.getY() < registerRect.getY()+registerRect.getWidth()) {
        Timer registerTimer = new Timer();
        registerTimer.scheduleAtFixedRate(new TimerTask() {

            @Override
            public void run() {
                if (registerIn == true) {

                    registerRect.setOpacity(registerRect.getOpacity() + 0.01);
                }
                if (registerIn == false) {
                    registerTimer.cancel();
                    registerTimer.purge();
                    System.out.println("Myska opustila register button");
                    registerRect.setOpacity(0);
                }
            }
        }, 0, 10);

        //}

    }

    public void LoginEnter(MouseEvent mouseEvent) {
        loginIn = true;
        //if (mouseEvent.getX() > registerRect.getX() && mouseEvent.getX() < registerRect.getX()+registerRect.getWidth() && mouseEvent.getY() > registerRect.getY() && mouseEvent.getY() < registerRect.getY()+registerRect.getWidth()) {
        Timer loginTimer = new Timer();
        loginTimer.scheduleAtFixedRate(new TimerTask() {

            @Override
            public void run() {
                if (loginIn == true) {

                    loginRect.setOpacity(loginRect.getOpacity() + 0.01);
                }
                if (loginIn == false) {
                    loginTimer.cancel();
                    loginTimer.purge();
                    System.out.println("Myska opustila login button");
                    loginRect.setOpacity(0);
                }
            }
        }, 0, 10);

        //}
    }

    public void signEnter(MouseEvent mouseEvent) {
        signIn = true;
        //if (mouseEvent.getX() > registerRect.getX() && mouseEvent.getX() < registerRect.getX()+registerRect.getWidth() && mouseEvent.getY() > registerRect.getY() && mouseEvent.getY() < registerRect.getY()+registerRect.getWidth()) {
        Timer signTimer = new Timer();
        signTimer.scheduleAtFixedRate(new TimerTask() {

            @Override
            public void run() {
                if (signIn == true) {

                    signRect.setOpacity(signRect.getOpacity() + 0.01);
                }
                if (signIn == false) {
                    signTimer.cancel();
                    signTimer.purge();
                    System.out.println("Myska opustila sign in button");
                    loginRect.setOpacity(0);
                }
            }
        }, 0, 10);

        //}
    }

    public void regBackEnter(MouseEvent mouseEvent) {
        regBackIn = true;
        //if (mouseEvent.getX() > registerRect.getX() && mouseEvent.getX() < registerRect.getX()+registerRect.getWidth() && mouseEvent.getY() > registerRect.getY() && mouseEvent.getY() < registerRect.getY()+registerRect.getWidth()) {
        Timer regBackTimer = new Timer();
        regBackTimer.scheduleAtFixedRate(new TimerTask() {

            @Override
            public void run() {
                if (regBackIn == true) {

                    regBackRect.setOpacity(regBackRect.getOpacity() + 0.01);
                }
                if (regBackIn == false) {
                    regBackTimer.cancel();
                    regBackTimer.purge();
                    System.out.println("Myska opustila sign in back button");
                    regBackRect.setOpacity(0);
                }
            }
        }, 0, 10);

        //}
    }

    public void logBackEnter(MouseEvent mouseEvent) {
        logBackIn = true;
        //if (mouseEvent.getX() > registerRect.getX() && mouseEvent.getX() < registerRect.getX()+registerRect.getWidth() && mouseEvent.getY() > registerRect.getY() && mouseEvent.getY() < registerRect.getY()+registerRect.getWidth()) {
        Timer logBackTimer = new Timer();
        logBackTimer.scheduleAtFixedRate(new TimerTask() {

            @Override
            public void run() {
                if (logBackIn == true) {

                    logBackRect.setOpacity(logBackRect.getOpacity() + 0.01);
                }
                if (logBackIn == false) {
                    logBackTimer.cancel();
                    logBackTimer.purge();
                    System.out.println("Myska opustila log in back button");
                    logBackRect.setOpacity(0);
                }
            }
        }, 0, 10);

        //}
    }
    public void logEnter(MouseEvent mouseEvent) {
        logIn = true;
        //if (mouseEvent.getX() > registerRect.getX() && mouseEvent.getX() < registerRect.getX()+registerRect.getWidth() && mouseEvent.getY() > registerRect.getY() && mouseEvent.getY() < registerRect.getY()+registerRect.getWidth()) {
        Timer logTimer = new Timer();
        logTimer.scheduleAtFixedRate(new TimerTask() {

            @Override
            public void run() {
                if (logIn) {

                    logRect.setOpacity(logRect.getOpacity() + 0.01);
                }
                if (!logIn) {
                    logTimer.cancel();
                    logTimer.purge();
                    System.out.println("Myska opustila log in button");
                    logRect.setOpacity(0);
                }
            }
        }, 0, 10);

        //}
    }

    public void RegisterExit(MouseEvent mouseEvent) {

        registerIn = false;
        registerRect.setOpacity(0);
    }

    public void LoginExit(MouseEvent mouseEvent) {
        loginIn = false;
        loginRect.setOpacity(0);
    }

    public void signExit(MouseEvent mouseEvent) {
        signIn = false;
        signRect.setOpacity(0);
    }

    public void regBackExit(MouseEvent mouseEvent) {
        regBackIn = false;
        regBackRect.setOpacity(0);
    }

    public void logBackExit(MouseEvent mouseEvent) {
        logBackIn = false;
        logBackRect.setOpacity(0);
    }

    public void logExit(MouseEvent mouseEvent) {
        logIn = false;
        logRect.setOpacity(0);
    }


    public void RegisterClick(MouseEvent mouseEvent) {
        RegisterButton.setVisible(false);
        LoginButton.setVisible(false);
        registerRect.setVisible(false);
        loginRect.setVisible(false);
        menoLabel.setVisible(true);
        hesloLabel.setVisible(true);
        heslo2Label.setVisible(true);
        signButton.setVisible(true);
        menoField.setVisible(true);
        hesloField.setVisible(true);
        heslo2Field.setVisible(true);
        signRect.setVisible(true);
        regBackButton.setVisible(true);
        regBackRect.setVisible(true);
        logBackButton.setVisible(false);
        logBackRect.setVisible(false);
        nameField.setVisible(false);
        passField.setVisible(false);
        nameLabel.setVisible(false);
        passLabel.setVisible(false);
        logRect.setVisible(false);
        logButton.setVisible(false);

    }

    public void regBackClick(MouseEvent mouseEvent) {
        RegisterButton.setVisible(true);
        LoginButton.setVisible(true);
        registerRect.setVisible(true);
        loginRect.setVisible(true);
        menoLabel.setVisible(false);
        hesloLabel.setVisible(false);
        heslo2Label.setVisible(false);
        signButton.setVisible(false);
        menoField.setVisible(false);
        hesloField.setVisible(false);
        heslo2Field.setVisible(false);
        signRect.setVisible(false);
        regBackButton.setVisible(false);
        regBackRect.setVisible(false);
        logBackButton.setVisible(false);
        logBackRect.setVisible(false);
        nameField.setVisible(false);
        passField.setVisible(false);
        nameLabel.setVisible(false);
        passLabel.setVisible(false);
        logButton.setVisible(false);
        logRect.setVisible(false);
    }

    public void logBackClick(MouseEvent mouseEvent) {
        RegisterButton.setVisible(false);
        LoginButton.setVisible(false);
        registerRect.setVisible(false);
        loginRect.setVisible(false);
        menoLabel.setVisible(false);
        hesloLabel.setVisible(false);
        heslo2Label.setVisible(false);
        signButton.setVisible(false);
        menoField.setVisible(false);
        hesloField.setVisible(false);
        heslo2Field.setVisible(false);
        signRect.setVisible(false);
        regBackButton.setVisible(false);
        regBackRect.setVisible(false);
        logBackButton.setVisible(true);
        logBackRect.setVisible(true);
        nameField.setVisible(true);
        passField.setVisible(true);
        nameLabel.setVisible(true);
        passLabel.setVisible(true);
        logButton.setVisible(true);
        logRect.setVisible(true);
    }

    public void signClick(MouseEvent mouseEvent) throws IOException {
        if (menoField.getText().trim().isEmpty()) {
            menoField.setPromptText("Je potrebne vyplnit");
        }
        if (hesloField.getText().trim().isEmpty()) {
            hesloField.setPromptText("Je potrebne vyplnit");
        }
        if (heslo2Field.getText().trim().isEmpty()) {
            heslo2Field.setPromptText("Je potrebne vyplnit");
        }
        if (menoField.getText().trim().isEmpty() == false && hesloField.getText().trim().isEmpty() == false && heslo2Field.getText().trim().isEmpty() == false) {
            String meno = menoField.getText();
            String heslo = hesloField.getText();
            String hesloconfirm = heslo2Field.getText();
            if (heslo.equals(hesloconfirm)) {
                if (!namesfile.exists()) {
                    System.out.println("File neexistoval, ale za chvilku bude + zapisujem tie udaje co tam hodili");
                    Parent root = FXMLLoader.load(getClass().getResource("shop.fxml"));
                    Scene scene = new Scene(root);
                    //tento riadok ziska stage info
                    Stage window = (Stage) ((Node)mouseEvent.getSource()).getScene().getWindow();
                    window.setScene(scene);
                    window.show();
                    FileWriter W = new FileWriter(namesfile);
                    StringBuilder sb = new StringBuilder();
                    sb.append(menoField.getText().toString() + "\n");
                    sb.append(hesloField.getText().toString() + "\n");
                    W.write(sb.toString());
                    W.close();
                } else {
                    try (BufferedReader reader = new BufferedReader(new FileReader(new File("C:\\Users\\frede\\IdeaProjects\\Obchod\\src\\sample\\Assets\\names.txt")))) {
                        int skip = 0;
                        String line;
                        while ((line = reader.readLine()) != null) {

                            if (meno.equals(line)) {
                                System.out.println("to meno uz tam je hmmmmmmmmmmmmm");
                                menorepeat = false;
                                if (onlyonce == true) {
                                    onlyonce = false;
                                    nezapismeno(mouseEvent);
                                }

                            }

                        }
                        if ((line = reader.readLine()) == null) {
                            zapismeno(mouseEvent);
                        }

                    } catch (IOException e) {
                        e.printStackTrace();
                    }


                }
            } else {
                System.out.println(heslo);
                System.out.println(hesloconfirm);
                hesloField.setText("");
                heslo2Field.setText("");
                hesloField.setPromptText("Neindenticke hesla");
                heslo2Field.setPromptText("Neindenticke hesla");
            }
        }
    }

    public void zapismeno(Event mouseEvent) throws IOException {
        if (repeat == true) {
            FileWriter W = new FileWriter(namesfile.getAbsoluteFile(), true);
            StringBuilder sb = new StringBuilder();

            sb.append(menoField.getText().toString() + "\n");
            sb.append(hesloField.getText().toString() + "\n");
            W.write(sb.toString());
            W.close();
            System.out.println("file existuje, vpisujem udaje");
            Parent root = FXMLLoader.load(getClass().getResource("shop.fxml"));
            Scene scene = new Scene(root);
            //tento riadok ziska stage info
            Stage window = (Stage) ((Node)mouseEvent.getSource()).getScene().getWindow();
            window.setScene(scene);
            window.show();
        }

    }

    public void nezapismeno(Event mouseEvent) throws IOException {
        System.out.println("Ohlasujem sa z konca metody, a áno to meno už existuje");
        menoField.setText("");
        menoField.setPromptText("Meno uz existuje");
        repeat = false;


    }

    public void logInClick(MouseEvent mouseEvent) throws IOException {
        if (nameField.getText().trim().isEmpty()) {
            nameField.setPromptText("Je potrebne vyplnit");
        }
        if (passField.getText().trim().isEmpty()) {
            passField.setPromptText("Je potrebne vyplnit");
        }

        if (!nameField.getText().trim().isEmpty() && !passField.getText().trim().isEmpty()) {
            System.out.println("Policka na logine su vyplnene");
            if (!namesfile.exists()) {
                nameField.setText("");
                nameField.setPromptText("Meno Neexistuje v databaze uctov");
            } else {
                String name = nameField.getText();
                String pass = passField.getText();
                int jetam = 0;
                try (BufferedReader reader = new BufferedReader(new FileReader(new File("C:\\Users\\frede\\IdeaProjects\\Obchod\\src\\sample\\Assets\\names.txt")))) {
                    int skip = 0;
                    String line;

                    while ((line = reader.readLine()) != null) {
                        if(jetam == 0) {

                        }
                        if(jetam == 1){
                            if(line.equals(pass)){

                                System.out.println("Prihlasujem....");
                                System.out.println("toto je to s cim porovnavam ked je spravne " + line);

                                Parent root = FXMLLoader.load(getClass().getResource("shop.fxml"));
                                Scene scene = new Scene(root);
                                //tento riadok ziska stage info
                                Stage window = (Stage) ((Node)mouseEvent.getSource()).getScene().getWindow();
                                window.setScene(scene);
                                window.show();
                            }
                            else{

                                System.out.println("Nespravne heslo");
                                System.out.println("toto je to s cim porovnavam ked je nespravne " + line);




                            }
                        }
                        System.out.println(line);
                        if(name.equals(line)){

                            jetam = 1;
                            System.out.println("Meno je v databaze");





                        }

                        else{

                        }

                    }
                    if ((line = reader.readLine()) == null){
                        if(jetam == 0){
                            System.out.println("Meno sa nenaslo");
                        }

                        else if(jetam == 1){
                            System.out.println("Ano potvrdzujem meno sa naslo");
                        }
                    }

                }


            }

        }
    }

    public void connect(ActionEvent actionEvent) throws SQLException{
        connectionClass conClass = connectionClass.getInstance();
        Connection connection = conClass.getConnection();
        String sql = "select * from product";
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(sql);
        while (rs.next()) {

            System.out.println(rs.getString(2));
        }
    }
}



