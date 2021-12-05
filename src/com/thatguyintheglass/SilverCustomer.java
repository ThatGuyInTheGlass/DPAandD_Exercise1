package com.thatguyintheglass;

public class SilverCustomer implements ICustomer{


    //state
    private int ID;
    private String Name;

    public SilverCustomer(int id, String name)
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
        if (fullPrice > 500) {
            return fullPrice*0.85;
        }

        else {
            return fullPrice;
        }
    }
}
