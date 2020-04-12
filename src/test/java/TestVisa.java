
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;


public class TestVisa {
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
    public void test(){

        String country1="France",
                country2="Canada",
                date="07-04-2020",
                first_name="Max",
                last_name="Danilishyn",
                email="maxdanilov@gmail.com",
                confirmemail="maxdanilov@gmail.com",
                phone="555555";


        driver.findElement(By.cssSelector(".visa")).click();

        driver.findElement(By.cssSelector(".chosen-container.chosen-container-single.chosen-container-active")).click();
        driver.switchTo().activeElement().sendKeys(country1);
        driver.findElement(By.xpath("//*[class='active-result highlighted']")).click();

        driver.findElement(By.cssSelector(".chosen-container.chosen-container-single.chosen-with-drop.chosen-container-active")).click();
        driver.switchTo().activeElement().sendKeys(country2);
        driver.findElement(By.xpath("//*[class='active-result highlighted']")).click();

        driver.findElement(By.xpath("//*[@placeholder = 'Date']")).click();
        driver.switchTo().activeElement().sendKeys(date);

        driver.findElement(By.xpath("//div[@class='hero-form-absolute']")).click();
        driver.findElement(By.xpath("//*[@class='col-md-2 col-xs-12']/button[contains(text(),'Submit')]")).click();



        //нова сторінка

        driver.findElement(By.xpath("//input[@name='first_name']")).click();
        driver.switchTo().activeElement().sendKeys(first_name);

        driver.findElement(By.xpath("//input[@name='last_name']")).click();
        driver.switchTo().activeElement().sendKeys(last_name);

        driver.findElement(By.xpath("//input[@name='email']")).click();
        driver.switchTo().activeElement().sendKeys(email);

        driver.findElement(By.xpath("//input[@name='confirmemail']")).click();
        driver.switchTo().activeElement().sendKeys(confirmemail);

        driver.findElement(By.xpath("//input[@name='phone']")).click();
        driver.switchTo().activeElement().sendKeys(phone);

        driver.findElement(By.xpath("//input[@type='checkbox']")).click();

        driver.findElement(By.id("sub")).click();

        String actual = driver.findElement(By.xpath("//*[@class='wow fadeIn']/strong")).getText();
        Assert.assertEquals(actual,"Visa Submitted");


    }

    @AfterClass
    public void close(){
        //закриває за собою ChromeDriver і вичищає все
        driver.quit();
    }
}
