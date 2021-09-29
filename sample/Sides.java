package sample;

import java.util.*;
public class Sides
{

    private double price;
    private BreadSticks breadStk;
    private Cookie cookie;
    private BreadBites breadBite;
//  private Sides[] sideOrder;
    private LinkedList<Object> sideList = new LinkedList<Object>();

    public Sides()
    {
        this.price=0.0;
        this.breadStk=null;
        this.cookie= null;
        this.breadBite=null;
    }

    //With each addition of a side, the method will be called to add to the price variable
    public void addprice(double amount)
    {
        this.price += amount;
    }

    public void removePrice(double amount)
    {
        this.price-= amount;
        if(this.price<0.0)
            price=0.0;
    }

    //Updates array sideOrder with a new object of cookie
    public void addCookie(Cookie cookie)
    {
        sideList.add(cookie);
        this.price+=cookie.getPrice();
    }

    public void removeCookie(Cookie cookie)
    {
        sideList.remove(cookie);
        this.price-=cookie.getPrice();
    }
    //Updates array sideOrder with a new object of breadstick
    public void addBreadstick(BreadSticks bd)
    {
        sideList.add(bd);
        price+=bd.getPrice();
    }

    public void removeBreadstick(BreadSticks bd)
    {
        sideList.remove(bd);
        price-=bd.getPrice();
    }

    //Updates array sideOrder with a new object of breadbites
    public void addBreadBite(BreadBites bb)
    {
        sideList.add(bb);
        price+=bb.getPrice();
    }

    public double getPrice() {
        return this.price;
    }

    public void removeBreadBite(BreadBites bb)
    {
        sideList.remove(bb);
        price-=bb.getPrice();
    }


}


