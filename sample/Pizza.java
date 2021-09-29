package sample;

public class Pizza
{
    private double price;
    private boolean[] pizzaToppings = new boolean[12];
    private int[] pizzaSpread = new int[12];

    //price is divided into two parts to better keep track of changing sizes and toppings.
    private double sizePrice, toppingsPrice;
    private String size, pizzaType;
    private boolean isFinished;
    //cheese and sauce
    private boolean nocheese,
                    regularcheese,
                    extracheese,
                    noSauce,
                    regularSauce,
                    extraSauce;

    // cheese and sauce spread
    private int nocheeseSpread,
                regcheeseSpread,
                extracheeseSpread,
                noSauceSpread,
                regularSauceSpread,
                extraSauceSpread;

    //toppings
    private boolean pepperoni,
                    sausage,
                    ham,
                    canadianBacon,
                    mushrooms,
                    tomatoes,
                    pineapple,
                    onions,
                    greenPeppers,
                    blkOlives,
                    spinach,
                    jalapeno;

    //topping spread values, 0,1 or 2
    private int pepperoniSpread,
                sausageSpread,
                hamSpread,
                canadianBaconSpread,
                mushroomsSpread,
                tomatoesSpread,
                pineappleSpread,
                onionsSpread,
                greenPeppersSpread,
                blkOlivesSpread,
                spinachSpread,
                jalapenoSpread;

    public Pizza()
    {
        //default pizza is a medium with regular cheese and sauce on whole pizza with no toppings
        this.regularcheese= this.regularSauce=true;
        this.regcheeseSpread=this.regularSauceSpread=2;
        size="medium";
        pizzaType="regular";
        sizePrice = 6.0;
        toppingsPrice=0.0;

        this.nocheese= this.extracheese= this.noSauce= this.extraSauce=false;

        this.nocheeseSpread= this.extracheeseSpread= this.noSauceSpread= this.extraSauceSpread=0;

        this.pepperoni= this.sausage= this.ham= this.canadianBacon= this.mushrooms= this.tomatoes=
                this.pineapple= this.onions= this.greenPeppers= this.blkOlives= this.spinach= this.jalapeno=false;

        this.pepperoniSpread= this.sausageSpread= this.hamSpread= this.canadianBaconSpread=
                this.mushroomsSpread= this.tomatoesSpread= this.pineappleSpread= this.onionsSpread=
                        this.greenPeppersSpread= this.blkOlivesSpread= this.spinachSpread= this.jalapenoSpread=0;
        isFinished=false;
    }

    public double getPrice()
    {
        price=sizePrice+toppingsPrice;
        return this.price;
    }

    public void addSizePrice(double amount)
    {
        this.sizePrice+=amount;
    }
    public void addToppingPrice(double amount) { this.toppingsPrice+=amount;}
  //  With each addition of a topping, a price increment is added to variable price

    public void removePrice(double amount)
    {
        this.price-=amount;
        if(price<0.0)
            price=0.0;
    }


  //    Takes user input from buttons to assign what size pizza ordered to variable size
    public void chooseSize(String amount)
    {
        if(amount.equals("small"));
            this.sizePrice=(4.00);
        if(amount.equals("medium"))
            this.sizePrice=(6.00);
        if(amount.equals("large"))
            this.sizePrice=(8.00);
        if(amount.equals("extraLarge"))
            this.sizePrice=(10.00);

        this.size = amount;
    }


    //   Takes user input from buttons to assign what type of pizza ordered to variable pizzaType
    public void chooseType(String type)
    {
        if(!type.equals("regular")&&!type.equals("pan")&&!type.equals("deepDish"))
        {
            //throw exception
        }
         this.pizzaType = type;
    }

    // the type of cheese desired, makes all other cheese types false
    public void chooseCheese(String cheese)
    {
        switch(cheese)
        {
            case "nocheese":
                nocheese=true;
                regularcheese = extracheese = false;
                break;
            case "regularcheese":
                regularcheese = true;
                nocheese = extracheese = false;
                break;
            case "extracheese":
                extracheese = true;
                nocheese = regularcheese= false;
                break;
        }
    }


    //choose the sauce you want, makes all other sauce types false
    public void chooseSauce(String sauce)
    {
        switch(sauce)
        {
            case "nosauce":
                noSauce=true;
                regularSauce=extraSauce=false;
                break;
            case "regularsauce":
                regularSauce = true;
                noSauce = extraSauce=false;
                break;
            case "extrasauce":
                extraSauce=true;
                noSauce=regularSauce=false;
                break;
        }
    }


    //assigns numeral value of cheese spread (0-2)
    public void chooseCheeseSpread(int spd)
    {
    if(nocheese)
        nocheeseSpread=spd;
    else if(regularcheese)
        regcheeseSpread=spd;
    else
        extracheeseSpread=spd;
    }

//assigns numeral value of sauce spread (0-2)
    public void chooseSauceSpread(int spd)
    {
        if(noSauce)
            noSauceSpread=spd;
        else if(regularSauce)
            regularSauceSpread = spd;
        else
            extraSauceSpread=spd;
    }

    public void finishPizza()
    {
        isFinished=true;
    }

