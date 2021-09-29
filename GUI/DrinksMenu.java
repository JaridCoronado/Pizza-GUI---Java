package GUI;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.scene.text.Font;
import sample.Drinks;
import sample.Order;

public class DrinksMenu {
    Order order = Main.getOrder();

    //Buttons used in the drinks menu
    private Button MainMenu_btn = new Button("Main Menu");
    private Button Back_btn = new Button("Back to Main Menu");
    private Button Cart_btn = new Button ("Go To Cart");
    private Button Pepsi_btn = new Button ("Add");
    private Button DietPepsi_btn = new Button ("Add");
    private Button SierraMist_btn = new Button ("Add");
    private Button DietSierraMist_btn = new Button ("Add");
    private Button RootBeer_btn = new Button ("Add");
    private Button DietRootBeer_btn = new Button ("Add");
    private Button Orange_btn = new Button ("Add");
    private Button DietOrange_btn = new Button ("Add");
    private Button Lemonade_btn = new Button ("Add");
    private Button Water_btn = new Button ("Add");

    //Radio Buttons Used in the drinks menu, multiple versions of the same name due to a bug in the program
    private RadioButton Large_radio = new RadioButton();
    private RadioButton Medium_radio = new RadioButton();
    private RadioButton Small_radio = new RadioButton();
    private RadioButton Large1_radio = new RadioButton();
    private RadioButton Medium1_radio = new RadioButton();
    private RadioButton Small1_radio = new RadioButton();
    private RadioButton Large2_radio = new RadioButton();
    private RadioButton Medium2_radio = new RadioButton();
    private RadioButton Small2_radio = new RadioButton();
    private RadioButton Large3_radio = new RadioButton();
    private RadioButton Medium3_radio = new RadioButton();
    private RadioButton Small3_radio = new RadioButton();
    private RadioButton Large4_radio = new RadioButton();
    private RadioButton Medium4_radio = new RadioButton();
    private RadioButton Small4_radio = new RadioButton();
    private RadioButton Large5_radio = new RadioButton();
    private RadioButton Medium5_radio = new RadioButton();
    private RadioButton Small5_radio = new RadioButton();
    private RadioButton Large6_radio = new RadioButton();
    private RadioButton Medium6_radio = new RadioButton();
    private RadioButton Small6_radio = new RadioButton();
    private RadioButton Large7_radio = new RadioButton();
    private RadioButton Medium7_radio = new RadioButton();
    private RadioButton Small7_radio = new RadioButton();
    private RadioButton Large8_radio = new RadioButton();
    private RadioButton Medium8_radio = new RadioButton();
    private RadioButton Small8_radio = new RadioButton();
    private RadioButton Large9_radio = new RadioButton();
    private RadioButton Medium9_radio = new RadioButton();
    private RadioButton Small9_radio = new RadioButton();

    //TextFields used for the drinks menu, Multiple versions of similar name due to a bug in the program
    private TextField Large_field = new TextField();
    private TextField Medium_field = new TextField();
    private TextField Small_field = new TextField();
    private TextField Large1_field = new TextField();
    private TextField Medium1_field = new TextField();
    private TextField Small1_field = new TextField();
    private TextField Large2_field = new TextField();
    private TextField Medium2_field = new TextField();
    private TextField Small2_field = new TextField();
    private TextField Large3_field = new TextField();
    private TextField Medium3_field = new TextField();
    private TextField Small3_field = new TextField();
    private TextField Large4_field = new TextField();
    private TextField Medium4_field = new TextField();
    private TextField Small4_field = new TextField();
    private TextField Large5_field = new TextField();
    private TextField Medium5_field = new TextField();
    private TextField Small5_field = new TextField();
    private TextField Large6_field = new TextField();
    private TextField Medium6_field = new TextField();
    private TextField Small6_field = new TextField();
    private TextField Large7_field = new TextField();
    private TextField Medium7_field = new TextField();
    private TextField Small7_field = new TextField();
    private TextField Large8_field = new TextField();
    private TextField Medium8_field = new TextField();
    private TextField Small8_field = new TextField();
    private TextField Large9_field = new TextField();
    private TextField Medium9_field = new TextField();
    private TextField Small9_field = new TextField();


