package Gun03;

import Utils.GenelWebDriver;
import Utils.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import javax.tools.Tool;
import java.util.List;

/*
       Senaryo;
       1- Siteyi açınız.
       2- Adress Ekleyiniz.
       3- En son adresi edit yaparak ad ve soyadı değiştirip kaydediniz.
       4- En son adresi siliniz.
 */
public class _02_AddressFunctionality extends GenelWebDriver {

   @Test
   void addAddress(){

       WebElement addressBook= driver.findElement(By.linkText("Address Book"));
       addressBook.click();

       WebElement newAddress= driver.findElement(By.linkText("New Address"));
       newAddress.click();

       WebElement firsName=driver.findElement(By.id("input-firstname"));
       firsName.sendKeys("Ahmet");

       WebElement lastname=driver.findElement(By.id("input-lastname"));
       lastname.sendKeys("Demir");

       WebElement company=driver.findElement(By.id("input-company"));
       company.sendKeys("Techno Study");

       WebElement address1=driver.findElement(By.id("input-address-1"));
       address1.sendKeys("21a London Road");

       WebElement address2=driver.findElement(By.id("input-address-2"));
       address2.sendKeys("RG2 5BJ");

       WebElement city=driver.findElement(By.id("input-city"));
       city.sendKeys("Reading");

       WebElement postCode=driver.findElement(By.id("input-postcode"));
       postCode.sendKeys("12345");

       WebElement country=driver.findElement(By.id("input-country"));
       Select countryS=new Select(country);
       countryS.selectByVisibleText("Turkey");

       wait.until(ExpectedConditions.elementToBeClickable(country));
       // wait.until(ExpectedConditions.stalenessOf(driver.findElement(By.cssSelector("select[id='input-zone']>option"))));
       //bu elemanın bayatlamış hali gidene kadar bekle

       WebElement State=driver.findElement(By.id("input-zone"));
       Select state=new Select(State);
       state.selectByIndex(10);

       WebElement defadres=driver.findElement(By.cssSelector("label [name='default'][value='1']"));
       defadres.click();

       WebElement ctn=driver.findElement(By.cssSelector("input[type='submit']"));
       ctn.click();

       Tools.successMessageValidation();
   }

   @Test(dependsOnMethods = {"addAddress"})
   void editAddress()
   {
       WebElement addressBook= driver.findElement(By.linkText("Address Book"));
       addressBook.click();

       List<WebElement> editAll=driver.findElements(By.linkText("Edit"));  //*[text()='Edit']
       WebElement sonEdit= editAll.get(editAll.size() - 1); // sonuncu edit
       System.out.println("editAll = " + editAll.size());
       sonEdit.click();

       WebElement firsName=driver.findElement(By.id("input-firstname"));
       firsName.clear();
       firsName.sendKeys("Mehmet");

       WebElement lastname=driver.findElement(By.id("input-lastname"));
       lastname.clear();
       lastname.sendKeys("Yılmaz");

       WebElement ctn=driver.findElement(By.cssSelector("input[type='submit']"));
       ctn.click();

       Tools.successMessageValidation();
   }

   @Test(dependsOnMethods = {"editAddress"})
   void deleteAddress()
   {
       WebElement addressBook= driver.findElement(By.linkText("Address Book"));
       addressBook.click();

       List<WebElement> deleteAll=driver.findElements(By.linkText("Delete"));
       WebElement sonDelete= deleteAll.get(deleteAll.size() - 2);
       sonDelete.click();

       Tools.successMessageValidation();
   }





}





   /*
       WebElement country=driver.findElement(By.id("input-country"));
       Select countryS=new Select(country);
       countryS.selectByIndex(10);

       WebElement State=driver.findElement(By.id("input-zone"));
       Select state=new Select(State);
       System.out.println("state.getOptions().size() 1 = " + state.getOptions().size());

       wait.until(ExpectedConditions.numberOfElementsToBeLessThan(By.cssSelector("[id='input-zone']>option"),
                   state.getOptions().size()));
       // option ların sayısı ilk halinden küçük olana kadar bekle : yeni durum gelene kadar bekle

       System.out.println("state.getOptions().size() 2 = " + state.getOptions().size());

       State=driver.findElement(By.id("input-zone"));
       state=new Select(State);

//       System.out.println("state.getOptions().size() = " + state.getOptions().size());
//       for(WebElement e: state.getOptions())
//           System.out.println(e.getText());

       state.selectByIndex(3);
       */