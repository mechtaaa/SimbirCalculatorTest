
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalculatorPage {
    public WebDriver driver;

    public  CalculatorPage (WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }

    @FindBy(xpath="//input[@aria-label='Найти']")
    public WebElement search;
    @FindBy(xpath="//input[@value='Поиск в Google']")
    public WebElement input;
    @FindBy(xpath = "//div[@jsname='N10B9']")
    public WebElement numberOne;
    @FindBy(xpath = "//div[@jsname='YovRWb']")
    public WebElement multiply;
    @FindBy(xpath = "//div[@jsname='lVjWed']")
    public WebElement numberTwo;
    @FindBy(xpath = "//div[@jsname='pPHzQc']")
    public WebElement minus;
    @FindBy(xpath = "//div[@jsname='KN1kY']")
    public WebElement numberThree;
    @FindBy(xpath = "//div[@jsname='XSr6wc']")
    public WebElement plus;
    @FindBy(xpath = "//div[@jsname='Pt8tGc']")
    public WebElement total;
    public void openCalculator(){
        search.sendKeys("Калькулятор");
        input.click();
    }
    public void calculator(){
        numberOne.click();
        multiply.click();
        numberTwo.click();
        minus.click();
        numberThree.click();
        plus.click();
        numberOne.click();
        total.click();
    }
    @FindBy (xpath = "//span[contains(text(), '1 × 2 - 3 + 1 =')]")
    public WebElement totalResult;
    public boolean memoryResult(){
        return totalResult.isDisplayed();
    }
    public String getAnswerTwo(){
        String result = driver.findElement(By.xpath("//span[@jsname='VssY5c']")).getText();
        return result;
    }
}