    //Labels used in the drinks menu
    private Label Drinks_Lbl = new Label("Drinks");
    private Label Pepsi_Lbl = new Label("Pepsi");
    private Label DietPepsi_Lbl = new Label("Diet Pepsi");
    private Label SierraMist_Lbl = new Label("Sierra Mist");
    private Label DietSierraMist_Lbl = new Label("Diet Sierra Mist");
    private Label RootBeer_Lbl = new Label("Root Beer");
    private Label DietRootBeer_Lbl = new Label("Diet Root Beer");
    private Label Orange_Lbl = new Label("Orange");
    private Label DietOrange_Lbl = new Label("Diet Orange");
    private Label Lemonade_Lbl = new Label("Lemonade");
    private Label Water_Lbl = new Label("Water");

    //There 10 of these because there was a bug to where the program would only add one of each label to the scene
    private Label Large_Lbl = new Label("Large");
    private Label Medium_Lbl = new Label("Medium");
    private Label Small_Lbl = new Label("Small");
    private Label Large1_Lbl = new Label("Large");
    private Label Medium1_Lbl = new Label("Medium");
    private Label Small1_Lbl = new Label("Small");
    private Label Large2_Lbl = new Label("Large");
    private Label Medium2_Lbl = new Label("Medium");
    private Label Small2_Lbl = new Label("Small");
    private Label Large3_Lbl = new Label("Large");
    private Label Medium3_Lbl = new Label("Medium");
    private Label Small3_Lbl = new Label("Small");
    private Label Large4_Lbl = new Label("Large");
    private Label Medium4_Lbl = new Label("Medium");
    private Label Small4_Lbl = new Label("Small");
    private Label Large5_Lbl = new Label("Large");
    private Label Medium5_Lbl = new Label("Medium");
    private Label Small5_Lbl = new Label("Small");
    private Label Large6_Lbl = new Label("Large");
    private Label Medium6_Lbl = new Label("Medium");
    private Label Small6_Lbl = new Label("Small");
    private Label Large7_Lbl = new Label("Large");
    private Label Medium7_Lbl = new Label("Medium");
    private Label Small7_Lbl = new Label("Small");
    private Label Large8_Lbl = new Label("Large");
    private Label Medium8_Lbl = new Label("Medium");
    private Label Small8_Lbl = new Label("Small");
    private Label Large9_Lbl = new Label("Large");
    private Label Medium9_Lbl = new Label("Medium");
    private Label Small9_Lbl = new Label("Small");

    //Images used in the Drinks menu
    private Image Template = new Image("GUI/images/PizzaProject Info Template_Back.png");
    private Image Pepsi_pic = new Image("GUI/images/Pepsi1.jpg");
    private Image DietPepsi_pic = new Image("GUI/images/DietPepsi.jpg");
    private Image SierraMist_pic = new Image("GUI/images/SierraMist1.jpg");
    private Image DietSierraMist_pic = new Image("GUI/images/DietSierraMist1.jpg");
    private Image RootBeer_pic = new Image("GUI/images/RootBeer1.jpg");
    private Image DietRootBeer_pic = new Image("GUI/images/DietRootBeer.jpg");
    private Image Orange_pic = new Image("GUI/images/Orange1.jpg");
    private Image DietOrange_pic = new Image("GUI/images/DietOrange.jpg");
    private Image Lemonade_pic = new Image("GUI/images/Lemonade1.jpg");
    private Image Water_pic = new Image("GUI/images/Water1.jpg");

