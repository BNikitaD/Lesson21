import org.testng.ITestListener;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

@Listeners(ITestListener.class)
    public class BaseTest {
    Calculator calculator;

    @BeforeMethod
    public void initTest() {
        calculator = new Calculator();
    }

    @AfterMethod
    public void endTest() {
    }
}
