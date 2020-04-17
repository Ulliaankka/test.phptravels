import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import sun.security.krb5.internal.CredentialsUtil;

public class AccountPage  extends BaseClass {
    public AccountPage(WebDriver driver){
        super(driver);
    }
    @FindBy(css="a[href='#profile']")
    private WebElement My_Profile;
    @FindBy(css="a[href='#wishlist']")
    private WebElement Wishlist;
    @FindBy(css="a[href='#newsletter']")
    private WebElement NewsLetter;
    @FindBy(css="a[href='#bookings']")
    private WebElement Bookings;
    //This elements are workable when u  clicked on My Profile

    @FindBy(name = "email")
    private  WebElement EmailField;
    @FindBy(name = "password")
    private  WebElement PasswordField;
    @FindBy(name = "confirmpassword")
    private  WebElement ConfirmPasswordField;
    @FindBy(name = "address1")
    private  WebElement AddressField;
    @FindBy(name = "address2")
    private  WebElement Address2Field;
    @FindBy(name = "city")
    private  WebElement CityField;
    @FindBy(name = "state")
    private  WebElement StateField;
    @FindBy(name = "zip")
    private  WebElement PostalZipCodeField;
    @FindBy(name = "phone")
    private  WebElement PhoneField;
    @FindBy(className= "chosen-single")
    private  WebElement SelectCountryBox;
    @FindBy(className = "chosen-search-input")
    private WebElement CountryField;
    @FindBy(xpath = "//button[contains(text(),'Submit')]")
    private WebElement SubmitButton;

    //slider
    @FindBy(className = "slider")
    private WebElement Slider;
    //back to up
    @FindBy(id="back-to-top")
    private WebElement BackToTopButton;

    //tabs Open methods
    public AccountPage OpenMy_Profile(){ this.My_Profile.click(); return this; }
    public AccountPage OpenWishlist(){ this.Wishlist.click(); return this; }
    public AccountPage OpenNewsLetter(){ this.NewsLetter.click(); return this; }
    public AccountPage OpenBookings(){ this.Bookings.click(); return this; }

    // input fields
    public String getText_address1(){
        //this.My_Profile.click();
        return this.AddressField.getText();
    }
    public String getText_address2(){
        //this.My_Profile.click();
        return this.AddressField.getText();
    }

    public AccountPage Set_Address1(String value){
        //this.My_Profile.click();
        this.AddressField.sendKeys(value);
        return this;
    }
    public AccountPage Set_Address2(String value){
        //this.My_Profile.click();
        this.Address2Field.sendKeys(value);
        return this;
    }
    public  AccountPage ChangePassword(String password){
        this.My_Profile.click();
        this.PasswordField.sendKeys(password);
        this.ConfirmPasswordField.sendKeys(password);
        return this;
    }
    public AccountPage Click_Submit(){
        this.SubmitButton.click();
        return this;
    }
    public AccountPage Set_City(String value){
        this.My_Profile.click();
        this.CityField.sendKeys(value);
        return this;
    }
    public AccountPage Set_ZipPostalCode(String value){
        this.My_Profile.click();
        this.PostalZipCodeField.sendKeys(value);
        return this;
    }
    public AccountPage Set_State(String value){
        this.My_Profile.click();
        this.StateField.sendKeys(value);
        return this;
    }
    public AccountPage Set_email(String value){
        this.My_Profile.click();
        this.EmailField.sendKeys(value);
        return this;
    }
    public AccountPage Set_Country(String value){
        this.SelectCountryBox.click();
        this.CountryField.sendKeys(value );
        this.CountryField.sendKeys(Keys.ENTER);
        return this;
    }
    public AccountPage Set_phone(String value){
        this.My_Profile.click();
        this.PhoneField.sendKeys(value);
        return this;
    }
    public AccountPage TopOfPage(){
        this.BackToTopButton.click();
        return this;
    }
    public AccountPage Change_Slider(){
        this.NewsLetter.click();
        this.Slider.click();
        return this;
    }





}