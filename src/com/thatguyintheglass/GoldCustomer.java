package com.thatguyintheglass;

public class GoldCustomer implements ICustomer{

    //state
    private int ID;
    private String Name;

    public GoldCustomer(int id, String name)

    {
        this.ID = id;
        this.Name = name;
    }


    @Override
    public String getCustomerName() {
        return Name;
    }

    @Override
    public double getPriceForProduct(double fullPrice) {
        return fullPrice*0.80;
    }
}
