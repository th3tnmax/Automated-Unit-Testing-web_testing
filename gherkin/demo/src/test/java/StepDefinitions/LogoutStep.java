package StepDefinitions;

import base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import pages.loginPage;
import pages.logoutPage;

import com.aventstack.extentreports.Status;
public class LogoutStep {
    private logoutPage logoutPage;

    public LogoutStep() {
        // Initialize loginPage with the WebDriver managed by TestBase
        this.logoutPage = new logoutPage(TestBase.getDriver());
    }

    @When("the user clicks on the acount button")
    public void clicksOnAccountButton() {
        // loginPage.submitLogin();
        try {
            logoutPage.submitAccount();
            Hooks._scenario.log(Status.PASS, "Clicked on the account button");
        } catch (Exception e) {
            Hooks._scenario.log(Status.FAIL, "Failed to click on account button: " );
            throw e;
        }
    }

    @Then("the user clicks on the logout button")
    public void userClicksLoginButton() {
        try {
            logoutPage.submitLogout();
            Hooks._scenario.log(Status.PASS, "clicks on the logout button");
        } catch (Exception e) {
            Hooks._scenario.log(Status.FAIL, "clicks on the logout button");
            Hooks._scenario.log(Status.FAIL,e.getMessage());
     
        }
    }
    @Then("the user should see a logout successful message")
    public void userSeesSuccessfulLoginMessage() {
        try {
            String successMessage = logoutPage.getSuccessMessage();
            Assertions.assertTrue(successMessage.contains("Sign in"), 
                "Expected success message not found");
            Hooks._scenario.log(Status.PASS, "The user should see a successful logout message: " + successMessage);
        } catch (Throwable t) {
            Hooks._scenario.log(Status.FAIL, "The user should see a successful logout message");
            Hooks._scenario.log(Status.FAIL, t.getMessage());
            throw t; // Re-throw to mark the scenario as failed
        }
    }
    
}
