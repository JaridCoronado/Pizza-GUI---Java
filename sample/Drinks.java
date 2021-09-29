package sample;

public class Drinks {

    private String flavor;
    private String size;

    public Drinks(String flavor, String size) {
        this.flavor = flavor;
        this.size = size;
    }

    public void setFlavor(String newFlavor) {
        this.flavor = newFlavor;
    }

    public String getFlavor() {
        return this.flavor;
    }

    public void setSize(String newSize) {
        this.size = newSize;
    }

    public String getSize() {
        return this.size;
    }

    public int getPrice() {
        return 1;
    }

    @Override
    public String toString() {
        return (this.size + " " + this.flavor);
    }

}
