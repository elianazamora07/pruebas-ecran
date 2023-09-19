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
import pages.SearchMovieTitle;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@SpringBootTest
public class SearchMovieTitleTest {
    WebDriver driver;
    BasePage home;
    SearchMovieTitle title;


    @BeforeAll
    public void setup(){
        System.setProperty("webdriver.edge.driver", "src/test/java/resources/edgedriver/msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ecran.lat");
    }
    @Test
    public void MovieByTitleTest(){
        home = new BasePage(driver);
        home.ClickSearchBar();
        title = new SearchMovieTitle(driver);
        title.TypeTitle();

    }

}
