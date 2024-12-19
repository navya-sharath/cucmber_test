package luma.project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sign_In  {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/women.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));
		WebElement click = driver.findElement(By.xpath("//li[@class='authorization-link']"));
		click.click();
		
		details("navya@gmail.com","navya@123");
		
		
	}
	public static void details(String email,String password) throws InterruptedException {
		WebElement emailname = driver.findElement(By.id("email"));
		emailname.sendKeys(email);
		WebElement emailpassword = driver.findElement(By.id("pass"));
		emailpassword.sendKeys(password);
		WebElement signin = driver.findElement(By.id("send2"));
		signin.click();
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(20));
		WebElement text = driver.findElement(By.xpath("//span[text()='Welcome, navya krishna!']"));
		wait.until(ExpectedConditions.visibilityOf(text));
		WebElement errortext = driver.findElement(By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']"));
		wait.until(ExpectedConditions.visibilityOf(errortext));
		if(text.isDisplayed()) {
			String textmsg = text.getText();
			System.out.println(textmsg);
		}

		else if(errortext.isDisplayed()) {
			String errormessage = errortext.getText();
			System.out.println(errormessage);
		}
		
		
		
		driver.close();
	
	
	}
	



}
