package org.skypro.skyshop.product;

public abstract class Product {

    protected final String name;



    public Product (String name) { //, int price

        this.name=name;

    }

    public String getName () {
        return this.name;
    }

    public abstract int getPrice ();

    public abstract boolean isSpecial ();

    @Override
    public String toString() {
        return ( name + ". ");
    }
}
