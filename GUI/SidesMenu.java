package GUI;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.scene.text.Font;
import sample.BreadBites;
import sample.BreadSticks;
import sample.Cookie;
import sample.Order;

public class SidesMenu {

    Order order = Main.getOrder();

    //Buttons used for the sides Menu
    private Button MainMenu_btn = new Button("Main Menu");
    private Button Back_btn = new Button("Back");
    private Button Cart_btn = new Button("Go To Cart");
    private Button Breadsticks_btn = new Button("Add");
    private Button BreadBites_btn = new Button("Add");
    private Button Cookie_btn = new Button("Add");

    //Labels used in the Side Menu
    private Label Sides_Lbl = new Label("Sides");
    private Label Breadsticks_Lbl = new Label("8-Inch Bread Sticks");
    private Label BreadBites_Lbl = new Label("Bread Bites");
    private Label Cookie_Lbl = new Label("Oversized Chocolate\nChip Cookie");
    private Label Garlic1_Lbl = new Label("Garlic");
    private Label Garlic2_Lbl = new Label("Garlic");
    private Label Butter1_Lbl = new Label("Butter");
    private Label Butter2_Lbl = new Label("Butter");
    private Label BreadstickPrice_Lbl = new Label("$2.00");
    private Label BreadBitePrice_Lbl = new Label("$2.00");
    private Label CookiePrice_Lbl = new Label("$4.00");

    //Radio Buttons for the Sides Menu
    private RadioButton Garlic1_radio = new RadioButton();
    private RadioButton Garlic2_radio = new RadioButton();
    private RadioButton Butter1_radio = new RadioButton();
    private RadioButton Butter2_radio = new RadioButton();

    //Images used for the Sides menu
    private Image Template = new Image("GUI/images/PizzaProject Info Template_Back.png");
    private Image Breadsticks_pic = new Image("GUI/images/breadsticks1.jpg");
    private Image BreadBites_pic = new Image("GUI/images/bread bites1.jpg");
    private Image Cookie_pic = new Image("GUI/images/cookie1.jpg");

    public VBox BuildSides(Stage window){
        //VBoxes used for this method
        VBox vb1 = new VBox(5);
        VBox vb2 = new VBox(5);
        VBox vb3 = new VBox(5);
        VBox vb4 = new VBox(10);

        //HBoxes used for this method
        HBox hb0 = new HBox(20);
        HBox hb1 = new HBox(20);
        HBox hb2 = new HBox(20);
        HBox hb3 = new HBox(20);
        HBox hb4 = new HBox(20);
        HBox hb5 = new HBox(20);
        HBox hb6 = new HBox(20);
        HBox hb7 = new HBox(20);
        HBox hb8 = new HBox(20);
        HBox hb9 = new HBox(20);
        HBox hb10 = new HBox(50);

        //VBox Padding
        vb4.setPadding(new Insets(-243,0,0,0));

        //VBox alignment
        vb1.setAlignment(Pos.CENTER_LEFT);
        vb2.setAlignment(Pos.CENTER_LEFT);
        vb3.setAlignment(Pos.CENTER_LEFT);
        vb4.setAlignment(Pos.CENTER);

        //HBox padding
        hb1.setPadding(new Insets(-420,0,0,0));
        hb2.setPadding(new Insets(-450,0,0,0));
        hb4.setPadding(new Insets(0,0,0,2));
        hb6.setPadding(new Insets(0,0,0,2));
        hb7.setPadding(new Insets(10,10,10,10));
        hb8.setPadding(new Insets(10,10,10,10));
        hb9.setPadding(new Insets(10,10,10,10));

        //HBox alignment
        hb0.setAlignment(Pos.CENTER_LEFT);
        hb1.setAlignment(Pos.CENTER_LEFT);
        hb2.setAlignment(Pos.CENTER_RIGHT);
        hb3.setAlignment(Pos.CENTER);
        hb4.setAlignment(Pos.CENTER);
        hb5.setAlignment(Pos.CENTER);
        hb6.setAlignment(Pos.CENTER);
        hb7.setAlignment(Pos.CENTER);
        hb8.setAlignment(Pos.CENTER);
        hb9.setAlignment(Pos.CENTER);
        hb10.setAlignment(Pos.CENTER);

        //This code is to put a border around the VBoxes to make user viability easier.
        String borderLayout = "-fx-border-color: black;\n" +
                "-fx-border-insets: 3;\n" +
                "-fx-border-width: 3;\n" +
                "-fx-border-style: solid inside;\n";
        hb7.setStyle(borderLayout);
        hb8.setStyle(borderLayout);
        hb9.setStyle(borderLayout);

        //disables the visibility but NOT the functionality of the back button
        hb1.setOpacity(0);
        hb0.setOpacity(0);

        //Set for the Buttons
        hb0.getChildren().addAll(MainMenu_btn);
        hb1.getChildren().addAll(Back_btn);
        hb2.getChildren().addAll(Cart_btn);

        //for the garlic and butter radio buttons
        hb3.getChildren().addAll(Garlic1_radio, Garlic1_Lbl);
        hb4.getChildren().addAll(Butter1_radio, Butter1_Lbl);
        hb5.getChildren().addAll(Garlic2_radio, Garlic2_Lbl);
        hb6.getChildren().addAll(Butter2_radio, Butter2_Lbl);

        //Breadsticks box
        hb7.getChildren().addAll(vb1, new ImageView(Breadsticks_pic));
        vb1.getChildren().addAll(Breadsticks_Lbl, BreadstickPrice_Lbl, hb3, hb4, Breadsticks_btn);

        //Bread Bites box
        hb8.getChildren().addAll(vb2, new ImageView(BreadBites_pic));
        vb2.getChildren().addAll(BreadBites_Lbl, BreadBitePrice_Lbl, hb5, hb6, BreadBites_btn);

        //Cookie Box
        hb9.getChildren().addAll(vb3, new ImageView(Cookie_pic));
        vb3.getChildren().addAll(Cookie_Lbl, CookiePrice_Lbl, Cookie_btn);

        hb10.getChildren().addAll(hb7, hb8, hb9);
        vb4.getChildren().addAll(new ImageView(Template), Sides_Lbl, hb0, hb2, hb1, hb10);

        Sides_ButtonActions(window);
        FontsUsed();

        return vb4;
    }

