package com.e2e.Tests.automation.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.e2e.Tests.automation.pageObjects.AccueilPage;
import com.e2e.Tests.automation.pageObjects.AuthentificationOutlinePage;
import com.e2e.Tests.automation.pageObjects.AuthentificationPage;
import com.e2e.Tests.automation.util.Setup;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AccueilStepDefinition {

	public WebDriver driver;
	private AccueilPage accueilPage = new AccueilPage();
	
	public AccueilStepDefinition() {
		driver = Setup.driver;
		PageFactory.initElements(driver, AccueilPage.class);//PageFactory on l'ecrit une seule fois par script pour faire l'initialisation
	}

	@When("^je clique sur le module Recruitment$")
	public void jeCliqueSurLeModuleRecruitment() throws Throwable {
		accueilPage.goToRecruitment();
	}

	@Then("^je verifie l affichage de la page Recruitment \"([^\"]*)\"$")
	public void jeVerifieLAffichageDeLaPageRecruitment(String sub_menu_rec) throws Throwable {
		String pageRecruitment = AccueilPage.pageRecruitment.getText();
		Assert.assertTrue(pageRecruitment.contains(sub_menu_rec));
	}

	@When("^je clique sur le module PIM$")
	public void jeCliqueSurLeModulePIM() throws Throwable {
		accueilPage.goToPIM();
	}

	@Then("^je verifie l'affichage de la page PIM  \"([^\"]*)\"$")
	public void jeVerifieLAffichageDeLaPagePIM(String sub_menu_PIM) throws Throwable {
		String pagePIM = AccueilPage.pagePIM.getText();
		Assert.assertTrue(pagePIM.contains(sub_menu_PIM));
	}

}
