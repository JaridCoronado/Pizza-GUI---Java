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

public class PizzaCreation_Cheese {

    Order order = Main.getOrder();
    Pizza pizza = Main.getPizza();

    //Buttons for Pizza Creation Menus initiated.
    private Button MainMenu = new Button("Main Menu");
    private Button Back_btn = new Button("Back to Crusts");
    private Button Cart_btn = new Button("Go To Cart");
    private Button Crust_btn = new Button("Crust");
    private Button Cheese_btn = new Button("Cheese");
    private Button Meats_btn = new Button("Meats");
    private Button Veggies_btn = new Button ("Veggies");
    private Button Next_btn = new Button("Next");
    private Button AddToCart_btn = new Button ("Add Pizza To Cart");

    //Labels used in this menu
    private Label CartInfo_Lbl = new Label ("Cart");
    private Label PriceInfo_Lbl = new Label("Price Information");
    private Label CheeseAndSauce_Lbl = new Label("Cheese And Sauce");
    private Label CheeseOptions_Lbl = new Label ("Cheese Options");
    private Label NoCheese_Lbl = new Label("No Cheese");
    private Label RegCheese_Lbl = new Label("Regular Cheese");
    private Label ExtraCheese_Lbl = new Label ("Extra Cheese");
    private Label SauceOptions_Lbl = new Label("Sauce Options");
    private Label NoSauce_Lbl = new Label("No Sauce");
    private Label RegSauce_Lbl = new Label("Regular Sauce");
    private Label ExtraSauce_Lbl = new Label("Extra Sauce");

    //Radio Buttons used for this menu
    //For No Cheese
    private RadioButton NoCheeseLeft_radio = new RadioButton();
    private RadioButton NoCheeseRight_radio = new RadioButton();
    private RadioButton NoCheeseWhole_radio = new RadioButton();

    //For Regular Cheese
    private RadioButton RegCheeseLeft_radio = new RadioButton();
    private RadioButton RegCheeseRight_radio = new RadioButton();
    private RadioButton RegCheeseWhole_radio = new RadioButton();

    //For Extra Cheese
    private RadioButton ExtraCheeseLeft_radio = new RadioButton();
    private RadioButton ExtraCheeseRight_radio = new RadioButton();
    private RadioButton ExtraCheeseWhole_radio = new RadioButton();

    //For No Sauce
    private RadioButton NoSauceLeft_radio = new RadioButton();
    private RadioButton NoSauceRight_radio = new RadioButton();
    private RadioButton NoSauceWhole_radio = new RadioButton();

    //For Regular Sauce
    private RadioButton RegSauceLeft_radio = new RadioButton();
    private RadioButton RegSauceRight_radio = new RadioButton();
    private RadioButton RegSauceWhole_radio = new RadioButton();

    //For Extra Sauce
    private RadioButton ExtraSauceLeft_radio = new RadioButton();
    private RadioButton ExtraSauceRight_radio = new RadioButton();
    private RadioButton ExtraSauceWhole_radio = new RadioButton();

    //Images for cheese Menu
    private Image Template = new Image("GUI/images/PizzaProject Info Template_Back.png");
    private Image Cheese_pic = new Image("GUI/images/Cheese3.png");
    private Image WholePizza_pic = new Image("GUI/images/Whole.jpg");
    private Image LeftHalf_pic = new Image("GUI/images/LeftHalf.jpg");
    private Image RightHalf_pic = new Image("GUI/images/RightHalf.jpg");

