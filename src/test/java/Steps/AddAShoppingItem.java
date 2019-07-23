package Steps;

import Base.BaseUtil;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class AddAShoppingItem extends BaseUtil {

    private BaseUtil base;

    public AddAShoppingItem(BaseUtil base) {
        this.base = base;
    }

    @Given("I navigate the Amazon website")
    public void iNavigateTheAmazonWebsiteAndLogin() {
        base.driver.get("https://www.amazon.com/");
    }

    @When("I search for (.*)")
    public void iSearchForNikeShoesMen(String sstring) {
        base.driver.findElement(By.id("twotabsearchtextbox")).sendKeys(sstring);
    }

    @And("I click the search button")
    public void iClickTheSearchButton() {
        base.driver.findElement(By.cssSelector("#nav-search .nav-search-submit")).click();
    }

    @And("I select the first product from the list")
    public void iSelectTheFirstProductFromTheList() {
        base.driver.findElement(By.cssSelector("[data-component-id='21'] img")).click();
    }

    @When("I add the product to the cart")
    public void iAddTheProductToTheCart() {
        base.driver.findElement(By.cssSelector("#add-to-cart-button")).click();
    }

    @Then("the product has been successfully added to cart")
    public void theProductHasBeenSuccessfullyAddedToCart() {
        Assert.assertEquals(base.driver.findElement(By.cssSelector("#huc-v2-order-row-confirm-text h1")).getText(),"Added to Cart");
    }
}
