import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SeleniumTest {

    @Before
    public void testSetup() {
        Selenium.setup();
    }

    @Test
    public void testSearchByKeyword() {
        Selenium.searchByKeyword("Baranauskas");
    }

    @After
    public void testClose() {
        //Selenium.close();
    }
}
