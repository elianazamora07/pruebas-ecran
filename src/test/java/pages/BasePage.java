package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {


    WebDriver driver;
    WebDriverWait wait;
    By RegisterButton = By.xpath("//*[@id=\"__next\"]/div/header/div/nav/ul/li[2]/a");

    By LoginButton = By.xpath("//*[@id=\"__next\"]/div/header/div/nav/ul/li[1]/a");

    By SearchPage = By.xpath("//*[@id=\"__next\"]/div/header/div/nav/ul/li/a");

    By SearchBar = By.xpath("//*[@id=\"__next\"]/div/main/div[1]/form/div");
    public BasePage (WebDriver driver) { this.driver = driver;}
    public void ClickRegisterButton(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        driver.findElement(RegisterButton).click();
    }

    public void ClickLoginButton(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        driver.findElement(LoginButton).click();
    }

    public void ClickButtonToSearchPage(){

        wait = new WebDriverWait(driver,Duration.ofSeconds(1));
        driver.findElement(SearchPage).click();
    }

    public void ClickSearchBar(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        driver.findElement(SearchBar).click();


    }
}
