package domain;

public class Dough {
    private String name;
    private Integer cookTime;
    private Integer cookTemp;

    private Integer maxIngredients;

    public Dough(String name, Integer cookTime, Integer cookTemp, Integer maxIngredients) {
        this.name = name;
        this.cookTime = cookTime;
        this.cookTemp = cookTemp;
        this.maxIngredients = maxIngredients;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCookTime() {
        return cookTime;
    }

    public void setCookTime(Integer cookTime) {
        this.cookTime = cookTime;
    }

    public Integer getCookTemp() {
        return cookTemp;
    }

    public void setCookTemp(Integer cookTemp) {
        this.cookTemp = cookTemp;
    }

    public Integer getMaxIngredients() {
        return maxIngredients;
    }

    public void setMaxIngredients(Integer maxIngredients) {
        this.maxIngredients = maxIngredients;
    }
}
