package GUI;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import sample.Customer;
import sample.Order;
import sample.Card;

import java.io.BufferedReader;
import java.io.FileReader;

public class PaymentOptions {

    Order order = Main.getOrder();
    //Buttons used for the Checkout Payment Options menu
    private Button Back_btn = new Button("Back");
    private Button Check_btn = new Button("Check");
    private Button Cash_btn = new Button("Cash");
    private Button Card_btn = new Button("Card");

    //Labels used for the Checkout Payment Options menu
    private Label Checkout_Lbl = new Label("Checkout");
    private Label PaymentOptions_Lbl = new Label("Payment Options");
    private Label OrderDetails_Lbl = new Label("Order Details");
    private Label PayAtPickup_Lbl = new Label("Must Pay At Pickup");
    private Label Receipt_Lbl = new Label(" ");
    private Label Total_Lbl = new Label("Total:");

    //Images used in the cart menu
    private Image Template= new Image("GUI/images/PizzaProject Info Template_Back.png");


    public VBox BuildPaymentOptions(Stage window){

        Receipt_Lbl.setText(order.toString());
        Total_Lbl.setText("Total: $" +  order.getTotal());
        //VBoxes used in this method
        VBox vb1 = new VBox(20);
        VBox vb2 = new VBox(20);
        VBox vb3 = new VBox(20);

        //HBoxes used in this method
        HBox hb1 = new HBox(50);
        HBox hb2 = new HBox(50);
        HBox hb3 = new HBox(50);
        HBox hb4 = new HBox(50);
        HBox hb5 = new HBox(50);
        HBox hb6 = new HBox(50);
        HBox hb7 = new HBox(50);
        HBox hb8 = new HBox(10);
        HBox hb9 = new HBox(65);
        HBox hb10 = new HBox(20);

        //Padding for the VBoxes
        vb1.setPadding(new Insets(0,0,0,0));
        vb2.setPadding(new Insets(-250,0,0,0));
        vb3.setPadding(new Insets(0,0,130,0));

        //Alignment for the VBoxes
        vb1.setAlignment(Pos.CENTER);
        vb2.setAlignment(Pos.CENTER);
        vb3.setAlignment(Pos.CENTER);

        //Padding for the HBoxes
        hb1.setPadding(new Insets(-100,0,0,0));
        hb2.setPadding(new Insets(0,0,0,0));
        hb3.setPadding(new Insets(0,250,-20,0));
        hb4.setPadding(new Insets(5,10,5,10));//Items_Lbl
        hb5.setPadding(new Insets(5,10,5,10));//Total_Lbl
        hb7.setPadding(new Insets(0,100,-20,0));

        //Alignment for the HBoxes
        hb1.setAlignment(Pos.CENTER_LEFT);
        hb2.setAlignment(Pos.CENTER);
        hb3.setAlignment(Pos.CENTER);
        hb4.setAlignment(Pos.TOP_LEFT);
        hb5.setAlignment(Pos.CENTER_LEFT);
        hb6.setAlignment(Pos.CENTER);
        hb7.setAlignment(Pos.CENTER_LEFT);
        hb8.setAlignment(Pos.CENTER);
        hb9.setAlignment(Pos.CENTER);
        hb10.setAlignment(Pos.CENTER);

        hb4.setPrefSize(275,300);
        hb5.setPrefSize(275,20);

        //This code is to put a border around the VBoxes to make user viability easier.
        String borderLayout = "-fx-border-color: black;\n" +
                "-fx-border-insets: 3;\n" +
                "-fx-border-width: 3;\n" +
                "-fx-border-style: solid inside;\n";
        hb4.setStyle(borderLayout);
        hb5.setStyle(borderLayout);

        //disables the visibility but NOT the functionality of the back button
        hb1.setOpacity(0);

        //Sets the all components onto the scene
        hb1.getChildren().addAll(Back_btn);
        hb2.getChildren().addAll(Checkout_Lbl);
        hb3.getChildren().addAll(OrderDetails_Lbl);
        hb4.getChildren().addAll(Receipt_Lbl);
        hb5.getChildren().addAll(Total_Lbl);
        hb6.getChildren().addAll(PaymentOptions_Lbl);
        hb7.getChildren().addAll(PayAtPickup_Lbl);
        hb8.getChildren().addAll(Check_btn, Cash_btn);
        hb9.getChildren().addAll(hb8, Card_btn);
        hb10.getChildren().addAll(vb1, vb2);

        vb1.getChildren().addAll(hb2, hb3, hb4, hb5);
        vb2.getChildren().addAll(hb6, hb7, hb9);
        vb3.getChildren().addAll(new ImageView(Template), hb1, hb10);

        //Calling other methods of this class
        PaymentOptions_ButtonActions(window);
        FontsUsed();

        return vb3;
    }

    //This Method handles the button actions in the payment options menu
    private void PaymentOptions_ButtonActions(Stage window){
        //Sets the sizes of the buttons
        Back_btn.setPrefSize(125,75);
        Check_btn.setPrefSize(75,75);
        Cash_btn.setPrefSize(75,75);
        Card_btn.setPrefSize(75,75);

        //Classes that can be navigated from the Checkout PaymentOptions Menu
        Cart cart = new Cart();
        PayWithCard pay = new PayWithCard();
        PickupOptions pickupOptions = new PickupOptions();
        Receipt receipt = new Receipt();

        //Button Actions
        Back_btn.setOnAction(e -> window.getScene().setRoot(pickupOptions.BuildPickup(window)));
        Check_btn.setOnAction(e -> window.getScene().setRoot(receipt.BuildReceipt(window)));
        Cash_btn.setOnAction(e -> window.getScene().setRoot(receipt.BuildReceipt(window)));
        Card_btn.setOnAction(e -> {
            try{
                BufferedReader filereaderLM = new BufferedReader(new FileReader("resources/Accounts.txt"));
                String tempString = filereaderLM.readLine();
                while(tempString != null){
                    if(tempString.contains("UserCard: ")){
                        System.out.println(tempString);
                        String txtFileLineKeyword = "TxtFileLine: ";
                        int sector = tempString.indexOf(txtFileLineKeyword) + 13;
                        String txtFileLineInput = tempString.substring(tempString.indexOf(sector));
                        int txtFileLine = Integer.parseInt(txtFileLineInput);
                        int cardTextFileInput = Main.account.getCardFileLineNumber();
                        if(txtFileLine == cardTextFileInput){
                            Main.userCard = new Card(txtFileLine);
                            filereaderLM.close();
                        }
                    }
                    tempString = filereaderLM.readLine();
                }
                filereaderLM.close();
            }catch(Exception g){
                System.out.println("Error in payment Reading");
            }

            window.getScene().setRoot(pay.BuildPayWithCard(window));
        });
    }

    private void FontsUsed(){
        //Sets the font for the labels
        Checkout_Lbl.setFont(Font.font("Calibri", FontWeight.SEMI_BOLD,48));
        PaymentOptions_Lbl.setFont(Font.font("Calibri", FontWeight.SEMI_BOLD,48));
        Receipt_Lbl.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        Total_Lbl.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        OrderDetails_Lbl.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        PayAtPickup_Lbl.setFont(Font.font("Calibri", FontPosture.ITALIC,18));

        //Sets the fonts for the buttons
        Back_btn.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        Check_btn.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        Cash_btn.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        Card_btn.setFont(Font.font("Calibri", FontWeight.BOLD,18));
    }
}
