package Gun07;

import Utils.GenelWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _04_PlaceOrderPOM extends GenelWebDriver {

    @Test
    void ProceedToCheckout()
    {
        // TODO : maximize  olmdan sağlıklı çalışması araştırılacak

        _03_PlaceOrderElements elements=new _03_PlaceOrderElements(driver);

        elements.searchBox.sendKeys("ipod");
        elements.searchButton.click();
        elements.addToCart.click();
        elements.shoppingCart.click();
        elements.checkOut.click();

        wait.until(ExpectedConditions.elementToBeClickable(elements.continue1)).click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.continue2)).click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.continue3)).click();
        elements.agree.click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.continue4)).click();
        elements.confirm.click();

        wait.until(ExpectedConditions.urlContains("success"));
        Assert.assertEquals(elements.confirmTxt.getText(),"Your order has been placed!","Karşılaştırma Sonucu : ");
    }


}
