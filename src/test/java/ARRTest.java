import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ARRTest extends WebDriverUtility{

    WebElement query;
    WebElement search;
    WebElement noRes;
    WebElement singleRes;
    WebElement errRes;

    ARRTest(){
        query = webDriver.findElement(By.id(""));
        search = webDriver.findElement(By.id(""));
        noRes = webDriver.findElement(By.id("error-no-results"));
        singleRes = webDriver.findElement(By.xpath("//ul[@id = 'search-results']//li"));
        errRes = webDriver.findElement(By.id("error-empty-query"));
    }

    @Test
    public void testTitle(){
        String name = webDriver.getTitle();
        Assert.assertEquals("ARR", name);
    }

    @Test
    public void forbiddenSearch(){

    }
}
