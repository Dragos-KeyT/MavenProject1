package curs23;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import selenium.utils.BaseTest;

public class ImplictWait extends BaseTest{

	@Test
	public void implictWaitExample() throws InterruptedException {
		
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		//implict wait asteapta ca elementul sa existe in DOM
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.cssSelector("div[id='start']>button")).click();
		
		//Thread.sleep(10000);--> bad practice
		
		WebElement finishText = driver.findElement(By.cssSelector("div[id='finish']>h4"));
		assertEquals(finishText.getText(), "Hello World!");
		
		
	}
	
	
}
