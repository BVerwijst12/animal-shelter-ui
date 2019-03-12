import Logic.Gender;
import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;
import Logic.Dog;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @Test
    public void NeedsWalkTest()
    {
        Dog dog = new Dog("dog", Gender.Male);
        Date date = Calendar.getInstance().getTime();

        boolean Test = false;

        assertEquals(Test, dog.NeedsWalk());
    }
}