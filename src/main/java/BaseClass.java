import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


import java.util.concurrent.TimeUnit;

public class BaseClass {
    WebDriver driver;

    public BaseClass (){
    }

    public BaseClass(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void beforeMet() {
        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
    }

    public HomePage openHomePage() {
        beforeMet();
        driver.get("https://www.phptravels.net/home");
        return new HomePage(driver);
    }

    public HomePage openAdminPage() {
        beforeMet();
        driver.get("https://www.phptravels.net/admin");
        return new HomePage(driver);
    }

}