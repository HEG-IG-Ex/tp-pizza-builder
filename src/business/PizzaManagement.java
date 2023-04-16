package business;

import dao.Bdd;
import domain.Base;
import domain.Cheese;
import domain.Dough;
import domain.Ingredient;

import java.util.List;

public class PizzaManagement {
    public PizzaManagement() {
        Bdd bdd;

        List<Dough> doughs = Bdd.getDough();
        List<Base> bases = Bdd.getBase();
        List<Ingredient> ingredients = Bdd.getIngredients();
        List<Cheese> cheese = Bdd.getCheese();
    }
}
