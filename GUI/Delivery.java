package GUI;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Delivery {
    //Buttons used for the Delivery menu
    private Button Back_btn = new Button("Back");
    private Button Purchase_btn = new Button("Proceed To Purchase");

    //Labels used for the Delivery menu
    private Label Delivery_Lbl = new Label("Delivery Address");
    private Label Street_Lbl = new Label("Street Address");
    private Label City_Lbl = new Label("City");
    private Label State_Lbl = new Label("State");
    private Label Zip_Lbl = new Label("Zip Code");
    private Label AdditionalInfo_Lbl = new Label("Additional Information");

    //TextBoxes used in the Delivery Menu
    private TextField Street_field = new TextField();
    private TextField City_field = new TextField();
    private TextField State_field = new TextField();
    private TextField Zip_field = new TextField();
    private TextField Additional_field = new TextField();

    //Images used in the cart menu
    private Image Template= new Image("GUI/images/PizzaProject Info Template_Back.png");

    public VBox BuildDelivery(Stage window){
        //VBoxes used in this method
        VBox vb1 = new VBox(2);
        VBox vb2 = new VBox(7);

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
        HBox hb11 = new HBox(50);
        HBox hb12 = new HBox(50);
        HBox hb13 = new HBox(50);

        //Padding for the VBoxes
        vb1.setPadding(new Insets(0,0,0,400));
        vb2.setPadding(new Insets(-177,0,0,0));

        //Alignment for the VBoxes
        vb1.setAlignment(Pos.CENTER);
        vb2.setAlignment(Pos.CENTER);

        //Padding for the HBoxes
        hb1.setPadding(new Insets(-80,0,0,0));
        hb2.setPadding(new Insets(0,0,0,-350));

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
        hb11.setAlignment(Pos.CENTER_LEFT);
        hb12.setAlignment(Pos.CENTER_LEFT);
        hb13.setAlignment(Pos.CENTER_LEFT);

        //disables the visibility but NOT the functionality of the back button
        hb1.setOpacity(0);

        //Sets the all components onto the scene
        hb1.getChildren().addAll(Back_btn);
        hb2.getChildren().addAll(Delivery_Lbl);
        hb3.getChildren().addAll(Street_Lbl);
        hb4.getChildren().addAll(State_field);
        hb5.getChildren().addAll(State_field);
        hb6.getChildren().addAll(City_Lbl);
        hb7.getChildren().addAll(City_field);
        hb8.getChildren().addAll(Street_Lbl);
        hb9.getChildren().addAll(State_field);
        hb10.getChildren().addAll(Zip_Lbl);
        hb11.getChildren().addAll(Zip_field);
        hb12.getChildren().addAll(AdditionalInfo_Lbl);
        hb13.getChildren().addAll(Additional_field);

        //Sets the size of the Additional Information field
        Additional_field.setPrefSize(500,100);

        vb1.getChildren().addAll(hb2, hb3, hb4, hb5, hb6, hb7, hb8, hb9, hb10, hb11, hb12, hb13);
        vb2.getChildren().addAll(new ImageView(Template), hb1, vb1, Purchase_btn);

        Delivery_ButtonActions(window);
        FontsUsed();

        return vb2;
    }

    //This Method handles the button actions in the Pay With Card menu
    private void Delivery_ButtonActions(Stage window){
        //Sets the sizes of the buttons
        Back_btn.setPrefSize(125,75);
        Purchase_btn.setPrefSize(200, 50);

        //Classes that can be navigated from the Checkout PaymentOptions Menu
        PaymentOptions po = new PaymentOptions();
        PickupOptions pickupOptions = new PickupOptions();

        //Button actions
        Back_btn.setOnAction(e -> window.getScene().setRoot(pickupOptions.BuildPickup(window)));
        Purchase_btn.setOnAction(e -> window.getScene().setRoot(po.BuildPaymentOptions(window)));
    }

    //This method handles the fonts in the pay with card menu.
    private void FontsUsed(){
        //Sets the font for the labels
        Delivery_Lbl.setFont(Font.font("Calibri", FontWeight.SEMI_BOLD,48));
        Street_Lbl.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        City_Lbl.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        State_Lbl.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        Zip_Lbl.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        AdditionalInfo_Lbl.setFont(Font.font("Calibri", FontWeight.BOLD,18));

        //Sets the fonts for the buttons
        Back_btn.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        Purchase_btn.setFont(Font.font("Calibri", FontWeight.BOLD,18));
    }
}
