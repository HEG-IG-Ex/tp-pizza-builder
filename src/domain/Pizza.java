package domain;

import java.util.List;

public class Pizza {
    private Dough dough;
    private BaseType base;
    private List<Ingredient> ingredients;
    private List<Cheese> cheeses;

    public Pizza(Dough dough, BaseType base, List<Ingredient> ingredients, List<Cheese> cheeses) {
        this.dough = dough;
        this.base = base;
        this.ingredients = ingredients;
        this.cheeses = cheeses;
    }
}
