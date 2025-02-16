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
}