    //This method is where the look and feel of the cheese menu derives
    public VBox BuildCheese(Stage window){

        VBox vb1 = new VBox(20);
        VBox vb2 = new VBox(20);
        VBox vb3 = new VBox(20);
        VBox vb4 = new VBox(20);
        VBox vb5 = new VBox(20);
        VBox vb6 = new VBox(1);

        HBox hb0 = new HBox(100);
        HBox hb1 = new HBox(100);
        HBox hb2 = new HBox(100);
        HBox hb3 = new HBox(100);
        HBox hb4 = new HBox(100);
        HBox hb5 = new HBox(100);
        HBox hb6 = new HBox(100);
        HBox hb7 = new HBox(100);
        HBox hb8 = new HBox(200);
        HBox hb9 = new HBox(70);
        HBox hb10 = new HBox(20);
        HBox hb11 = new HBox(20);
        HBox hb12 = new HBox(20);
        HBox hb13 = new HBox(100);
        HBox hb14 = new HBox(100);

        //Padding for the VBoxes
        vb1.setPadding(new Insets(0,0,-15,-400));
        vb2.setPadding(new Insets(10,35,10,35));
        vb3.setPadding(new Insets(0,0,-15,-400));
        vb4.setPadding(new Insets(10,35,10,35));
        vb5.setPadding(new Insets(0,0,0,0));
        vb6.setPadding(new Insets(5,0,0,0));

        //Alignment for the VBoxes
        vb1.setAlignment(Pos.CENTER);
        vb2.setAlignment(Pos.CENTER);
        vb3.setAlignment(Pos.CENTER);
        vb4.setAlignment(Pos.CENTER);
        vb5.setAlignment(Pos.CENTER);
        vb6.setAlignment(Pos.CENTER);

        //Padding for the HBoxes
        hb14.setPadding(new Insets(-135,0,0,0));
        hb13.setPadding(new Insets(-100,0,0,0));
        hb0.setPadding(new Insets(-135,0,0,0));// cart button
        hb1.setPadding(new Insets(-80,0,0,0));//back button
        hb2.setPadding(new Insets(0,-2,0,0));
        hb3.setPadding(new Insets(0,31,0,0));
        hb4.setPadding(new Insets(0,14,0,0));
        hb5.setPadding(new Insets(0,-10,0,0));
        hb6.setPadding(new Insets(0,22,0,0));
        hb7.setPadding(new Insets(0,4,0,0));
        hb8.setPadding(new Insets(27,0,10,0));//nav bar
        hb9.setPadding(new Insets(0,15,-20,0));
        hb10.setPadding(new Insets(15,0, 15, 0));

        //Alignment for the HBoxes
        hb14.setAlignment(Pos.CENTER_RIGHT);
        hb0.setAlignment(Pos.CENTER_RIGHT);
        hb1.setAlignment(Pos.CENTER_LEFT);
        hb2.setAlignment(Pos.CENTER);
        hb3.setAlignment(Pos.CENTER);
        hb4.setAlignment(Pos.CENTER);
        hb5.setAlignment(Pos.CENTER);
        hb6.setAlignment(Pos.CENTER);
        hb7.setAlignment(Pos.CENTER);
        hb8.setAlignment(Pos.CENTER);
        hb9.setAlignment(Pos.CENTER);
        hb10.setAlignment(Pos.CENTER);
        hb11.setAlignment(Pos.CENTER);
        hb11.setPadding(new Insets(0,10,0,10));
        hb12.setAlignment(Pos.CENTER);

        //disables the visibility but NOT the functionality of the back button
        hb1.setOpacity(0);
        hb0.setOpacity(100);
        hb13.setOpacity(0);

        //This code is to put a border around the VBoxes to make user viability easier.
        String borderLayout = "-fx-border-color: black;\n" +
                "-fx-border-insets: 5;\n" +
                "-fx-border-width: 3;\n" +
                "-fx-border-style: solid outside;\n";

        vb2.setStyle(borderLayout);
        vb4.setStyle(borderLayout);
        hb11.setStyle(borderLayout);
        hb14.setStyle(borderLayout);

        //Sets the all components onto the scene
        hb13.getChildren().addAll(MainMenu);

        hb14.getChildren().addAll(CartInfo_Lbl);
        hb0.getChildren().addAll(Cart_btn);

        hb1.getChildren().addAll(Back_btn);
        hb2.getChildren().addAll(NoCheese_Lbl, NoCheeseLeft_radio, NoCheeseRight_radio, NoCheeseWhole_radio);
        hb3.getChildren().addAll(RegCheese_Lbl, RegCheeseLeft_radio, RegCheeseRight_radio, RegCheeseWhole_radio);
        hb4.getChildren().addAll(ExtraCheese_Lbl, ExtraCheeseLeft_radio, ExtraCheeseRight_radio, ExtraCheeseWhole_radio);
        hb5.getChildren().addAll(NoSauce_Lbl, NoSauceLeft_radio, NoSauceRight_radio, NoSauceWhole_radio);
        hb6.getChildren().addAll(RegSauce_Lbl, RegSauceLeft_radio, RegSauceRight_radio, RegSauceWhole_radio);
        hb7.getChildren().addAll(ExtraSauce_Lbl, ExtraSauceLeft_radio, ExtraSauceRight_radio, ExtraSauceWhole_radio);
        hb8.getChildren().addAll(Crust_btn, Cheese_btn, Meats_btn, Veggies_btn, Next_btn);
        hb9.getChildren().addAll(CheeseOptions_Lbl, new ImageView(LeftHalf_pic), new ImageView(RightHalf_pic), new ImageView(WholePizza_pic));
        hb10.getChildren().addAll(new ImageView(Cheese_pic), CheeseAndSauce_Lbl);
        hb11.getChildren().addAll(PriceInfo_Lbl);
        hb12.getChildren().addAll(vb5, hb11);

        vb2.getChildren().addAll(hb2, hb3, hb4);
        vb3.getChildren().addAll(SauceOptions_Lbl);
        vb4.getChildren().addAll(hb5, hb6, hb7);
        vb5.getChildren().addAll(hb9, vb2, vb3, vb4);
        vb6.getChildren().addAll(new ImageView(Template), hb13, hb14, hb0, hb1, hb10, hb12, AddToCart_btn, hb8);

        //Calls other methods in this class
        FontsUsed();
        Cheese_RadioButtons();
        Cheese_ButtonActions(window);

        return vb6;
    }

