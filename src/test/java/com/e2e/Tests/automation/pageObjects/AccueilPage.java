package com.e2e.Tests.automation.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AccueilPage {

	final static String BUTTON_RECRUITMENT = "menu_recruitment_viewRecruitmentModule"; //On inspecte le bouton recruitment : ID
	final static String PAGE_RECRUITMENT = "menu_recruitment_viewCandidates"; //Pour controler:Choisir un message qui s'affiche 'Condidate' suite à l'affichage de la page et l'inspecter
	final static String BUTTON_PIM = "menu_pim_viewPimModule"; ////On inspecte le bouton PIM : ID
	final static String PAGE_PIM = "menu_pim_Configuration"; //Pour controler : Choisir un message qui s'affiche 'Configuration' suite à l'affichage de la page et l'inspecter
	
	/* @FindBy */
	@FindBy(how = How.ID, using = BUTTON_RECRUITMENT)
	public static WebElement btnRecruitment;
	@FindBy(how = How.ID, using = PAGE_RECRUITMENT)
	public static WebElement pageRecruitment;
	@FindBy(how = How.ID, using = BUTTON_PIM)
	public static WebElement btnPIM;
	@FindBy(how = How.ID, using = PAGE_PIM)
	public static WebElement pagePIM;
	
	/* Method */
	public void goToRecruitment() {
		btnRecruitment.click();
	}
	
	public void goToPIM() {
		btnPIM.click();
	}

}
