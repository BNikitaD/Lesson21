import org.testng.annotations.Test;

public class MultiplicationTest extends BaseTest{

    @Test(priority = 1, description = "this test check multipl with small numbers")
    public void mulsmallNumbers() {
        calculator.multiplicaion(2,3);
    }

    @Test(priority = 2, description = "this test check multipl with bigger numbers")
    public void mulBiggerNumbers() {
        calculator.multiplicaion(23,21);
    }

    @Test(priority = 3, description = "this test check multipl with the biggest numbers")
    public void milTheBiggestNubmers() {
        calculator.multiplicaion(100, 200);
    }
}
