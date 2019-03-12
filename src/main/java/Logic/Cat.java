package Logic;

public class Cat extends Animal {
    private String BadHabits;
    private int price;

    public String getBadHabits()
    {
        return BadHabits;
    }
    private String setBadHabits(String badHabits)
    {
        return this.BadHabits = badHabits;
    }

    public int getPrice(){
        return price;
    }

    public Cat(String name, Gender gender, String BadHabits) {
        super(name, gender);
        this.BadHabits = BadHabits;
        price = calcPrice();
    }

    private int calcPrice(){
        char[] badHabitsLength = getBadHabits().toCharArray();
        int price = 350;

        for (int i = 0; i < badHabitsLength.length; i++){
            if (price - 20 < 35){
                return price;
            }
            price = price - 20;
        }
        return price;
    }
}
