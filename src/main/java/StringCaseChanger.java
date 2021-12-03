public class StringCaseChanger implements StringTranformer{

    @Override
    public void execute(StringDrink drink) {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < drink.getText().length(); i++){
            if(Character.isLowerCase(drink.getText().charAt(i))){
                stringBuilder.append(Character.toUpperCase(drink.getText().charAt(i)));
            } else {
                stringBuilder.append(Character.toLowerCase(drink.getText().charAt(i)));
            }
        }
        drink.setText(stringBuilder.toString());
    }
}
