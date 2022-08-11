package Gun08;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class _02_WishListElements {

    public _02_WishListElements(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css="div.caption>h4>a")
    List<WebElement> searchResults;

    @FindBy(css = "[data-original-title='Add to Wish List']")
    public List<WebElement> wishBtnList;

    @FindBy(id = "wishlist-total")
    public WebElement btnWish;

    @FindBy(css = "td[class='text-left']>a")
    public List<WebElement> tableNames;
}
