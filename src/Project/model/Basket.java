package Project.model;

import java.util.Objects;

public class Basket
{
    private String name;

    private String product;

    private int price;


    public Basket(String name, String product, int price)
    {
        this.name = name;
        this.product = product;
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    @Override
    public String toString()
    {
        return "Basket{" +
                "Customer=" + name +
                ", Product=" + product +
                ", Price='" + price + '\'' +
                '}';
    }


}