    public VBox BuildDrinks(Stage window){
        //VBoxes used in this method
        VBox vb1 = new VBox(1);
        VBox vb2 = new VBox(1);
        VBox vb3 = new VBox(1);
        VBox vb4 = new VBox(1);
        VBox vb5 = new VBox(1);
        VBox vb6 = new VBox(1);
        VBox vb7 = new VBox(1);
        VBox vb8 = new VBox(1);
        VBox vb9 = new VBox(1);
        VBox vb10 = new VBox(1);
        VBox vb11 = new VBox(1);
        VBox vb12 = new VBox(1);
        VBox vb13 = new VBox(1);
        VBox vb14 = new VBox(1);
        VBox vb15 = new VBox(1);
        VBox vb16 = new VBox(1);
        VBox vb17 = new VBox(1);
        VBox vb18 = new VBox(1);
        VBox vb19 = new VBox(1);
        VBox vb20 = new VBox(1);
        VBox vb21 = new VBox(5);

        //HBoxes used in this method
        HBox hb0 = new HBox(10);
        HBox hb1 = new HBox(10);
        HBox hb2 = new HBox(10);
        HBox hb3 = new HBox(10);
        HBox hb4 = new HBox(10);
        HBox hb5 = new HBox(10);
        HBox hb6 = new HBox(50);
        HBox hb7 = new HBox(50);
        HBox hb8 = new HBox(50);
        HBox hb9 = new HBox(50);
        HBox hb10 = new HBox(50);
        HBox hb11 = new HBox(50);
        HBox hb12 = new HBox(50);
        HBox hb13 = new HBox(50);
        HBox hb14 = new HBox(50);
        HBox hb15 = new HBox(50);
        HBox hb16 = new HBox(50);
        HBox hb17 = new HBox(50);

        HBox hb18 = new HBox(10);
        HBox hb19 = new HBox(10);
        HBox hb20 = new HBox(10);
        HBox hb21 = new HBox(10);
        HBox hb22 = new HBox(10);
        HBox hb23 = new HBox(10);
        HBox hb24 = new HBox(10);
        HBox hb25 = new HBox(10);
        HBox hb26 = new HBox(10);
        HBox hb27 = new HBox(10);
        HBox hb28 = new HBox(10);
        HBox hb29 = new HBox(10);
        HBox hb30 = new HBox(10);
        HBox hb31 = new HBox(10);
        HBox hb32 = new HBox(10);
        HBox hb33 = new HBox(10);
        HBox hb34 = new HBox(10);
        HBox hb35 = new HBox(10);
        HBox hb36 = new HBox(10);
        HBox hb37 = new HBox(10);
        HBox hb38 = new HBox(10);
        HBox hb39 = new HBox(10);
        HBox hb40 = new HBox(10);
        HBox hb41 = new HBox(10);
        HBox hb42 = new HBox(10);
        HBox hb43 = new HBox(10);
        HBox hb44 = new HBox(10);

        //VBox Padding
        vb21.setPadding(new Insets(13,0,0,0));

        //VBox Alignment
        vb1.setAlignment(Pos.CENTER_LEFT);
        vb2.setAlignment(Pos.CENTER);
        vb3.setAlignment(Pos.CENTER_LEFT);
        vb4.setAlignment(Pos.CENTER);
        vb5.setAlignment(Pos.CENTER_LEFT);
        vb6.setAlignment(Pos.CENTER);
        vb7.setAlignment(Pos.CENTER_LEFT);
        vb8.setAlignment(Pos.CENTER);
        vb9.setAlignment(Pos.CENTER_LEFT);
        vb10.setAlignment(Pos.CENTER);
        vb11.setAlignment(Pos.CENTER_LEFT);
        vb12.setAlignment(Pos.CENTER);
        vb13.setAlignment(Pos.CENTER_LEFT);
        vb14.setAlignment(Pos.CENTER);
        vb15.setAlignment(Pos.CENTER_LEFT);
        vb16.setAlignment(Pos.CENTER);
        vb17.setAlignment(Pos.CENTER_LEFT);
        vb18.setAlignment(Pos.CENTER);
        vb19.setAlignment(Pos.CENTER_LEFT);
        vb20.setAlignment(Pos.CENTER);
        vb21.setAlignment(Pos.CENTER);

        //HBox padding
        hb1.setPadding(new Insets(-145,0,0,0));//Back Button
        hb2.setPadding(new Insets(-200,0,0,0));// Cart Button
        hb16.setPadding(new Insets(0,0,10,0));
        hb17.setPadding(new Insets(0,40,25,0));

        //HBox alignment
        hb1.setAlignment(Pos.CENTER_LEFT);
        hb2.setAlignment(Pos.CENTER_RIGHT);
        hb3.setAlignment(Pos.CENTER_LEFT);
        hb4.setAlignment(Pos.CENTER_LEFT);
        hb5.setAlignment(Pos.CENTER_LEFT);
        hb6.setAlignment(Pos.CENTER);
        hb7.setAlignment(Pos.CENTER);
        hb8.setAlignment(Pos.CENTER);
        hb9.setAlignment(Pos.CENTER);
        hb10.setAlignment(Pos.CENTER);
        hb11.setAlignment(Pos.CENTER);
        hb12.setAlignment(Pos.CENTER);
        hb13.setAlignment(Pos.CENTER);
        hb14.setAlignment(Pos.CENTER);
        hb15.setAlignment(Pos.CENTER);
        hb16.setAlignment(Pos.CENTER);
        hb17.setAlignment(Pos.CENTER);

        //This code is to put a border around the VBoxes to make user viability easier.
        String borderLayout = "-fx-border-color: black;\n" +
                "-fx-border-insets: 3;\n" +
                "-fx-border-width: 3;\n" +
                "-fx-border-style: solid inside;\n";
        hb6.setStyle(borderLayout);
        hb7.setStyle(borderLayout);
        hb8.setStyle(borderLayout);
        hb9.setStyle(borderLayout);
        hb10.setStyle(borderLayout);
        hb11.setStyle(borderLayout);
        hb12.setStyle(borderLayout);
        hb13.setStyle(borderLayout);
        hb14.setStyle(borderLayout);
        hb15.setStyle(borderLayout);

        //disables the visibility but NOT the functionality of the back button
        hb1.setOpacity(0);
        hb0.setOpacity(0);

        //Back Button and Cart Button are on their Own
        hb0.getChildren().addAll(MainMenu_btn);
        hb1.getChildren().addAll(Back_btn);
        hb2.getChildren().addAll(Cart_btn);

        //Pepsi Box
        hb18.getChildren().addAll(Large1_radio, Large1_Lbl);
        hb19.getChildren().addAll(Medium1_radio, Medium1_Lbl);
        hb20.getChildren().addAll(Small1_radio, Small1_Lbl);
        hb6.getChildren().addAll(vb1, new ImageView(Pepsi_pic));
        vb1.getChildren().addAll(Pepsi_Lbl, hb18, Large1_field, hb19, Medium1_field, hb20, Small1_field);
        vb2.getChildren().addAll(hb6, Pepsi_btn);

        //Diet Pepsi Box
        hb21.getChildren().addAll(Large2_radio, Large2_Lbl);
        hb22.getChildren().addAll(Medium2_radio, Medium2_Lbl);
        hb23.getChildren().addAll(Small2_radio, Small2_Lbl);
        hb7.getChildren().addAll(vb3, new ImageView(DietPepsi_pic));
        vb3.getChildren().addAll(DietPepsi_Lbl, hb21, Large2_field, hb22, Medium2_field, hb23, Small2_field);
        vb4.getChildren().addAll(hb7, DietPepsi_btn);

        //Sierra Mist Box
        hb24.getChildren().addAll(Large3_radio, Large3_Lbl);
        hb25.getChildren().addAll(Medium3_radio, Medium3_Lbl);
        hb26.getChildren().addAll(Small3_radio, Small3_Lbl);
        hb8.getChildren().addAll(vb5, new ImageView(SierraMist_pic));
        vb5.getChildren().addAll(SierraMist_Lbl, hb24, Large3_field, hb25, Medium3_field, hb26, Small3_field);
        vb6.getChildren().addAll(hb8, SierraMist_btn);

        //Diet Sierra Mist Box
        hb27.getChildren().addAll(Large4_radio, Large4_Lbl);
        hb28.getChildren().addAll(Medium4_radio, Medium4_Lbl);
        hb29.getChildren().addAll(Small4_radio, Small4_Lbl);
        hb9.getChildren().addAll(vb7, new ImageView(DietSierraMist_pic));
        vb7.getChildren().addAll(DietSierraMist_Lbl, hb27, Large4_field, hb28, Medium4_field, hb29, Small4_field);
        vb8.getChildren().addAll(hb9, DietSierraMist_btn);

        //Root Beer Box
        hb30.getChildren().addAll(Large5_radio, Large5_Lbl);
        hb31.getChildren().addAll(Medium5_radio, Medium5_Lbl);
        hb32.getChildren().addAll(Small5_radio, Small5_Lbl);
        hb10.getChildren().addAll(vb9, new ImageView(RootBeer_pic));
        vb9.getChildren().addAll(RootBeer_Lbl, hb30, Large5_field, hb31, Medium5_field, hb32, Small5_field);
        vb10.getChildren().addAll(hb10, RootBeer_btn);

        //Diet Root Beer Box
        hb33.getChildren().addAll(Large6_radio, Large6_Lbl);
        hb34.getChildren().addAll(Medium6_radio, Medium6_Lbl);
        hb35.getChildren().addAll(Small6_radio, Small6_Lbl);
        hb11.getChildren().addAll(vb11, new ImageView(DietRootBeer_pic));
        vb11.getChildren().addAll(DietRootBeer_Lbl, hb33, Large6_field, hb34, Medium6_field, hb35, Small6_field);
        vb12.getChildren().addAll(hb11, DietRootBeer_btn);

        //Orange Box
        hb36.getChildren().addAll(Large7_radio, Large7_Lbl);
        hb37.getChildren().addAll(Medium7_radio, Medium7_Lbl);
        hb38.getChildren().addAll(Small7_radio, Small7_Lbl);
        hb12.getChildren().addAll(vb13, new ImageView(Orange_pic));
        vb13.getChildren().addAll(Orange_Lbl, hb36, Large7_field, hb37, Medium7_field, hb38, Small7_field);
        vb14.getChildren().addAll(hb12, Orange_btn);

        //Diet Orange Box
        hb39.getChildren().addAll(Large8_radio, Large8_Lbl);
        hb40.getChildren().addAll(Medium8_radio, Medium8_Lbl);
        hb41.getChildren().addAll(Small8_radio, Small8_Lbl);
        hb13.getChildren().addAll(vb15, new ImageView(DietOrange_pic));
        vb15.getChildren().addAll(DietOrange_Lbl, hb39, Large8_field, hb40, Medium8_field, hb41, Small8_field);
        vb16.getChildren().addAll(hb13, DietOrange_btn);

        //Lemonade Box
        hb42.getChildren().addAll(Large9_radio, Large9_Lbl);
        hb43.getChildren().addAll(Medium9_radio, Medium9_Lbl);
        hb44.getChildren().addAll(Small9_radio, Small9_Lbl);
        hb14.getChildren().addAll(vb17, new ImageView(Lemonade_pic));
        vb17.getChildren().addAll(Lemonade_Lbl, hb42, Large9_field, hb43, Medium9_field, hb44, Small9_field);
        vb18.getChildren().addAll(hb14, Lemonade_btn);

        //Water Box
        hb3.getChildren().addAll(Large_radio, Large_Lbl);
        hb4.getChildren().addAll(Medium_radio, Medium_Lbl);
        hb5.getChildren().addAll(Small_radio, Small_Lbl);
        hb15.getChildren().addAll(vb19, new ImageView(Water_pic));
        vb19.getChildren().addAll(Water_Lbl, hb3, Large_field, hb4, Medium_field, hb5, Small_field);
        vb20.getChildren().addAll(hb15, Water_btn);

        //Lines up all the beverage boxes
        hb16.getChildren().addAll(vb2, vb4, vb6, vb8, vb10);
        hb17.getChildren().addAll(vb12, vb14, vb16, vb18, vb20);

        vb21.getChildren().addAll(new ImageView(Template), hb0, hb2, hb1, Drinks_Lbl, hb16, hb17);

        //Calling all other methods from this class
        Drinks_ButtonActions(window);
        FontsUsed();

        return vb21;
    }

