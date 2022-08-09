package Gun06;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class _01_DataProvider {

    /**
     * Aşağıdaki ikili ile Dataproviderın içindeki bütün veriler tek tek test e gönderilerek
     * data sayısı kadar test çalıştırılır, dataların olduğu yere DataProvider annottion ı konur.
     * çalıştırılacak teste ise dataProvider = "getData"  bölümü eklenir.
     * Dataprovider bir testi birden fazla DATA ile çok çalıştırmak için kullanılır.
     * XML filer file gruplama, pararalel, ve farklı tesleri koordine edip birarada çalıştırmak için kullanılır.
     */

    @Test(dataProvider="getData")
    void UsernameTest(String username)
    {
        System.out.println("Username="+username);
    }

    @DataProvider // bu metoda dataprovider görevi verildi.
    public Object[] getData() // DataProvider olarak kullanılcak metodun tipi Object olmak zorunda.
    {
        Object[] data={"Nurhayat","Alper","Uğur","Hakan"};

        return data;
    }

    /*****************************************/

    @Test(dataProvider="userlar") // DataProviderın ismi burda metod adı yerine kullanıldı.
    void UsernameTest2(String username)
    {
        System.out.println("Username="+username);
    }

    @DataProvider(name="userlar") // DataProvider a isim verdim.
    public Object[] getData2() // DataProvider olarak kullanılcak metodun tipi Object olmak zorunda.
    {
        Object[] data={"ismet","Alper","Uğur","Hakan"};

        return data;
    }



}
