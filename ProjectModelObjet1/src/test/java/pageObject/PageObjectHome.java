package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PageObjectHome {
	public WebDriver driver;
	
	
	//constructeur
	public PageObjectHome(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
		}
	
	//identification des elements design pattern
	@FindBy(how=How.XPATH ,using="//h2[text()='Full-Fledged practice website for Automation Engineers']")
	WebElement txt_page_home;
	@FindBy(how=How.XPATH ,using="//a[text()=' Signup / Login']")
    WebElement bt_signup_login;
	@FindBy(how=How.XPATH,using="//a[contains(text(),' Logged in as ')]")
	WebElement txt_logged;
	@FindBy(how=How.XPATH,using="//a[text()=' Home']")
	WebElement bt_home;
	@FindBy(how=How.XPATH,using="//a[text()=' Products']")
	WebElement bt_products;
	@FindBy(how=How.XPATH,using="//u[text()='View Cart']")
	WebElement bt_view_Cart;
		
	//creation des methodes
	public void url(String url){
		driver.get(url);
	}
	
	public void cliquer_bouton_signuplogin() {
		bt_signup_login.click();
	}
	public String recuperer_txt_home_page(){
		String txt_full_flagged_obtenu=txt_page_home.getText();
		return txt_full_flagged_obtenu;
	}
	public String recuperer_txt_bt_sigup_login() {
		String txt_bt_signup_obtenu=bt_signup_login.getText();
		return txt_bt_signup_obtenu;
	}
	public String recuperer_txt_logged() {
		String txt_loggd_obtenu=txt_logged.getText();
		return txt_loggd_obtenu;
	}
	public String recuperer_couleur_bt_home(){
		String couleur_bt_home_obtenu=bt_home.getCssValue("color");
		return couleur_bt_home_obtenu;
	}
	public String txt_bt_products() {
		String txt_bt_products_obtenu=bt_products.getText();
		return txt_bt_products_obtenu;
	}
	public void cliquer_bt_products() {
		bt_products.click();
	}
	public void cliquer_bt_view_cart() {
		bt_view_Cart.click();
	}
	

}
