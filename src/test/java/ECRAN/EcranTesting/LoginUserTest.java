package ECRAN.EcranTesting;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.boot.test.context.SpringBootTest;
import pages.BasePage;
import pages.LoginUser;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@SpringBootTest
public class LoginUserTest {

    WebDriver driver;
    WebDriverWait wait;

    BasePage home;
    LoginUser loginUser;


    @BeforeAll
    public void setup() {
        System.setProperty("webdriver.edge.driver", "src/test/java/resources/edgedriver/msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ecran.lat");
    }


    @Test
    public void LoginTest() {
        home = new BasePage(driver);
        home.ClickLoginButton();

        loginUser = new LoginUser(driver);
        loginUser.Email("elianazamora9907@gmail.com");
        loginUser.Password("123456");
        loginUser.ClickSignUp();


    }


}
