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

public class PizzaCreation_Veggies {

    Order order = Main.getOrder();
    Pizza pizza = Main.getPizza();
    //Buttons for Pizza Creation Menus initiated.
    private Button MainMenu = new Button("Main Menu");
    private Button Cart_btn = new Button("Go To Cart");
    private Button Back_btn = new Button("Back");//GOES BK TO MAIN MENU
    private Button Crust_btn = new Button("Crust");
    private Button Cheese_btn = new Button("Cheese");
    private Button Meats_btn = new Button("Meats");
    private Button Veggies_btn = new Button ("Veggies");
    private Button Next_btn = new Button("Next");
    private Button AddToCart_btn = new Button ("Add Pizza To Cart");

    //Radio Buttons used in the Veggies menu
    //Mushrooms
    private RadioButton MushroomsLeft_radio = new RadioButton();
    private RadioButton MushroomsRight_radio = new RadioButton();
    private RadioButton MushroomsWhole_radio = new RadioButton();

    //Tomatoes
    private RadioButton TomatoesLeft_radio = new RadioButton();
    private RadioButton TomatoesRight_radio = new RadioButton();
    private RadioButton TomatoesWhole_radio = new RadioButton();

    //Pineapple
    private RadioButton PineappleLeft_radio = new RadioButton();
    private RadioButton PineappleRight_radio = new RadioButton();
    private RadioButton PineappleWhole_radio = new RadioButton();

    //Onions
    private RadioButton OnionsLeft_radio = new RadioButton();
    private RadioButton OnionsRight_radio = new RadioButton();
    private RadioButton OnionsWhole_radio = new RadioButton();

    //Green Peppers
    private RadioButton GreenPeppersLeft_radio = new RadioButton();
    private RadioButton GreenPeppersRight_radio = new RadioButton();
    private RadioButton GreenPeppersWhole_radio = new RadioButton();

    //Black Olives
    private RadioButton BlackOlivesLeft_radio = new RadioButton();
    private RadioButton BlackOlivesRight_radio = new RadioButton();
    private RadioButton BlackOlivesWhole_radio = new RadioButton();

    //Fresh Spinach
    private RadioButton FreshSpinachLeft_radio = new RadioButton();
    private RadioButton FreshSpinachRight_radio = new RadioButton();
    private RadioButton FreshSpinachWhole_radio = new RadioButton();

    //Jalapeno
    private RadioButton JalapenoLeft_radio = new RadioButton();
    private RadioButton JalapenoRight_radio = new RadioButton();
    private RadioButton JalapenoWhole_radio = new RadioButton();

    //Labels for the Veggie menu
    private Label CartInfo_Lbl = new Label ("Cart");
    private Label PriceInfo_Lbl = new Label("Price Information");
    private Label Veggies_Lbl = new Label("Veggies");
    private Label Mushrooms_Lbl = new Label("Mushrooms");
    private Label Tomatoes_Lbl = new Label("Tomatoes");
    private Label Pineapple_Lbl = new Label("Pineapple");
    private Label Onions_Lbl = new Label("Onions");
    private Label GreenPeppers_Lbl = new Label("Green Peppers");
    private Label BlackOlives_Lbl = new Label("Black Olives");
    private Label FreshSpinach_Lbl = new Label("Fresh Spinach");
    private Label Jalapeno_Lbl = new Label("Jalapenos");

    //Constants in every scene
    private Image Template= new Image("GUI/images/PizzaProject Info Template_Back.png");
    private Image Tomatoes_pic = new Image("GUI/images/tomatoes1.jpg");
    private Image Pineapple_pic = new Image("GUI/images/pineapple1.jpg");
    private Image Spinach_pic = new Image("GUI/images/spinache1.jpg");
    private Image Mushrooms_pic = new Image("GUI/images/mushrooms1.jpg");
    private Image Onions_pic = new Image("GUI/images/onions1.jpg");
    private Image GreenPeppers_pic = new Image("GUI/images/green pepper1.jpg");
    private Image BlackOlives_pic = new Image("GUI/images/black olives1.jpg");
    private Image Jalapenos_pic = new Image("GUI/images/jalapenos1.jpg");
    private Image WholePizza_pic = new Image("GUI/images/Whole.jpg");
    private Image LeftHalf_pic = new Image("GUI/images/LeftHalf.jpg");
    private Image RightHalf_pic = new Image("GUI/images/RightHalf.jpg");

