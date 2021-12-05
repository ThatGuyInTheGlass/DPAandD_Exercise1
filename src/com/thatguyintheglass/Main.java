package com.thatguyintheglass;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<ICustomer> customers = new ArrayList<ICustomer>();
        customers.add(new GoldCustomer(1,"MA'KHIA BRYANT"));
        customers.add(new SilverCustomer(2,"ALVIN MOTLEY JR."));
        customers.add(new Customer(3,"DAUNTEE WRIGHT"));
        customers.add(new GoldCustomer(4,"JAMES LIONEL JOHNSON"));
        customers.add(new Customer(5,"QUAWAN CHARLES"));
        customers.add(new Customer(6,"RAYSHARD BROOKS"));
        customers.add(new Customer(7,"MAURICE ABISDID-WAGNER"));
        customers.add(new SilverCustomer(8,"JAQUYN O'NEILL LIGHT"));
        customers.add(new GoldCustomer(9,"MARQUISE JONES"));
        customers.add(new SilverCustomer(10,"NATASHA MCKENNA"));

        for (ICustomer customer : customers) {
            System.out.println(customer.getCustomerName() + " will pay " + customer.getPriceForProduct(300) + " for a product with a full price of 300");
            System.out.println(customer.getCustomerName() + " will pay " + customer.getPriceForProduct(3800) + " for a product with a full price of 3800");
        }
    }
}
