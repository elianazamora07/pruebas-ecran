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
import pages.BasePage;
import pages.RegisterUser;

import static org.junit.jupiter.api.Assertions.assertTrue;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@SpringBootTest
public class RegisterTest {

    WebDriver driver;
    WebDriverWait wait;

    BasePage home;
    RegisterUser register;


    @BeforeAll
    public void setup() {
        System.setProperty("webdriver.edge.driver", "src/test/java/resources/edgedriver/msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ecran.lat");
    }

    @Test
    public void RegisterTest() {
        home = new BasePage(driver);
        home.ClickRegisterButton();

        register = new RegisterUser(driver);
        register.FirstName("diana");
        register.LastName("ramos");
        register.Email("dian13@mail.com");
        register.Password("123456");
        register.ClickSignUp();

        /*ebElement message = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div[1]/h1"));
        String message2 = message.getText();
        assertTrue(message2.contains("Reseñas de series y películas al instante"));*/


    }

}
