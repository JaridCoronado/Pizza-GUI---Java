package GUI;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import sample.Order;
import sample.Card;

public class PayWithCard {
    Card accountCard = Main.userCard;
    Order order = Main.getOrder();
    //Buttons used for the cart menu
    private Button Back_btn = new Button("Back");
    private Button PlaceOrder_btn = new Button("Place Order");

    //Labels used for the Checkout Payment Options menu
    private Label Checkout_Lbl = new Label("Checkout");
    private Label OrderDetails_Lbl = new Label("Order Details");
    private Label PayWithCard_Lbl = new Label("Pay With Card");
    private Label CardType_Lbl = new Label("Card Type");
    private Label NameOfCardHolder_Lbl = new Label("Name Of Card Holder");
    private Label CardNumber_Lbl = new Label("Card Number");
    private Label ExpirationDate_Lbl = new Label("Expiration Date");
    private Label ZipCode_Lbl = new Label("Zip Code");
    private Label SecurityCode_Lbl = new Label("Security Code");
    private Label Receipt_Lbl = new Label(" ");
    private Label Total_Lbl = new Label("Total:");

    //TextFields used in the Pay With Card Menu
    private TextField NameOfCardHolder_field = new TextField();
    private TextField CardNumber_field = new TextField();
    private TextField ZipCode_field = new TextField();
    private TextField SecurityCode_field = new TextField();

    //DropDown Menus used in the
    private ChoiceBox<String> CardType_DropDown = new ChoiceBox<>();
    private ChoiceBox<Integer> ExDateMonth_DropDown = new ChoiceBox<>();
    private ChoiceBox<Integer> ExDateYear_DropDown = new ChoiceBox<>();

    //Images used in the cart menu
    private Image Template= new Image("GUI/images/PizzaProject Info Template_Back.png");

    public VBox BuildPayWithCard(Stage window){

        Receipt_Lbl.setText(order.toString());
        Total_Lbl.setText("Total: $" +  order.getTotal());
        //VBoxes used in this method
        VBox vb1 = new VBox(20);
        VBox vb2 = new VBox(5);
        VBox vb3 = new VBox(1);

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
        HBox hb14 = new HBox(20);
        HBox hb15 = new HBox(50);
        HBox hb16 = new HBox(50);
        HBox hb17 = new HBox(50);
        HBox hb18 = new HBox(50);
        HBox hb19 = new HBox(50);
        HBox hb20 = new HBox(10);

        //Padding for the VBoxes
        vb1.setPadding(new Insets(15,21,0,0));
        vb2.setPadding(new Insets(5,0,-25,50));
        vb3.setPadding(new Insets(0,0,108,0));

        //Alignment for the VBoxes
        vb1.setAlignment(Pos.CENTER);
        vb2.setAlignment(Pos.CENTER);
        vb3.setAlignment(Pos.CENTER);

        //Padding for the HBoxes
        hb1.setPadding(new Insets(-80,0,0,0));
        hb3.setPadding(new Insets(0,250,-20,0));//Order Details
        hb4.setPadding(new Insets(0,10,5,10));//Receipt
        hb5.setPadding(new Insets(10,10,5,10));//Total

        //Alignment for the HBoxes
        hb1.setAlignment(Pos.CENTER_LEFT);
        hb2.setAlignment(Pos.CENTER);
        hb3.setAlignment(Pos.CENTER);
        hb4.setAlignment(Pos.TOP_LEFT);
        hb5.setAlignment(Pos.CENTER_LEFT);
        hb6.setAlignment(Pos.CENTER);
        hb7.setAlignment(Pos.CENTER_LEFT);
        hb8.setAlignment(Pos.CENTER_LEFT);
        hb9.setAlignment(Pos.CENTER_LEFT);
        hb10.setAlignment(Pos.CENTER_LEFT);
        hb11.setAlignment(Pos.CENTER_LEFT);
        hb12.setAlignment(Pos.CENTER_LEFT);
        hb13.setAlignment(Pos.CENTER_LEFT);
        hb14.setAlignment(Pos.CENTER_LEFT);
        hb15.setAlignment(Pos.CENTER_LEFT);
        hb16.setAlignment(Pos.CENTER_LEFT);
        hb17.setAlignment(Pos.CENTER_LEFT);
        hb18.setAlignment(Pos.CENTER_LEFT);
        hb19.setAlignment(Pos.CENTER_LEFT);
        hb20.setAlignment(Pos.CENTER);

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

        hb6.getChildren().addAll(PayWithCard_Lbl);
        hb7.getChildren().addAll(CardType_Lbl);
        hb8.getChildren().addAll(CardType_DropDown);
        hb9.getChildren().addAll(NameOfCardHolder_Lbl);
        hb10.getChildren().addAll(NameOfCardHolder_field);
        hb11.getChildren().addAll(CardNumber_Lbl);
        hb12.getChildren().addAll(CardNumber_field);
        hb13.getChildren().addAll(ExpirationDate_Lbl);
        hb14.getChildren().addAll(ExDateMonth_DropDown, ExDateYear_DropDown);
        hb15.getChildren().addAll(ZipCode_Lbl);
        hb16.getChildren().addAll(ZipCode_field);
        hb17.getChildren().addAll(SecurityCode_Lbl);
        hb18.getChildren().addAll(SecurityCode_field);
        hb19.getChildren().addAll(PlaceOrder_btn);

        hb20.getChildren().addAll(vb1, vb2);

        vb1.getChildren().addAll(hb2, hb3, hb4, hb5);
        vb2.getChildren().addAll(hb6, hb7, hb8, hb9, hb10, hb11, hb12, hb13, hb14, hb15, hb16, hb17, hb18, hb19);
        vb3.getChildren().addAll(new ImageView(Template), hb1, hb20);
        if(Main.userCard != null){
            NameOfCardHolder_field.setText(accountCard.getNameOfCardHolder());
            CardType_DropDown.setValue(accountCard.getUserCard());
            String cardNumbertxt = Long.toString(accountCard.getCardNumber());
            CardNumber_field.setText(cardNumbertxt);
            String zipcodetxt = Integer.toString(accountCard.getZipCode());
            ZipCode_field.setText(zipcodetxt);
            String securecodetxt = Integer.toString(accountCard.getSecureCode());
            SecurityCode_field.setText(securecodetxt);
        }

        Card_ButtonActions(window);
        DropDownMenus();
        FontsUsed();

        return vb3;
    }

