package Gun04;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class _02_Intro {

    @Test
    void Test1(){ System.out.println("Test 1"); }

    @Test
    void Test2(){ System.out.println("Test 2"); }

    @BeforeTest
    void aTest(){ System.out.println("a test"); }
    //Aynı annotation dan olursa Class isminin alfabetik sırasına göre çalışır
}
