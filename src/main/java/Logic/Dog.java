package Logic;

import java.util.Calendar;
import java.util.Date;

public class Dog extends Animal {
    public Date LastWalk;

    public Dog(String name, Gender gender)
    {
        super(name, gender);
        LastWalk = Calendar.getInstance().getTime();
    }

    public boolean NeedsWalk()
    {
        return Calendar.getInstance().getTime().compareTo(LastWalk) > 1;
    }

}