    //This method is where the look and feel of the Veggies menu derives
    public VBox BuildVeggies(Stage window){

        VBox vb1 = new VBox(1);
        VBox vb2 = new VBox(1);
        VBox vb3 = new VBox(1);
        VBox vb4 = new VBox(1);

        HBox hb1 = new HBox(50);
        HBox hb2 = new HBox(50);
        HBox hb3 = new HBox(50);
        HBox hb4 = new HBox(50);
        HBox hb5 = new HBox(50);
        HBox hb6 = new HBox(50);
        HBox hb7 = new HBox(50);
        HBox hb8 = new HBox(50);
        HBox hb9 = new HBox(50);
        HBox hb10 = new HBox(100);
        HBox hb11 = new HBox(200);
        HBox hb12 = new HBox(20);
        HBox hb13 = new HBox(20);

        HBox hb0 = new HBox(100);
        HBox hb14 = new HBox(100);
        HBox hb15 = new HBox(100);


        //Padding for the VBoxes
        vb4.setPadding(new Insets(0,0,100,0));

        //Alignment for the VBoxes
        vb1.setAlignment(Pos.CENTER);
        vb2.setAlignment(Pos.CENTER);
        vb3.setAlignment(Pos.CENTER);
        vb4.setAlignment(Pos.CENTER);

        //Padding for the HBoxes
        hb13.setPadding(new Insets(-100,0,0,0));
        hb15.setPadding(new Insets(-185,0,0,0));// cart info label
        hb0.setPadding(new Insets(-185,0,0,0));// cart button

        hb1.setPadding(new Insets(-120,0,0,0));//back button
        hb2.setPadding(new Insets(0,10,0,13));//mushrooms
        hb3.setPadding(new Insets(0,10,0,25));//tomatoes
        hb4.setPadding(new Insets(0,10,0,27));//pineapple
        hb5.setPadding(new Insets(0,10,0,50));//onions
        hb6.setPadding(new Insets(0,10,0,10));//Green peppers
        hb7.setPadding(new Insets(0,10,0,30));//black olives
        hb8.setPadding(new Insets(0,10,0,20));//fresh spinach
        hb9.setPadding(new Insets(0,10,0,47));//jalapenos
        hb11.setPadding(new Insets(0,0,-157,0)); //nav bar
        hb12.setPadding(new Insets(0,-250,0,0));
        hb13.setPadding(new Insets(0,-250,0,0));

        //Alignment for the HBoxes
        hb15.setAlignment(Pos.CENTER_RIGHT);
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
        hb12.setAlignment(Pos.CENTER);
        hb13.setAlignment(Pos.CENTER);

        //This code is to put a border around the VBoxes to make user viability easier.
        String borderLayout = "-fx-border-color: black;\n" +
                "-fx-border-insets: 3;\n" +
                "-fx-border-width: 3;\n" +
                "-fx-border-style: solid inside;\n";
        hb2.setStyle(borderLayout);
        hb3.setStyle(borderLayout);
        hb4.setStyle(borderLayout);
        hb5.setStyle(borderLayout);
        hb6.setStyle(borderLayout);
        hb7.setStyle(borderLayout);
        hb8.setStyle(borderLayout);
        hb9.setStyle(borderLayout);
        hb15.setStyle(borderLayout);

        //disables the visibility but NOT the functionality of the back button
        hb1.setOpacity(0);
        hb0.setOpacity(100);
        hb14.setOpacity(0);

        //Sets the all components onto the scene
        hb14.getChildren().addAll(MainMenu);

        hb15.getChildren().addAll(CartInfo_Lbl);
        hb0.getChildren().addAll(Cart_btn);

        hb1.getChildren().addAll(Back_btn);
        hb2.getChildren().addAll(new ImageView(Mushrooms_pic), Mushrooms_Lbl, MushroomsLeft_radio, MushroomsRight_radio, MushroomsWhole_radio);
        hb3.getChildren().addAll(new ImageView(Tomatoes_pic), Tomatoes_Lbl, TomatoesLeft_radio, TomatoesRight_radio, TomatoesWhole_radio);
        hb4.getChildren().addAll(new ImageView(Pineapple_pic), Pineapple_Lbl, PineappleLeft_radio, PineappleRight_radio, PineappleWhole_radio);
        hb5.getChildren().addAll(new ImageView(Onions_pic), Onions_Lbl, OnionsLeft_radio, OnionsRight_radio, OnionsWhole_radio);
        hb6.getChildren().addAll(new ImageView(GreenPeppers_pic), GreenPeppers_Lbl, GreenPeppersLeft_radio, GreenPeppersRight_radio, GreenPeppersWhole_radio);
        hb7.getChildren().addAll(new ImageView(BlackOlives_pic), BlackOlives_Lbl, BlackOlivesLeft_radio, BlackOlivesRight_radio, BlackOlivesWhole_radio);
        hb8.getChildren().addAll(new ImageView(Spinach_pic), FreshSpinach_Lbl, FreshSpinachLeft_radio, FreshSpinachRight_radio, FreshSpinachWhole_radio);
        hb9.getChildren().addAll(new ImageView(Jalapenos_pic), Jalapeno_Lbl, JalapenoLeft_radio, JalapenoRight_radio, JalapenoWhole_radio);
        hb10.getChildren().addAll(vb1, vb2);
        hb11.getChildren().addAll(Crust_btn, Cheese_btn, Meats_btn, Veggies_btn, Next_btn);
        hb12.getChildren().addAll(new ImageView(LeftHalf_pic), new ImageView(RightHalf_pic), new ImageView(WholePizza_pic));
        hb13.getChildren().addAll(new ImageView(LeftHalf_pic), new ImageView(RightHalf_pic), new ImageView(WholePizza_pic));


        vb1.getChildren().addAll(hb12, hb2, hb3, hb4, hb5);
        vb2.getChildren().addAll(hb13, hb6, hb7, hb8, hb9);
        vb3.getChildren().addAll(hb10, AddToCart_btn, hb11);
        vb4.getChildren().addAll(new ImageView(Template), hb14, hb15, hb0, hb1, Veggies_Lbl, vb3);

        //Calls other methods in this class
        FontsUsed();
        Veggies_ButtonAction(window);
        Veggies_RadioButtons();

        return vb4;
    }

