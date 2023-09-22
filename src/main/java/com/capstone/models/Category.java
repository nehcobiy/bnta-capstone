package com.capstone.models;

public enum Category {

    BOOKS("Books"),
    HOMEWARE("Homeware"),
    ELECTRONICS("Electronics"),
    TOYS("Toys"),
    MEDIA("Media");

    private final String displayCategoryName;

    Category(String displayCategoryName){
        this.displayCategoryName = displayCategoryName;
    }

    public String getDisplayCategoryName(){
        return displayCategoryName;
    }

}
