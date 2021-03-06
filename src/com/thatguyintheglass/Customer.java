package com.thatguyintheglass;

public class Customer implements ICustomer{

    //state
    protected int ID;
    protected String Name;

    public Customer(int id, String name)
    {
        this.ID = id;
        this.Name = name;
    }

    //behaviour

    @Override
    public String getCustomerName() {
        return Name;
    }

    @Override
    public double getPriceForProduct(double fullPrice) {
        return fullPrice;
    }
}
