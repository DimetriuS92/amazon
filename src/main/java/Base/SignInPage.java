package Base;

import data.TestData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage {
    private WebDriver driver;


    public SignInPage(WebDriver driver) {
        this.driver = driver;
    }

    private By userEmailField = By.cssSelector("#ap_email");
    private By continueForUserEmailButton = By.xpath("//div/span/span/input[@id=\"continue\"]");
    private By userPasswordField = By.cssSelector("#ap_password");
    private By signInSubmitButton = By.cssSelector("#signInSubmit");
    private By signInButton = By.cssSelector("#nav-link-accountList");

    public SignInPage clickSignInButton() {
        driver.findElement(signInButton).click();
        return this;

    }

    public SignInPage typeUserEmail (String email) {
        driver.findElement(userEmailField).sendKeys(TestData.LOGIN.getEmail());
        return this;
    }

    public SignInPage clickContinueForUserEmailButton() {
        driver.findElement(continueForUserEmailButton).click();
        return this;
    }

    public SignInPage typeUserPassword(String password) {
        driver.findElement(userPasswordField).sendKeys(TestData.LOGIN.getPassword());
        return this;
    }

    public SignInPage clickSignInSubmitButton() {
        driver.findElement(signInSubmitButton).click();
        return new SignInPage(driver);
    }

    public SignInPage register(String email, String password) {
        this.clickSignInButton();
        this.typeUserEmail(email);
        this.clickContinueForUserEmailButton();
        this.typeUserPassword(password);
        this.clickSignInSubmitButton();
        return new SignInPage(driver);
    }


}
