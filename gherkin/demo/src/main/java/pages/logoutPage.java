package pages;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class logoutPage {
    private WebDriver driver;
    private WebDriverWait wait;

    // Constructor to initialize WebDriver and WebDriverWait
    public logoutPage(WebDriver driver) {
        if (driver == null) throw new IllegalArgumentException("Driver cannot be null");
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void submitAccount() {
        WebElement logoutBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[1]/div/nav/div/div[3]/div[1]/button/img")));
        logoutBtn.click();
        try {
            Thread.sleep(500);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public void submitLogout() {
        WebElement logoutBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[1]/div/nav/div/div[3]/div[2]/div[3]/form/button")));
        logoutBtn.click();
        try {
            Thread.sleep(500);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public String getSuccessMessage() {
        WebElement successMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/main/div/section/header/h1")));
        return successMsg.getText();
    }
}
