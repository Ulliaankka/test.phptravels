
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;


public class TestHotel {
    WebDriver driver;

    @BeforeClass
    public void beforeMetod(){
        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.phptravels.net/home");

        //відкриває сторінку на повне вікно
        driver.manage().window().maximize();

        //час
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
    }


    @Test
    public void test() {

        String checkout_date="11.06.2021",
                checkin_date="01.06.2021";

        driver.findElement(By.id("hotels")).click();

        driver.findElement(By.id("s2id_autogen2")).click();
        driver.findElement(By.id("s2id_autogen2")).sendKeys("Paris");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//ul[@class='select2-result-sub']/li/div")).click();

        driver.findElement(By.id("checkin")).click();
        driver.findElement(By.id("checkin")).clear();
        driver.findElement(By.id("checkin")).sendKeys(checkin_date);


        driver.findElement(By.id("checkout")).click();
        driver.findElement(By.id("checkout")).clear();
        driver.findElement(By.id("checkout")).sendKeys(checkout_date);



        driver.findElement(By.className(".hero-form-absolute")).click();
        driver.findElement(By.xpath("//div[@class='col-md-2 col-xs-12']/button")).click();

        String actual = driver.findElement(By.xpath("//*[@class='heading-title']")).getText();
        Assert.assertEquals(actual,"Hotels Paris");
    }


    @AfterClass
    public void close(){
        //закриває за собою ChromeDriver і вичищає все
        driver.quit();
    }
}
