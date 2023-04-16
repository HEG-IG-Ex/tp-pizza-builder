package builder;

import domain.*;

import java.util.ArrayList;
import java.util.List;

public class PizzaBuilder {
    private Dough dough;
    private BaseType base;
    private List<Ingredient> ingredients;
    private List<Cheese> cheeses;

    public PizzaBuilder() {
        ingredients = new ArrayList<>();
        cheeses = new ArrayList<>();
    }

    public void setBaseType(BaseType base) {
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

    private boolean isBaseSet(){
        return this.base != null;
    }
    private boolean isDoughSet(){
        return this.dough != null;
    }
    private boolean isAtLeastOneCheese(){
        return this.cheeses.size() > 0;
    }

    private boolean isBaseTomatoe(){
        return (this.base == BaseType.TOMATOE);
    }

    private boolean isBaseWhite(){
        return !isBaseTomatoe();
    }

    private boolean containsStrongCheese(){
        for (Cheese c:cheeses) {
            if(c.getType() == CheeseType.STRONG){
                return true;
            }
        }
        return false;
    }

    private boolean contains(IngredientType t){
        for (Ingredient i:ingredients) {
            if(i.getType() == t){
                return true;
            }
        }
        return false;
    }

    private boolean respectMaxIngredient(){
        return this.ingredients.size() <= this.dough.getMaxIngredients();
    }

    private void validate() throws IllegalArgumentException{
        if(!isBaseSet()){
            throw new IllegalArgumentException("Base is missing");
        }

        if(!isDoughSet()){
            throw new IllegalArgumentException("Dough is missing");
        }

        if(contains(IngredientType.RED_MEAT) && !isBaseTomatoe()){
            throw new IllegalArgumentException("Can't create a pizza with red meat with another base than tomatoes");
        }

        if((contains(IngredientType.WHITE_MEAT) || contains(IngredientType.FISH)) && !isBaseWhite()){
            throw new IllegalArgumentException("Can't create a pizza with white meat or fish with a base tomatoes");
        }

        if(contains(IngredientType.FISH) && containsStrongCheese()){
            throw new IllegalArgumentException("Can't create a pizza with fish and strong cheese");
        }

        if(!respectMaxIngredient()){
            throw new IllegalArgumentException("Can't create a pizza with that much of ingredient on this kind of dough");
        }
    }

    public Pizza build() {

        try{
            validate();
            return new Pizza(dough, base, ingredients, cheeses);
        }catch(IllegalArgumentException IAE){
            IAE.printStackTrace();
            return null;
        }

    }
}
