import Logic.Cat;
import Logic.CatCollection;
import Logic.Gender;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CatCollectionTest {
    static CatCollection catCollection;
    @BeforeAll
    public static void TestSetup(){
        catCollection = new CatCollection();
    }
    @Test
    public void calcCatPriceTest(){
        Cat cat = new Cat("cat", Gender.Male, "scratch");

        int expected = 350 - 7 * 20;
        int actual = catCollection.calcPrice(cat);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void calcCatPriceTestCheap(){
        Cat cat = new Cat("cat", Gender.Male, "breaks everything that ever could be broken");

        int expected = 50;
        int actual = catCollection.calcPrice(cat);

        Assert.assertEquals(expected, actual);
    }
}
