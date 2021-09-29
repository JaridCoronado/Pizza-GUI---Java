package sample;

import java.text.DecimalFormat;
import java.util.*;

public class Order {

    ArrayList<Pizza> pizzas = new ArrayList<>();
    ArrayList<Sides> sides = new ArrayList<>();
    ArrayList<Drinks> drinks = new ArrayList<>();

    public void addPizza(Pizza pizza) {
        this.pizzas.add(pizza);
    }

    public void addSide(Sides side) {
        this.sides.add(side);
    }

    public void addDrink(Drinks drink) {
        this.drinks.add(drink);
    }

    public ArrayList<Pizza> getPizzas() {
        return this.pizzas;
    }

    public ArrayList<Sides> getSides() {
        return this.sides;
    }

    public ArrayList<Drinks> getDrinks() {
        return this.drinks;
    }

    public String toString() {
        String answer = "";
        for(int i = 0; i < pizzas.size(); i ++) {
            answer = answer + ("$" + pizzas.get(i).getPrice() + ": " + (pizzas.get(i)).toString() + "\n");
        }
        for(int i = 0; i < sides.size(); i ++) {
            answer = answer + ("$" + sides.get(i).getPrice() + ": " + (sides.get(i)).toString() + "\n");
        }
        for(int i = 0; i < drinks.size(); i ++) {
            answer = answer + ("$" + drinks.get(i).getPrice() + ": " + (drinks.get(i)).toString() + "\n");
        }
        return answer;
    }

    public String getTotal(){
        double answer = 0;
        for(int i = 0; i < pizzas.size(); i ++) {
            answer = answer + pizzas.get(i).getPrice();
        }
        for(int i = 0; i < drinks.size(); i ++) {
            answer = answer + drinks.get(i).getPrice();
        }
        for(int i = 0; i < sides.size(); i ++) {
            answer = answer + sides.get(i).getPrice();
        }
        DecimalFormat df2 = new DecimalFormat("#.00");
        return df2.format(answer);
    }

    public void resetOrder() {
        this.drinks.clear();
        this.pizzas.clear();
        this.sides.clear();
    }

}
