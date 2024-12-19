package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import hooks.SetUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.PageObjectCreatedAccount;
import pageObject.PageObjectHome;
import pageObject.PageObjectLignup;
import pageObject.PageObjectSignup;

public class RegisterUserAutomationExercice {
	
	public static WebDriver driver =SetUp.driver ;
	PageObjectHome home=new PageObjectHome(driver);
	PageObjectLignup lignup=new PageObjectLignup(driver);
	PageObjectSignup signup=new PageObjectSignup(driver);
	PageObjectCreatedAccount account=new PageObjectCreatedAccount(driver);
	
	
	@Given("Saisir url {string}")
	public void saisir_url(String string) {
	    home.url(string);
	}

	@Then("verifier la page home")
	public void verifier_la_page_home() {
	 Assert.assertEquals(donnees.DonneesDivers.txt_confirmation_home_attendu,home.recuperer_txt_home_page());
	}

	@When("cliquer sur le bouton signup_login")
	
	public void cliquer_sur_le_bouton_signup() {
	    home.cliquer_bouton_signuplogin();
	}

	@Then("vérifier la page login")
	public void vérifier_la_page_login() {
	  Assert.assertEquals(donnees.DonneesDivers.txt_signup_attendu,lignup.recuperer_txt_signup()); 
	}

	@When("saisir le nom {string}")
	public void saisir_le_nom(String string) {
	   lignup.saisir_nom(string);
	}

	@When("saisie adress mail {string}")
	public void saisie_adress_mail(String string) {
		lignup.saisir_adresse_mail(string);
	
	}
	@When("cliquer sur le bouton signup")
	public void cliquer_bouton_signup() {
		lignup.cliquer_bt_signup();
	}

	@Then("vérifier la page signup")
	public void vérifier_la_page_signup() {
		Assert.assertEquals(donnees.DonneesDivers.txt_enter_account_attendu,signup.recupérer_txt_page_signup());
		Assert.assertEquals(donnees.DonneesDivers.couleur_orange, signup.recuperer_couleurtxt_page_signup());
	    
	}

	@When("cliquer sur bouton radio Mr")
	public void cliquer_sur_bouton_radio_mr() {
		signup.cliquer_bt_radio_mr();
	   
	}

	@When("sasir le password {string}")
	public void sasir_le_password(String string) {
		signup.saisir_txt_pssword(string);
	    
	}

	@When("selectionner la date de naissance")
	public void selectionner_le_jour_de_naissance() {
	    signup.selectionner_jour_naissance();
	   
	}


	@When("Cliquer sur les boutons checks box")
	public void Cliquer_sur_le_bouton_checks_box_receive() {
		signup.cliquer_bouton_Check_box_receive();
		signup.cliquer_bouton_Check_box_sign();
	}
	
	
	@When("saisir Last name {string}")
	public void saisir_last_name(String string) {
		signup.sasir_Last_name(string);
	    
	}

	@When("saisr First name {string}")
	public void saisr_first_name(String string) {
		signup.saisir_First_name(string);
	    
	}

	@When("saisir adresse utilistaeur {string}")
	public void saisir_adresse_utilistaeur(String string) {
		signup.sasir_adresse(string);
	   
	}

	@When("selectionner country")
	public void selectionner_country() {
		signup.select_country();
	    
	}

	@When("saisir State {string}")
	public void saisir_state(String string) {
		signup.saisir_txt_state(string);
	    
	}

	@When("saisir city {string}")
	public void saisir_city(String string) {
		signup.sasir_txt_city(string);
	    
	}

	@When("saisir zip code {string}")
	public void saisir_zip_code(String string) {
		signup.saisir_txt_zip_code(string);
	   
	}

	@When("saisir telephone number {string}")
	public void saisir_telephone_number(String string) {
		signup.saisir_txt_mobile_number(string);
	    
	}

	@When("cliquer Sur bouton create account")
	public void cliquer_sur_bouton_create_account() {
		signup.cliquer_bouton_create();
		
	    
	}

	@Then("vérifier page account_created")
	public void vérifier_page_account_created() {
	   Assert.assertEquals(donnees.DonneesDivers.confirmation_account_attendu,account.recuperer_txt_cration_account( ));
	   Assert.assertEquals(donnees.DonneesDivers.couleur_vert,account.recuperer_couleur_txt_cration_account()); 
	}

	@When("cliquer sur le bouton continue")
	public void cliquer_sur_le_bouton_continue() {
		account.cliquer_bouton_continue();
	   
	}

	@Then("vérifier que utilisateur connecté logged as {string} dans la page home")
	public void vérifier_que_utilisateur_connecté_logged_as_dans_la_page_home(String string) {
		;
		Assert.assertTrue(home.recuperer_txt_logged().contains(string));
	    
	}
	

}
