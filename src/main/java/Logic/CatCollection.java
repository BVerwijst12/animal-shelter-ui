package Logic;

import java.util.ArrayList;

public class CatCollection {
    public ArrayList<Cat> allCats;

    public CatCollection(){
        allCats = new ArrayList<Cat>();
    }

    public int calcPrice(Cat cat){
        char[] badHabitsLength = cat.getBadHabits().toCharArray();
        int price = 350;

        for (int i = 0; i < badHabitsLength.length; i++){
            if (priceCheck(price)){
                price = price - 20;
            }
        }
        return price;
    }
    public boolean priceCheck(int price){
        if (price - 20 < 35){
            return false;
        }
        return true;
    }

    public void addCat(String name, Gender gender, String badHabits){
        Cat cat = new Cat(name, gender, badHabits);

        allCats.add(cat);
    }
}
