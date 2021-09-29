package sample;

public class BreadBites extends Sides
{
    private boolean garlic;
    private boolean butter;
    private double price;

    public BreadBites(boolean garlic, boolean butter)
    {
        this.garlic = garlic;
        this.butter = butter;
        this.price = 2.0;
    }

    public void addGarlic()
    {
        this.garlic = true;
    }

    public void removeGarlic()
    {
        this.garlic = false;
    }

    public void addButter()
    {
        this.butter=true;
    }

    public void removeButter()
    {
        this.butter=false;
    }

    public double getPrice()
    {
        return price;
    }

    public void addPrice(double amount)
    {
        this.price += amount;
    }

    public void removePrice(double amount)
    {
        this.price-= amount;
        if(this.price<0.0)
            price=0.0;
    }

    public String toString()
    {
        String bs = "Breadsticks ";
        if(garlic && !butter)
            bs += "with garlic";
        else if(butter && !garlic)
            bs+="with butter";
        else if(butter && garlic)
            bs+=" with butter and garlic";
        return bs;
    }
}

