import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

@SuppressWarnings("unused")
public class ass3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      System.setProperty("webdriver.chrome.driver","C:\\Users\\siripurapu\\Downloads\\chromedriver_win32\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.get("http://the-internet.herokuapp.com/");
      driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[25]/a")).click();
      //Actions a1 = new Actions(driver);
      driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/img"));
      System.out.println("name:" +driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div/h5")).getText());
      driver.navigate().back();
      driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[6]/a")).click();
      driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[2]")).click();
      Thread.sleep(2000L);
      driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]")).click();
      driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[2]")).click();
      driver.navigate().back();
      driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[27]/a")).click();
      driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/input")).sendKeys("0413");
      Thread.sleep(2000L);
      driver.navigate().back();
      driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[11]/a")).click();
      driver.findElement(By.xpath("//*[@id=\"dropdown\"]")).click();
      int i=1;
      while(i<3)
      {
    	  
    	  driver.findElement(By.xpath("//*[@id=\"dropdown\"]"));
    	  i++;
    	  driver.findElement(By.xpath("//*[@id=\"dropdown\"]/option[3]")).click();
    	  driver.navigate().back();
    	  driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[18]/a")).click();
    	  driver.navigate().back();
    	  driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[41]/a")).click();
          System.out.println("email:"+driver.findElement(By.xpath("//*[@id=\"table1\"]/tbody/tr[1]/td[3]")));
          System.out.println("website:"+driver.findElement(By.xpath("//*[@id=\"table1\"]/tbody/tr[1]/td[5]")));
          
    	  
    	  
      }
      driver.navigate().back();
}
}
