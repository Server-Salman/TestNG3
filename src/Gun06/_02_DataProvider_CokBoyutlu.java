package Gun06;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _02_DataProvider_CokBoyutlu {

    @Test(dataProvider="getData")
    void UsernameTest(String username, String password)
    {
        System.out.println("Username="+username+", password="+password);
    }

    @DataProvider
    public Object[][] getData()
    {
        Object[][] data={
                {"Nurhayat","122333"},
                {"Alper","ererer"},
                {"Uğur","ererer3343"},
                {"Hakan","sdsdsd"}
        };
        return data;
    }

}
