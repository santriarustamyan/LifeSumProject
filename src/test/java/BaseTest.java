import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pages.HomePage;

public class BaseTest {
    private WebDriver driver;
    private HomePage homePage;

    @BeforeSuite
    public void  setUp() {
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(co);
    }

    @BeforeClass
    public void navigateHomePage(){
        driver.get("https://lifesum.com/ru/");
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
    }

//    @AfterClass
//    public void tearDown(){
//        driver.quit();
//    }

    @Test
    public void practicePageTest(){
        homePage.clickAllowAllCookieFiles();
        homePage.goLifeSumPage();
        homePage.clickRegistrationBtn();
    }

}