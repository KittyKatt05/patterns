import java.util.List;

public class StringRecipe {

    List<StringTranformer> transformers;

    public StringRecipe(List<StringTranformer> transformers){
        this.transformers = transformers;
    }


    public void mix(StringDrink drink){
        for(StringTranformer tranformer : transformers){
            tranformer.execute(drink);
        }

    }
}