    //This Method is to handle the radio button options for the veggies Menu
    private void Veggies_RadioButtons(){
        //ToggleGroup for Mushrooms
        final ToggleGroup group1 = new ToggleGroup();
        MushroomsLeft_radio.setToggleGroup(group1);
        MushroomsRight_radio.setToggleGroup(group1);
        MushroomsWhole_radio.setToggleGroup(group1);

        //ToggleGroup for Tomatoes
        final ToggleGroup group2 = new ToggleGroup();
        TomatoesLeft_radio.setToggleGroup(group2);
        TomatoesRight_radio.setToggleGroup(group2);
        TomatoesWhole_radio.setToggleGroup(group2);

        //ToggleGroup for Pineapple
        final ToggleGroup group3 = new ToggleGroup();
        PineappleLeft_radio.setToggleGroup(group3);
        PineappleRight_radio.setToggleGroup(group3);
        PineappleWhole_radio.setToggleGroup(group3);

        //ToggleGroup for Onions
        final ToggleGroup group4 = new ToggleGroup();
        OnionsLeft_radio.setToggleGroup(group4);
        OnionsRight_radio.setToggleGroup(group4);
        OnionsWhole_radio.setToggleGroup(group4);

        //ToggleGroup for Green Peppers
        final ToggleGroup group5 = new ToggleGroup();
        GreenPeppersLeft_radio.setToggleGroup(group5);
        GreenPeppersRight_radio.setToggleGroup(group5);
        GreenPeppersWhole_radio.setToggleGroup(group5);

        //ToggleGroup for Black Olives
        final ToggleGroup group6 = new ToggleGroup();
        BlackOlivesLeft_radio.setToggleGroup(group6);
        BlackOlivesRight_radio.setToggleGroup(group6);
        BlackOlivesWhole_radio.setToggleGroup(group6);

        //ToggleGroup for Fresh Spinache
        final ToggleGroup group7 = new ToggleGroup();
        FreshSpinachLeft_radio.setToggleGroup(group7);
        FreshSpinachRight_radio.setToggleGroup(group7);
        FreshSpinachWhole_radio.setToggleGroup(group7);

        //ToggleGroup for Jalapenos
        final ToggleGroup group8 = new ToggleGroup();
        JalapenoLeft_radio.setToggleGroup(group8);
        JalapenoRight_radio.setToggleGroup(group8);
        JalapenoWhole_radio.setToggleGroup(group8);
    }

