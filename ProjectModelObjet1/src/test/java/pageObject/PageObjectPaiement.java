package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;



public class PageObjectPaiement {
	public WebDriver driver;
	//constructeur
	public PageObjectPaiement(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver= driver;
		
		
	}
	//identification des elements
	@FindBy(how=How.XPATH,using="//li[text()='Payment']")
	WebElement txt_paiement;
	@FindBy(how=How.NAME,using="name_on_card")
	WebElement txt_name_card;
	@FindBy(how=How.NAME,using="card_number")
	WebElement num_card;
	@FindBy(how=How.NAME,using="cvc")
	WebElement num_cvc;
	@FindBy(how=How.NAME,using="expiry_month")
	WebElement txt_month;
	@FindBy(how=How.NAME,using="expiry_year")
	WebElement txt_years;
	@FindBy(how=How.ID,using="submit")
	WebElement bt_pay;
	
//methodes
	public String txt_page_paiement() {
		String txt_page_paiement_obtenu=txt_paiement.getText();
		return txt_page_paiement_obtenu;
		
	}
	public void saisir_name_on_card(String name) {
		txt_name_card.sendKeys(name);
	}
	public void saisir_num_on_card(String numero) {
		txt_name_card.sendKeys(numero);
	}
	public void saisir_num_cvc(String CVC) {
		num_cvc.sendKeys(CVC);
	}
	public void saisir_mois_expi(String mois) {
		num_cvc.sendKeys(mois);
	}
	public void saisir_année_expi(String year) {
		num_cvc.sendKeys(year);
	}
	public void cliquer_bt_payment() {
		bt_pay.click();
	}
	
}
