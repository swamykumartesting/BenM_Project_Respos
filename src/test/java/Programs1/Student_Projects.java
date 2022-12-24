package Programs1;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Student_Projects {
	
	public WebDriver driver; 
	
  @Test
  public void Student_Regform() throws Exception {
	 
		  driver.findElement(By.id("firstName")).sendKeys("Rama");
		  
		  driver.findElement(By.id("lastName")).sendKeys("Raju");
		  
		  driver.findElement(By.id("userEmail")).sendKeys("ramraju@gmail.com");
		  Thread.sleep(3000);
		  
		  driver.findElement(By.xpath("//label[@for='gender-radio-1']")).click();
		  Thread.sleep(3000);
		  
		  driver.findElement(By.id("userNumber")).sendKeys("9912345678");
		  Thread.sleep(3000);
		  
		  //Calender 
		  driver.findElement(By.id("dateOfBirthInput")).click();
		  Thread.sleep(3000);
		  
		  driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']")).sendKeys("December");
		  Thread.sleep(3000);
		  
		  driver.findElement(By.className("react-datepicker__year-select")).sendKeys("1990"); Thread.sleep(3000);
		  
		  driver.findElement(By.xpath("//div[@aria-label='Choose Tuesday, December 25th, 1990']")).click();
		  Thread.sleep(8000);
		  
		  driver.findElement(By.id("subjectsInput")).sendKeys("Maths");
		  Thread.sleep(3000);
		  driver.findElement(By.id("subjectsInput")).sendKeys(Keys.ENTER);
		  Thread.sleep(3000);
		  
		  driver.findElement(By.xpath("//label[@for='hobbies-checkbox-2']")).click();
		  Thread.sleep(3000);
		  
		  driver.findElement(By.xpath("//input[@id='uploadPicture']")).sendKeys("D:\\Pictures\\APJ.jpg");
		  Thread.sleep(3000);
		  
		  driver.findElement(By.id("currentAddress")).sendKeys("Mumbai City Views");
		  Thread.sleep(3000);
		  
		 //selecting order 
		  driver.findElement(By.xpath("//div[contains(@class,'css-1pahdxg-control')]//div[contains(@class,'css-1hwfws3')]")).click(); Thread.sleep(3000);
		  
		  //state sending
		  driver.findElement(By.xpath("//div[contains(@class,'css-1pahdxg-control')]//div[contains(@class,'css-1hwfws3')]")).sendKeys("Rajasthan"); Thread.sleep(3000);
		  
		  //passing keyboard actions 
		  driver.findElement(By.xpath("//div[contains(@class,'css-1pahdxg-control')]//div[contains(@class,'css-1hwfws3')]")).sendKeys(Keys.ENTER); Thread.sleep(3000);
		  
		  //selecting order City
		  driver.findElement(By.xpath("//*[@id=\"city\"]/div/div[1]")).click();
		  Thread.sleep(3000);
		  
		  //City sending
		  driver.findElement(By.xpath("//*[@id=\"city\"]/div/div[1]")).sendKeys(
		  "Jaipur"); Thread.sleep(3000);
		  
		  //City passing keyboard actions
		  driver.findElement(By.xpath("//*[@id=\"city\"]/div/div[1]")).sendKeys(Keys.
		  ENTER); Thread.sleep(3000);
		  
		  driver.findElement(By.id("submit")).click(); Thread.sleep(3000);
		 
  }
  
  @BeforeTest
  public void beforeTest() {
	  
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://demoqa.com/automation-practice-form");
	  driver.manage().window().maximize();
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  
  }

}
