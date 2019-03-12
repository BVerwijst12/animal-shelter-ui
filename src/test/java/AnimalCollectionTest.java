import Logic.*;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class AnimalCollectionTest {
    static AnimalCollection animalCollection;

    @BeforeAll
    public static void TestSetup(){
        animalCollection = new AnimalCollection();

        Dog dog = new Dog("henk", Gender.Male, animalCollection.calcDogPrice());
        Dog dog2 = new Dog("henk", Gender.Male, animalCollection.calcDogPrice());
        Dog dog3 = new Dog("henk", Gender.Male, animalCollection.calcDogPrice());

        animalCollection.addAnimal(dog);
        animalCollection.addAnimal(dog2);
        animalCollection.addAnimal(dog3);
    }


    @Test
    public void calcDogPriceTest(){
        int actual = animalCollection.calcDogPrice();
        int expected = 200;

        Assert.assertEquals(expected, actual);
    }
}
