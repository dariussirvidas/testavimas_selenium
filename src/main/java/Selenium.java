import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium {
    static WebDriver browser;
    static final int PAGE_LOAD_TIME_IN_SEC = 2;

    public static void setup() {
        System.setProperty("webdriver.chrome.driver", ".\\.\\drivers\\chromedriver.exe");
        browser = new ChromeDriver();
        browser.get("https://www.bing.com/");
    }

    public static void close() {
        browser.close();
    }

    public static String searchByKeyword(String keyword) {

        String id = "sb_form_q";

        waitForElementById(id);

        WebElement searchField = browser.findElement(By.id(id));

        searchField.sendKeys(keyword);
        WebElement searchButton = browser.findElement(By.id("sb_form_go"));
        //searchField.sendKeys(Keys.ENTER);
        waitForElementById("sb_form_go");
        searchButton.click();

        /*try {
            Thread.sleep(10000);
        }
        catch (Exception e) {}*/
        waitForElementById(id);
        WebElement SearchResultField = browser.findElement(By.cssSelector("span.sb_count"));
        return SearchResultField.getText();
    }

    public static void waitForElementById(String id) {
        WebDriverWait waitas = new WebDriverWait(browser, PAGE_LOAD_TIME_IN_SEC);
        waitas.until(ExpectedConditions.elementToBeClickable(By.id(id)));
    }

    public static void main(String args[])
    {
        /*System.out.println("selenium");
        System.setProperty("webdriver.chrome.driver", ".\\.\\drivers\\chromedriver.exe");
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\moksleivis\\IdeaProjects\\selenium\\drivers\\chromedriver.exe");
*/
        //searchByKeyword("Baranauskas");

    }
}
