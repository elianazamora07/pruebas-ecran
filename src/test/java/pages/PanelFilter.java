package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PanelFilter {

    WebDriver driver;
    WebDriverWait wait;

    By ActionGenre = By.xpath("//*[@id=\"__next\"]/div/main/div/div[2]/div[1]/div/div/div[1]/div/label[1]/input");

    public PanelFilter(WebDriver driver){ this.driver = driver;}

    public void ClickActionGenre (){
        wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        driver.findElement(ActionGenre).click();
    }


}
