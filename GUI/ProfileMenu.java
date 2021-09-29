package GUI;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.scene.text.Font;
import sample.Customer;

public class ProfileMenu {
    static Customer presetaccount = Main.account;
    //Buttons Used for the Profile Menu
    private Button Back_btn = new Button("Back");

    //Labels used for the Delivery menu
    private Label AccountInformation_Lbl = new Label("Account Information");
    private Label Name_Lbl = new Label("Name");
    private Label PhoneNumber_Lbl = new Label("Phone Number");
    private Label Address_Lbl = new Label("Address");
    private Label AdditionalInfo_Lbl = new Label("Additional Information");

    //TextBoxes used in the Profile Menu
    private TextField Name_field = new TextField();
    private TextField PhoneNumber_field = new TextField();
    private TextField Address_field = new TextField();
    private TextField Additional_field = new TextField();


    //Images used for the Profile Menu
    private Image Template = new Image("GUI/images/PizzaProject Info Template_Back.png");

    public VBox BuildProfile(Stage window){
        //VBoxes used in this method
        VBox vb1 = new VBox(2);
        VBox vb2 = new VBox(1);

        //HBoxes used in this method
        HBox hb1 = new HBox(50);
        HBox hb2 = new HBox(50);
        HBox hb3 = new HBox(50);
        HBox hb4 = new HBox(50);
        HBox hb5 = new HBox(50);
        HBox hb6 = new HBox(50);
        HBox hb7 = new HBox(50);
        HBox hb8 = new HBox(50);
        HBox hb9 = new HBox(50);
        HBox hb10 = new HBox(50);

        //Padding for the VBoxes
        vb1.setPadding(new Insets(0,0,0,350));
        vb2.setPadding(new Insets(-225,0,0,0));

        //Alignment for the VBoxes
        vb1.setAlignment(Pos.CENTER);
        vb2.setAlignment(Pos.CENTER);

        //Padding for the HBoxes
        hb1.setPadding(new Insets(-100,0,0,0));

        //Alignment for the HBoxes
        hb1.setAlignment(Pos.CENTER_LEFT);
        hb2.setAlignment(Pos.CENTER);
        hb3.setAlignment(Pos.CENTER_LEFT);
        hb4.setAlignment(Pos.CENTER_LEFT);
        hb5.setAlignment(Pos.CENTER_LEFT);
        hb6.setAlignment(Pos.CENTER_LEFT);
        hb7.setAlignment(Pos.CENTER_LEFT);
        hb8.setAlignment(Pos.CENTER_LEFT);
        hb9.setAlignment(Pos.CENTER_LEFT);
        hb10.setAlignment(Pos.CENTER_LEFT);

        //disables the visibility but NOT the functionality of the back button
        hb1.setOpacity(0);

        //Sets the all components onto the scene
        hb1.getChildren().addAll(Back_btn);
        hb2.getChildren().addAll(AccountInformation_Lbl);
        hb3.getChildren().addAll(Name_Lbl);
        hb4.getChildren().addAll(Name_field);
        hb5.getChildren().addAll(PhoneNumber_Lbl);
        hb6.getChildren().addAll(PhoneNumber_field);
        hb7.getChildren().addAll(Address_Lbl);
        hb8.getChildren().addAll(Address_field);
        hb9.getChildren().addAll(AdditionalInfo_Lbl);
        hb10.getChildren().addAll(Additional_field);

        //Sets the size of the Additional Information field
        Additional_field.setPrefSize(500,100);

        vb1.getChildren().addAll(hb3, hb4, hb5, hb6, hb7, hb8, hb9, hb10);
        vb2.getChildren().addAll(new ImageView(Template), hb1, hb2, vb1);

        if(presetaccount != null){
            Name_field.setText(presetaccount.getNameofUser());
            String temp = presetaccount.getPhoneNumber();
            PhoneNumber_field.setText(temp);
            Address_field.setText(presetaccount.getAddress());
        }
        Delivery_ButtonActions(window);
        FontsUsed();

        return vb2;
    }

    //This Method handles the button actions in the Pay With Card menu
    private void Delivery_ButtonActions(Stage window){
        //Sets the sizes of the buttons
        Back_btn.setPrefSize(125,75);

        //Classes that can be navigated from the Checkout PaymentOptions Menu
        MainMenu mm = new MainMenu();

        //Button actions
        Back_btn.setOnAction(e -> {
            try{
                String tempName = Name_field.getText();
                String tempAddress = Address_field.getText();
                String tempPhone = PhoneNumber_field.getText();
                Main.adjustCustomer(tempName, tempAddress, tempPhone);
                window.getScene().setRoot(mm.BuildMainMenu(window));
            }catch(Exception g){
                System.out.println("Failure to update account in Profile Menu");
                window.getScene().setRoot(mm.BuildMainMenu(window));
            }
        });
    }

    //This method handles the fonts in the pay with card menu.
    private void FontsUsed(){
        //Sets the font for the labels
        AccountInformation_Lbl.setFont(Font.font("Calibri", FontWeight.SEMI_BOLD,48));
        Name_Lbl.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        PhoneNumber_Lbl.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        Address_Lbl.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        AdditionalInfo_Lbl.setFont(Font.font("Calibri", FontWeight.BOLD,18));

        //sets the fonts for the text Fields
        Name_field.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        PhoneNumber_field.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        Address_field.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        Additional_field.setFont(Font.font("Calibri", FontWeight.BOLD,18));

        //Sets the fonts for the buttons
        Back_btn.setFont(Font.font("Calibri", FontWeight.BOLD,18));
    }
}
