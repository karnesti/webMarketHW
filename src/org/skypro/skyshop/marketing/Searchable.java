package org.skypro.skyshop.marketing;

public interface Searchable {

    public String getSearchTerm();
    public String getContentType();

    public default String getStringRepresentation() {
        return "0";
    }


}
