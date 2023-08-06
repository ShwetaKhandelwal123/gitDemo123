package Motorcycle;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Motorcycle_TC01_silver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\seleniumAll\\ChromeBrowserSetup\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://sampleapp.tricentis.com/101/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
		
		driver.findElement(By.id("nav_motorcycle")).click();
		
		//make dropdown
		WebElement dropdown=driver.findElement(By.id("make"));
		Select make=new Select(dropdown);
		make.selectByIndex(1);
		
		//model
		WebElement dropdown0=driver.findElement(By.id("model"));
		Select model=new Select(dropdown0);
		model.selectByIndex(2);
		
		//cylinder capacity
		driver.findElement(By.id("cylindercapacity")).sendKeys("12");
		
		//engine performance
		driver.findElement(By.id("engineperformance")).sendKeys("123");
		
		//date of manufacturer
		driver.findElement(By.id("dateofmanufacture")).sendKeys("12/08/2022");
		
		//no.of seats dropdown1
		WebElement dropdown1=driver.findElement(By.id("numberofseatsmotorcycle"));
		Select seats=new Select(dropdown1);
		seats.selectByIndex(2);
		
		//list price
		driver.findElement(By.id("listprice")).sendKeys("1000");
		
		//annual milage
		driver.findElement(By.id("annualmileage")).sendKeys("200");
		
		//next
		driver.findElement(By.id("nextenterinsurantdata")).click();

		//-----------------------------------------------------------------------------------------------------	
		
		//first name
		driver.findElement(By.id("firstname")).sendKeys("Atul");
		
		//last name
		driver.findElement(By.id("lastname")).sendKeys("Khandelwal");
		
		//birth date
		driver.findElement(By.id("birthdate")).sendKeys("05/03/1999");
		
		//gender radio button
		driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[1]/span")).click();
		
		//country dropdown3
		WebElement dropdown3=driver.findElement(By.id("country"));
		Select country=new Select(dropdown3);
		country.selectByVisibleText("India");
		
		//zipcode
		driver.findElement(By.id("zipcode")).sendKeys("412101");
		
		//occupation dropdown4
		WebElement dropdown4=driver.findElement(By.id("occupation"));
		Select occupation=new Select(dropdown4);
		occupation.selectByIndex(1);
		
		//hobbies checkbox
	driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[1]/span")).click();
		
		//next
		driver.findElement(By.id("nextenterproductdata")).click();

		//--------------------------------------------------------------------------------------------------	
		
		//enter product data
		//start date
		driver.findElement(By.id("startdate")).sendKeys("02/10/2023");
		
		//insurance sum dropdown5
		WebElement dropdown5=driver.findElement(By.id("insurancesum"));
		Select sum=new Select(dropdown5);
		sum.selectByIndex(1);
		
		
		//damage insurance dropdown6
		WebElement dropdown6=driver.findElement(By.id("damageinsurance"));
		Select damageinsurance=new Select(dropdown6);
		damageinsurance.selectByVisibleText("No Coverage");
		
		//optional products
		driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[4]/p/label[1]/span")).click();
		
		
		//next
		driver.findElement(By.id("nextselectpriceoption")).click();

		//-------------------------------------------------------------------------------------------------	
		
		
		//select price option(silver)
		String ExpPrice="86.00",ExpOnlineClaim="No",ExpClaimDiscount="No",ExpWWCover="No";
		System.out.println("silver price:");
		WebElement actPrice=driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tbody/tr[2]/td[2]"));
		if(actPrice.equals(ExpPrice))
		{
			System.out.println("Price is matching");
		}
		
		else
		{
			System.out.println("price is not matching");
		}
		
		
		//online claim
		System.out.println("Online claim:");
		WebElement actlineClaim=(driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tbody/tr[2]/td[2]")));
		
		if(actlineClaim.equals(ExpOnlineClaim))
		{
			System.out.println("online claim is matching");
		}
		
		else
		{
			System.out.println("online claim is matching");
		}
		//claims discount
		System.out.println("claims discount:");
		System.out.println(driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tbody/tr[3]/td[2]")).getText());
	
	    //worldwide cover
		System.out.println("worldwide cover");
	    System.out.println(driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tbody/tr[4]/td[2]")).getText());
	
	    //radio button
	    driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[1]/span")).click();
	
	    //next
	    driver.findElement(By.id("nextsendquote")).click();
//-----------------------------------------------------------------------------------------------------------------------------------------------

       //send quote
	    
	    //email
        driver.findElement(By.id("email")).sendKeys("atulkhandelwal123@gmail.com");
	    
        //user name
        driver.findElement(By.id("username")).sendKeys("atul");
        
        //password
        driver.findElement(By.id("password")).sendKeys("Atul@12");
	    
        //confirm password
        driver.findElement(By.id("confirmpassword")).sendKeys("Atul@12");
	    
	    //send email
        driver.findElement(By.id("sendemail")).click();
	    
	    //email confirmation
        
        WebDriverWait wait =new WebDriverWait(driver,10);
       System.out.println( wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]/h2"))).getText());
        
       // System.out.println(driver.findElement(By.xpath("/html/body/div[4]/h2")).getText());
	   
        //ok button
      WebElement btn= driver.findElement(By.xpath("/html/body/div[4]/div[7]/div/button")); 
	   Actions act =new Actions(driver);
	   act.click(btn).perform();
	   
	   //back to main menu
	   driver.findElement(By.xpath("//*[@id=\"backmain\"]/span")).click();
      
	}

}
