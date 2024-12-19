package luma.project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Forgot_Password {
	static WebDriver driver;

	public static void main(String[] args) {
		driver =new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/women.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement clickButton = driver.findElement(By.xpath("//li[@class='authorization-link']"));
	    clickButton.click();
	   // driver.navigate().to("https://magento.softwaretestingboard.com/customer/account/forgotpassword/");
		 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement button=driver.findElement(By.xpath("//a[@class='action remind']"));
		 wait.until(ExpectedConditions.visibilityOf(button));
		button.click();
		WebElement text = driver.findElement(By.id("email_address"));
		text.sendKeys("navya@gmail.com");
		WebElement button2 = driver.findElement(By.xpath("//button[@class='action submit primary']"));
		button2.click();
		WebElement message = driver.findElement(By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']"));
		if(message.isDisplayed()) {
			String textMeaasge = message.getText();
			System.out.println(textMeaasge);
		}
	 }

	}


