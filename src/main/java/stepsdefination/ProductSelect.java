package stepsdefination;

import io.cucumber.java.After;
import io.cucumber.java.Before;
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


    @Before

    public void beforeHook(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
    @Given("I am on amazon app")
    public void I_am_on_amazon_app() {

        // WebDriverManager.chromedriver().setup();
        //driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");

    }
    @When("title of login page would be  Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more")
    public void title_of_login_page_would_be_Amazon_com_Online_Shopping_for_Electronics_Apparel_Computers_Books_DVDs_more() {

        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more",title);

    }
    @And("I click on Sign in")
    public void I_click_on_Sign_in() throws InterruptedException {

        driver.findElement(By.partialLinkText("Sign in")).click();
        Thread.sleep(3000);

    }
    @When("I  enter userEmail")
    public void i_enter_userEmail() throws InterruptedException {

        driver.findElement(By.xpath("//*[@id='ap_email']")).sendKeys("khanshabb111@gmail.com");
        Thread.sleep(3000);

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
    public void i_click_on_search_icon() throws InterruptedException {

        driver.findElement(By.xpath("//*[@id='nav-search']/form/div[2]/div/input")).click();
        Thread.sleep(5000);

    }
    @And ("I should view laptopcomputers and click on computer to select")
    public void i_should_view_laptopcomputers_and_click_on_computer_to_select() throws InterruptedException {

        driver.findElement(By.xpath("//*[@id='search']/div[1]/div[2]/div/span[4]/div[2]/div[2]/div/span/div/div/div/div/div[2]/div[1]/div/div/span/a/div/img")).click();
        Thread.sleep(5000);
    }


    @When("I click on Add to Cart button")
    public void i_click_on_Add_to_Cart_button() throws InterruptedException {

        driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
        Thread.sleep(5000);

    }


    @And("I click Procceed to Checkout")
    public void i_click_Procceed_to_Checkout() throws InterruptedException {
        driver.findElement(By.partialLinkText("checkout")).click();
        Thread.sleep(4000);

    }
    @Then("I should view shipping address information to enter")
    public void i_should_view_shipping_address_information_to_enter() {

        String title = driver.getTitle();
        System.out.println("Shipping page title is "+ title);
        Assert.assertEquals("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more",title);

    }
    @After
    public void tearDown(){
        driver.quit();
    }

}
