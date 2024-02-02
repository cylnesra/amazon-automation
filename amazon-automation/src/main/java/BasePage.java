import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BasePage {
    WebDriver driver;
    WebDriverWait wait;

    public BasePage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public void type(By locator,String text){
      wait.until(ExpectedConditions.visibilityOf(find(locator)));
      find(locator).sendKeys(text);
    }
    public WebElement find(By locator){
        return driver.findElement(locator);
    }
    public List<WebElement> findAll(By locator){
     return driver.findElements(locator);
    }

    public Boolean isDisplayed(By locator){
        return find(locator).isDisplayed();
    }

    public void click(By locator){
        find(locator).click();
    }


}

