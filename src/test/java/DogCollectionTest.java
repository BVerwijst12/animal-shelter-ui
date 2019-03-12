import Logic.DogCollection;
import Logic.Gender;
import Logic.Dog;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class DogCollectionTest {
    static DogCollection dogCollection;
    @BeforeAll
    public static void testSetup(){
        dogCollection = new DogCollection();
        dogCollection.allDogs.add(new Dog("dog", Gender.Male));
        dogCollection.allDogs.add(new Dog("dog", Gender.Male));
        dogCollection.allDogs.add(new Dog("dog", Gender.Male));

    }
    @Test
    public void calcDogPriceTest(){
        int actual = dogCollection.calcDogPrice();
        int expected = 350;

        Assert.assertEquals(expected, actual);
    }
}
