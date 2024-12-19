package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PageObjectDonePaiement {
	public WebDriver driver;
	//constructeur
	public PageObjectDonePaiement(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
		
	}
	//identification des elements
	@FindBy(how=How.XPATH,using="//p[text()='Order Placed!']")
	WebElement txt_ordered;
	@FindBy(how=How.XPATH,using="//a[@class='btn btn-default check_out']")
	WebElement bt_download;
	@FindBy(how=How.XPATH,using="//a[@class='btn btn-primary']")
	WebElement bt_continue;
	
	//methodes
	public void url_done_paiement(String url_url_done_paiement_obtenu) {
		driver.getCurrentUrl();
	}
	public String recuperer_txt_ordered_obtenu() {
		String txt_ordered_obtenu=txt_ordered.getText();
		return txt_ordered_obtenu;
		
	}
	public void cliquer_bt_download() {
		bt_download.click();
	}
	public void cliquer_bt_continue() {
		bt_continue.click();
	}

}
