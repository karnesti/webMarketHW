package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
// import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.marketing.Article;
import org.skypro.skyshop.marketing.SearchEngine;
import org.skypro.skyshop.product.SimpleProduct;
import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.product.FixPriceProduct;

public class App {
    public static void main(String[] args) {

        ProductBasket basket1 = new ProductBasket();

        SimpleProduct prod1 = new SimpleProduct("Ручка синяя Erich Krause", 29);
        DiscountedProduct prod2 = new DiscountedProduct ("Ручка синяя Attache", 100, (byte)10);
        FixPriceProduct prod3 = new FixPriceProduct("Карандаш Koh-i-Noor (HB)"); // , 22
        SimpleProduct prod4 = new SimpleProduct("Ластик Koh-i-Noor", 15);
        DiscountedProduct prod5 = new DiscountedProduct("Линейка 15 см Attache", 100, (byte)30);
        SimpleProduct prod6 = new SimpleProduct("Тетрадь 12 листов в клетку", 11);

        // Добавление продукта в корзину
        //System.out.println("\n--- 1. Добавление продукта в корзину ---");
        basket1.addProduct(prod1);
        basket1.addProduct(prod2);
        basket1.addProduct(prod3);
        basket1.addProduct(prod4);
        basket1.addProduct(prod5);

        //Добавление продукта в заполненную корзину, в которой нет свободного места.
        //System.out.println("\n--- 2. Добавление продукта в заполненную корзину ---");
        //basket1.addProduct(prod6);

        //Печать содержимого корзины с несколькими товарами.
        //System.out.println("\n--- 3. Печать содержимого корзины с несколькими товарами ---");
        //basket1.printBasket();

        //Получение стоимости корзины с несколькими товарами.
        //System.out.println("\n--- 4. Получение стоимости корзины с несколькими товарами ---");
        //System.out.println("Цена корзины: " + basket1.costBasket() + " руб.");

        //Поиск товара, который есть в корзине.
        //System.out.println("\n--- 5. Поиск товара, который есть в корзине ---");
        //System.out.println(basket1.checkProduct("Карандаш Koh-i-Noor (HB)"));


        //Поиск товара, которого нет в корзине.
        //System.out.println("\n--- 6. Поиск товара, которого нет в корзине ---");
        //System.out.println(basket1.checkProduct("Сапоги"));


        //Очистка корзины.
        //System.out.println("\n--- 7. Очистка корзины ---");
        //basket1.cleanBasket();

        //Печать содержимого пустой корзины.
        //System.out.println("\n--- 8. Печать содержимого пустой корзины ---");
        //basket1.printBasket();

        //Получение стоимости пустой корзины.
        //System.out.println("\n--- 9. Получение стоимости пустой корзины ---");
        //System.out.println("Цена корзины: " + basket1.costBasket() + " руб.");

        //Поиск товара по имени в пустой корзине.
        //System.out.println("\n--- 10. Поиск товара по имени в пустой корзине ---");
        //System.out.println(basket1.checkProduct("Карандаш Koh-i-Noor (HB)"));

        //------- ООП: наследование, абстрактные классы -----
        System.out.println("\n*** ООП: наследование, абстрактные классы ***");
        System.out.println("\nСоздание класса обычного товара. Объект класса SimpleProduct:");
        System.out.println(prod1.toString());
        System.out.println("\nСоздание класса товара со скидкой. Объект класса DiscountedProduct:");
        System.out.println(prod2.toString());
        System.out.println("\nСоздание класса товара с фиксированной ценой. Объект класса FixPriceProduct:");
        System.out.println(prod3.toString());

        System.out.println("\nПроверка изменений. Корзина:");
        basket1.printBasket();
        System.out.println();
        basket1.printBasket();

        //------- ООП: интерфейсы, полиморфизм -----
        System.out.println("\n*** ООП: интерфейсы, полиморфизм ***");
        SearchEngine searchEngine = new SearchEngine(10);
        searchEngine.add(prod1);
        searchEngine.add(prod2);
        searchEngine.add(prod3);
        searchEngine.add(prod4);
        searchEngine.add(prod5);
        searchEngine.add(prod6);

        Article article1 = new Article("Синяя ручка Erich Krause — пишите с удовольствием!", "Надёжная ручка с насыщенными синими чернилами подойдёт для учёбы, работы и повседневных записей. Удобный выбор всего за 29 рублей.");
        Article article2 = new Article("Attache: синяя ручка для важных идей", "Записывайте планы, конспекты и вдохновение плавно и аккуратно. Сейчас синяя ручка Attache стоит 90 рублей — скидка 10% уже учтена.");
        Article article3 = new Article("Карандаш Koh-i-Noor HB — точность в каждой линии", "Для заметок, эскизов и чертежей выбирайте карандаш Koh-i-Noor твёрдости HB. Отличный помощник для учёбы и творчества по фиксированной цене 99 рублей.");
        Article article4 = new Article("Линейка Attache 15 см — точность всегда под рукой", "Чертите ровные линии и делайте измерения на уроках и дома. Линейка Attache длиной 15 см стоит 70 рублей — скидка 30% уже учтена.");

        searchEngine.add(article1);
        searchEngine.add(article2);
        searchEngine.add(article3);
        searchEngine.add(article4);

        System.out.println("\n Результат поиска:");
        searchEngine.search("Koh-i-Noor");



    }
}
