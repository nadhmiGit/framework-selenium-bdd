package com.e2e.Tests.automation.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.e2e.Tests.automation.pageObjects.AuthentificationPage;
import com.e2e.Tests.automation.util.CommonMethods;
import com.e2e.Tests.automation.util.Setup;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AuthentificationStepDefinition extends CommonMethods {

	public WebDriver driver; // cette methode est une pratique de script linéaire mais on l'a fait juste pour
								// déclencher le site Orange
	private AuthentificationPage authentificationPage = new AuthentificationPage(); // prendre une instance de la page
																					// 'AuthentificationPage'
	private CommonMethods commonMethods = new CommonMethods();

	public AuthentificationStepDefinition() {
		driver = Setup.driver;
	}

	@Given("^J ouvre l application OrangeHRM$")
	public void jOuvreLApplicationOrangeHRM() throws Throwable {
		logger.info("J ouvre l application OrangeHRM");
		commonMethods.readFromConfigFile("url");

	}

	@When("^Je saisie le login$")
	public void jeSaisieLeLogin() throws Throwable {
		PageFactory.initElements(driver, AuthentificationPage.class); // cette ligne de code est necessaire pour
																		// indiquer que nous prenons les elements de la
																		// page AuthentificationPage
		logger.info("Je saisie le login");
		authentificationPage.fillUserName(); // ajouter cette ligne pour remplir le username et pareil ds les autres
												// methodes
	}

	@When("^Je saisie le mot de passe$")
	public void jeSaisieLeMotDePasse() throws Throwable {
		logger.info("Je saisie le mot de passe");
		authentificationPage.fillPassword();
	}

	@When("^Je clique sur le bouton login$")
	public void jeCliqueSurLeBoutonLogin() throws Throwable {
		logger.info("Je clique sur le bouton login");
		authentificationPage.clickLoginButton();
	}

	@Then("^Je verifie le compte admin$")
	public void jeVerifieLeCompteAdmin() throws Throwable {
		logger.info("Je verifie le compte admin");
		String text = AuthentificationPage.welcome.getText();
		Assert.assertTrue(text.contains("Welcome"));

	}

}
