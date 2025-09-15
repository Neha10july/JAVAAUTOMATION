package login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BaseTest {
    private WebDriver driver;

    // Locators
    private By username = By.id("username");
    private By password = By.id("password");
    private By loginBtn = By.id("login");
    private By errorMsg = By.id("error");  // example error message locator

    // Constructor
    public BaseTest(WebDriver driver) {
        this.driver = driver;
    }

    // Actions
    public void enterUsername(String user) {
        driver.findElement(username).sendKeys(user);
    }

    public void enterPassword(String pass) {
        driver.findElement(password).sendKeys(pass);
    }

    public void clickLogin() {
        driver.findElement(loginBtn).click();
    }

    public void login(String user, String pass) {
        enterUsername(user);
        enterPassword(pass);
        clickLogin();
    }

    public String getErrorMessage() {
        return driver.findElement(errorMsg).getText();
    }
}

