package com.e2e.Tests.automation.stepDefinitions;

import org.openqa.selenium.WebDriver;

import com.e2e.Tests.automation.util.Setup;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AuthentificationStepDefinition {
	
	/* public WebDriver driver; // cette methode est une pratique de script linéaire mais on l'a fait juste pour déclencher le site Orange
	
	public AuthentificationStepDefinition() {
		driver = Setup.driver; 
	} */
	
	@Given("^J ouvre l application OrangeHRM$")
	public void jOuvreLApplicationOrangeHRM() throws Throwable {
		
	}

	@When("^Je saisie le login$")
	public void jeSaisieLeLogin() throws Throwable {

	}

	@When("^Je saisie le mot de passe$")
	public void jeSaisieLeMotDePasse() throws Throwable {

	}

	@When("^Je clique sur le bouton login$")
	public void jeCliqueSurLeBoutonLogin() throws Throwable {
	 
	}

	@Then("^Je verifie le compte admin$")
	public void jeVerifieLeCompteAdmin() throws Throwable {
	  
	}

}
