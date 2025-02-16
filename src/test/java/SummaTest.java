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
        calculator.sum(12,22);
    }

    @DataProvider(name = "numbers for summ")
    public Object[][] numbersSumm() {
        return new Object[][] {
                {2, "smallChetnoe"},
                {3, "smallNechetnoe"},
                {18, "biggerChentnoe"},
                {27, "biggerNechentoe"},
        };
    }

    @Test(dataProvider = "numbers for summ")
    public void testSumm(int x, int y, int expected) {
        Assert.assertEquals(calculator.sum(x, y), expected);
    }
}
