import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DivideTest extends BaseTest {

    @Test(priority = 3, description = "this test check divide with small numbers")
    public void divideSmallNumbers() {
        calculator.divide(8,2);
    }

    @Test(retryAnalyzer = Retry.class)
    public void divideBigNumbers() {
        calculator.divide(111,11);
    }

    @DataProvider(name = "divisionDataProvider")
    public Object[][] divisionDataProvider() {
        return new Object[][]{
                {111, 11},
                {100, 25},
                {50, 5},
                {20, 4},
                {0, 1},
                {1, 1},
                {1000, 100},
                {123456789, 12345}
        };
    }
    @Test(dataProvider = "divisionDataProvider")
    public void testDivideWithDataProvider(int dividend, int divisor,int expected) {
        int result = calculator.divide(dividend, divisor);
        Assert.assertEquals(result, expected);
    }
}
