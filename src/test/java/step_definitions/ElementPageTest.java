package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.elementPage;
import utilities.BrowserUtiltities;
import utilities.ConfigurationReader;
import utilities.Driver;

public class ElementPageTest {

 elementPage element = new elementPage();

    @When("the user clicks to Add Element button n times")
    public void the_user_clicks_to_Add_Element_button_n_times() {
        BrowserUtiltities.clickOnAddElement(element.addElementButton, ConfigurationReader.get("n"));
    }

    @Then("then verify that element was added n times")
    public void then_verify_that_element_was_added_n_times() {


        BrowserUtiltities.waitForClickablility(element.deleteElement,5000);
        Assert.assertEquals(element.deleteElements.size(),Integer.parseInt(ConfigurationReader.get("n")));
    }



}
