package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Detail {

    WebDriver driver;
    WebDriverWait wait;
    public Detail(WebDriver driver){ this.driver = driver;}

    By ExploreButton = By.xpath("//*[@id=\"__next\"]/div/header/div/nav/ul/li/a");

    By Movie = By.xpath("//*[@id=\"__next\"]/div/main/div/div[2]/div[2]/li[1]/div");

    By AddListButton = By.xpath("//*[@id=\"__next\"]/div/main/main/section/div[1]/div[2]/div[1]/button");


    public  void  ClickExploreButton(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.findElement(ExploreButton).click();
    }

    public  void  ClickMovie(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.findElement(Movie).click();
    }

    public  void  ClickAddList(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.findElement(AddListButton).click();
    }
}
