package org.skypro.skyshop.product;

import org.skypro.skyshop.marketing.Searchable;

public abstract class Product implements Searchable {

    protected final String name;


    public Product(String name) { //, int price

        this.name = name;

    }

    public String getName() {
        return this.name;
    }

    public abstract int getPrice();

    public abstract boolean isSpecial();

    @Override
    public String toString() {
        return (name + ". ");
    }

    @Override
    public String getSearchTerm() {
        String searchTerm = this.name + " PRODUCT";
        return  searchTerm;
    }

}
