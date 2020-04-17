import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends BaseClass{
    public SignUpPage(WebDriver driver){
        super(driver);
    }


    @FindBy(name = "firstname")
    private WebElement firstname;

    @FindBy(name = "lastname")
    private WebElement lastname;

    @FindBy(name = "phone")
    private WebElement phone;

    @FindBy(name = "email")
    private WebElement email;

    @FindBy(name = "password")
    private WebElement password;

    @FindBy(name = "confirmpassword")
    private WebElement confirmPassword;

    @FindBy(className = "signupbtn")
    private WebElement signUpBtn;


    public SignUpPage setFirstName (String value){
        firstname.sendKeys(value);
        return this;
    }

    public SignUpPage setLastName (String value){
        lastname.sendKeys(value);
        return this;
    }

    public SignUpPage setPhone (String value){
        phone.sendKeys(value);
        return this;
    }

    public SignUpPage setEmail (String value){
        email.sendKeys(value);
        return this;
    }

    public SignUpPage setPassword (String value){
        password.sendKeys(value);
        return this;
    }

    public SignUpPage setConfirmPassword (String value){
        confirmPassword.sendKeys(value);
        return this;
    }

    public String getNameOfButton(){
        return signUpBtn.getText();
    }
    public AccountPage goToAccountPage(){
        this.setFirstName("Mark");
        this.setLastName("Wolberg");
        this.setPhone("123456789");
        this.setEmail("test10@mail.com");
        this.setPassword("test11");
        this.setConfirmPassword("test11");
        this.signUpBtn.click();
        return new AccountPage(driver);
    }

}
