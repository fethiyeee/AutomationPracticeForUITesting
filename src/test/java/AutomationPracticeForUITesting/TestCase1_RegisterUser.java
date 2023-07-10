package AutomationPracticeForUITesting;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ParametersBrowserClass;

public class TestCase1_RegisterUser extends ParametersBrowserClass {


    /*
    1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Verify that home page is visible successfully
4. Click on 'Signup / Login' button
5. Verify 'New User Signup!' is visible
6. Enter name and email address
7. Click 'Signup' button
8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
9. Fill details: Title, Name, Email, Password, Date of birth
10. Select checkbox 'Sign up for our newsletter!'
11. Select checkbox 'Receive special offers from our partners!'
12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
13. Click 'Create Account button'
14. Verify that 'ACCOUNT CREATED!' is visible
15. Click 'Continue' button
16. Verify that 'Logged in as username' is visible
17. Click 'Delete Account' button
18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
     */






    @Test
    public void test(){
//        1. Launch browser (in der ParametersBrowserClass gemacht ✅)

//        2. Navigate to url 'http://automationexercise.com'

        driver.get("http://automationexercise.com");

//        3. Verify that home page is visible successfully

       Assert.assertTrue(driver.findElement(By.xpath("//a[.=' Home']")).isDisplayed());//passed

//        4. Click on 'Signup / Login' button

        driver.findElement(By.xpath("//a[.=' Signup / Login']")).click();

//        5. Verify 'New User Signup!' is visible

        Assert.assertTrue(driver.findElement(By.xpath("//h2[.='New User Signup!']")).isDisplayed());//passed

//        6. Enter name and email address

        Faker faker_data=new Faker();

        String name=faker_data.name().firstName();
        String eMail=faker_data.internet().emailAddress();

        driver.findElement(By.xpath("//input[@name='name']")).sendKeys(name);
        driver.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys(eMail);

//        7. Click 'Signup' button

        driver.findElement(By.xpath("//button[.='Signup']")).click();

//        8. Verify that 'ENTER ACCOUNT INFORMATION' is visible

        Assert.assertTrue(driver.findElement(By.xpath("//b[.='Enter Account Information']")).isDisplayed());//passed

//        9. Fill details: Title, Name, Email, Password, Date of birth

        driver.findElement(By.id("uniform-id_gender2")).click();// Mrs. clicked.

        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");

        Select selectDay=new Select(driver.findElement(By.xpath("//select[@id='days']")));
        selectDay.selectByValue("24");

        Select selectMonth=new Select(driver.findElement(By.xpath("//select[@id='months']")));
        selectMonth.selectByValue("4");

        Select selectYear=new Select(driver.findElement(By.xpath("//select[@id='years']")));

        selectYear.selectByValue("1990");

//        10. Select checkbox 'Sign up for our newsletter!'



//        11. Select checkbox 'Receive special offers from our partners!'
//        12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
//        13. Click 'Create Account button'
//        14. Verify that 'ACCOUNT CREATED!' is visible
//        15. Click 'Continue' button
//        16. Verify that 'Logged in as username' is visible
//        17. Click 'Delete Account' button
//        18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
    }
}
