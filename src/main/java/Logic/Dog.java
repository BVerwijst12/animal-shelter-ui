package Logic;

import java.util.Calendar;
import java.util.Date;

public class Dog extends Animal {
    public Date LastWalk;
    private int price;

    public int getPrice(){
        return price;
    }

    public Dog(String name, Gender gender){
        super(name, gender);
    }

    public Dog(String name, Gender gender, int price)
    {
        super(name, gender);
        LastWalk = Calendar.getInstance().getTime();
        this.price = price;
    }

    public boolean NeedsWalk()
    {
        return Calendar.getInstance().getTime().compareTo(LastWalk) > 1;
    }

}
