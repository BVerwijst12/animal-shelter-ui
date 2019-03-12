package Logic;

public class Cat extends Animal {
    private String BadHabits;

    public String getBadHabits()
    {
        return BadHabits;
    }
    private String setBadHabits(String badHabits)
    {
        return this.BadHabits = badHabits;
    }

    public Cat(String name, Gender gender, String BadHabits) {
        super(name, gender);
        this.BadHabits = BadHabits;
    }
}
