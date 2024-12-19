package pageObject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PageObjectProduct {
	
	
 public  WebDriver driver;
 
 //constructeur
 public PageObjectProduct(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
		} 
 
 //identification des elements 
 @FindBy(how=How.XPATH,using="//h2[text()='Rs. 500']")
  WebElement txt_prix_product1;
 @FindBy(how=How.XPATH,using="//p[text()='Your product has been added to cart.']")
 WebElement txt_pop_up_added;
 @FindBy(how=How.XPATH,using="//button[@class='btn btn-success close-modal btn-block']")
 WebElement bt_pop_up_continuer;
 @FindBy(how=How.XPATH,using="//h2[text()='All Products']")
 WebElement txt_all_products;
 @FindBy(how=How.XPATH,using="//a[@href='/product_details/3']")
 WebElement bt_view_product;
 
 //methodes
 
 //public String  url_products=driver.getCurrentUrl(); 
 
 public void cliquer_bt_add_to_cart(){
	 Actions action=new Actions(driver);
	 action.moveToElement(txt_prix_product1);
	 Alert alert=driver.switchTo().alert();
	 alert.accept();
	 
 }
 public String recuperer_txt_pop_up_added() {
	 String txt_pop_up_added_obtenu=txt_pop_up_added.getText();
	return txt_pop_up_added_obtenu;
 }
 public void cliquer_bt_pop_up_continuer() {
	 bt_pop_up_continuer.click();
 }
 public String recuperer_txt_al_products() {
	 String txt_al_products_obtenu=txt_all_products.getText();
	return txt_al_products_obtenu;
	 
 }
 public void cliquer_bt_view_product() {
	 bt_view_product.click();
	 
 }
 
 
}
