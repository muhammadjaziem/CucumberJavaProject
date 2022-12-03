/*
 * package StepDefinitions;
 * 
 * import java.time.Duration;
 * 
 * import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.chrome.ChromeDriver;
 * 
 * import io.cucumber.java.en.And; import io.cucumber.java.en.Given; import
 * io.cucumber.java.en.Then; import io.cucumber.java.en.When; import
 * pages.loginPage;
 * 
 * 
 * 
 * public class LoginDemoPOM {
 * 
 * WebDriver driver = null; loginPage login;
 * 
 * @Given("browser is opens") public void browser_is_opens() {
 * System.out.println("=== I am inside LoginDemo");
 * System.out.println("Inside Step - browser is opens");
 * System.setProperty("webdriver.chrome.driver",
 * System.getProperty("user.dir")+"/Drivers/chromedriver.exe");
 * 
 * driver = new ChromeDriver();
 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
 * driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40)); }
 * 
 * @And("user is on login page") public void user_is_on_login_page() {
 * driver.navigate().to("https://example.testproject.io/web/"); }
 * 
 * @When("^user enters (.*) and (.*)$") public void
 * user_enters_username_and_password(String username, String password) throws
 * InterruptedException { login = new loginPage(driver);
 * login.enterUsername(username); login.enterPassword(password);;
 * //driver.findElement(By.id("name")).sendKeys(username);
 * //driver.findElement(By.id("password")).sendKeys(password);
 * 
 * Thread.sleep(2000); }
 * 
 * @And("user clicks on login") public void user_clicks_on_login() {
 * login.clickLogin(); //driver.findElement(By.id("login")).click(); }
 * 
 * @Then("user is navigated to home page") public void
 * user_is_navigated_to_home_page() throws InterruptedException {
 * login.checkLogOutIsDisplayed();
 * //driver.findElement(By.id("logout")).isDisplayed(); Thread.sleep(2000);
 * 
 * driver.close(); driver.quit();
 * 
 * }
 * 
 * }
 */