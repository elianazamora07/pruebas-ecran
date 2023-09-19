package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegisterUser {

    WebDriver driver;
    WebDriverWait wait;


    By HomeButton = By.xpath("//*[@id=\"__next\"]/div/header/div/a");

    By SignUp = By.xpath("//*[@id=\"__next\"]/div/section/form/button");

    public RegisterUser(WebDriver driver) {
        this.driver = driver;
    }

    public void FirstName(String name) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"__next\"]/div/section/form/div[1]/input")));
        WebElement FirstNameInput = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section/form/div[1]/input"));
        FirstNameInput.clear();
        FirstNameInput.sendKeys(name);
    }

    public void LastName(String Lastname) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"__next\"]/div/section/form/div[2]/input")));
        WebElement LastNameInput = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section/form/div[2]/input"));
        LastNameInput.clear();
        LastNameInput.sendKeys(Lastname);
    }


    public void Email(String email) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"__next\"]/div/section/form/div[3]/input")));
        WebElement ZipCodeInput = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section/form/div[3]/input"));
        ZipCodeInput.clear();
        ZipCodeInput.sendKeys(email);
    }


    public void Password(String pass) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"__next\"]/div/section/form/div[4]/input")));
        WebElement passwordInput = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section/form/div[4]/input"));
        passwordInput.clear();
        passwordInput.sendKeys(pass);
    }

    public void ClickSignUp() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        driver.findElement(SignUp).click();


    }


}
