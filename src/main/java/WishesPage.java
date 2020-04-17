import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishesPage extends BaseClass{


    public WishesPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".btn.wish.addwishlist.btn-danger.btn-outline.btn-block")
    private WebElement buttonAddToWishlist;

    @FindBy(css = ".dropdown.dropdown-login.dropdown-tab")
    private WebElement buttonUser;

    @FindBy(css = ".dropdown-item.active.tr")
    private WebElement buttonMyAccount;

    public AccountPage goToAccountPage(){
        this.buttonMyAccount.click();
        return new AccountPage(driver);
    }
}