package sample;

public class Cookie extends Sides
{
    private double price;

    public Cookie()
    {
        this.price=4.0;
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
        return "Cookie";
    }
}
