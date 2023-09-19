package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExploreButton {

    WebDriver driver;
    WebDriverWait wait;
    public ExploreButton(WebDriver driver){ this.driver = driver;}

    By ExploreButton = By.xpath("//*[@id=\"__next\"]/div/header/div/nav/ul/li/a");


    public  void  ClickExploreButton(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        driver.findElement(ExploreButton).click();
    }
}
