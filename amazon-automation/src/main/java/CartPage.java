import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CartPage extends BasePage{
    By shoppingCardProducts = By.cssSelector("span.a-truncate-cut");
    public CartPage(WebDriver driver){
        super(driver);
    }

    public boolean checkIfProductAdded(){
        return getShoppingProducts().size() > 0 ;
    }

    private List<WebElement> getShoppingProducts(){
        return findAll(shoppingCardProducts);
    }
}
