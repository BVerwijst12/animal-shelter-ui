package Logic;

import java.util.ArrayList;

public class Reservation {
    private ArrayList<Animal> Anminals;

    public Reservation()
    {
        Anminals = new ArrayList<Animal>();
    }

    public ArrayList<Animal> getAnminals()
    {
        return Anminals;
    }

    public void NewCat(String name, Gender gender, String badHabits)
    {
        Anminals.add(new Cat(name, gender, badHabits));
    }

    public void NewDog(String name, Gender gender){
        Anminals.add(new Dog(name, gender));
    }
}
