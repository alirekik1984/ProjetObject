package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PageObjectDetailProduct {
	 public  WebDriver driver;
	 
	 //constructeur
	 public PageObjectDetailProduct(WebDriver driver) {
			PageFactory.initElements(driver, this);
			this.driver=driver;
			} 
     //identification des elements
	 @FindBy(how=How.XPATH,using="//h2[text()='Sleeveless Dress']")
	 WebElement txt_produit2;
	 @FindBy(how=How.XPATH,using="//button[@class='btn btn-default cart']")
	 WebElement bt_add_cart;
	 @FindBy(how=How.XPATH,using="//p[text()='Your product has been added to cart.']")
		WebElement txt_pop_up_added;
	 //methodes
	 public void url_details_produit2(String Url_details_produit2) {
		 driver.getCurrentUrl();
	 }
	 
	 public String nom_produit2() {
		 String nom_produit2_obtenu=txt_produit2.getText();
		return nom_produit2_obtenu;
		 
	 }
	 public void cliquer_bt_add_cart() {
		 bt_add_cart.click();
		 	 }
	 public  String txt_added() {
		 String txt_pop_up_added_obtenu=txt_pop_up_added.getText();
		return txt_pop_up_added_obtenu;
		 
	 }
	 
	 
}
