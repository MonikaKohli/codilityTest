package codility.covidWarrier;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyCreateWarrier {
	
	
	public static void main(String [] args) throws InterruptedException{
        
	         readData excel = new readData("D:\\Warrier.xlsx");
	         
	        String exePath = "C:\\Users\\Monika\\Downloads\\chromedriver_win32\\chromedriver.exe";
	        System.setProperty("webdriver.chrome.driver", exePath);
	        WebDriver driver = new ChromeDriver();
	         
	        driver.get("http://www.google.com/");
	        driver.navigate().to("https://responsivefight.herokuapp.com/");  

	         
	        driver.findElement(By.id("worrior_username")).sendKeys("monika");
	        driver.findElement(By.id("warrior")).click();
	         
	        Thread.sleep(5000);
	         
	        driver.close();
	    }

}
