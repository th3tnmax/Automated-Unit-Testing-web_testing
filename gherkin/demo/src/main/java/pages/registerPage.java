package pages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class registerPage {
    
    private WebDriver driver;
    private WebDriverWait wait;

    // Constructor to initialize WebDriver and WebDriverWait
    public registerPage(WebDriver driver) {
        if (driver == null) throw new IllegalArgumentException("Driver cannot be null");
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void openLoginPage() {
        driver.get("https://poc-epi.satoripop.io/login");
    }

    public void submitRegisterpage() {
        WebElement loginBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/main/div/section/header/p/a/span")));
        loginBtn.click();
    }

    public String getSuccessMessageRegPage() {
        WebElement successMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/main/div/section/header/h1")));
        return successMsg.getText();
    }

    public void enterUsername(String username) {
        WebElement usernameInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"data.name\"]")));
        usernameInput.sendKeys(username);
    }
    public void enterEmail(String email) {
        WebElement emailInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"data.email\"]")));
        emailInput.sendKeys(email);
    }

    public void enterPassword(String password) {
        WebElement passwordInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"data.password\"]")));
        passwordInput.sendKeys(password);
    }

    public void enterConfirmPassword(String confirmpassword) {
        WebElement passwordInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"data.passwordConfirmation\"]")));
        passwordInput.sendKeys(confirmpassword);
    }

    public void submitLogin() {
        WebElement loginBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/main/div/section/form/div[2]/div/button")));
        loginBtn.click();
    }

    public String getSuccessMessage() {
        WebElement successMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[1]/main/div/section/header/div[1]/h1")));
        return successMsg.getText();
    }
    public String getErrorMessage() {
        WebElement errorMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/main/div/section/form/div[1]/div[3]/div/div/div[2]/p")));
        return errorMsg.getText();
    }
    public String getErrorMessage2() {
        WebElement errorMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/main/div/section/form/div[1]/div[2]/div/div/div[2]/p")));
        return errorMsg.getText();
    }
}
