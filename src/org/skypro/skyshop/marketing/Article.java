package org.skypro.skyshop.marketing;

public class Article implements Searchable {

    private final String name;
    private final String text;

    public Article(String name, String text) {
        this.name = name;
        this.text = text;
    }

    @Override
    public String toString() {
        return (name + "\n" + text);
    }

    @Override
    public String getSearchTerm() {
        return ("\n"+ toString() + "\nARTICLE");
    }

    @Override
    public String getContentType() {
        return  "ARTICLE";
    }

    @Override
    public String getStringRepresentation() {
        return this.name;
    }
}



