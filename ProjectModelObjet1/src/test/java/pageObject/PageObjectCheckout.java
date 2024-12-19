package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PageObjectCheckout {
public  WebDriver driver;
//constructeur
  public PageObjectCheckout(WebDriver driver) {
	PageFactory.initElements(driver, this);
	this.driver=driver;
  }
	//identification des elements
	
	@FindBy(how=How.XPATH,using="//li[@class='active']")
	WebElement txt_checkout;
	@FindBy(how=How.XPATH,using="//h3[text()='Your delivery address']")
	WebElement txt_delivery_adress;
	@FindBy(how=How.XPATH,using="//h3[text()='Your billing address']")
	WebElement txt_billing_adress;
	@FindBy(how=How.XPATH,using="//textarea[@class='form-control']")
	WebElement commentaire;
	@FindBy(how=How.XPATH,using="//a[@class='btn btn-default check_out']")
	WebElement bt_place_order;
	//methodes
	
	public String recuperer_txt_page_checkout() {
		String txt_page_checkout_obtenu=txt_checkout.getText();
		return txt_page_checkout_obtenu;
		}
	public void recuperer_url_checkout(String url_checkout ) {
		driver.getCurrentUrl();
	
	}
	public String recuperer_txt_delivery_adress() {
		String txt_delivery_adress_obtenu=txt_delivery_adress.getText();
		return txt_delivery_adress_obtenu;
	}
	public String recuperer_txt_billing_adress() {
		String txt_billing_adress_obtenu=txt_billing_adress.getText();
		return txt_billing_adress_obtenu;
	}
	public void saisir_commentaire() {
		commentaire.sendKeys("Ras");
	}
	public void cliquer_bt_place_order() {
		bt_place_order.click();
	}
	
	
}


