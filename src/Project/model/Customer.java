package Project.model;

import java.util.Objects;

public class Customer
{
    private int id_cust;

    private String name;


    public Customer(int id_cust, String name)
    {
        this.id_cust = id_cust;
        this.name = name;
    }


    public int getId_cust() {
        return id_cust;
    }

    public String getName() {
        return name;
    }

    public void setId_cust(int id_cust) {
        this.id_cust = id_cust;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "Customers{" +
                "id=" + id_cust +
                ", name='" + name + '\'' +
                '}';
    }


}
