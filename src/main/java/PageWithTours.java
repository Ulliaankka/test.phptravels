import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageWithTours extends BaseClass{


    public PageWithTours(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "input[value = '225102P1']")
    private WebElement buttonSmallSearch;

    public WishesPage goToPageWithWishes(){
        this.buttonSmallSearch.click();
        return new WishesPage(driver);
    }
}
