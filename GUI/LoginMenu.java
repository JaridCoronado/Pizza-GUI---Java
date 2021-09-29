package GUI;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Modality;
import javafx.stage.Stage;
import sample.Customer;

import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.FileReader;

class LoginMenu {
    //Buttons are initiated.
    private Button Guest_btn = new Button("Sign In As Guest");
    private Button LogIn_btn = new Button("Log In");
    private Button CreateAccount_btn = new Button("Create Account");

    //Labels and image template used in his window
    private Label password_Lbl = new Label(" ");
    private Label welcome_Lbl = new Label("Welcome!");
    private Label plsLogin_Lbl = new Label("Please Login.");
    private Label email_Lbl = new Label("Email:");
    private Label password_lbl = new Label("Password:");

    //Password and text fields used for the main login menu
    private PasswordField password = new PasswordField();
    private TextField email = new TextField();
    private Image Template = new Image("GUI/images/PizzaProject Info Template.png");

    VBox BuildLogin(Stage window){
        //these boxes are set up to store everything
        VBox vb1 = new VBox(20);
        VBox vb2 = new VBox(20);

        HBox hb1 = new HBox(50);
        HBox hb2 = new HBox(10);
        HBox hb3 = new HBox(20);

        //Padding and alignment for VBoxes and HBoxes are initiated.
        vb1.setPadding(new Insets(150, 0, 0, 0));//Scoots everything in vb1 down a few spaces
        vb2.setAlignment(Pos.TOP_CENTER);//puts the picture on the top and center of the scene
        vb1.setAlignment(Pos.CENTER);
        hb1.setAlignment(Pos.CENTER);
        hb2.setAlignment(Pos.CENTER);
        hb3.setAlignment(Pos.CENTER);

        //Sets the all components onto the scene
        hb1.getChildren().addAll(email_Lbl, email);
        hb2.getChildren().addAll(password_lbl, password);
        hb3.getChildren().addAll(LogIn_btn, CreateAccount_btn, Guest_btn);
        vb1.getChildren().addAll(welcome_Lbl, plsLogin_Lbl, hb1, hb2, password_Lbl, hb3);
        vb2.getChildren().addAll(new ImageView(Template), vb1);

        Login_ButtonActions(window);
        FontsUsed();

        return  vb2;
    }

    private void Login_ButtonActions(Stage window)  {
        //Scenes are initiated
        MainMenu mm  = new MainMenu();
        CreateAccount ca = new CreateAccount();
        //sets events for buttons and passwords
        LogIn_btn.setOnAction(e -> {
            try{
                BufferedReader filereaderLM = new BufferedReader(new FileReader("resources/Accounts.txt"));
                String tempString = filereaderLM.readLine();
                while(tempString != null){
                    if(tempString.contains("Username: ")){
                        String usernameKeyword = "Username: ";
                        String passwordKeyword = "Password: ";
                        int sector = tempString.indexOf("||");
                        String usernameInput = tempString.substring(tempString.indexOf(usernameKeyword) + 10, sector );
                        tempString = tempString.substring(sector + 3);
                        sector = tempString.indexOf("||");
                        String passwordInput = tempString.substring(tempString.indexOf(passwordKeyword) + 10 , sector);
                        if(email.getText().equals(usernameInput) && password.getText().equals(passwordInput)){
                            String temp = tempString.substring(tempString.indexOf("TextLine#: ") + 11);
                            int lineValue = Integer.parseInt(temp);
                            Main.account = new Customer(lineValue);
                            filereaderLM.close();
                            window.getScene().setRoot(mm.BuildMainMenu(window));
                        }
                    }
                    tempString = filereaderLM.readLine();
                }
                filereaderLM.close();
                System.out.println("Incorrect login");
            }catch(Exception g){
                System.out.println("Error in reading the file");
            }

        });
        Guest_btn.setOnAction(e -> window.getScene().setRoot(mm.BuildMainMenu(window)));
        CreateAccount_btn.setOnAction(e -> window.getScene().setRoot(ca.PopUpBox(window)));
    }

    //Changes the fonts of the labels and buttons
    private void FontsUsed(){
        welcome_Lbl.setFont(Font.font("Calibri", FontWeight.SEMI_BOLD, 72));
        plsLogin_Lbl.setFont(Font.font("Calibri", 24));
        email_Lbl.setFont(Font.font("Calibri", 24));
        password_lbl.setFont(Font.font("Calibri", 24));
        password_Lbl.setFont(Font.font("Calibri", 18));
        email.setFont(Font.font("Calibri", 24));
        password.setFont(Font.font("Calibri", 24));
        LogIn_btn.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        Guest_btn.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        CreateAccount_btn.setFont(Font.font("Calibri", FontWeight.BOLD,18));
    }

}
