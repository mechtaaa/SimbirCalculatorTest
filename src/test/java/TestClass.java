import org.junit.Assert;
import org.junit.Test;

public class TestClass extends Settings {
    @Test
    public void calculatorTest(){
        CalculatorPage calculatorPage= new CalculatorPage(driver);
        calculatorPage.openCalculator();
        calculatorPage.calculator();
        Assert.assertTrue(calculatorPage.memoryResult());
        Assert.assertEquals(calculatorPage.getAnswerTwo(), "0");
    }
}