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
import pages.ExploreButton;


import static org.junit.jupiter.api.Assertions.assertTrue;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@SpringBootTest
public class ExploreButtonTest {

    WebDriver driver;
    WebDriverWait wait;
    ExploreButton explore;


    @BeforeAll
    public void setup(){
        System.setProperty("webdriver.edge.driver", "src/test/java/resources/edgedriver/msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ecran.lat");
    }

    @Test
    public void ExploreButtonTest(){
        explore = new ExploreButton(driver);
        explore.ClickExploreButton();


        /*WebElement message = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div/div[2]/div[1]/div/div/h2"));
        String message2 = message.getText();
        assertTrue(message2.contains("Elige una opción..."));      */



    }
}
