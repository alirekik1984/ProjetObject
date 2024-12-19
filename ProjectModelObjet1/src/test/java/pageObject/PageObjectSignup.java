package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageObjectSignup {
	
	public  WebDriver driver;

	//constructeur
	public PageObjectSignup(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	//identification des elements design pattern
	@FindBy(how=How.XPATH ,using="//b[text()='Enter Account Information']")
	WebElement txt_enter_account;
	@FindBy(how=How.ID,using="id_gender1")
	WebElement bt_radio_Mr;
	@FindBy(how=How.ID,using="password")
	WebElement txt_password;
	@FindBy(how=How.ID,using="days")
	WebElement liste_deroulante_day;
	@FindBy(how=How.ID,using="months")
	WebElement liste_deroulante_month;
	@FindBy(how=How.ID,using="years")
	WebElement liste_deroulante_year;
	@FindBy(how=How.ID,using="newsletter")
	WebElement Check_box_sign;
	@FindBy(how=How.ID,using="optin")
	WebElement Check_box_receive;
	@FindBy(how=How.ID,using="first_name")
	WebElement txt_first_name;
	@FindBy(how=How.ID,using="last_name")
	WebElement txt_last_name;
	@FindBy(how=How.ID,using="company")
	WebElement txt_company;
	@FindBy(how=How.ID,using="address1")
	WebElement txt_adress;
	@FindBy(how=How.ID,using="country")
	WebElement liste_deroulante_country;
	@FindBy(how=How.ID,using="state")
	WebElement txt_state;
	@FindBy(how=How.ID,using="city")
	WebElement txt_city;
	@FindBy(how=How.ID,using="zipcode")
	WebElement txt_zip_code;
	@FindBy(how=How.ID,using="mobile_number")
	WebElement txt_mobile;
	@FindBy(how=How.XPATH,using="//button[@data-qa='create-account']")
	WebElement bt_create_account;
	
	//creation des methodes
	public String recupérer_txt_page_signup() {
		String txt_page_signup_obtenu=txt_enter_account.getText();
		return txt_page_signup_obtenu;
		
	}
	public String recuperer_couleurtxt_page_signup() {
		String couleurtxt_page_signup_obtenu=txt_enter_account.getCssValue("color");
		return couleurtxt_page_signup_obtenu;
		
	}
	public void cliquer_bt_radio_mr() {
		bt_radio_Mr.click();
	}
	public void saisir_txt_pssword(String password){
		txt_password.sendKeys(password);
		
		}
	public void selectionner_jour_naissance() {
		Select select=new Select(liste_deroulante_day);
		select.selectByValue("24");
		
		Select select_1=new Select(liste_deroulante_month);
		select_1.selectByVisibleText("June");
		
		Select select_2=new Select(liste_deroulante_year);
		select_2.selectByValue("1984");
		}
		
	
	
	public void cliquer_bouton_Check_box_sign(){
		Check_box_sign.click();
	}
	public void cliquer_bouton_Check_box_receive(){
		Check_box_receive.click();
	}
	public void saisir_First_name(String first_name) {
		txt_first_name.sendKeys(first_name);
	}
	public void sasir_Last_name(String Last_name) {
		txt_last_name.sendKeys(Last_name);
	}
	public void sasir_nom_company(String company_name) {
		txt_company.sendKeys(company_name);
	}
	public void sasir_adresse(String adresse) {
		txt_adress.sendKeys(adresse);
	}
	public void select_country() {
		Select select_3=new Select(liste_deroulante_country);
		select_3.selectByVisibleText("Canada");
	}
	public void saisir_txt_state(String state) {
		txt_state.sendKeys(state);
	}
	public void sasir_txt_city(String city) {
		txt_city.sendKeys(city);
	}
	public void saisir_txt_zip_code(String zip_code) {
		txt_zip_code.sendKeys(zip_code);
	}
	public void saisir_txt_mobile_number(String mobile) {
		txt_mobile.sendKeys(mobile);
	}
	public void cliquer_bouton_create() {
		bt_create_account.click();
	}
	
	
	
	
	
	
	
	
	
	
}
