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
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import sample.Order;

public class Receipt {
    Order order = Main.getOrder();
    //Buttons used for the cart menu
    private Button MainMenu_btn = new Button("Main Menu");

    //Labels used for the Checkout Payment Options menu
    private Label ThankYou_Lbl = new Label("Thank you for your business!\n"
                                            + "Your order will be ready soon.");
    private Label Items_Lbl = new Label(" ");
    private Label Space_Lbl = new Label(" ");

    //Images used in the cart menu
    private Image Template= new Image("GUI/images/PizzaProject Info Template.png");

    public VBox BuildReceipt(Stage window){

        Items_Lbl.setText(order.toString());
        //VBoxes used for this method
        VBox vb1 = new VBox(20);
        VBox vb2 = new VBox(20);

        //HBoxes used in this method
        HBox hb1 = new HBox(50);
        HBox hb2 = new HBox(50);
        HBox hb3 = new HBox(50);
        HBox hb4 = new HBox(50);

        //Padding for the VBoxes
        vb1.setPadding(new Insets(0,0,0,0));
        vb2.setPadding(new Insets(0,0,191,0));

        //Alignment for the VBoxes
        vb1.setAlignment(Pos.CENTER);
        vb2.setAlignment(Pos.CENTER);

        //Padding for the HBoxes
        hb1.setPadding(new Insets(-57,0,0,0));//Main Menu Button
        hb2.setPadding(new Insets(0,0,0,50));
        hb3.setPadding(new Insets(5,10,5,10));

        //Alignment for the HBoxes
        hb1.setAlignment(Pos.CENTER_RIGHT);
        hb2.setAlignment(Pos.CENTER);
        hb3.setAlignment(Pos.TOP_LEFT);
        hb4.setAlignment(Pos.CENTER);

        //This code is to put a border around the VBoxes to make user viability easier.
        String borderLayout = "-fx-border-color: black;\n" +
                "-fx-border-insets: 3;\n" +
                "-fx-border-width: 3;\n" +
                "-fx-border-style: solid inside;\n";
        hb3.setStyle(borderLayout);

        //Sets the all components onto the scene
        hb1.getChildren().addAll(MainMenu_btn);
        hb2.getChildren().addAll(ThankYou_Lbl);
        hb3.getChildren().addAll(Items_Lbl);
        hb4.getChildren().addAll(Space_Lbl, hb3);

        hb3.setPrefSize(275,300);

        vb1.getChildren().addAll(hb2, hb4);
        vb2.getChildren().addAll(new ImageView(Template), hb1, vb1);

        //Calls he other methods for this class
        Receipt_ButtonAction(window);
        FontsUsed();

        return vb2;
    }

    //This method is to handle to button activations for the receipt menu
    private void Receipt_ButtonAction(Stage window) {
        //Sets the sizes of the buttons
        MainMenu_btn.setPrefSize(125, 75);

        //Scenes are initiated
        MainMenu mm = new MainMenu();

        //sets events for buttons and passwords
        MainMenu_btn.setOnAction((e) -> {
            order.resetOrder();
            window.getScene().setRoot(mm.BuildMainMenu(window));
        });
    }

    //This Method handles all the fonts used in the receipt menu
    private void FontsUsed(){
        //Sets the font for the labels
        ThankYou_Lbl.setFont(Font.font("Calibri", FontWeight.SEMI_BOLD,48));
        Items_Lbl.setFont(Font.font("Calibri", FontWeight.BOLD,18));

        //Sets the fonts for the buttons
        MainMenu_btn.setFont(Font.font("Calibri", FontWeight.BOLD,18));
    }
}
