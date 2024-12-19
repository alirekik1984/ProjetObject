package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PageObjectCreatedAccount {
	public  WebDriver driver;
	
	//constructeur
	public PageObjectCreatedAccount(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
		
	}
	
	
	//indentification des elements design pattern
	
	@FindBy(how=How.XPATH,using="//b[text()='Account Created!']")
	WebElement txt_account_creation;
	@FindBy(how=How.XPATH,using="//a[@data-qa='continue-button']")
	WebElement bt_continue;
	//creation methodes
	
	public String recuperer_txt_cration_account() {
		String txt_account_creation_obtenu=txt_account_creation.getText();
		return txt_account_creation_obtenu;
			}
	public String recuperer_couleur_txt_cration_account() {
		String couleur_txt_account_creation_obtenu=txt_account_creation.getCssValue("color");
		return couleur_txt_account_creation_obtenu;
	}
	public void cliquer_bouton_continue() {
		bt_continue.click();
	}
	
	

}
