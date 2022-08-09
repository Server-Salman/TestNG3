package Gun06;

import Utils.GenelWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Daha önceki derslerde yaptğımı Search fonksiyonunu
 * mac,ipod ve samsung için Dataprovider ile yapınız.
 */
public class _04_Task extends GenelWebDriver {


    @Test(dataProvider = "getData")
    void  SearchFunction(String txtSearch)
    {
        WebElement searchInput = driver.findElement(By.name("search"));
        searchInput.clear();
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

    @DataProvider
    public Object[] getData()
    {
        Object[] data = {"mac","ipod","samsung"};
        return data;
    }


}
