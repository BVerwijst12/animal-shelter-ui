import Logic.Cat;
import Logic.Gender;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class CatTest {
    @Test
    public void calcCatPriceTest(){
        Cat cat = new Cat("cat", Gender.Male, "scratch");

        int expected = 350 - 7 * 20;
        int actual = cat.getPrice();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void calcCatPriceTestCheap(){
        Cat cat = new Cat("cat", Gender.Male, "breaks everything that ever could be broken");

        int expected = 50;
        int actual = cat.getPrice();

        Assert.assertEquals(expected, actual);
    }
}
