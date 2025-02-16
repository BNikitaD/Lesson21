import org.testng.annotations.Test;

public class DivideTest extends BaseTest{

    @Test(priority = 3, description = "this test check divide with small numbers")
    public void divideSmallNumbers() {
        calculator.divide(8,2);
    }

    @Test(retryAnalyzer = Retry.class)
    public void divideBigNumbers() {
        calculator.divide(111,11);
    }
}
