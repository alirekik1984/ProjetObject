package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PageObjectViewCart {
	 public  WebDriver driver;
	 
	 //constructeur
	 
	 public PageObjectViewCart(WebDriver driver) {
			PageFactory.initElements(driver, this);
			this.driver=driver;
			} 
	 
	 //identification des elements
	 @FindBy(how=How.XPATH,using="//li[@class='active']")
	 WebElement txt_Shop_Cart;
	 @FindBy(how=How.XPATH,using="//a[@href='/product_details/1']")
	 WebElement txt_produit1;
	 @FindBy(how=How.XPATH,using="//a[@href='/product_details/1']")
	 WebElement txt_produit2;
	 @FindBy(how=How.XPATH,using="//a[@class='btn btn-default check_out']")
	 WebElement bt_checkout;
	 //methodes
	 public void url_view_product(String Url_view) {
		 driver.getCurrentUrl();
	 }
	 public String recuperer_txt_shop_cart() {
		 String txt_shop_cart_obtenu= txt_Shop_Cart.getText();
		return txt_shop_cart_obtenu;
		 
	 }
	 public String recuperer_nom_produit1() {
		 String txt_produit1_obtenu=txt_produit1.getText();
		return txt_produit1_obtenu;
	 }
	 public String recuperer_nom_produit2() {
		String txt_produit2_obtenu=txt_produit2.getText();
		return txt_produit2_obtenu; 
		 
	}
	 public void cliquer_bt_checkout() {
		 bt_checkout.click();
	 }
	 
	 
	 
	 
	 
	 
	 
	 
}
