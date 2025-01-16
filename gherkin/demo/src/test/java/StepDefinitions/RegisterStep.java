package StepDefinitions;

import base.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import pages.loginPage;
import pages.registerPage;

import com.aventstack.extentreports.Status;



public class RegisterStep {
    

    private registerPage registerPage;

    public RegisterStep() {
        // Initialize loginPage with the WebDriver managed by TestBase
        this.registerPage = new registerPage(TestBase.getDriver());
    }

    @Given("the user is on the Sign in page")
    public void userIsOnLoginPage() {
        try {
            registerPage.openLoginPage();
            Hooks._scenario.log(Status.PASS, "the user is on the login page");
        } catch (Exception e) {
            Hooks._scenario.log(Status.FAIL, "the user is on the login page");
            Hooks._scenario.log(Status.FAIL, e.getMessage());
           
        }
    }

    @When("clicks on the sign up button")
    public void userClicksRegButton() {
        try {
            registerPage.submitRegisterpage();
            Hooks._scenario.log(Status.PASS, "clicks on the login button");
        } catch (Exception e) {
            Hooks._scenario.log(Status.FAIL, "clicks on the login button");
            Hooks._scenario.log(Status.FAIL,e.getMessage());
     
        }
    }
    @When("the user should see a sign up page")
    public void userSeesRegisterPage() {
        try {
            String successMessage = registerPage.getSuccessMessageRegPage();
            Assertions.assertTrue(successMessage.contains("Sign up"), 
                "Expected success message not found");
            Hooks._scenario.log(Status.PASS, "The user should see a successful login message: " + successMessage);
        } catch (Throwable t) {
            Hooks._scenario.log(Status.FAIL, "The user should see a successful login message");
            Hooks._scenario.log(Status.FAIL, t.getMessage());
            throw t; // Re-throw to mark the scenario as failed
        }
    }

    @Then("the user enters a name as {string}")
    public void userEntersUsername(String username) {
        try {
            registerPage.enterUsername(username);
            Hooks._scenario.log(Status.PASS, "the user enters a username");
        } catch (Exception e) {
            Hooks._scenario.log(Status.FAIL, "the user enters a username" );
            Hooks._scenario.log(Status.FAIL,e.getMessage());
        }
    }

    @And("the user enters a email as {string}")
    public void userEntersEmail(String email) {
        try {
            registerPage.enterEmail(email);
            Hooks._scenario.log(Status.PASS, "the user enters a email");
        } catch (Exception e) {
            Hooks._scenario.log(Status.FAIL, "the user enters a email" );
            Hooks._scenario.log(Status.FAIL,e.getMessage());
        }
    }

    @And("the user enters a Password as {string}")
    public void userEntersPassword(String password) {
        try {
            registerPage.enterPassword(password);
            Hooks._scenario.log(Status.PASS, "the user enters a password");
        } catch (Exception e) {
            Hooks._scenario.log(Status.FAIL, "the user enters a password" );
            Hooks._scenario.log(Status.FAIL,  e.getMessage());
        }
    }

    @And("the user enters a confirmPwd as {string}")
    public void userEntersPasswordconfirm(String passwordconfirm) {
        try {
            registerPage.enterConfirmPassword(passwordconfirm);
            Hooks._scenario.log(Status.PASS, "the user enters a passwordconfirm");
        } catch (Exception e) {
            Hooks._scenario.log(Status.FAIL, "the user enters a passwordconfirm" );
            Hooks._scenario.log(Status.FAIL,  e.getMessage());
        }
    }

    @Then("clicks on the signIn button")
    public void userClicksLoginButton() {
        try {
            registerPage.submitLogin();
            Hooks._scenario.log(Status.PASS, "clicks on the login button");
        } catch (Exception e) {
            Hooks._scenario.log(Status.FAIL, "clicks on the login button");
            Hooks._scenario.log(Status.FAIL,e.getMessage());
     
        }
    }

    @Then("the user should see a successful signIn message")
    public void userSeesSuccessfulLoginMessage() {
        try {
            String successMessage = registerPage.getSuccessMessage();
            Assertions.assertTrue(successMessage.contains("Dashboard"), 
                "Expected success message not found");
            Hooks._scenario.log(Status.PASS, "The user should see a successful login message: " + successMessage);
        } catch (Throwable t) {
            Hooks._scenario.log(Status.FAIL, "The user should see a successful login message");
            Hooks._scenario.log(Status.FAIL, t.getMessage());
            throw t; // Re-throw to mark the scenario as failed
        }
    }
    @Then("the user should see a signIn failure message")
    public void userSeesLoginFailureMessage() {
        try {
            String failureMessage = registerPage.getErrorMessage();
            String failureMessage2 = registerPage.getErrorMessage2();
            Assertions.assertTrue(failureMessage.contains("The email address has already been taken." )
             || failureMessage2.contains("The password must be at least 8 characters.") 
             || !failureMessage.contains("Dashboard") 
             ,"Expected failure message not found");
            
            Hooks._scenario.log(Status.PASS, "The user should see a login failure message: " + failureMessage);
        } catch (Throwable t) {
            Hooks._scenario.log(Status.FAIL, "The user should see a login failure message");
            Hooks._scenario.log(Status.FAIL, t.getMessage());
            throw t; // Re-throw to mark the scenario as failed
        }
    }

}
