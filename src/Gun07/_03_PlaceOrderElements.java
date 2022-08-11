package Gun07;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _03_PlaceOrderElements {

    // Bu sayfadaki bütün elemenalrın driverlar bağlantısı gerekiyor
    // bunun için aşağıdaki consructor eklendi ve için PageFatory ile
    // driver üzerinden bu (this) sayfadaki bütün elemnalar ilşkilendirildi.
    // Böylece Sayfada dan nesne türetildiği zaman değil, kullanıldığı
    // anda elemanların bulunması aktif oluyor.Bu yöntemle bütün sayfalarda
    // aynı isimde elemanlar var ise buradaki tanımlama hepsi için geçerli hale
    // gelmiş oluyor. buna yapıya Page Object Model (POM) adı veriliyor.

    public _03_PlaceOrderElements(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(name="search")
    public WebElement searchBox;

    @FindBy(className = "input-group-btn")
    public WebElement searchButton;

    @FindBy(xpath = "//span[text()='Add to Cart']")
    public WebElement addToCart;

    @FindBy(linkText = "Shopping Cart")
    public WebElement shoppingCart;

    @FindBy(linkText = "Checkout")
    public WebElement checkOut;

    @FindBy(id="button-payment-address")
    public WebElement continue1;

    @FindBy(id="button-shipping-address")
    public WebElement continue2;

    @FindBy(id="button-shipping-method")
    public WebElement continue3;

    @FindBy(name="agree")
    public WebElement agree;

    @FindBy(id="button-payment-method")
    public WebElement continue4;

    @FindBy(id="button-confirm")
    public WebElement confirm;

    @FindBy(css="[id='content']>h1")
    public WebElement confirmTxt;


//    @FindBy(xpath = "(//div[@class='button-group']/button)[1]")
//    public WebElement addToCart;
//
//    @FindBy(css ="i[class='fa fa-shopping-cart']")
//    public WebElement shoppingCart;

}
