import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BaseClass {

    public LoginPage(WebDriver driver) {
        super(driver);

    }

    @FindBy(name = "username")
    private WebElement emailField;

    @FindBy(name = "password")
    private WebElement passwordField;

    @FindBy(className = "loginbtn")
    private WebElement loginButton;

    @FindBy(css = "a[href = 'https://www.phptravels.net/account/logout/']")
    private WebElement logoutButton;

    public LoginPage setEmail(String value) {
        emailField.sendKeys(value);
        return this;
    }

    public LoginPage setPassword(String value) {
        passwordField.sendKeys(value);
        return this;
    }

    public AccountPage clickLoginButton (){
        loginButton.click();
        return new AccountPage(driver);
    }

    public LoginPage clickLogoutButton(){
        logoutButton.click();
        return new LoginPage(driver);
    }


}