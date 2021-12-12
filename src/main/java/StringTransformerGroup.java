import java.util.List;

public class StringTransformerGroup implements StringTranformer {

    List<StringTranformer> transformers;

    public StringTransformerGroup(List<StringTranformer> transformers){
        this.transformers = transformers;
    }

    @Override
    public void execute(StringDrink drink) {
        for(StringTranformer tranformer : transformers){
            tranformer.execute(drink);
        }

    }
}
