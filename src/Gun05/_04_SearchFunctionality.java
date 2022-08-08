package Gun05;

 /*
       Senaryo ;
       1- Siteyi açınız.
       2- mac kelimeini göndererek aratınız.
       3- Çıkan sonuçlarda mac kelimesinin geçtiğini doğrulayınız.
       4- aynı işlemi samsung için de yapınız
     */

import Utils.GenelWebDriver;
import Utils.ParametreliWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

public class _04_SearchFunctionality extends ParametreliWebDriver {

    @Parameters("arananKelime")
    @Test
    void  SearchFunction(String txtSearch)
    {
        WebElement searchInput = driver.findElement(By.name("search"));
        searchInput.sendKeys(txtSearch);

        WebElement searchButton = driver.findElement
                (By.cssSelector("[class='btn btn-default btn-lg']"));
        searchButton.click();

        //h4>a
        List<WebElement> captions = driver.findElements
                  (By.cssSelector("[class='product-thumb'] [class='caption'] a"));

        for (WebElement e : captions) {
            Assert.assertTrue(e.getText().toLowerCase().contains(txtSearch));
        }
    }

}
