import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends BaseClass{

    public HomePage(){}

    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//div[contains(@class, 'dropdown-login')]//a[contains (text(), 'Sign Up')]")
    private WebElement signUpElement;

    @FindBy(className = "dropdown-login")
    private WebElement logInDropDown;

    @FindBy(xpath = "//div[@id='select2-drop']/div/input")
    private WebElement destination;

    @FindBy(id = "s2id_autogen1")
    private WebElement field;

    @FindBy(css = "span.select2-match")
    private WebElement dropdownItem;

    @FindBy(xpath = "//form[@name= 'HOTELS']//button[contains(text(), 'Search')]")
    private WebElement searchButton;

    @FindBy(className = "dropdown-login")
    private WebElement DropDownMyAccount; //My account (you click there, when you want to log in, or sign up)

    @FindBy(xpath = "//div[contains(@class, 'dropdown-login')]//a[contains (text(), 'Login')]" )
    private  WebElement LogInElement;  // Login button

    public SignUpPage goToSignUpPage() {
        this.logInDropDown.click();
        this.signUpElement.click();
        return new SignUpPage(driver);
    }
    public LoginPage OpenLoginPage() {// type = LoginPage
        this.DropDownMyAccount.click();
        this.LogInElement.click();
        return new LoginPage(driver);
    }

    private HomePage setValueIntoDestination(String destination) {
        this.field.click();
        this.destination.sendKeys(destination);
        return this;
    }

    public HomePage selectValueFromList(String destination) {
        setValueIntoDestination(destination);
        this.dropdownItem.click();
        return this;
    }


}