    private void Sides_ButtonActions(Stage window){
        //Sets the sizes of the buttons
        Back_btn.setPrefSize(120,75);
        MainMenu_btn.setPrefSize(120,75);
        Cart_btn.setPrefSize(125,75);

        //Classes used for navigation
        MainMenu mm = new MainMenu();
        Cart cart = new Cart();
        DrinksMenu drinks = new DrinksMenu();

        //Button Actions
        Back_btn.setOnAction(e -> window.getScene().setRoot(mm.BuildMainMenu(window)));
        MainMenu_btn.setOnAction(e -> window.getScene().setRoot(drinks.BuildDrinks(window)));
        Cart_btn.setOnAction(e-> window.getScene().setRoot(cart.BuildCart(window)));


        //Adding sides to order
        Breadsticks_btn.setOnAction(e-> {
            //for (Type curInstance: CollectionOf<Type>)
            //loop through order to find Sides
            if(Garlic1_radio.isSelected() && !Butter1_radio.isSelected())
            {
                //garlic no butter
                order.addSide(new BreadSticks(true, false));
            }
            else if(!Garlic1_radio.isSelected() && Butter1_radio.isSelected())
            {
                //butter no garlic
                order.addSide(new BreadSticks(false, true));
            }
            else if(Garlic1_radio.isSelected() && Butter1_radio.isSelected())
            {
                //butter and garlic
                order.addSide(new BreadSticks(true, true));
            }
            else
            {
                order.addSide(new BreadSticks(false, false));
            }
            //neither
        });
        BreadBites_btn.setOnAction(e->{
            if(Garlic2_radio.isSelected() && !Butter2_radio.isSelected())
            {
                //garlic no butter
                order.addSide(new BreadBites(true, false));
            }
            else if(!Garlic2_radio.isSelected() && Butter2_radio.isSelected())
            {
                //butter no garlic
                order.addSide(new BreadBites(false, true));
            }
            else if(Garlic2_radio.isSelected() && Butter2_radio.isSelected())
            {
                //butter and garlic
                order.addSide(new BreadBites(true, true));
            }
            else
            {
                order.addSide(new BreadBites(false, false));
            }
            //neither
        });
        Cookie_btn.setOnAction(e->{
            //add to order
            order.addSide(new Cookie());
        });

    }

    private void FontsUsed(){
        //Sets the fonts for the Labels
        Sides_Lbl.setFont(Font.font("Calibri", FontWeight.SEMI_BOLD,48));
        Breadsticks_Lbl.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        BreadBites_Lbl.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        Cookie_Lbl.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        Garlic1_Lbl.setFont(Font.font("Calibri", FontWeight.BOLD,12));
        Garlic2_Lbl.setFont(Font.font("Calibri", FontWeight.BOLD,12));
        Butter1_Lbl.setFont(Font.font("Calibri", FontWeight.BOLD,12));
        Butter2_Lbl.setFont(Font.font("Calibri", FontWeight.BOLD,12));
        BreadstickPrice_Lbl.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        BreadBitePrice_Lbl.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        CookiePrice_Lbl.setFont(Font.font("Calibri", FontWeight.BOLD,18));

        //Sets Fonts for the Buttons
        Back_btn.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        Cart_btn.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        Breadsticks_btn.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        BreadBites_btn.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        Cookie_btn.setFont(Font.font("Calibri", FontWeight.BOLD,18));
    }
}