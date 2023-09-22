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

    public static Category findByName(String name){

        Category result = null;

        for (Category category : values()){
            if (category.name().equalsIgnoreCase(name)){
                result = category;
                break;
            }
        }
        return result;
    }
}


