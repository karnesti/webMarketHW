package org.skypro.skyshop.marketing;

public class SearchEngine {
    private Searchable[] searchable; //по которым делаем поиск;
    private Searchable[] searchResult = new Searchable[5];
    private int j = 0;
    private final int massLength;

    public SearchEngine(int massLength) {
        this.massLength=massLength;
        this.searchable = new Searchable[massLength];
    }

    public Searchable[] search (String searchStr) {
        int i = 0;
        for (Searchable current : searchable) {
            if (current.getSearchTerm().contains(searchStr)) {
                searchResult[i] = current;
                System.out.println(searchResult[i].getSearchTerm());
                i++;
            }

            if (i >= 5) break;
        }

        return searchResult;


    }


    public void add ( Searchable newElement) {
        if (j<massLength) {
            searchable[j] = newElement;
            j++;
        } else System.out.println("Массив переполнен");
    }


}
