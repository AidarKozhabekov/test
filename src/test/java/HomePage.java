import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePage {
    @Test
    public void titleTest(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://testkwidos.tk/");
        driver.manage().window().maximize();

        String title = driver.getTitle();
        Assert.assertEquals(title, "Kwidos");

        driver.quit();

    }
}