    public boolean isFinished()
    {
        return isFinished;
    }

//make this topping true and includes it in the toppings array
    public void addToppings(String topping)
    {
        switch(topping)
        {
            case "pepperoni":
                this.pepperoni=true;
                topA(0,true);
                break;
            case "sausage":
                this.sausage=true;
                topA(1,true);
                break;
            case "ham":
                this.ham=true;
                topA(2,true);
                break;
            case "canadianBacon":
                this.canadianBacon=true;
                topA(3,true);
                break;
            case "mushrooms":
                this.mushrooms=true;
                topA(4,true);
                break;
            case "tomatoes":
                this.tomatoes=true;
                topA(5,true);
                break;
            case "pineapple":
                this.pineapple=true;
                topA(6,true);
                break;
            case "onions":
                this.onions=true;
                topA(7,true);
                break;
            case "greenPeppers":
                this.greenPeppers=true;
                topA(8,true);
                break;
            case "blkOlives":
                this.blkOlives=true;
                topA(9,true);
                break;
            case "spinach":
                this.spinach=true;
                topA(10,true);
                break;
            case "jalapeno":
                this.jalapeno=true;
                topA(11,true);
                break;
            default:
                //throw exception
        }
        this.toppingsPrice();
    }
 //   With each added topping, a space in the array pizzaToppings will updated according to each specific topping


    //removes the selected topping by making the variable and it's spot in the array false
    public void removeToppings(String topping)
    {
        switch(topping)
        {
            case "pepperoni":
                this.pepperoni=false;
                topA(0,false);
                break;
            case "sausage":
                this.sausage=false;
                topA(1,false);
                break;
            case "ham":
                this.ham=false;
                topA(2,false);
                break;
            case "canadianBacon":
                this.canadianBacon=false;
                topA(3,false);
                break;
            case "mushrooms":
                this.mushrooms=false;
                topA(4,false);
                break;
            case "tomatoes":
                this.tomatoes=false;
                topA(5,false);
                break;
            case "pineapple":
                this.pineapple=false;
                topA(6,false);
                break;
            case "onions":
                this.onions=false;
                topA(7,false);
                break;
            case "greenPeppers":
                this.greenPeppers=false;
                topA(8,false);
                break;
            case "blkOlives":
                this.blkOlives=false;
                topA(9,false);
                break;
            case "spinach":
                this.spinach=false;
                topA(10,false);
                break;
            case "jalapeno":
                this.jalapeno=false;
                topA(11,false);
                break;
            default:
                //throw exception
        }
        this.toppingsPrice();
    }

    //  Updates the toppings in the array
    public void topA(int i, boolean s)
    {
        this.pizzaToppings[i]=s;
    }

    public void addSpread(String topping, int s)
     {
        switch(topping)
        {
            case "pepperoni":
                this.pepperoniSpread=s;
                spdA(0,s);
                break;
            case "sausage":
                this.sausageSpread=s;
                spdA(1,s);
                break;
            case "ham":
                this.hamSpread=s;
                spdA(2,s);
                break;
            case "canadianBacon":
                this.canadianBaconSpread=s;
                spdA(3,s);
                break;
            case "mushrooms":
                this.mushroomsSpread=s;
                spdA(4,s);
                break;
            case "tomatoes":
                this.tomatoesSpread=s;
                spdA(5,s);
                break;
            case "pineapple":
                this.pineappleSpread=s;
                spdA(6,s);
                break;
            case "onions":
                this.onionsSpread=s;
                spdA(7,s);
                break;
            case "greenPeppers":
                this.greenPeppersSpread=s;
                spdA(8,s);
                break;
            case "blkOlives":
                this.blkOlivesSpread=s;
                spdA(9,s);
                break;
            case "spinach":
                this.spinachSpread=s;
                spdA(10,s);
                break;
            case "jalapeno":
                this.jalapenoSpread=s;
                spdA(11,s);
                break;
            default:
                //throw exception
        }
     }
 //   With each topping added, an update will be made to the array pizzaSpread to specify what type of spread according to each topping.

    public void spdA(int i, int s)
    {
        //don't let 's' be above 2, throw exception
        this.pizzaSpread[i]=s;
    }
    //updates the topping spread in the array

    public void toppingsPrice()
    {
        int counter=-1;
        for(boolean top:this.pizzaToppings)
        {
            if(top)
                counter++;
        }
        if(counter>0)
        {
            if(size.equals("small"))
                toppingsPrice+=(counter*0.5);
            if(size.equals("medium"))
                toppingsPrice+=(counter*0.75);
            if(size.equals("large"))
                toppingsPrice+=(counter*1.0);
            if(size.equals("extraLarge"))
                toppingsPrice+=(counter*1.25);
        }
    }

    public boolean complete()
    {
        if(size==null || price==0.0 || (nocheese==false && regularcheese==false && extracheese==false) ||
                (noSauce==false && regularSauce==false && extraSauce==false))
            return false;
        else
            return true;
    }

    public String toString()
    {
        String pizza=size+" "+pizzaType+", with";
        if(regularcheese)
            pizza+=" regular cheese,";
        else if(nocheese)
            pizza+=" no cheese,";
        else if(extracheese)
            pizza+=" extra cheese,";

        if(regularSauce)
            pizza+="regular sauce,";
        else if(noSauce)
            pizza+=" no sauce,";
        else if(extraSauce)
            pizza+=" extra sauce, ";

        if(pepperoni)
            pizza+="pepperoni, ";
        if(sausage)
            pizza+="sausage, ";
        if(ham)
            pizza+="ham";
        if(canadianBacon)
            pizza+="candian bacon, ";
        if(mushrooms)
            pizza+="mushrooms, ";
        if(tomatoes)
            pizza+="tomatoes, ";
        if(pineapple)
            pizza+="pineapple, ";
        if(onions)
            pizza+="onions, ";
        if(greenPeppers)
            pizza+="green peppers, ";
        if(blkOlives)
            pizza+="black olives, ";
        if(spinach)
            pizza+="spinach, ";
        if(jalapeno)
            pizza+="jalapenos, ";
        return pizza.substring(0,pizza.length()-2);
    }
}