    //This Method is to handle the radio button options for the Cheese and Sauce Menu
    private void Cheese_RadioButtons(){
        //Toggle for the No Cheese Options
        final ToggleGroup group1 = new ToggleGroup();
        NoCheeseLeft_radio.setToggleGroup(group1);
        NoCheeseRight_radio.setToggleGroup(group1);
        NoCheeseWhole_radio.setToggleGroup(group1);

        //Toggle for the regular cheese options
        final ToggleGroup group2 = new ToggleGroup();
        RegCheeseLeft_radio.setToggleGroup(group2);
        RegCheeseRight_radio.setToggleGroup(group2);
        RegCheeseWhole_radio.setToggleGroup(group2);

        //Toggle for the Extra Cheese options
        final ToggleGroup group3 = new ToggleGroup();
        ExtraCheeseLeft_radio.setToggleGroup(group3);
        ExtraCheeseRight_radio.setToggleGroup(group3);
        ExtraCheeseWhole_radio.setToggleGroup(group3);

        //Toggle for the No sauce option
        final ToggleGroup group4 = new ToggleGroup();
        NoSauceLeft_radio.setToggleGroup(group4);
        NoSauceRight_radio.setToggleGroup(group4);
        NoSauceWhole_radio.setToggleGroup(group4);

        //Toggle for the Regular Sauce
        final ToggleGroup group5 = new ToggleGroup();
        RegSauceLeft_radio.setToggleGroup(group5);
        RegSauceRight_radio.setToggleGroup(group5);
        RegSauceWhole_radio.setToggleGroup(group5);

        //Toggle for the Extra Sauce
        final ToggleGroup group6 = new ToggleGroup();
        ExtraSauceLeft_radio.setToggleGroup(group6);
        ExtraSauceRight_radio.setToggleGroup(group6);
        ExtraSauceWhole_radio.setToggleGroup(group6);
    }

