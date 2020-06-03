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

public class LoginStepDef {

    WebDriver driver;


    @Given("I am on amazon appplicaton")
    public void I_am_on_amazon_appplicaton() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");

    }
    @When("title of login page is Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more")
    public void title_of_login_page_is_Amazon_com_Online_Shopping_for_Electronics_Apparel_Computers_Books_DVDs_more() {
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more",title);

    }
    @And("I click on Sign in link")
    public void I_click_on_Sign_in_link() {
        driver.findElement(By.partialLinkText("Sign in")).click();

    }



    @When("I  enter username")
    public void i_enter_username() {

        driver.findElement(By.id("ap_email")).sendKeys("khanshabb111@gmail.com");

    }
    @And("I click on Continue")
    public void i_click_on_Continue() {
        driver.findElement(By.id("continue")).click();
    }
    @When("I enter password")
    public void i_enter_password(){
        driver.findElement(By.id("ap_password")).sendKeys("Agustina2426");
    }

    @And("I click on Sign in button")
    public void I_click_on_Sign_in_button(){
        driver.findElement(By.id("signInSubmit")).click();
    }
    /* @When("User clicks Continue button")
     public void User_clicks_Continue_button(){

         driver.findElement(By.xpath("//input[@id='continue']")).click();
     }*/

    @Then("I should be on  homepage")
    public void i_should_be_on_homepage() {

        String title = driver.getTitle();
        System.out.println("Home page title is "+ title);
        Assert.assertEquals("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more",title);

    }
}
