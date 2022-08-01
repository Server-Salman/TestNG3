package Gun01;

/*
   Senaryo ;
     1- http://opencart.abstracta.us/index.php?route=account/login  sitesini açınız.
     2- asd@gmail.com  ve 123qweasd   bilgileri ile login olan test metodunu yazınız.
     3- Login olup olmadığınızı assert ile kontrol ediniz.

 */

import Utils.GenelWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class _05_Ornek extends GenelWebDriver {

    @Test
    void LoginTest()
    {
        WebElement inputEmail= driver.findElement(By.id("input-email"));
        inputEmail.sendKeys("tenstng@gmail.com");

        WebElement password= driver.findElement(By.id("input-password"));
        password.sendKeys("123qweasd");

        WebElement loginBtn= driver.findElement(By.cssSelector("input[value='Login']"));
        loginBtn.click();
    }

}
