/*import org.junit.After;
import org.junit.Before;
import org.junit.Test;*/

import org.testng.annotations.*;

import java.util.Scanner;

public class SeleniumTest {

    @BeforeTest
    public void testSetup() {
        Selenium.setup();
    }

    @Test
    public void testSearchByKeyword() {
        Scanner s = new Scanner(Selenium.searchByKeyword("Baranauskas"));
        String res = s.next();
        res = res.replace(",", "");
        System.out.println(res);
    }

    @AfterTest
    public void testClose() {
        //Selenium.close();
    }
}
