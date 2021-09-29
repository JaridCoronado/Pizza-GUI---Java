package GUI;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
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


import java.io.FileWriter;


public class CreateAccount {

    //buttons used in this box
    private Button CreateAccount_btn = new Button("Create Account");
    private Button Back_btn = new Button("Back");//GOES BK TO LOGIN MENU

    //Labels and image template used in his window
    private Label email_Lbl = new Label("Enter Your Email Address:");
    private Label password_lbl = new Label("Enter Your Password:");
    private Label ConfirmPassword_lbl = new Label("Confirm Your Password:");
    private Label Name_lbl = new Label("Enter Your First Name:");
    private Label Username_lbl = new Label("Enter Your Username:");
    private Label PhoneNumber_lbl = new Label("Enter Your Phone Number:");

    //Text and password fields used fro the create account window
    private PasswordField NewPassword = new PasswordField();
    private PasswordField ConfirmNewPassword = new PasswordField();
    private TextField NewEmail_field = new TextField();
    private TextField Name_field = new TextField();
    private TextField PhoneNumber_field = new TextField();
    private TextField Username_field = new TextField();


    //Images used for this scene
    private Image Template = new Image("GUI/images/PizzaProject Info Template_Back.png");

    public VBox PopUpBox(Stage window){
        VBox vb1 = new VBox(10);

        HBox hb0 = new HBox(50);
        HBox hb1 = new HBox(20);
        HBox hb2 = new HBox(20);
        HBox hb3 = new HBox(20);
        HBox hb4 = new HBox(20);
        HBox hb5 = new HBox(20);
        HBox hb6 = new HBox(20);
        HBox hb7 = new HBox(20);

        //Padding and alignment for VBoxes and HBoxes are initiated.
        vb1.setPadding(new Insets(0, 0, 145, 0));//Scoots everything in vb1 down a few spaces

        hb0.setPadding(new Insets(-100, 0, 0, 0));
        hb2.setPadding(new Insets(0, 0, 0, 8));//Username
        hb3.setPadding(new Insets(0, 28, 0, 0));//Email
        hb4.setPadding(new Insets(0, 38, 0, 0));//Phone Number
        hb5.setPadding(new Insets(0, 0, 0, 20));//Enter Password
        hb6.setPadding(new Insets(0, 5, 0, 0));//Enter Password AGAIN YOU FOOL!
        hb7.setPadding(new Insets(0, 0, 0, 0));//Create Account Button

        vb1.setAlignment(Pos.CENTER);//puts the picture on the top and center of the scene
        vb1.setAlignment(Pos.CENTER);

        hb0.setAlignment(Pos.CENTER_LEFT);
        hb1.setAlignment(Pos.CENTER);
        hb2.setAlignment(Pos.CENTER);
        hb3.setAlignment(Pos.CENTER);
        hb4.setAlignment(Pos.CENTER);
        hb5.setAlignment(Pos.CENTER);
        hb6.setAlignment(Pos.CENTER);
        hb7.setAlignment(Pos.CENTER);

        hb0.setOpacity(0);

        //Sets the all components onto the scene
        hb0.getChildren().addAll(Back_btn);
        hb1.getChildren().addAll(Name_lbl, Name_field);
        hb2.getChildren().addAll(Username_lbl, Username_field);
        hb3.getChildren().addAll(email_Lbl, NewEmail_field);
        hb4.getChildren().addAll(PhoneNumber_lbl, PhoneNumber_field);
        hb5.getChildren().addAll(password_lbl, NewPassword);
        hb6.getChildren().addAll(ConfirmPassword_lbl, ConfirmNewPassword);
        hb7.getChildren().addAll(CreateAccount_btn);
        vb1.getChildren().addAll(new ImageView(Template), hb0, hb1, hb2, hb3, hb4, hb5, hb6, hb7);

        CreatAccount_ButtonActions(window);
        FontsUsed();

        return vb1;
    }

    private void CreatAccount_ButtonActions(Stage window){
        //sts the size of the back Button
        Back_btn.setPrefSize(125,75);
        CreateAccount_btn.setPrefSize(300,100);

        //Sets the "Create Account" Button disabled until each text field is  filled

        /*if(CreateAccount_btn.isDisable()) {

        }
        else {

        }*/
        //creates a class for the main menu
        MainMenu mm = new MainMenu();
        LoginMenu loginMenu = new LoginMenu();

        //Sets button action for create account to take user to the main menu
        CreateAccount_btn.setOnAction(e -> {
            String usernameInput = Username_field.getText();
            String passwordInput = NewPassword.getText();
            String passwordcheckInput = ConfirmNewPassword.getText();
            String emailInput = NewEmail_field.getText();
            String nameInput = Name_field.getText();
            String phoneNumberInput = PhoneNumber_field.getText();
            if(passwordInput.equals(passwordcheckInput)){
                try{
                    Main.account = new Customer(usernameInput, passwordInput, emailInput, nameInput, phoneNumberInput);
                    window.getScene().setRoot(mm.BuildMainMenu(window));
                } catch(Exception g){
                    System.out.println("The create account button failed");
                }
            } else {
                //Present a hidden label that will tell the user that the passwords did not match and needs to try again
            }
        });
        Back_btn.setOnAction(e -> window.getScene().setRoot(loginMenu.BuildLogin(window)));
    }
    private void FontsUsed(){
        Name_field.setFont(Font.font("Calibri", 24));
        Username_field.setFont(Font.font("Calibri", 24));
        PhoneNumber_field.setFont(Font.font("Calibri", 24));
        PhoneNumber_lbl.setFont(Font.font("Calibri", 24));
        Username_lbl.setFont(Font.font("Calibri", 24));
        Name_lbl.setFont(Font.font("Calibri", 24));
        email_Lbl.setFont(Font.font("Calibri", 24));
        password_lbl.setFont(Font.font("Calibri", 24));
        NewEmail_field.setFont(Font.font("Calibri", 24));
        NewPassword.setFont(Font.font("Calibri", 24));
        ConfirmNewPassword.setFont(Font.font("Calibri", 24));
        ConfirmPassword_lbl.setFont(Font.font("Calibri", 24));
        CreateAccount_btn.setFont(Font.font("Calibri", FontWeight.BOLD,18));
    }
}
