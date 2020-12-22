package com.example.beeradviser;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {
    List<String> getBrands(String color) {
        List<String> brands = new ArrayList<>();
        if (color.equals("light")) {
            brands.add("Jail Pale Ale");
            brands.add("India Pale Ale");
        }
        if (color.equals("amber")) {
            brands.add("Jack Amber");
            brands.add("Red Moose");
        }
        if (color.equals("brown")) {
            brands.add("Brown Ale");
            brands.add("Nut Brown Ale");
        }
        if (color.equals("dark")) {
            brands.add("Gout Stout");
            brands.add("Munich Dunkel");
        }
        return brands;
    }
}
