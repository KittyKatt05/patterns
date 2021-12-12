public class StringReplacer implements StringTranformer{

    private char a;
    private char b;

    public StringReplacer(char a, char b){
        this.a = a;
        this.b = b;
    }


    @Override
    public void execute(StringDrink drink) {
        String aux;
        aux = drink.getText().replace(a, b);
        drink.setText(aux);


    }
}