    //This Method handles the button actions in the drinks menu
    private void Drinks_ButtonActions(Stage window){
        //Sets the sizes of the buttons
        Back_btn.setPrefSize(120,75);
        MainMenu_btn.setPrefSize(120,75);
        Cart_btn.setPrefSize(125,75);

        //Classes that can be navigated in the Drinks Menu
        MainMenu mm = new MainMenu();
        Cart cart = new Cart();
        SidesMenu sides = new SidesMenu();

        //Button Actions
        Back_btn.setOnAction(e -> window.getScene().setRoot(mm.BuildMainMenu(window)));
        MainMenu_btn.setOnAction(e -> window.getScene().setRoot(sides.BuildSides(window)));
        Cart_btn.setOnAction(e -> window.getScene().setRoot(cart.BuildCart(window)));
        Pepsi_btn.setOnAction(e -> {
            if(Large1_radio.isSelected()) {
                System.out.println("TEST1");
                Drinks large_pepsi = new Drinks("Pepsi", "Large");
                    for(int i = 0; i < (Integer.parseInt(Large1_field.getText())); i++) {
                        System.out.println("TEST2");
                        order.addDrink(large_pepsi);
                        System.out.println(order.toString());
                    }
            }
            if(Medium1_radio.isSelected()) {
                Drinks medium_pepsi = new Drinks("Pepsi", "Medium");
                for(int i = 0; i < (Integer.parseInt(Medium1_field.getText())); i++) {
                    order.addDrink(medium_pepsi);
                }
            }
            if(Small1_radio.isSelected()) {
                Drinks small_pepsi = new Drinks("Pepsi", "Small");
                for(int i = 0; i < (Integer.parseInt(Small1_field.getText())); i++) {
                    order.addDrink(small_pepsi);
                }
            }
        });
        DietPepsi_btn.setOnAction((e) -> {
            if(Large2_radio.isSelected()) {
                Drinks large_dietpepsi = new Drinks("Diet-Pepsi", "Large");
                for(int i = 0; i < (Integer.parseInt(Large2_field.getText())); i++) {
                    order.addDrink(large_dietpepsi);
                }
            }
            if(Medium2_radio.isSelected()) {
                Drinks medium_dietpepsi = new Drinks("Diet-Pepsi", "Medium");
                for(int i = 0; i < (Integer.parseInt(Medium2_field.getText())); i++) {
                    order.addDrink(medium_dietpepsi);
                }
            }
            if(Small2_radio.isSelected()) {
                Drinks small_dietpepsi = new Drinks("Diet-Pepsi", "Small");
                for(int i = 0; i < (Integer.parseInt(Small2_field.getText())); i++) {
                    order.addDrink(small_dietpepsi);
                }
            }
        });
        SierraMist_btn.setOnAction((event) -> {
            if(Large3_radio.isSelected()) {
                Drinks large_sierra = new Drinks("SierraMist", "Large");
                for(int i = 0; i < (Integer.parseInt(Large3_field.getText())); i++) {
                    order.addDrink(large_sierra);
                }
            }
            if(Medium3_radio.isSelected()) {
                Drinks medium_sierra = new Drinks("SierraMist", "Medium");
                for(int i = 0; i < (Integer.parseInt(Medium3_field.getText())); i++) {
                    order.addDrink(medium_sierra);
                }
            }
            if(Small3_radio.isSelected()) {
                Drinks small_sierra = new Drinks("SierraMist", "Small");
                for(int i = 0; i < (Integer.parseInt(Small3_field.getText())); i++) {
                    order.addDrink(small_sierra);
                }
            }
        });
        DietSierraMist_btn.setOnAction((event) -> {
            if(Large4_radio.isSelected()) {
                Drinks large_dietsierra = new Drinks("Diet-SierraMist", "Large");
                for(int i = 0; i < (Integer.parseInt(Large4_field.getText())); i++) {
                    order.addDrink(large_dietsierra);
                }
            }
            if(Medium4_radio.isSelected()) {
                Drinks medium_dietsierra = new Drinks("Diet-SierraMist", "Medium");
                for(int i = 0; i < (Integer.parseInt(Medium4_field.getText())); i++) {
                    order.addDrink(medium_dietsierra);
                }
            }
            if(Small4_radio.isSelected()) {
                Drinks small_dietsierra = new Drinks("Diet-SierraMist", "Small");
                for(int i = 0; i < (Integer.parseInt(Small4_field.getText())); i++) {
                    order.addDrink(small_dietsierra);
                }
            }
        });
        RootBeer_btn.setOnAction((event) -> {
            if(Large5_radio.isSelected()) {
                Drinks large_rootbeer = new Drinks("RootBeer", "Large");
                for(int i = 0; i < (Integer.parseInt(Large5_field.getText())); i++) {
                    order.addDrink(large_rootbeer);
                }
            }
            if(Medium5_radio.isSelected()) {
                Drinks medium_rootbeer = new Drinks("RootBeer", "Medium");
                for(int i = 0; i < (Integer.parseInt(Medium5_field.getText())); i++) {
                    order.addDrink(medium_rootbeer);
                }
            }
            if(Small5_radio.isSelected()) {
                Drinks small_rootbeer = new Drinks("RootBeer", "Small");
                for(int i = 0; i < (Integer.parseInt(Small5_field.getText())); i++) {
                    order.addDrink(small_rootbeer);
                }
            }
        });
        DietRootBeer_btn.setOnAction((event) -> {
            if(Large6_radio.isSelected()) {
                Drinks large_dietrootbeer = new Drinks("Diet-RootBeer", "Large");
                for(int i = 0; i < (Integer.parseInt(Large6_field.getText())); i++) {
                    order.addDrink(large_dietrootbeer);
                }
            }
            if(Medium6_radio.isSelected()) {
                Drinks medium_dietrootbeer = new Drinks("Diet-RootBeer", "Medium");
                for(int i = 0; i < (Integer.parseInt(Medium6_field.getText())); i++) {
                    order.addDrink(medium_dietrootbeer);
                }
            }
            if(Small6_radio.isSelected()) {
                Drinks small_dietrootbeer = new Drinks("Diet-RootBeer", "Small");
                for(int i = 0; i < (Integer.parseInt(Small6_field.getText())); i++) {
                    order.addDrink(small_dietrootbeer);
                }
            }
        });
        Orange_btn.setOnAction((event) -> {
            if(Large7_radio.isSelected()) {
                Drinks large_orange = new Drinks("Orange", "Large");
                for(int i = 0; i < (Integer.parseInt(Large7_field.getText())); i++) {
                    order.addDrink(large_orange);
                }
            }
            if(Medium7_radio.isSelected()) {
                Drinks medium_orange = new Drinks("Orange", "Medium");
                for(int i = 0; i < (Integer.parseInt(Medium7_field.getText())); i++) {
                    order.addDrink(medium_orange);
                }
            }
            if(Small7_radio.isSelected()) {
                Drinks small_orange = new Drinks("Orange", "Small");
                for(int i = 0; i < (Integer.parseInt(Small7_field.getText())); i++) {
                    order.addDrink(small_orange);
                }
            }
        });
        DietOrange_btn.setOnAction((event) -> {
            if(Large8_radio.isSelected()) {
                Drinks large_dietorange = new Drinks("Diet-Orange", "Large");
                for(int i = 0; i < (Integer.parseInt(Large8_field.getText())); i++) {
                    order.addDrink(large_dietorange);
                }
            }
            if(Medium8_radio.isSelected()) {
                Drinks medium_dietorange = new Drinks("Diet-Orange", "Medium");
                for(int i = 0; i < (Integer.parseInt(Medium8_field.getText())); i++) {
                    order.addDrink(medium_dietorange);
                }
            }
            if(Small8_radio.isSelected()) {
                Drinks small_dietorange = new Drinks("Diet-Orange", "Small");
                for(int i = 0; i < (Integer.parseInt(Small8_field.getText())); i++) {
                    order.addDrink(small_dietorange);
                }
            }
        });
        Lemonade_btn.setOnAction((event) -> {
            if(Large9_radio.isSelected()) {
                Drinks large_lemonade = new Drinks("Lemonade", "Large");
                for(int i = 0; i < (Integer.parseInt(Large9_field.getText())); i++) {
                    order.addDrink(large_lemonade);
                }
            }
            if(Medium9_radio.isSelected()) {
                Drinks medium_lemonade = new Drinks("Lemonade", "Medium");
                for(int i = 0; i < (Integer.parseInt(Medium9_field.getText())); i++) {
                    order.addDrink(medium_lemonade);
                }
            }
            if(Small9_radio.isSelected()) {
                Drinks small_lemonade = new Drinks("Lemonade", "Small");
                for(int i = 0; i < (Integer.parseInt(Small9_field.getText())); i++) {
                    order.addDrink(small_lemonade);
                }
            }
        });
        Water_btn.setOnAction((event) -> {
            if(Large_radio.isSelected()) {
                Drinks large_water = new Drinks("Water", "Large");
                for(int i = 0; i < (Integer.parseInt(Large_field.getText())); i++) {
                    order.addDrink(large_water);
                }
            }
            if(Medium_radio.isSelected()) {
                Drinks medium_water = new Drinks("Water", "Medium");
                for(int i = 0; i < (Integer.parseInt(Medium_field.getText())); i++) {
                    order.addDrink(medium_water);
                }
            }
            if(Small_radio.isSelected()) {
                Drinks small_water = new Drinks("Water", "Small");
                for(int i = 0; i < (Integer.parseInt(Small_field.getText())); i++) {
                    order.addDrink(small_water);
                }
            }
        });
    }

