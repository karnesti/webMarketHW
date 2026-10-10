package org.skypro.skyshop.product;

public class DiscountedProduct extends Product {

    private int basePrice;
    private byte discount ;

    public DiscountedProduct (String name, int price, byte discount ) {

        //this.name=name;
        super (name);

        this.basePrice=price;
        this.discount  = discount;
    }

    @Override
    public int getPrice () { return (this.basePrice - (this.basePrice * discount  / 100)); }

    @Override
    public boolean isSpecial () {return true;}

    @Override
    public String toString() {
        return (  super.name + "(СО СКИДКОЙ) : " +  this.getPrice() + " руб. " + " (СКИДКА: " + discount + "%)") ;
    }
}
