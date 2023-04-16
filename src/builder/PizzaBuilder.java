package builder;

import domain.*;

import java.util.ArrayList;
import java.util.List;

public class PizzaBuilder {
    private Dough dough;
    private Base base;
    private List<Ingredient> ingredients;
    private List<Cheese> cheeses;

    public PizzaBuilder() {
        ingredients = new ArrayList<>();
        cheeses = new ArrayList<>();
    }

    public void setBase(Base base) {
        this.base = base;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public void addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
    }

    public void addCheese(Cheese cheese) {
        cheeses.add(cheese);
    }

    public Pizza build() {
        return new Pizza(dough, base, ingredients, cheeses);
    }
}
