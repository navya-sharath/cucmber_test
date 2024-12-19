package luma.project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Create_page {
static WebDriver driver;
public static void main(String[] args) {
	 driver=new ChromeDriver();
	driver.get("https://magento.softwaretestingboard.com/");
	driver.manage().window().maximize();

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 driver.findElement(By.xpath("//a[text()='Create an Account']")).click();

	createAccount("chandana","pradeep","chanadanapradeep@gmail.com","pradeep@123","pradeep@123");
	
	 
  	
}
public static void createAccount(String name,String lname,String email,String password,String confirmPassword) {
	// driver.findElement(By.xpath("//a[text()='Create an Account']")).click();

	 driver.findElement(By.id("firstname")).sendKeys(name);
     driver.findElement(By.id("lastname")).sendKeys(lname);
     driver.findElement(By.id("email_address")).sendKeys(email);
     driver.findElement(By.id("password")).sendKeys(password);
     driver.findElement(By.id("password-confirmation")).sendKeys(confirmPassword);
    WebElement click_Button = driver.findElement(By.xpath("//button[@class='action submit primary']"));
	click_Button.click();
	WebElement message = driver.findElement(By.xpath("//div[@class='message-success success message']"));
	if(message.isDisplayed()){
		System.out.println(message.isDisplayed());
		
	}
	else {
		System.out.println("message is not display");
	}
	
	
}

}