    //This Method handles the button actions in the Pay With Card menu
    private void Card_ButtonActions(Stage window){
        //Sets the sizes of the buttons
        Back_btn.setPrefSize(125,75);
        PlaceOrder_btn.setPrefSize(150, 50);

        //Classes that can be navigated from the Checkout PaymentOptions Menu
        PaymentOptions po = new PaymentOptions();
        Receipt receipt = new Receipt();

        //Button actions
        Back_btn.setOnAction(e -> window.getScene().setRoot(po.BuildPaymentOptions(window)));
        PlaceOrder_btn.setOnAction(e -> {
            try{
                String tempName = NameOfCardHolder_field.getText();
                String tempuserCard = CardType_DropDown.getValue();
                int tempZipCode = Integer.parseInt(ZipCode_field.getText());
                int tempSecureCode = Integer.parseInt(SecurityCode_field.getText());
                Long tempCardNumber = Long.parseLong(CardNumber_field.getText());
                int tempExpirationDate = ExDateMonth_DropDown.getValue() + ExDateYear_DropDown.getValue();
                Main.adjustUserCard(tempName, tempuserCard, tempZipCode, tempSecureCode, tempCardNumber, tempExpirationDate);
                window.getScene().setRoot(receipt.BuildReceipt(window));
            }catch(Exception g){
                System.out.println("Failure to update account in PayWithCard Menu");
                window.getScene().setRoot(receipt.BuildReceipt(window));
            }
        });
    }

    //This Method handles the drop down menu actions in the Pay with Card Menu
    private void DropDownMenus(){
        CardType_DropDown.getItems().addAll("Master Card", "Visa");
        CardType_DropDown.setValue("-Please Select Card Type-");

        ExDateMonth_DropDown.getItems().addAll(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);

        ExDateYear_DropDown.getItems().addAll(20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
                                                         31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41,
                                                         42, 43, 44, 45, 46, 47, 48, 49, 50);
    }

    //This method handles the fonts in the pay with card menu.
    private void FontsUsed(){
        //Sets the font for the labels
        Checkout_Lbl.setFont(Font.font("Calibri", FontWeight.SEMI_BOLD,48));
        PayWithCard_Lbl.setFont(Font.font("Calibri", FontWeight.SEMI_BOLD,48));
        OrderDetails_Lbl.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        CardType_Lbl.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        NameOfCardHolder_Lbl.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        CardNumber_Lbl.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        ExpirationDate_Lbl.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        ZipCode_Lbl.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        SecurityCode_Lbl.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        Receipt_Lbl.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        Total_Lbl.setFont(Font.font("Calibri", FontWeight.BOLD,18));

        //Sets the fonts for the buttons
        Back_btn.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        PlaceOrder_btn.setFont(Font.font("Calibri", FontWeight.BOLD,18));

        //Sets the fonts for the TextFields
        NameOfCardHolder_field.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        CardNumber_field.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        SecurityCode_field.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        ZipCode_field.setFont(Font.font("Calibri", FontWeight.BOLD,18));
    }
}
