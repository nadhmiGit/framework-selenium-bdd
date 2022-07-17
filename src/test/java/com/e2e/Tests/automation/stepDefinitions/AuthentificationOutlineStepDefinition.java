package com.e2e.Tests.automation.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.e2e.Tests.automation.pageObjects.AuthentificationOutlinePage;
import com.e2e.Tests.automation.pageObjects.AuthentificationPage;
import com.e2e.Tests.automation.util.CommonMethods;
import com.e2e.Tests.automation.util.Setup;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AuthentificationOutlineStepDefinition {

	public WebDriver driver;
	private CommonMethods commonMethods = new CommonMethods();
	private AuthentificationOutlinePage authentificationOutlinePage = new AuthentificationOutlinePage();

	public AuthentificationOutlineStepDefinition() {
		driver = Setup.driver;
	}

	@Given("^Je me connecte sur l application OrangeHRM$")
	public void jeMeConnecteSurLApplicationOrangeHRM() throws Throwable {
		commonMethods.readFromConfigFile("url");
	}

	@When("^Je saisie le login \"([^\"]*)\"$")
	public void jeSaisieLeLogin(String name) throws Throwable {
		PageFactory.initElements(driver, AuthentificationOutlinePage.class);
		authentificationOutlinePage.fillUserName(name);
	}

	@And("^Je saisie le mot de passe \"([^\"]*)\"$")
	public void jeSaisieLeMotDePasse(String pswd) throws Throwable {
		authentificationOutlinePage.fillPassword(pswd);
	}

	@And("^Je clique sur login$")
	public void jeCliqueSurLogin() throws Throwable {
		authentificationOutlinePage.clickLogin();
	}

	@Then("^Redirection vers l accueil$")
	public void redirectionVersLAccueil() throws Throwable {
		PageFactory.initElements(driver, AuthentificationPage.class); // on a initialiser la page AuthentificationPage
																		// afin de l'utiliser
		String text = AuthentificationPage.welcome.getText();
		Assert.assertTrue(text.contains("Welcome"));
	}

}
