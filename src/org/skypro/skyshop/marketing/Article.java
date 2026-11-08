package org.skypro.skyshop.marketing;

public class Article implements Searchable {

    String name;
    String text;

    public Article (String name, String text) {
        this.name=name;
        this.text=text;
    }

    @Override
    public String toString () {
        return (name + "\n" + text);
    }

    @Override
    public String getSearchTerm() {
        return (toString ()+ " ARTICLE");
    }
}



