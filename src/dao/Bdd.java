package dao;

import domain.*;

import java.util.ArrayList;
import java.util.List;

public class Bdd {
    public static List<Dough> getDough(){
        List<Dough> doughs = new ArrayList<>();
        doughs.add(new Dough("Napolitaine", 2,400, 3));
        doughs.add(new Dough("Romaine", 15,230, 3));
        doughs.add(new Dough("Sfincione", 15,230, 3));
        doughs.add(new Dough("New York", 20,220, 3));
        doughs.add(new Dough("Chicago", 45,180, 6));
        return doughs;
    }
    public static List<Ingredient> getIngredients(){
        List<Ingredient> ingredients = new ArrayList<>();
        ingredients.add(new Ingredient("Jambon cuit", IngredientType.RED_MEAT));
        ingredients.add(new Ingredient("Jambon cru", IngredientType.RED_MEAT));
        ingredients.add(new Ingredient("Peperoni", IngredientType.RED_MEAT));
        ingredients.add(new Ingredient("Saumon", IngredientType.FISH));
        ingredients.add(new Ingredient("Anchois", IngredientType.FISH));
        ingredients.add(new Ingredient("Poulet", IngredientType.WHITE_MEAT));
        ingredients.add(new Ingredient("Champignons", IngredientType.VEGETABLES));
        ingredients.add(new Ingredient("Aubergines", IngredientType.VEGETABLES));
        ingredients.add(new Ingredient("Artichauts", IngredientType.VEGETABLES));
        ingredients.add(new Ingredient("Courgettes Grillés", IngredientType.VEGETABLES));
        ingredients.add(new Ingredient("Poireaux", IngredientType.VEGETABLES));
        ingredients.add(new Ingredient("Oignons", IngredientType.VEGETABLES));
        return ingredients;
    }
    public static List<Cheese> getCheese(){
        List<Cheese> cheeses = new ArrayList<>();
        cheeses.add(new Cheese("Mozzarella", CheeseType.LIGHT));
        cheeses.add(new Cheese("Gorgonzola", CheeseType.STRONG));
        cheeses.add(new Cheese("Raclette", CheeseType.STRONG));
        cheeses.add(new Cheese("Mascarpone", CheeseType.LIGHT));
        cheeses.add(new Cheese("Ricotta", CheeseType.LIGHT));
        return cheeses;
    }
}
