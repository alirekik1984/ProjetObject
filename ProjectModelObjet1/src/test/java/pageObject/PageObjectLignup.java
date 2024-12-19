package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PageObjectLignup {
	public WebDriver driver;
	
	//constructeur
	public PageObjectLignup(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
		}
	
	//identification des elements
	@FindBy(how=How.XPATH,using="//h2[text()='New User Signup!']")
	WebElement txt_signup;
	@FindBy(how=How.NAME,using="name")
	WebElement txt_name;
	@FindBy(how=How.XPATH,using="//input[@data-qa='signup-email']")
	WebElement txt_adress_mail;
	@FindBy(how=How.XPATH,using="//button[@data-qa='signup-button']")
	WebElement bt_signup;
	@FindBy(how=How.XPATH,using="//input[@data-qa='login-email']")
	WebElement txt_mail_login;
	@FindBy(how=How.XPATH,using="//input[@data-qa='login-password']")
	WebElement txt_password;
	@FindBy(how=How.XPATH,using="//input[@data-qa='login-button']")
	WebElement bt_login;
	
	//creation des methodes
	public void url(String url){
		driver.get(url);
	}
	public String recuperer_url_login() {
		String url_login_obtenu=driver.getCurrentUrl();
		return url_login_obtenu;
		
	}
	public String recuperer_txt_signup() {
	String txt_signup_obtenu=txt_signup.getText();
	return txt_signup_obtenu;
	}
	public void saisir_nom(String name) {
		txt_name.sendKeys(name);
	}
	public void saisir_adresse_mail(String mail) {
		txt_adress_mail.sendKeys(mail);
	}
	public void cliquer_bt_signup() {
		bt_signup.click();
	}
	public void saisir_mail_login(String mail) {
		txt_mail_login.sendKeys(mail);
	}
	public void saisir_txt_password(String password) {
		txt_password.sendKeys(password);
	}
	public void cliquer_bt_login() {
		bt_login.click();
	}

}
