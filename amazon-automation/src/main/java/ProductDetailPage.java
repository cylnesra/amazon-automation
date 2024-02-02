import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage extends BasePage{
    By addToCartButton = By.cssSelector("input[name='submit.add-to-cart']");
    public ProductDetailPage(WebDriver driver){
        super(driver);
    }

    public boolean isOnProductDetailPage() {
        return isDisplayed(addToCartButton);
    }

    public void addToCart(){
        click(addToCartButton);
    }
}
