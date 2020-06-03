package stepsdefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProductSelect {

    WebDriver driver;


    @Given("I am on amazon app")
    public void I_am_on_amazon_app() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");

    }
    @When("title of login page would be  Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more")
    public void title_of_login_page_would_be_Amazon_com_Online_Shopping_for_Electronics_Apparel_Computers_Books_DVDs_more() {

        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more",title);

    }
    @And("I click on Sign in")
    public void I_click_on_Sign_in() {

        driver.findElement(By.partialLinkText("Sign in")).click();

    }
    @When("I  enter userEmail")
    public void i_enter_userEmail() {

        driver.findElement(By.xpath("//*[@id='ap_email']")).sendKeys("khanshabb111@gmail.com");

    }
    @And("I click on Continue button")
    public void i_click_on_Continue_button() {

        driver.findElement(By.id("continue")).click();
    }
    @When("I enter pass_word")
    public void i_enter_pass_word(){

        driver.findElement(By.id("ap_password")).sendKeys("Agustina2426");
    }
    @And("I click on Sign_in button")
    public void I_click_on_Sign_in_button(){

        driver.findElement(By.id("signInSubmit")).click();
    }
    @When("I  am  on  homepage")
    public void i_am_on_homepage() {
        String title = driver.getTitle();
        System.out.println("Home page title is "+ title);
        Assert.assertEquals("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more",title);

    }


    @And("I type in laptop in search text box")
    public void i_type_in_laptop_in_search_text_box() {

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop");

    }

    @When("I click on search icon")
    public void i_click_on_search_icon() {

        //driver.findElement(By.id("nav-search-submit-text")).click();
        //driver.findElement(By.xpath("//span[@class='nav-search-submit-text nav-sprite']")).click();
        driver.findElement(By.xpath("//*[@id='nav-search']/form/div[2]/div/input")).click();

    }
    @And ("I should view laptopcomputers and click on computer to select")
    public void i_should_view_laptopcomputers_and_click_on_computer_to_select(){

        driver.findElement(By.partialLinkText("Business and Student")).click();
    }

    @When("I click on Add to Cart button")
    public void i_click_on_Add_to_Cart_button() {

        driver.findElement(By.id("add-to-cart-button")).click();

    }


    @And("I click Procceed to Checkout")
    public void i_click_Procceed_to_Checkout() {
        driver.findElement(By.linkText("Proceed to Checkout (1 item)")).click();

    }
    @Then("I should view shipping address information to enter")
    public void i_should_view_shipping_address_information_to_enter() {

        String title = driver.getTitle();
        System.out.println("Shipping page title is "+ title);
        Assert.assertEquals("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more",title);

    }

}
