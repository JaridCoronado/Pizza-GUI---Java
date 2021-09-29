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
import sample.Order;
import sample.Pizza;

public class PizzaCreation_Crust {
    Order order = Main.getOrder();
    Pizza pizza = Main.getPizza();

    //Buttons for Pizza Creation Menus initiated.
    private Button MainMenu = new Button("Main Menu");
    private Button Cart_btn = new Button("Go To Cart");
    private Button Back_btn = new Button("Back to Main Menu");
    private Button Crust_btn = new Button("Crust");
    private Button Cheese_btn = new Button("Cheese");
    private Button Meats_btn = new Button("Meats");
    private Button Veggies_btn = new Button ("Veggies");
    private Button Next_btn = new Button("Next");
    private Button AddToCart_btn = new Button ("Add Pizza To Cart");

    //Labels used in this menu
    private Label CartInfo_Lbl = new Label ("Cart");
    private Label PriceInfo_Lbl= new Label("Price Info");
    private Label CrustTitle_Lbl = new Label("Crust");
    private Label Size_Lbl = new Label("Size");
    private Label Small_Lbl = new Label("Small");
    private Label Medium_Lbl = new Label("Medium");
    private Label Large_Lbl = new Label("Large");
    private Label ExtraLarge_Lbl = new Label ("Extra Large");
    private Label Style_Lbl = new Label("Style");
    private Label Regular_Lbl = new Label("Regular");
    private Label Pan_Lbl = new Label("Pan");
    private Label DeepDish_Lbl = new Label("Deep Dish");


    //Radio Buttons used for the crust menu
    private RadioButton Small_radio = new RadioButton();
    private RadioButton Medium_radio = new RadioButton();
    private RadioButton Large_radio = new RadioButton();
    private RadioButton ExtraLarge_radio = new RadioButton();
    private RadioButton Regular_radio = new RadioButton();
    private RadioButton Pan_radio= new RadioButton();
    private RadioButton DeepDish_radio = new RadioButton();

    //Constants in every scene
    private Image Template= new Image("GUI/images/PizzaProject Info Template_Back.png");
    private Image Crust_pic = new Image("GUI/images/Crust1.jpg");

