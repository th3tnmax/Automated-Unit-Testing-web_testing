package pages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class createPage {

    private WebDriver driver;
    private WebDriverWait wait;

    // Constructor to initialize WebDriver and WebDriverWait
    public createPage(WebDriver driver) {
        if (driver == null) throw new IllegalArgumentException("Driver cannot be null");
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }


    public void clickCustomers() {
        WebElement loginBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/aside/nav/ul/li[2]/ul/li[3]/a")));
        loginBtn.click();
    }

    public void clickNewCustomers() {
        WebElement loginBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[1]/main/div/section/header/div[2]/div/a")));
        loginBtn.click();
    }

    public String getCreateCustomerPage() {
        WebElement successMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[1]/main/div/section/header/div[1]/h1")));
        return successMsg.getText();
    }

    public void enterName(String name) {
        WebElement nameInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"data.name\"]")));
        nameInput.sendKeys(name);
    }

    public void enterCustEmail(String custEmail) {
        WebElement custEmailInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"data.email\"]")));
        custEmailInput.sendKeys(custEmail);
    }


    public void enterCustPhone(String phone) {
        WebElement phoneInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"data.phone\"]")));
        phoneInput.sendKeys(phone);
    }

    public void enterCustBirthday(String birthday) {
        WebElement birthdayInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"data.birthday\"]")));
        birthdayInput.sendKeys(birthday);
    }

    public void clickGender() {
        WebElement loginBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"data.gender\"]")));
        loginBtn.click();
    }

    public void chooseGender() {
        WebElement loginBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[1]/main/div/section/div/div/form/div[1]/div[1]/section/div/div/div/div[5]/div/div/div[2]/div/div/select/option[2]")));
        loginBtn.click();
    }

    public void submitLogin() {
        WebElement loginBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"key-bindings-1\"]")));
        loginBtn.click();

       
    }

    public String getSuccessMessage() {
        WebElement successMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div[1]/div/div/div/h3")));
        return successMsg.getText();
        
    }
    
}
// /html/body/div[2]/div[1]/div/div/div/h3/
// /html/body/div[2]/div[1]/div/div/div/h3