package GUI;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.scene.text.Font;

class MainMenu {

    //Buttons used for the main menu
    private Button Pizza_btn = new Button("Build A Pizza");
    private Button Drinks_btn = new Button("Drinks");
    private Button Sides_btn = new Button("Sides");
    private Button Profile_btn = new Button("Profile");
    private Button Back_btn = new Button("Back");

    //Label and template image are initiated.
    private Label main_menu_lbl = new Label("Main Menu");

    //Constants in every scene
    private Image Template = new Image("GUI/images/PizzaProject Info Template_Back.png");

   public VBox BuildMainMenu(Stage window){
        //VBoxes and HBoxes are initiated.
        VBox vb1 = new VBox(20);
        VBox vb2 = new VBox(50);

        HBox hb1 = new HBox(20);
        HBox hb2 = new HBox(20);
        HBox hb3 = new HBox(445);
        HBox hb4 = new HBox(500);

        //Padding and alignment for VBoxes and HBoxes are initiated.
        vb1.setPadding(new Insets(50,0,0,0));
        vb1.setAlignment(Pos.CENTER);
        vb2.setAlignment(Pos.TOP_CENTER);
        hb1.setPadding(new Insets(-125,0, 0, 0));
        hb1.setAlignment(Pos.TOP_LEFT);
        hb2.setAlignment(Pos.CENTER);
        hb3.setAlignment(Pos.CENTER);
        hb4.setAlignment(Pos.CENTER);

        //disables the visibility but NOT the functionality of the back button
        hb1.setOpacity(0);

        //Sets the all components onto the scene
        hb1.getChildren().add(Back_btn);
        hb2.getChildren().addAll(main_menu_lbl);
        hb3.getChildren().addAll(Pizza_btn, Drinks_btn);
        hb4.getChildren().addAll(Sides_btn, Profile_btn);
        vb1.getChildren().addAll( hb2, hb3, hb4);
        vb2.getChildren().addAll(new ImageView(Template), hb1, vb1);

        MainMenu_ButtonActions(window);
        FontsUsed();

        return vb2;
    }

    private void MainMenu_ButtonActions(Stage window){


        //Sets the size of the back button to match the template
        Back_btn.setPrefSize(75,75);

        //Scenes are initiated
        LoginMenu loginMenu = new LoginMenu();
        PizzaCreation_Crust pcc = new PizzaCreation_Crust();
        DrinksMenu drinksMenu = new DrinksMenu();
        SidesMenu sidesMenu = new SidesMenu();
        ProfileMenu profileMenu = new ProfileMenu();

        //sets events for buttons
        Back_btn.setOnAction(e -> window.getScene().setRoot(loginMenu.BuildLogin(window)));
        Pizza_btn.setOnAction(e -> window.getScene().setRoot(pcc.BuildCrust(window)));
        Drinks_btn.setOnAction(e -> window.getScene().setRoot(drinksMenu.BuildDrinks(window)));
        Sides_btn.setOnAction(e -> window.getScene().setRoot(sidesMenu.BuildSides(window)));
        Profile_btn.setOnAction(e -> window.getScene().setRoot(profileMenu.BuildProfile(window)));

    }
    private void FontsUsed(){
        //Changes the fonts of the labels and buttons
        main_menu_lbl.setFont(Font.font("Calibri", FontWeight.SEMI_BOLD,72));
        Pizza_btn.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        Drinks_btn.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        Sides_btn.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        Profile_btn.setFont(Font.font("Calibri", FontWeight.BOLD,18));
    }
}
