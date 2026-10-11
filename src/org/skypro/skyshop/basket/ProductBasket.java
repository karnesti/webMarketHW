package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

public class ProductBasket {

    private Product[] prods = new Product[5];
    private int i = 0;

    public ProductBasket() {
        System.out.println("Корзина пользователя успешно создана ");
    }

    public void addProduct(Product newProd) {
        if (i < 5) {
            prods[i] = newProd;
            // System.out.println(prods[i].toString() + " - успешно добавлен в корзину");
            i++;
        } else System.out.println("!! Невозможно добавить продукт !!");

    }

    public int costBasket() {
        int cost = 0;
        for (int j = 0; j < prods.length; j++) {
            if (prods[j] != null) cost = cost + prods[j].getPrice();

        }
        return cost;
    }

    public int countSpecial() {
        int count = 0;

        if (i > 0) {
            for (Product prod : prods) {
                if ((prod != null) && (prod.isSpecial())) {
                    count++;
                }
            }
        }
        return count;
    }

    public void printBasket() {


        if (i > 0) {
            for (Product prod : prods) {
                if (prod != null) {
                    System.out.println(prod.toString());
                }
            }
            System.out.println("Итого: " + this.costBasket() + " руб");
            System.out.println("Специальных товаров: " + this.countSpecial());
        } else System.out.println("в корзине пусто");
    }


    public boolean checkProduct(String prodName) {

        boolean check = false;

        for (int j = 0; j < prods.length; j++) {
            if ((prods[j] != null) && (prodName.equals(prods[j].getName()))) {
                check = true;
            }
        }

        return check;

    }

    public void cleanBasket() {

        for (int j = 0; j < prods.length; j++) {

            prods[j] = null;
            i = 0;

        }

        System.out.println("Корзина очищена");

    }

}

