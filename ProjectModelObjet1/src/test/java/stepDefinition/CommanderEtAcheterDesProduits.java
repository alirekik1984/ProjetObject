package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import hooks.SetUp;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pageObject.PageObjectCheckout;
import pageObject.PageObjectCreatedAccount;
import pageObject.PageObjectDetailProduct;
import pageObject.PageObjectDonePaiement;
import pageObject.PageObjectHome;
import pageObject.PageObjectLignup;
import pageObject.PageObjectPaiement;
import pageObject.PageObjectProduct;
import pageObject.PageObjectSignup;
import pageObject.PageObjectViewCart;


public class CommanderEtAcheterDesProduits {
	public static WebDriver driver = SetUp.driver;
	PageObjectHome home= new PageObjectHome(driver);
	PageObjectLignup lignup=new PageObjectLignup(driver);
	PageObjectSignup signup=new PageObjectSignup(driver);
	PageObjectCreatedAccount account=new PageObjectCreatedAccount(driver);
	PageObjectCheckout checkout=new PageObjectCheckout(driver);
	PageObjectDonePaiement done =new PageObjectDonePaiement(driver);
	PageObjectDetailProduct detail=new PageObjectDetailProduct(driver);
	PageObjectViewCart view=new PageObjectViewCart(driver);
	PageObjectProduct product=new PageObjectProduct(driver);
	PageObjectPaiement payment=new PageObjectPaiement(driver);
	
	@Then("cliquer sur signup")
	public void cliquer_sur_signup() {
		home.cliquer_bouton_signuplogin();
	}
	@Then("vérifier la page login\\/signup")
	public void vérifier_la_page_login_signup() {
		Assert.assertEquals(lignup.recuperer_url_login(),donnees.DonneesDivers.url_login_attendu);
	   
	}

	@When("saisir  mail {string}")
	public void saisir_mail(String string) {
		lignup.saisir_mail_login(string);
			    
	}

	@When("sasir le mot de passe {string}")
	public void sasir_le_mot_de_passe(String string) {
	   lignup.saisir_txt_password(string);
	}

	@When("cliquer sur le bouton login")
	public void cliquer_sur_le_bouton_login() {
		lignup.cliquer_bt_login();
	    
	}

	@Then("verif page home")
	public void verif_page_home() {
	    
	}

	@Then("vérifier le text du bouton products")
	public void vérifier_le_text_du_bouton_products() {
	    
	}

	@When("cliquer sur le bouton products")
	public void cliquer_sur_le_bouton_products() {
	    
	}

	@Then("vérifier la page products")
	public void vérifier_la_page_products() {
	    
	}

	@When("choisir un premier produit et cliquer sur add to cart")
	public void choisir_un_premier_produit_et_cliquer_sur_add_to_cart() {
	    
	}

	@Then("vérifier Pop-up added")
	public void vérifier_pop_up_added() {
	    
	}

	@When("cliquer bouton continuer du pop-up added")
	public void cliquer_bouton_continuer_du_pop_up_added() {
	    
	}

	@Then("vérifier le retour a la page products")
	public void vérifier_le_retour_a_la_page_products() {
	    
	}

	@When("cliquer sur view products pour un autre products")
	public void cliquer_sur_view_products_pour_un_autre_products() {
	    
	}

	@Then("verifier affichage page details du produit selectionné")
	public void verifier_affichage_page_details_du_produit_selectionné() {
	    
	}

	@When("cliquer sur add to cart")
	public void cliquer_sur_add_to_cart() {
	    
	}

	@Then("vérifier le Pop-up added")
	public void vérifier_le_pop_up_added() {
	   
	}

	@When("cliquer sur view cart")
	public void cliquer_sur_view_cart() {
	    
	}

	@Then("vérifier page view cart")
	public void vérifier_page_view_cart() {
	    
	}

	@Then("verifier les produits selectionnés existent")
	public void verifier_les_produits_selectionnés_existent() {
	    
	}

	@When("cliquer bouton checkout")
	public void cliquer_bouton_checkout() {
	    
	}

	@Then("verifier affichage page checkout")
	public void verifier_affichage_page_checkout() {
	    
	}

	@Then("verifier adress delivery")
	public void verifier_adress_delivery() {
	    
	}

	@Then("verifier billig adress")
	public void verifier_billig_adress() {
	    
	}

	@Then("ecrire commentaire")
	public void ecrire_commentaire() {
	    
	}

	@When("cliquer sur le bouton place order")
	public void cliquer_sur_le_bouton_place_order() {
	    
	}

	@Then("verifier affichage page paiement")
	public void verifier_affichage_page_paiement() {
	    
	}

	@When("saisir Name on card {string}")
	public void saisir_name_on_card(String string) {
	    
	}

	@When("saisir card number")
	public void saisir_card_number() {
	    
	}

	@When("saisir cvc {string}")
	public void saisir_cvc(String string) {
	    
	}

	@When("saisir mois expiration {string}")
	public void saisir_mois_expiration(String string) {
	    
	}

	@When("année expiration {string}")
	public void année_expiration(String string) {
	    
	}

	@When("cliquer sur cliquer bouton paiement")
	public void cliquer_sur_cliquer_bouton_paiement() {
	    
	}

	@Then("verifier page done paiement")
	public void verifier_page_done_paiement() {
	      
	}

	@When("cliquer sur bouton download")
	public void cliquer_sur_bouton_download() {
	    
	}

	@Then("vérifier téléchargement fichier txt")
	public void vérifier_téléchargement_fichier_txt() {
	    
	}

	@When("cliquer sur le bouton continuer")
	public void cliquer_sur_le_bouton_continuer() {
	    
	}

	@Then("verifier affichage page home")
	public void verifier_affichage_page_home() {
	    
	}
}
