package luma.project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Add_Cart {
	static WebDriver driver; //a[@class='ui-corner-all'];
	public static void main(String[] args) {
		 driver = new ChromeDriver();
		 driver.get("https://magento.softwaretestingboard.com/women.html");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			WebElement women = driver.findElement(By.xpath("//span[@class='ui-menu-icon ui-icon ui-icon-carat-1-e']"));
			 Actions action=new Actions(driver);
			 action.moveToElement(women).build().perform();
			WebElement catagoris = driver.findElement(By.xpath("//a[@id='ui-id-9']"));
			catagoris.click();

		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
WebElement element = wait.until((ExpectedConditions.refreshed(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='ui-id-9']")))));
			element.click();
           driver.findElement(By.xpath("//img[@alt='Breathe-Easy Tank']")).click();
          WebElement element2 = wait.until((ExpectedConditions.refreshed(ExpectedConditions.elementToBeClickable(By.xpath("//img[@alt='Breathe-Easy Tank']")))));
          // driver.findElement(By.xpath("//div[@id='option-label-size-143-item-167']")).click();
		element2.click();
			
			
			 
			 }

	}


