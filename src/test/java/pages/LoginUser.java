package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginUser {


    WebDriver driver;
    WebDriverWait wait;


    public LoginUser (WebDriver driver) { this.driver = driver;}

    By SignUp = By.xpath("//*[@id=\"__next\"]/div/div[2]/form/button");

    public void Email(String Email){
        wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"__next\"]/div/div[2]/form/div/div[1]/input")));
        WebElement EmailInput = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/form/div/div[1]/input"));
        EmailInput.clear();
        EmailInput.sendKeys(Email);
    }

    public void Password(String pass){
        wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"__next\"]/div/div[2]/form/div/div[2]/input")));
        WebElement passwordInput = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/form/div/div[2]/input"));
        passwordInput.clear();
        passwordInput.sendKeys(pass);
    }

    public void ClickSignUp(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        driver.findElement(SignUp).click();


    }




}
