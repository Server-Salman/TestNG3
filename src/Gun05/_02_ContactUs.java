package Gun05;

/*
  1- ContactUs a tıklayınız
  2- Mesaj kutusuna en az 10 karakterlik bir mesaj yazınız.
  3- Submit ettikten sonra Contact US yazısını doğrulayınız.
 */

import Utils.GenelWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class _02_ContactUs extends GenelWebDriver {

    @Test
    @Parameters("mesaj") // XML deki adı
    void ContactUs(String gelenMesaj) // metoddaki adı
    {
        WebElement contactUsButton = driver.findElement(By.linkText("Contact Us"));
        contactUsButton.click();

        WebElement enquiryArea = driver.findElement(By.id("input-enquiry"));
        enquiryArea.sendKeys(gelenMesaj);

        WebElement submitButton = driver.findElement(By.cssSelector("[value='Submit']"));
        submitButton.click();

        WebElement contactUslabel = driver.findElement(By.cssSelector("[id='content']>h1"));
        System.out.println(contactUslabel.getText());

        Assert.assertEquals("Contact Us",contactUslabel.getText(),"Karşılaştırma sonucu : ");
    }


}
