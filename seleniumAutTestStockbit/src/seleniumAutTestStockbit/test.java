package seleniumAutTestStockbit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://stockbit.com/");
		driver.findElement(By.xpath("//*[@id=\"section0\"]/div/div/div[1]/div/a")).click();
	}

}
