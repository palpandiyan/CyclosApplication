package org.stepdef;

import java.util.concurrent.TimeUnit;

import org.baseclass.Base_Class_For_All_Project;
import org.openqa.selenium.WebDriver;
import org.page.object.manager.PageObjectManager;
import org.testrunnercyclos.TestRunner12;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdef extends Base_Class_For_All_Project {
	public static WebDriver driver = TestRunner12.driver;

	public static PageObjectManager pom = new PageObjectManager(driver);

	@Given("^User Launch the Application$")
	public void user_Launch_the_Application() throws Throwable {
		getUrl("https://demo.cyclos.org/ui/home");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@When("^User click the login button$")
	public void user_click_the_login_button() throws Throwable {

		clickOnElement(pom.getHomepage().getLogin());

	}

	@When("^User enter the username in the user name field$")
	public void user_enter_the_username_in_the_user_name_field() throws Throwable {
		inputValueElement(pom.getHomepage().getUsername(), "demo");
	}

	@When("^User enter the password in the user name field$")
	public void user_enter_the_password_in_the_user_name_field() throws Throwable {
		inputValueElement(pom.getHomepage().getPassword(), "1234");
	}

	@Then("^User click the submit button and it navigates to dashboardpage$")
	public void user_click_the_submit_button_and_it_navigates_to_dashboardpage() throws Throwable {
		clickOnElement(pom.getHomepage().getSubmit());
		Thread.sleep(5000);
	}

	@When("Click on the payuser button")
	public void click_on_the_payuser_button() throws Throwable {
		clickOnElement(pom.getHomepage().getPayuser());

	}

	@When("User click on the touser button in touser button should be clicked")
	public void user_click_on_the_touser_button_in_touser_button_should_be_clicked() throws Throwable {
		clickOnElement(pom.getDashboard().getTouser());

	}

	@When("User select the Active walking in active walking should be selected")
	public void user_select_the_active_walking_in_active_walking_should_be_selected() throws Throwable {
		clickOnElement(pom.getDashboard().getActivewalking());

	}

	@When("user Enter the Amount in amount should be Entered")
	public void user_enter_the_amount_in_amount_should_be_entered() throws Throwable {
		inputValueElement(pom.getDashboard().getAmount(), "2");
	}

	@When("User Click on the Paynow button in paynow button should be clicked")
	public void user_click_on_the_paynow_button_in_paynow_button_should_be_clicked() throws Throwable {

		clickOnElement(pom.getDashboard().getPaynow());
	}

	@When("User Select the paynow button in the payment options")
	public void user_select_the_paynow_button_in_the_payment_options() throws Throwable {
		clickOnElement(pom.getDashboard().getPaynowdrop());

	}

	@When("User Enter the Description  text Message")
	public void user_enter_the_description_text_message() throws Throwable {
		inputValueElement(pom.getDashboard().getText(), "jaga");

	}

	@When("User click on the next button in the next button should be clicked")
	public void user_click_on_the_next_button_in_the_next_button_should_be_clicked() throws Throwable {

		clickOnElement(pom.getDashboard().getNext());

	}

	@Then("User click on the confirm button in the confirm button should be clicked")
	public void user_click_on_the_confirm_button_in_the_confirm_button_should_be_clicked() throws Throwable {
		clickOnElement(pom.getDashboard().getConfirm());

	}

}