    //This method is where the look and feel of the crust menu derives
    public VBox BuildCrust(Stage window){
        //VBoxes and HBoxes are initiated.
        VBox vb1 = new VBox(20);
        VBox vb2 = new VBox(20);
        VBox vb3 = new VBox(20);
        VBox vb4 = new VBox(20);
        VBox vb5 = new VBox(20);
        VBox vb6 = new VBox(1);

        HBox hb0 = new HBox(100);
        HBox hb1 = new HBox(100);
        HBox hb2 = new HBox(150);
        HBox hb3 = new HBox(133);
        HBox hb4 = new HBox(149);
        HBox hb5 = new HBox(120);
        HBox hb6 = new HBox(140);
        HBox hb7 = new HBox(160);
        HBox hb8 = new HBox(125);
        HBox hb9 = new HBox(200);
        HBox hb10 = new HBox(20);
        HBox hb11 = new HBox(20);
        HBox hb12 = new HBox(20);
        HBox hb13 = new HBox(100);
        HBox hb14 = new HBox(100);

        //Padding for the VBoxes
        vb1.setPadding(new Insets(0,200,-15,0));
        vb2.setPadding(new Insets(10,35,10,35));
        vb3.setPadding(new Insets(0,200,-15,0));
        vb4.setPadding(new Insets(10,35,10,35));
        vb6.setPadding(new Insets(7,0,0,0));

        //Alignment for the VBoxes
        vb1.setAlignment(Pos.CENTER);
        vb2.setAlignment(Pos.CENTER);
        vb3.setAlignment(Pos.CENTER);
        vb4.setAlignment(Pos.CENTER);
        vb5.setAlignment(Pos.CENTER);
        vb6.setAlignment(Pos.CENTER);

        //Padding for the HBoxes
        hb14.setPadding(new Insets(-135,0,0,0));//cart info label
        hb13.setPadding(new Insets(-77,0, 0, 0));
        hb0.setPadding(new Insets(-135,0, 0, 0));
        hb1.setPadding(new Insets(-77,0, 0, 0));
        hb3.setPadding(new Insets(0,0, 0, -3));
        hb4.setPadding(new Insets(0,-3, 0, 0));
        hb5.setPadding(new Insets(0,0, 0, -9));
        hb6.setPadding(new Insets(0,0, 0, -6));
        hb7.setPadding(new Insets(0,-3, 0, 0));
        hb8.setPadding(new Insets(0,0, 0, -8));
        hb9.setPadding(new Insets(30,0, 10, 0));
        hb10.setPadding(new Insets(0,10,0,10));

        //Alignment for the HBoxes
        hb14.setAlignment(Pos.CENTER_RIGHT);
        hb0.setAlignment(Pos.CENTER_RIGHT);
        hb13.setAlignment(Pos.CENTER_LEFT);
        hb1.setAlignment(Pos.CENTER_LEFT);
        hb2.setAlignment(Pos.CENTER);
        hb3.setAlignment(Pos.CENTER);
        hb4.setAlignment(Pos.CENTER);
        hb5.setAlignment(Pos.CENTER);
        hb6.setAlignment(Pos.CENTER);
        hb7.setAlignment(Pos.CENTER);
        hb8.setAlignment(Pos.CENTER);
        hb9.setAlignment(Pos.BOTTOM_CENTER);
        hb10.setAlignment(Pos.CENTER);
        hb11.setAlignment(Pos.CENTER);
        hb12.setAlignment(Pos.CENTER);

        //disables the visibility but NOT the functionality of the back button
        hb1.setOpacity(0);
        hb0.setOpacity(100);
        hb13.setOpacity(0);

        //This code is to put a border around the VBoxes to make user viability easier.
        String borderLayout = "-fx-border-color: black;\n" +
                "-fx-border-insets: 3;\n" +
                "-fx-border-width: 3;\n" +
                "-fx-border-style: solid inside;\n";
        vb2.setStyle(borderLayout);
        vb4.setStyle(borderLayout);
        hb10.setStyle(borderLayout);
        hb14.setStyle(borderLayout);

        //Sets the all components onto the scene
        hb13.getChildren().addAll(MainMenu);

        hb14.getChildren().addAll(CartInfo_Lbl);
        hb0.getChildren().addAll(Cart_btn);

        hb1.getChildren().addAll(Back_btn);
        hb2.getChildren().addAll(Small_Lbl, Small_radio);
        hb3.getChildren().addAll(Medium_Lbl, Medium_radio);
        hb4.getChildren().addAll(Large_Lbl, Large_radio);
        hb5.getChildren().addAll(ExtraLarge_Lbl, ExtraLarge_radio);
        hb6.getChildren().addAll(Regular_Lbl, Regular_radio);
        hb7.getChildren().addAll(Pan_Lbl, Pan_radio);
        hb8.getChildren().addAll(DeepDish_Lbl, DeepDish_radio);
        hb9.getChildren().addAll(Crust_btn, Cheese_btn, Meats_btn, Veggies_btn, Next_btn);
        hb10.getChildren().addAll(PriceInfo_Lbl);
        hb11.getChildren().addAll(vb5, hb10);
        hb12.getChildren().addAll(new ImageView(Crust_pic), CrustTitle_Lbl);

        vb1.getChildren().addAll(Size_Lbl);
        vb2.getChildren().addAll(hb2, hb3, hb4, hb5);
        vb3.getChildren().addAll(Style_Lbl);
        vb4.getChildren().addAll(hb6, hb7, hb8);
        vb5.getChildren().addAll(vb1, vb2, vb3, vb4);
        vb6.getChildren().addAll(new ImageView(Template), hb13, hb14, hb0, hb1, hb12, hb11, AddToCart_btn, hb9);

        //Calls other methods in this class
        FontsUsed();
        Crust_ButtonActions(window);
        Crust_RadioButtons();

        return vb6;
    }

    //This method is for handling the radio Buttons for the crust menu
    private void Crust_RadioButtons(){

        //handles the toggle for the pizza crust sizes
        final ToggleGroup group1 = new ToggleGroup();
        Small_radio.setToggleGroup(group1);
        Medium_radio.setToggleGroup(group1);
        Large_radio.setToggleGroup(group1);
        ExtraLarge_radio.setToggleGroup(group1);

        //Handles the toggle for the pizza styles
        final ToggleGroup group2 = new ToggleGroup();
        Pan_radio.setToggleGroup(group2);
        Regular_radio.setToggleGroup(group2);
        DeepDish_radio.setToggleGroup(group2);
    }

