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
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import sample.Drinks;
import sample.Order;

import java.text.DecimalFormat;

public class Cart {

    Order order = Main.getOrder();

    //Buttons used for the cart menu
    private Button Back_btn = new Button("Back");
    private Button MainMenu_btn = new Button("Main Menu");
    private Button Checkout_btn = new Button("Proceed To Checkout");

    //Labels used in the cart menu
    private Label Cart_Lbl = new Label("Cart");
    private Label Receipt_Lbl = new Label("");
    private Label Total_Lbl = new Label("Total:");
    private Label Space_Lbl = new Label(" ");
    private Label Space1_Lbl = new Label(" ");

    //Images used in the cart menu
    private Image Template= new Image("GUI/images/PizzaProject Info Template_Back.png");

    public VBox BuildCart(Stage window){

        Receipt_Lbl.setText(order.toString());
        Total_Lbl.setText("Total: $" +  order.getTotal());

        VBox vb1 = new VBox(20);
        VBox vb2 = new VBox(20);
        VBox vb3 = new VBox(5);

        HBox hb1 = new HBox(50);
        HBox hb2 = new HBox(50);
        HBox hb3 = new HBox(50);

        HBox hb4 = new HBox(50);

        HBox hb5 = new HBox(50);

        HBox hb6 = new HBox(50);
        HBox hb7 = new HBox(50);
        HBox hb8 = new HBox(50);
        HBox hb9 = new HBox(50);

        //Padding for the VBoxes
        vb3.setPadding(new Insets(0,0,100,0));

        //Alignment for the VBoxes
        vb1.setAlignment(Pos.CENTER);
        vb2.setAlignment(Pos.CENTER);
        vb3.setAlignment(Pos.CENTER);

        //Padding for the HBoxes
        hb1.setPadding(new Insets(-90,0,0,0));//back button
        hb2.setPadding(new Insets(-130,0,0,0));//main menu button
        hb3.setPadding(new Insets(-50,50,0,50));// cart label
        hb4.setPadding(new Insets(5,10,5,10));// cart label
        hb5.setPadding(new Insets(2,10,2,10));// cart label

        //Alignment for the HBoxes
        hb1.setAlignment(Pos.CENTER_LEFT);
        hb2.setAlignment(Pos.CENTER_LEFT);
        hb3.setAlignment(Pos.CENTER);
        hb4.setAlignment(Pos.TOP_LEFT);
        hb5.setAlignment(Pos.CENTER_LEFT);
        hb6.setAlignment(Pos.CENTER);
        hb7.setAlignment(Pos.CENTER);
        hb8.setAlignment(Pos.CENTER);
        hb9.setAlignment(Pos.CENTER_LEFT);

        hb4.setPrefSize(400,300);
        hb5.setPrefSize(400,20);

        //This code is to put a border around the VBoxes to make user viability easier.
        String borderLayout = "-fx-border-color: black;\n" +
                "-fx-border-insets: 3;\n" +
                "-fx-border-width: 3;\n" +
                "-fx-border-style: solid inside;\n";
        hb4.setStyle(borderLayout);
        hb5.setStyle(borderLayout);

        //disables the visibility but NOT the functionality of the back button
        hb1.setOpacity(0);
        hb2.setOpacity(0);

        //Sets the all components onto the scene
        hb1.getChildren().addAll(Back_btn);
        hb2.getChildren().addAll(MainMenu_btn);
        hb3.getChildren().addAll(Cart_Lbl);
        hb4.getChildren().addAll(Receipt_Lbl);
        hb5.getChildren().addAll(Total_Lbl);
        hb6.getChildren().addAll(Checkout_btn);
        hb7.getChildren().addAll(Space_Lbl, hb4);
        hb8.getChildren().addAll(Space1_Lbl, hb5);

        vb1.getChildren().addAll(hb1, hb2);
        vb2.getChildren().addAll(hb3, hb7, hb8, hb6);
        vb3.getChildren().addAll(new ImageView(Template), vb1, vb2);

        //Calls other methods in this class
        Cart_ButtonActions(window);
        FontsUsed();

        return vb3;
    }

    private void Cart_ButtonActions(Stage window){
        //Sets the sizes of the buttons
        Back_btn.setPrefSize(125,75);
        MainMenu_btn.setPrefSize(125,75);
        Checkout_btn.setPrefSize(200,75);

        //Classes that can be navigated to from the cart menu
        MainMenu mm = new MainMenu();
        PizzaCreation_Crust pcc = new PizzaCreation_Crust();
        PickupOptions options = new PickupOptions();

        //Button actions
        Back_btn.setOnAction(e -> window.getScene().setRoot(pcc.BuildCrust(window)));
        MainMenu_btn.setOnAction(e -> window.getScene().setRoot(mm.BuildMainMenu(window)));
        Checkout_btn.setOnAction(e -> window.getScene().setRoot(options.BuildPickup(window)));
    }

    private void FontsUsed(){
        //Sets the font for the labels
        Cart_Lbl.setFont(Font.font("Calibri", FontWeight.SEMI_BOLD,48));
        Receipt_Lbl.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        Total_Lbl.setFont(Font.font("Calibri", FontWeight.BOLD,18));

        //Sets the fonts for the buttons
        Back_btn.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        MainMenu_btn.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        Checkout_btn.setFont(Font.font("Calibri", FontWeight.BOLD,18));
    }
}
