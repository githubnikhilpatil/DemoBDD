package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;


public class OrderStepDefinition extends  BaseStepDefinition{
	


	
	
@Given("^Navigate to Givconnect Portal Home Page$")
public void navigate_to_Givconnect_Portal_Home_Page() throws InterruptedException {
	System.out.println("CurrentThread is: "+ Thread.currentThread().getName());
	
	driver.get().navigate().to("https://givaudan-pegasus--uat.sandbox.my.site.com/store/s/");
	String title= driver.get().getTitle();
	System.out.println(title);
	

	WebDriverWait wait = new WebDriverWait(driver.get(), Duration.ofSeconds(30));
	wait.until( ExpectedConditions.visibilityOfElementLocated(By.xpath("//input")));
	WebElement login = driver.get().findElement(By.xpath("//input"));
	login.sendKeys(  this.scenariocontext.get().getContext("Email").toString() );
	WebElement submit = driver.get().findElement(By.xpath("//button[@title='Send']"));
	submit.click();
	
	
		
	//Thread.sleep(20000);
	System.out.println("Inside step1");
 
}






@Given("^Initialize data1$")
public void Initialize_Data() throws InterruptedException {

	System.out.println("CurrentThread is: "+ Thread.currentThread().getName());
	this.scenariocontext.get().setContext("Email","abc@abc.com");
}



@Given("^Initialize data2$")
public void Initialize_Data2() throws InterruptedException {
	System.out.println("CurrentThread is: "+ Thread.currentThread().getName());
	
	this.scenariocontext.get().setContext("Email","xyz@xyz.com");
}

/*
@Given("^Navigate to Givconnect Product Page$")
public void navigate_to_Givconnect_Product_Page() {
	
	WebElement productsearch = driver.findElement(By.xpath("//input[@title='Search...']"));
	productsearch.sendKeys("Mince Pie Flavour");
	productsearch.sendKeys(Keys.ENTER);
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	wait.until( ExpectedConditions.visibilityOfElementLocated(By.xpath("//lightning-formatted-rich-text[@title='Mince Pie Flavour']")));
	//driver.findElement(By.xpath("//lightning-formatted-rich-text[@title='Mince Pie Flavour']")).click();
	
	
	
	
	//System.out.println(driver.getTitle());
	//driver.close();
	
	
	
	System.out.println("Inside step2");
}



@When("^Add the Product to Cart$")
public void add_the_Product_to_Cart(){
	
	driver.findElement(By.xpath("//button[contains(text(),'Add to Cart')]")).click();
}

@And("^Navigate to Cart$")
public void navigate_to_Cart() throws InterruptedException{
	Thread.sleep(5000);
	
	/*
	driver.findElement(By.xpath("//span[contains(@title,'Cart')]")).click();
	
	
	
	
	


	 JavascriptExecutor js = (JavascriptExecutor) driver; 
     WebElement element = (WebElement) js.executeScript("document.evaluate('//button[contains(text(),'Continue Shopping')]/preceding-sibling::a', document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue"); 
     js.executeScript("arguments[0].click();", element);
     
	

	 JavascriptExecutor js = (JavascriptExecutor) driver; 

	js.executeScript("var s=document.createElement('script');s.src='http://ajax.googleapis.com/ajax/libs/jquery/1.6.1/jquery.min.js';document.body.appendChild(s);");
	Thread.sleep(5000);

	js.executeScript("$x('//a')[21].click();");
	
	
}


@Then("^Add Sample Request Information$")
public void add_Sample_Request_Information() {
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	wait.until( ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'Cart')]")));
	driver.findElement(By.xpath("//span[contains(text(),'Sample')]/parent::label")).click();
	
	wait.until( ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='QTY']")));

	driver.findElement(By.xpath("//input[@placeholder='QTY']")).sendKeys("1");
	
	driver.findElement(By.xpath("//input[@placeholder='Packing Units']")).sendKeys("10");
	
}

@And("^Add Quote Request Information$")
public void add_Quote_Request_Information() {
	driver.findElement(By.xpath("//span[contains(text(),'Quote')]/parent::label")).click();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	wait.until( ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Qty for given time period (i.e. 100kg/year)']")));
	driver.findElement(By.xpath("//input[@placeholder='Qty for given time period (i.e. 100kg/year)']")).sendKeys("10");

}

@And("^Add Regulatory Request Infomrmation$")
public void add_Regulatory_Request_Infomrmation()  {
	driver.findElement(By.xpath("//span[contains(text(),'Regulatory Document')]/parent::label")).click();
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	wait.until( ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Documents']")));
	
	driver.findElement(By.xpath("//input[@placeholder='Documents']")).click();
	wait.until( ExpectedConditions.visibilityOfElementLocated(By.xpath("//li//child::div[@data-label='Allergen Declaration']")));
	driver.findElement(By.xpath("//li//child::div[@data-label='Allergen Declaration']")).click();
	 
	

	driver.findElement(By.xpath("//input[@placeholder='Country']")).click();
	wait.until( ExpectedConditions.visibilityOfElementLocated(By.xpath("//li//child::div[@data-label='Albania']")));
	driver.findElement(By.xpath("//li//child::div[@data-label='Albania']")).click();

	

	driver.findElement(By.xpath("//input[@placeholder='Language']")).click();
	wait.until( ExpectedConditions.visibilityOfElementLocated(By.xpath("//li//child::div[@data-label='British English']")));
	driver.findElement(By.xpath("//li//child::div[@data-label='British English']")).click();

	
	wait.until( ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Add')]")));

	driver.findElement(By.xpath("//button[contains(text(),'Add')]")).click();
	
}



@Then("^Add project Additonal Information$")
public void add_project_Additonal_Information() {
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	driver.findElement(By.xpath("//input[@placeholder='Project Name']")).sendKeys("My Project");
    
	driver.findElement(By.xpath("//textarea[@placeholder='Leave a comment for entire order...']")).sendKeys("Order needs to be reviewed");
	
	
	
	wait.until( ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Checkout')]")));

	driver.findElement(By.xpath("//button[contains(text(),'Checkout')]")).click();
	
	
	
}

@Then("^Add Shipping Address Information$")
public void add_Shipping_Address_Information()  {
	
	//shipping
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	wait.until( ExpectedConditions.visibilityOfElementLocated(By.xpath("//lightning-formatted-text[text()='Select Shipping Address']")));
	
	driver.findElement(By.xpath("//span[contains(text(),'ACE INGREDIENTS SRL')]/parent::label")).click();
	
	driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
		
   
}

@Then("^Confirm Submit order$")
public void confirm_Submit_order() {
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	wait.until( ExpectedConditions.visibilityOfElementLocated(By.xpath("//lightning-formatted-text[text()='Confirm & Submit the Order'] ")));
	driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
	
	
	//lightning-formatted-text[text()='Confirm & Submit the Order'] 
		//button[contains(text(),'Next')]
}

@Then("^View order details$")
public void view_order_details() {
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	wait.until( ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'View My Order')]")));
	
	driver.findElement(By.xpath("//button[contains(text(),'View My Order')]")).click();
	wait.until( ExpectedConditions.visibilityOfElementLocated(By.xpath("//lightning-formatted-text[@slot='primaryField']")));
	
		
	
 
}

*/

@After
public void tear_down()
{
	driver.get().quit();
}




}