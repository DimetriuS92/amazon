package Base;

import data.TestData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainClass {
    static WebDriver driver;

    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Asus\\IdeaProjects\\testselenium\\drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
        WebDriverWait wait = (new WebDriverWait(driver, 20));
       // driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#nav-logo")));
       // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        SignInPage signInPage = new SignInPage(driver);
        signInPage.register(TestData.LOGIN.getEmail(),TestData.LOGIN.getPassword() );
    }
}