    //This method handles the fonts in the drinks menu
    private void FontsUsed(){
        //Sets font for the Labels
        Drinks_Lbl.setFont(Font.font("Calibri", FontWeight.SEMI_BOLD,48));
        Pepsi_Lbl.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        DietPepsi_Lbl.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        SierraMist_Lbl.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        DietSierraMist_Lbl.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        RootBeer_Lbl.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        DietRootBeer_Lbl.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        Orange_Lbl.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        DietOrange_Lbl.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        Lemonade_Lbl.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        Water_Lbl.setFont(Font.font("Calibri", FontWeight.BOLD,18));

        Large_Lbl.setFont(Font.font("Calibri", FontWeight.BOLD,12));
        Medium_Lbl.setFont(Font.font("Calibri", FontWeight.BOLD,12));
        Small_Lbl.setFont(Font.font("Calibri", FontWeight.BOLD,12));
        Large1_Lbl.setFont(Font.font("Calibri", FontWeight.BOLD,12));
        Medium1_Lbl.setFont(Font.font("Calibri", FontWeight.BOLD,12));
        Small1_Lbl.setFont(Font.font("Calibri", FontWeight.BOLD,12));
        Large2_Lbl.setFont(Font.font("Calibri", FontWeight.BOLD,12));
        Medium2_Lbl.setFont(Font.font("Calibri", FontWeight.BOLD,12));
        Small2_Lbl.setFont(Font.font("Calibri", FontWeight.BOLD,12));
        Large3_Lbl.setFont(Font.font("Calibri", FontWeight.BOLD,12));
        Medium3_Lbl.setFont(Font.font("Calibri", FontWeight.BOLD,12));
        Small3_Lbl.setFont(Font.font("Calibri", FontWeight.BOLD,12));
        Large4_Lbl.setFont(Font.font("Calibri", FontWeight.BOLD,12));
        Medium4_Lbl.setFont(Font.font("Calibri", FontWeight.BOLD,12));
        Small4_Lbl.setFont(Font.font("Calibri", FontWeight.BOLD,12));
        Large5_Lbl.setFont(Font.font("Calibri", FontWeight.BOLD,12));
        Medium5_Lbl.setFont(Font.font("Calibri", FontWeight.BOLD,12));
        Small5_Lbl.setFont(Font.font("Calibri", FontWeight.BOLD,12));
        Large6_Lbl.setFont(Font.font("Calibri", FontWeight.BOLD,12));
        Medium6_Lbl.setFont(Font.font("Calibri", FontWeight.BOLD,12));
        Small6_Lbl.setFont(Font.font("Calibri", FontWeight.BOLD,12));
        Large7_Lbl.setFont(Font.font("Calibri", FontWeight.BOLD,12));
        Medium7_Lbl.setFont(Font.font("Calibri", FontWeight.BOLD,12));
        Small7_Lbl.setFont(Font.font("Calibri", FontWeight.BOLD,12));
        Large8_Lbl.setFont(Font.font("Calibri", FontWeight.BOLD,12));
        Medium_Lbl.setFont(Font.font("Calibri", FontWeight.BOLD,12));
        Small8_Lbl.setFont(Font.font("Calibri", FontWeight.BOLD,12));
        Large9_Lbl.setFont(Font.font("Calibri", FontWeight.BOLD,12));
        Medium9_Lbl.setFont(Font.font("Calibri", FontWeight.BOLD,12));
        Small9_Lbl.setFont(Font.font("Calibri", FontWeight.BOLD,12));

        //Sets Fonts for the Buttons
        Back_btn.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        Cart_btn.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        Pepsi_btn.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        DietPepsi_btn.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        SierraMist_btn.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        DietSierraMist_btn.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        RootBeer_btn.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        DietRootBeer_btn.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        Orange_btn.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        DietOrange_btn.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        Lemonade_btn.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        Water_btn.setFont(Font.font("Calibri", FontWeight.BOLD,18));

        //Sets the fonts for the TextFields
        Large_field.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        Medium_field.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        Small_field.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        Large1_field.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        Medium1_field.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        Small1_field.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        Large2_field.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        Medium2_field.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        Small2_field.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        Large3_field.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        Medium3_field.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        Small3_field.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        Large4_field.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        Medium4_field.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        Small4_field.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        Large5_field.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        Medium5_field.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        Small5_field.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        Large6_field.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        Medium6_field.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        Small6_field.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        Large7_field.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        Medium7_field.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        Small7_field.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        Large8_field.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        Medium8_field.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        Small8_field.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        Large9_field.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        Medium9_field.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        Small9_field.setFont(Font.font("Calibri", FontWeight.BOLD,18));

        //Sets the sizes o the text fields
        Large_field.setPrefSize(10,10);
        Medium_field.setPrefSize(10,10);
        Small_field.setPrefSize(10,10);
        Large1_field.setPrefSize(10,10);
        Medium1_field.setPrefSize(10,10);
        Small1_field.setPrefSize(10,10);
        Large2_field.setPrefSize(10,10);
        Medium2_field.setPrefSize(10,10);
        Small2_field.setPrefSize(10,10);
        Large3_field.setPrefSize(10,10);
        Medium3_field.setPrefSize(10,10);
        Small3_field.setPrefSize(10,10);
        Large4_field.setPrefSize(10,10);
        Medium4_field.setPrefSize(10,10);
        Small4_field.setPrefSize(10,10);
        Large5_field.setPrefSize(10,10);
        Medium5_field.setPrefSize(10,10);
        Small5_field.setPrefSize(10,10);
        Large6_field.setPrefSize(10,10);
        Medium6_field.setPrefSize(10,10);
        Small6_field.setPrefSize(10,10);
        Large7_field.setPrefSize(10,10);
        Medium7_field.setPrefSize(10,10);
        Small7_field.setPrefSize(10,10);
        Large8_field.setPrefSize(10,10);
        Medium8_field.setPrefSize(10,10);
        Small8_field.setPrefSize(10,10);
        Large9_field.setPrefSize(10,10);
        Medium9_field.setPrefSize(10,10);
        Small9_field.setPrefSize(10,10);
    }
}
