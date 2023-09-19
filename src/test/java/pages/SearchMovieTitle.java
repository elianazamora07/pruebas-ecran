package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SearchMovieTitle {

    WebDriver driver;
    WebDriverWait wait;

    public SearchMovieTitle(WebDriver driver){ this.driver = driver;}

    public void TypeTitle(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement inputElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"autocomplete-2-input\"]")));
        inputElement.click();
        inputElement.sendKeys("New York Doll");
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement CardElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div/main/div[1]/form/div/div/section/ul/li/a")));
        CardElement.click();

    }



}
