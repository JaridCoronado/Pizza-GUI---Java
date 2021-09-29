package GUI;

//javafx packages
import sample.Order;
import sample.Customer;
import sample.Card;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.Pizza;

public class Main extends Application{

    private Stage window;

    private Scene login_menu;

    public static void main(String[] args){
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Mom And Pop Pizza");//Name of the window

        LoginMenu loginMenu = new LoginMenu();

        login_menu = new Scene(loginMenu.BuildLogin(window), 1366, 786);

        window.setScene(login_menu);
        window.show();
    }

    static Order order = new Order();
    static Pizza pizza = new Pizza();
    static Customer account;
    static Card userCard;

    static Order getOrder() {
        return order;
    }
    static Pizza getPizza() { return pizza; }
    static void resetPizza() { pizza = new Pizza(); }

    static Customer getCustomer() { return account; }
    static void adjustCustomer(String nameinput, String addressinput, String phoneinput) throws Exception{
        account.setNameofUser(nameinput);
        account.setPhoneNumber(phoneinput);
        account.setAddress(addressinput);
    }
    static Card getUserCard(){ return userCard;}
    static void adjustUserCard(String cardNameHolderupdate, String cardtypeupdate, int zipcodeupdate, int securecodeupdate, long cardnumberupdate, int expirationdateupdate) throws Exception{
        userCard.setCardNumber(cardnumberupdate);
        userCard.setUserCard(cardtypeupdate);
        userCard.setNameOfCardHolder(cardNameHolderupdate);
        userCard.setSecureCode(securecodeupdate);
        userCard.setZipCode(zipcodeupdate);
        userCard.setExpDate(expirationdateupdate);
    }
}
