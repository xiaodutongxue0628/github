package zuoye03;

public class Computer {
    private double price;
    private String color;
    private String typename;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "price=" + price +
                ", color='" + color + '\'' +
                ", typename='" + typename + '\'' +
                '}';
    }
}