    //This method is to handle the buttons in the cheese menu
    private void Cheese_ButtonActions(Stage window){

        /*disables the button since the user will already be on this page. No need to navigate
          to a page they are already on or an accidental refresh.*/
        Cheese_btn.setDisable(true);

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
        MainMenu.setOnAction(e -> {
            detCheese();
            detSauce();
            window.getScene().setRoot(mm.BuildMainMenu(window));
        });
        Back_btn.setOnAction(e -> {
            detCheese();
            detSauce();
            window.getScene().setRoot(mm.BuildMainMenu(window));
        });
        Cart_btn.setOnAction(e -> {
            detCheese();
            detSauce();
            window.getScene().setRoot(cart.BuildCart(window));
        });
        Crust_btn.setOnAction(e -> {
            detCheese();
            detSauce();
            window.getScene().setRoot(pizzaCreation_crust.BuildCrust(window));
        });
        Cheese_btn.setOnAction(e -> {
            detCheese();
            detSauce();
            window.getScene().setRoot(pizzaCreation_cheese.BuildCheese(window));
        });
        Meats_btn.setOnAction(e -> {
            detCheese();
            detSauce();
            window.getScene().setRoot(pizzaCreation_meats.BuildMeats(window));
        });
        Veggies_btn.setOnAction(e -> {
            detCheese();
            detSauce();
            window.getScene().setRoot(pizzaCreation_veggies.BuildVeggies(window));
        });
        Next_btn.setOnAction(e -> {
            detCheese();
            detSauce();
            window.getScene().setRoot(pizzaCreation_meats.BuildMeats(window));
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
        CheeseAndSauce_Lbl.setFont(Font.font("Calibri", FontWeight.SEMI_BOLD,48));
        PriceInfo_Lbl.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        CheeseOptions_Lbl.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        SauceOptions_Lbl.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        NoCheese_Lbl.setFont(Font.font("Calibri", FontWeight.SEMI_BOLD,18));
        RegCheese_Lbl.setFont(Font.font("Calibri", FontWeight.SEMI_BOLD,18));
        ExtraCheese_Lbl.setFont(Font.font("Calibri", FontWeight.SEMI_BOLD,18));
        NoSauce_Lbl.setFont(Font.font("Calibri", FontWeight.SEMI_BOLD,18));
        RegSauce_Lbl.setFont(Font.font("Calibri", FontWeight.SEMI_BOLD,18));
        ExtraSauce_Lbl.setFont(Font.font("Calibri", FontWeight.SEMI_BOLD,18));

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

    //determines what cheese is selected when you click out of the screen
    private void detCheese()
    {
        if(NoCheeseLeft_radio.isSelected())
        {
            pizza.chooseCheese("nocheese");
            pizza.chooseCheeseSpread(0);
        }
        if(NoCheeseRight_radio.isSelected())
        {
            pizza.chooseCheese("nocheese");
            pizza.chooseCheeseSpread(1);
        }
        if(NoCheeseWhole_radio.isSelected())
        {
            pizza.chooseCheese("nocheese");
            pizza.chooseCheeseSpread(2);
        }
        if(RegCheeseLeft_radio.isSelected())
        {
            pizza.chooseCheese("regularcheese");
            pizza.chooseCheeseSpread(0);
        }
        if(RegCheeseRight_radio.isSelected())
        {
            pizza.chooseCheese("regularcheese");
            pizza.chooseCheeseSpread(1);
        }
        if(RegCheeseWhole_radio.isSelected())
        {
            pizza.chooseCheese("regularcheese");
            pizza.chooseCheeseSpread(2);
        }
        if(ExtraCheeseLeft_radio.isSelected())
        {
            pizza.chooseCheese("extracheese");
            pizza.chooseCheeseSpread(0);
        }
        if(ExtraCheeseRight_radio.isSelected())
        {
            pizza.chooseCheese("extracheese");
            pizza.chooseCheeseSpread(1);
        }
        if(ExtraCheeseWhole_radio.isSelected())
        {
            pizza.chooseCheese("extracheese");
            pizza.chooseCheeseSpread(2);
        }
    }

    //determines what sauce is selected when you click out of the screen
    private void detSauce()
    {
        //Choose Sauce
        if(NoSauceLeft_radio.isSelected()){
            //         Pizza pizza = findpizza();
            pizza.chooseSauce("nosauce");
            pizza.chooseSauceSpread(0);
        }
        if(NoSauceRight_radio.isSelected()){
            //          Pizza pizza = findpizza();
            pizza.chooseSauce("nosauce");
            pizza.chooseSauceSpread(1);
        }
        if(NoSauceWhole_radio.isSelected()){
            //         Pizza pizza = findpizza();
            pizza.chooseSauce("nosauce");
            pizza.chooseSauceSpread(2);
        }
        if(RegSauceLeft_radio.isSelected()){
            //          Pizza pizza = findpizza();
            pizza.chooseSauce("regularsauce");
            pizza.chooseSauceSpread(0);
        }
        if(RegSauceRight_radio.isSelected()){
            //           Pizza pizza = findpizza();
            pizza.chooseSauce("regularsauce");
            pizza.chooseSauceSpread(1);
        }
        if(RegSauceWhole_radio.isSelected()){
            //          Pizza pizza = findpizza();
            pizza.chooseSauce("regularsauce");
            pizza.chooseSauceSpread(2);
        }
        if(ExtraSauceLeft_radio.isSelected()){
            //         Pizza pizza = findpizza();
            pizza.chooseSauce("extrasauce");
            pizza.chooseSauceSpread(0);
        }
        if(ExtraSauceRight_radio.isSelected()){
            //         Pizza pizza = findpizza();
            pizza.chooseSauce("extrasauce");
            pizza.chooseSauceSpread(1);
        }
        if(ExtraSauceWhole_radio.isSelected()){
            //           Pizza pizza = findpizza();
            pizza.chooseSauce("extrasauce");
            pizza.chooseSauceSpread(2);
        }
    }

}