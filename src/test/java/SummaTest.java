import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SummaTest extends BaseTest{

    @Test(priority = 1, description = "this test check summ with small numbers")
    public void summSmallNumbers() {
        calculator.sum(2,5);
    }

    @Test(priority = 2, description = "this test check big with small numbers" )
    public void summBigNumbers() {
        calculator.sum(122,128);
    }

    @DataProvider(name = "numbers")
    public static Object[][] evenNumbers() {
        return new Object[][]{{1, false}, {2, true}, {4, true}};
    }

    @Test(dataProvider = "numbers")
    public void givenNumberFromDataProvider_ifEvenCheckOK_thenCorrect
            (Integer number, boolean expected) {
        Assert.assertEquals(expected, number % 2 == 0);
    }
}
