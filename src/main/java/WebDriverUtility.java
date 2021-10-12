
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverUtility {
    WebDriver webDriver;

    WebDriverUtility() {
        System.setProperty("webdriver.chrome.driver","Utility/chromedriver");
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://codility-frontend-prod.s3.amazonaws.com/media/task_static/qa_search/6f03f4361b080eeb74" +
                "7193aadd94cd2b/static/attachments/reference_page.html");
    }
}