    //This method is to handle to button activations for the Veggies menu
    private void  Veggies_ButtonAction(Stage window){
        /*disables the button since the user will already be on this page. No need to navigate
          to a page they are already on or an accidental refresh.*/
        Veggies_btn.setDisable(true);

        //Sets the size of the buttons to match the template
        Back_btn.setPrefSize(125,75);
        Cart_btn.setPrefSize(125,75);
        Crust_btn.setPrefSize(100,35);
        Cheese_btn.setPrefSize(100,35);
        Meats_btn.setPrefSize(100,35);
        Veggies_btn.setPrefSize(100,35);
        Next_btn.setPrefSize(100,50);
        AddToCart_btn.setPrefSize(200,50);

        //Classes for scene navigation
        MainMenu mm = new MainMenu();
        PizzaCreation_Crust pizzaCreation_crust = new PizzaCreation_Crust();
        PizzaCreation_Cheese pizzaCreation_cheese = new PizzaCreation_Cheese();
        PizzaCreation_Meats pizzaCreation_meats = new PizzaCreation_Meats();
        PizzaCreation_Veggies pizzaCreation_veggies = new PizzaCreation_Veggies();
        Cart cart = new Cart();

        //Button Actions
        Back_btn.setOnAction(e -> {
            detVeggies();
            window.getScene().setRoot(mm.BuildMainMenu(window));
        });
        Crust_btn.setOnAction(e -> {
            detVeggies();
            window.getScene().setRoot(pizzaCreation_crust.BuildCrust(window));
        });
        Cheese_btn.setOnAction(e -> {
            detVeggies();
            window.getScene().setRoot(pizzaCreation_cheese.BuildCheese(window));
        });
        Meats_btn.setOnAction(e -> {
            detVeggies();
            window.getScene().setRoot(pizzaCreation_meats.BuildMeats(window));
        });
        Veggies_btn.setOnAction(e -> {
            detVeggies();
            window.getScene().setRoot(pizzaCreation_veggies.BuildVeggies(window));
        });
        Next_btn.setOnAction(e -> {
            detVeggies();
            pizza.finishPizza();
            order.addPizza(pizza);
            Main.resetPizza();
            window.getScene().setRoot(cart.BuildCart(window));
        });
        Cart_btn.setOnAction(e -> {
            detVeggies();
            window.getScene().setRoot(cart.BuildCart(window));
        });
        AddToCart_btn.setOnAction(e -> {
            if(pizza.complete()) {
                pizza.finishPizza();
                order.addPizza(pizza);
                Main.resetPizza();
            }
        });

    }

    //This Method handels all the fonts used in the Veggies menu
    private void FontsUsed(){
        //Sets fonts for all the labels
        Veggies_Lbl.setFont(Font.font("Calibri", FontWeight.SEMI_BOLD,48));
        PriceInfo_Lbl.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        Mushrooms_Lbl.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        Tomatoes_Lbl.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        Pineapple_Lbl.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        Onions_Lbl.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        GreenPeppers_Lbl.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        BlackOlives_Lbl.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        FreshSpinach_Lbl.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        Jalapeno_Lbl.setFont(Font.font("Calibri", FontWeight.BOLD,18));

        //Sets Fonts for all the Buttons
        Cart_btn.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        Back_btn.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        Crust_btn.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        Cheese_btn.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        Meats_btn.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        Veggies_btn.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        Next_btn.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        AddToCart_btn.setFont(Font.font("Calibri", FontWeight.BOLD,18));
    }

