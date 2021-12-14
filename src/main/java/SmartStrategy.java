import java.util.ArrayList;
import java.util.List;

public class SmartStrategy implements OrderingStrategy{

    private List<StringDrink> drinks = new ArrayList<>();
    private List<StringRecipe> recipes = new ArrayList<>();
    private List<StringBar> bars = new ArrayList<>();

    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        if(bar.isHappyHour()){
            bar.order(drink, recipe);
        } else {
            drinks.add(drink);
            recipes.add(recipe);
            bars.add(bar);
        }

    }

    @Override
    public void happyHourStarted(StringBar bar) {
        for(int i=0; i< drinks.size(); i++){
            bars.get(i).order(drinks.get(i), recipes.get(i));
        }
        bars.clear();
        drinks.clear();
        recipes.clear();
    }

    @Override
    public void happyHourEnded(StringBar bar) {

    }
}
