public class StringInverter implements StringTranformer {


    @Override
    public void execute(StringDrink drink) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(drink.getText());
        stringBuilder.reverse();
        drink.setText(stringBuilder.toString());
    }
}
