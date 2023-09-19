package ECRAN.EcranTesting;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.boot.test.context.SpringBootTest;
import pages.Detail;

import static org.junit.jupiter.api.Assertions.assertTrue;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@SpringBootTest
public class DetailAddListTest {

    WebDriver driver;
    WebDriverWait wait;
    Detail detail;


    @BeforeAll
    public void setup() {
        System.setProperty("webdriver.edge.driver", "src/test/java/resources/edgedriver/msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ecran.lat");
    }

    @Test
    public void DetailAddListTest() {
        detail = new Detail(driver);
        detail.ClickExploreButton();
        detail.ClickMovie();

       /* WebElement message = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/main/section/div[1]/div[2]/div[1]/button/p"));
        String message2 = message.getText();
        assertTrue(message2.contains("Agregar a mi lista"));       */


    }
}
