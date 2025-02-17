import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MinusTest extends BaseTest {

    @Test(priority = 2, description = "this test check minus with small numbers")
    public void minusSmallNumbers() {
        calculator.minus(8,4);
    }

    @Test(priority = 1,description = "this test check minus with bigger numbers")
    public void minusBiggerNumbers() {
        calculator.minus(96, 69);
    }
    @DataProvider(name = "minusDataProvider")
    public Object[][] minusDataProvider() {
        return new Object[][]{
                {8, 4},
                {100, 50},
                {200, 150},
                {10, 10},
                {50, 25},
                {0, 0},
                {5, 3},
                {1000, 999}
        };
    }

    @Test(dataProvider = "minusDataProvider", priority = 3, description = "this test checks minus with various values")
    public void testMinusWithDataProvider(int minuend, int subtrahend, int expected) {
        int result = calculator.minus(minuend, subtrahend);
        Assert.assertEquals(result, expected);
    }
}