    //determine what toppings are added to the pizza
    private void detVeggies()
    {
        //Adding veggie toppings
        if(MushroomsLeft_radio.isSelected())
        {
            pizza.addToppings("mushrooms");
            pizza.addSpread("mushrooms",0);
        }
        if(MushroomsRight_radio.isSelected())
        {
            pizza.addToppings("mushrooms");
            pizza.addSpread("mushrooms",1);
        }
        if(MushroomsWhole_radio.isSelected())
        {
            pizza.addToppings("mushrooms");
            pizza.addSpread("mushrooms",2);
        }
        if(TomatoesLeft_radio.isSelected())
        {
            pizza.addToppings("tomatoes");
            pizza.addSpread("tomatoes",0);
        }
        if(TomatoesRight_radio.isSelected())
        {
            pizza.addToppings("tomatoes");
            pizza.addSpread("tomatoes",1);
        }
        if(TomatoesWhole_radio.isSelected())
        {
            pizza.addToppings("tomatoes");
            pizza.addSpread("tomatoes",2);
        }
        if(PineappleLeft_radio.isSelected())
        {
            pizza.addToppings("pineapples");
            pizza.addSpread("pineapples",0);
        }
        if(PineappleRight_radio.isSelected())
        {
            pizza.addToppings("pineapples");
            pizza.addSpread("pineapples",1);
        }
        if(PineappleWhole_radio.isSelected())
        {
            pizza.addToppings("pineapples");
            pizza.addSpread("pineapples",2);
        }
        if(OnionsLeft_radio.isSelected())
        {
            pizza.addToppings("onions");
            pizza.addSpread("onions",0);
        }
        if(OnionsRight_radio.isSelected())
        {
            pizza.addToppings("onions");
            pizza.addSpread("onions",1);
        }
        if(OnionsWhole_radio.isSelected())
        {
            pizza.addToppings("onions");
            pizza.addSpread("onions",2);
        }
        if(GreenPeppersLeft_radio.isSelected())
        {
            pizza.addToppings("greenPeppers");
            pizza.addSpread("greenPeppers",0);
        }
        if(GreenPeppersRight_radio.isSelected())
        {
            pizza.addToppings("greenPeppers");
            pizza.addSpread("greenPeppers",1);
        }
        if(GreenPeppersWhole_radio.isSelected())
        {
            pizza.addToppings("greenPeppers");
            pizza.addSpread("greenPeppers",2);
        }
        if(BlackOlivesLeft_radio.isSelected())
        {
            pizza.addToppings("blkOlives");
            pizza.addSpread("blkOlives",0);
        }
        if(BlackOlivesRight_radio.isSelected())
        {
            pizza.addToppings("blkOlives");
            pizza.addSpread("blkOlives",1);
        }
        if(BlackOlivesWhole_radio.isSelected())
        {
            pizza.addToppings("blkOlives");
            pizza.addSpread("blkOlives",2);
        }
        if(FreshSpinachLeft_radio.isSelected())
        {
            pizza.addToppings("spinach");
            pizza.addSpread("spinach",0);
        }
        if(FreshSpinachRight_radio.isSelected())
        {
            pizza.addToppings("spinach");
            pizza.addSpread("spinach",1);
        }
        if(FreshSpinachWhole_radio.isSelected())
        {
            pizza.addToppings("spinach");
            pizza.addSpread("spinach",2);
        }
        if(JalapenoLeft_radio.isSelected())
        {
            pizza.addToppings("jalapeno");
            pizza.addSpread("jalapeno",0);
        }
        if(JalapenoRight_radio.isSelected())
        {
            pizza.addToppings("jalapeno");
            pizza.addSpread("jalapeno",1);
        }
        if(JalapenoWhole_radio.isSelected())
        {
            pizza.addToppings("jalapeno");
            pizza.addSpread("jalapeno",2);
        }
    }

}
