package sample;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String args[]) {
        Drinks drink = new Drinks("pepsi" , "medium");
        Order order = new Order();
        order.addDrink(drink);
        order.addDrink(drink);
        order.addDrink(drink);
        order.addDrink(drink);
        order.addDrink(drink);
        System.out.println(order.toString());
    }

}