    //This method is the handle the buttons for the crust menu
    private void Crust_ButtonActions(Stage window){

        /*disables the button since the user will already be on this page. No need to navigate
          to a page they are already on or an accidental refresh.*/
        Crust_btn.setDisable(true);

        //Sets the size of the buttons to match the template
        Back_btn.setPrefSize(125,75);
        MainMenu.setPrefSize(125,75);
        Cart_btn.setPrefSize(125,75);
        Crust_btn.setPrefSize(100,35);
        Cheese_btn.setPrefSize(100,35);
        Meats_btn.setPrefSize(100,35);
        Veggies_btn.setPrefSize(100,35);
        Next_btn.setPrefSize(100,50);
        AddToCart_btn.setPrefSize(200,50);

        //Classes for scene navigation
        MainMenu mm = new MainMenu();
        Cart cart = new Cart();
        PizzaCreation_Crust pizzaCreation_crust = new PizzaCreation_Crust();
        PizzaCreation_Cheese pizzaCreation_cheese = new PizzaCreation_Cheese();
        PizzaCreation_Meats pizzaCreation_meats = new PizzaCreation_Meats();
        PizzaCreation_Veggies pizzaCreation_veggies = new PizzaCreation_Veggies();

        //Button Actions
        Back_btn.setOnAction(e -> {
            detSize();
            detType();
            window.getScene().setRoot(mm.BuildMainMenu(window));
        });
        MainMenu.setOnAction(e -> {
            detSize();
            detType();
            window.getScene().setRoot(mm.BuildMainMenu(window));
        });
        Cart_btn.setOnAction(e -> {
            detSize();
            detType();
            window.getScene().setRoot(cart.BuildCart(window));
        });
        Crust_btn.setOnAction(e -> {
            detSize();
            detType();
            window.getScene().setRoot(pizzaCreation_crust.BuildCrust(window));
        });
        Cheese_btn.setOnAction(e -> {
            detSize();
            detType();
            window.getScene().setRoot(pizzaCreation_cheese.BuildCheese(window));
        });
        Meats_btn.setOnAction(e -> {
            detSize();
            detType();
            window.getScene().setRoot(pizzaCreation_meats.BuildMeats(window));
        });
        Veggies_btn.setOnAction(e -> {
            detSize();
            detType();
            window.getScene().setRoot(pizzaCreation_veggies.BuildVeggies(window));
        });
        Next_btn.setOnAction(e -> {
            detSize();
            detType();
            window.getScene().setRoot(pizzaCreation_cheese.BuildCheese(window));
        });
        AddToCart_btn.setOnAction(e -> {
            if(pizza.complete())
            {
                pizza.finishPizza();
                order.addPizza(pizza);
                Main.resetPizza();
            }
        });

    }
    private void FontsUsed(){
        //Sets fonts for the labels.
        CrustTitle_Lbl.setFont(Font.font("Calibri", FontWeight.SEMI_BOLD,48));
        PriceInfo_Lbl.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        Size_Lbl.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        Style_Lbl.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        Small_Lbl.setFont(Font.font("Calibri", FontWeight.SEMI_BOLD,18));
        Medium_Lbl.setFont(Font.font("Calibri", FontWeight.SEMI_BOLD,18));
        Large_Lbl.setFont(Font.font("Calibri", FontWeight.SEMI_BOLD,18));
        ExtraLarge_Lbl.setFont(Font.font("Calibri", FontWeight.SEMI_BOLD,18));
        Regular_Lbl.setFont(Font.font("Calibri", FontWeight.SEMI_BOLD,18));
        Pan_Lbl.setFont(Font.font("Calibri", FontWeight.SEMI_BOLD,18));
        DeepDish_Lbl.setFont(Font.font("Calibri", FontWeight.SEMI_BOLD,18));

        //Sets Fonts for all the Buttons
        Back_btn.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        Cart_btn.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        Crust_btn.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        Cheese_btn.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        Meats_btn.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        Veggies_btn.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        Next_btn.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        AddToCart_btn.setFont(Font.font("Calibri", FontWeight.BOLD,18));
    }

    //determines size of pizza
    private void detSize()
    {
        if(Small_radio.isSelected())
        {
            pizza.chooseSize("small");
        }
        else if(Medium_radio.isSelected())
        {
            pizza.chooseSize("medium");
        }
        else if(Large_radio.isSelected()) {
            pizza.chooseSize("large");
        }
        else if(ExtraLarge_radio.isSelected())
        {
            pizza.chooseSize("extraLarge");
        }
    }

    //determines type of pizza
    private void detType()
    {
        //Crust type
        if(Regular_radio.isSelected())
        {
            pizza.chooseType("regular");
        }
        else if(Pan_radio.isSelected())
        {
            pizza.chooseType("pan");
        }
        else if(DeepDish_radio.isSelected())
        {
            pizza.chooseType("deepDish");
        }
    }

}