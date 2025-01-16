package StepDefinitions;

import base.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;

import pages.createPage;
import pages.loginPage;
import com.aventstack.extentreports.Status;

public class CreateStep {

    private createPage createpage;

    public CreateStep() {
        // Initialize loginPage with the WebDriver managed by TestBase
        this.createpage = new createPage(TestBase.getDriver());
    }

    @When("the user clicks on the customer button")
    public void userClicksCustomerButton() {
        try {
            createpage.clickCustomers();
            Hooks._scenario.log(Status.PASS, "clicks on the login button");
        } catch (Exception e) {
            Hooks._scenario.log(Status.FAIL, "clicks on the login button");
            Hooks._scenario.log(Status.FAIL,e.getMessage());
     
        }
    }

    @Then("the user clicks on the new customer button")
    public void userClicksNewCustomerButton() {
        try {
            createpage.clickNewCustomers();
            Hooks._scenario.log(Status.PASS, "clicks on the login button");
        } catch (Exception e) {
            Hooks._scenario.log(Status.FAIL, "clicks on the login button");
            Hooks._scenario.log(Status.FAIL,e.getMessage());
     
        }
    }

    @Then("the user should see Create Customer interface")
    public void userSeesCustomerInterface() {
        try {
            String successMessage = createpage.getCreateCustomerPage();
            Assertions.assertTrue(successMessage.contains("Create Customer"), 
                "Expected success message not found");
            Hooks._scenario.log(Status.PASS, "The user should see a successful login message: " + successMessage);
        } catch (Throwable t) {
            Hooks._scenario.log(Status.FAIL, "The user should see a successful login message");
            Hooks._scenario.log(Status.FAIL, t.getMessage());
            throw t; // Re-throw to mark the scenario as failed
        }
    }

    @When("the user enters a customer name as {string}")
    public void userEnterName(String name) {
        try {
            createpage.enterName(name);
            Hooks._scenario.log(Status.PASS, "the user enters a name");
        } catch (Exception e) {
            Hooks._scenario.log(Status.FAIL, "the user enters a name" );
            Hooks._scenario.log(Status.FAIL,e.getMessage());
        }
    }

    @And("the user enters a customer phone as {string}")
    public void userEnterphone(String phone) {
        try {
            createpage.enterCustPhone(phone);
            Hooks._scenario.log(Status.PASS, "the user enters a phone");
        } catch (Exception e) {
            Hooks._scenario.log(Status.FAIL, "the user enters a phone" );
            Hooks._scenario.log(Status.FAIL,e.getMessage());
        }
    }

    @And("the user enters a customer email as {string}")
    public void userEnteremail(String email) {
        try {
            createpage.enterCustEmail(email);
            Hooks._scenario.log(Status.PASS, "the user enters a email");
        } catch (Exception e) {
            Hooks._scenario.log(Status.FAIL, "the user enters a email" );
            Hooks._scenario.log(Status.FAIL,e.getMessage());
        }
    }

    @And("the user clicks on customer gender")
    public void userClicksCustomergender() {
        try {
            createpage.clickGender();
            Hooks._scenario.log(Status.PASS, "clicks on the customer gender button");
        } catch (Exception e) {
            Hooks._scenario.log(Status.FAIL, "clicks on the customer gender button");
            Hooks._scenario.log(Status.FAIL,e.getMessage());
     
        }
    }
    @When("the user clicks a customer gender option")
    public void userClicksCustomergenderoption() {
        try {
            createpage.chooseGender();
            Hooks._scenario.log(Status.PASS, "clicks on the customer gender option button");
        } catch (Exception e) {
            Hooks._scenario.log(Status.FAIL, "clicks on the customer gender option button");
            Hooks._scenario.log(Status.FAIL,e.getMessage());
     
        }
    }

    @When("the user clicks create")
    public void userClickscreate() {
        try {
            createpage.submitLogin();
            Hooks._scenario.log(Status.PASS, "clicks on the create button");
        } catch (Exception e) {
            Hooks._scenario.log(Status.FAIL, "clicks on the create button");
            Hooks._scenario.log(Status.FAIL,e.getMessage());
     
        }
    }

    @Then("the user should see a successful create message")
    public void userSeessuccessfulmessage() {
        try {
            
            String successMessage = createpage.getSuccessMessage();
            Assertions.assertTrue(successMessage.contains("Created"), 
                "Expected success message not found");
            Hooks._scenario.log(Status.PASS, "The user should see a successful create message: " + successMessage);
        } catch (Throwable t) {
            Hooks._scenario.log(Status.FAIL, "The user should see a successful create message");
            Hooks._scenario.log(Status.FAIL, t.getMessage());
            throw t; // Re-throw to mark the scenario as failed
        }
    }

}
// Edit