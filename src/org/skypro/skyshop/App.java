package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.Product;

public class App {
    public static void main(String[] args) {

        ProductBasket basket1 = new ProductBasket();

        Product prod1 = new Product("Ручка синяя Erich Krause", 29);
        Product prod2 = new Product("Ручка синяя Attache", 14);
        Product prod3 = new Product("Карандаш Koh-i-Noor (HB)", 22);
        Product prod4 = new Product("Ластик Koh-i-Noor", 15);
        Product prod5 = new Product("Линейка 15 см Attache", 12);
        Product prod6 = new Product("Тетрадь 12 листов в клетку", 11);

        // Добавление продукта в корзину
        System.out.println("\n--- 1. Добавление продукта в корзину ---");
        basket1.addProduct(prod1);
        basket1.addProduct(prod2);
        basket1.addProduct(prod3);
        basket1.addProduct(prod4);
        basket1.addProduct(prod5);

        //Добавление продукта в заполненную корзину, в которой нет свободного места.
        System.out.println("\n--- 2. Добавление продукта в заполненную корзину ---");
        basket1.addProduct(prod6);

        //Печать содержимого корзины с несколькими товарами.
        System.out.println("\n--- 3. Печать содержимого корзины с несколькими товарами ---");
        basket1.printBasket();

        //Получение стоимости корзины с несколькими товарами.
        System.out.println("\n--- 4. Получение стоимости корзины с несколькими товарами ---");
        System.out.println("Цена корзины: " + basket1.costBasket() + " руб.");

        //Поиск товара, который есть в корзине.
        System.out.println("\n--- 5. Поиск товара, который есть в корзине ---");
        System.out.println(basket1.checkProduct("Карандаш Koh-i-Noor (HB)"));


        //Поиск товара, которого нет в корзине.
        System.out.println("\n--- 6. Поиск товара, которого нет в корзине ---");
        System.out.println(basket1.checkProduct("Сапоги"));


        //Очистка корзины.
        System.out.println("\n--- 7. Очистка корзины ---");
        basket1.cleanBasket();

        //Печать содержимого пустой корзины.
        System.out.println("\n--- 8. Печать содержимого пустой корзины ---");
        basket1.printBasket();

        //Получение стоимости пустой корзины.
        System.out.println("\n--- 9. Получение стоимости пустой корзины ---");
        System.out.println("Цена корзины: " + basket1.costBasket() + " руб.");

        //Поиск товара по имени в пустой корзине.
        System.out.println("\n--- 10. Поиск товара по имени в пустой корзине ---");
        System.out.println(basket1.checkProduct("Карандаш Koh-i-Noor (HB)"));


    }
}
