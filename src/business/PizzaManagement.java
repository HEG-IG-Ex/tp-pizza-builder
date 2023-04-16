package business;

import builder.PizzaBuilder;
import dao.Bdd;
import domain.*;

import java.util.List;

public class PizzaManagement {
    public PizzaManagement() {
        Bdd bdd;

        List<Dough> doughs = Bdd.getDough();
        List<Ingredient> ingredients = Bdd.getIngredients();
        List<Cheese> cheeses = Bdd.getCheese();

        PizzaBuilder pizza = new PizzaBuilder();
        pizza.setDough(doughs.get(1));
        pizza.setBaseType(BaseType.TOMATOE);
        pizza.addIngredient(ingredients.get(1));
        pizza.addIngredient(ingredients.get(7));
        pizza.addIngredient(ingredients.get(8));
        pizza.addCheese(cheeses.get(1));
        pizza.addCheese(cheeses.get(2));

        Pizza p = pizza.build();
    }
}
