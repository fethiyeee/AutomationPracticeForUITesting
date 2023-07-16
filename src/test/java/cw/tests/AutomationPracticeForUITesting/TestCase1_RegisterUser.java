package cw.tests.AutomationPracticeForUITesting;

import cw.pages.TestPageDemoLogIn;
import cw.pages.TestPageTransactions;
import cw.utilities.Configuration_Reader;
import cw.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase1_RegisterUser {


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
    public void test1() {
//        1. Launch browser (in der ParametersBrowserClass gemacht ✅)

//        2. Navigate to url 'http://automationexercise.com'

        Driver.getDriver().get(Configuration_Reader.getProperty("automationexerciseUrl"));

//        3. Verify that home page is visible successfully

        TestPageTransactions obj = new TestPageTransactions();

//        3. Verify that home page is visible successfully

        obj.homePageIsVisible();
//        4. Click on 'Signup / Login' button

        obj.signUp.click();

//        5. Verify 'New User Signup!' is visible
        obj.newUserSignedUpMessageIsVisible();


//        6. Enter name and email address

        obj.inputName();
        obj.inputEmail1();

//        7. Click 'Signup' button

        obj.signUp1.click();

//        8. Verify that 'ENTER ACCOUNT INFORMATION' is visible

        obj.enterAccou8ntInformationMessageIsVisible();




/*
//        9. Fill details: Title, Name, Email, Password, Date of birth

        driver.findElement(By.id("uniform-id_gender2")).click();// Mrs. clicked.

        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");

        Select selectDay = new Select(driver.findElement(By.xpath("//select[@id='days']")));
        selectDay.selectByValue("24");

        Select selectMonth = new Select(driver.findElement(By.xpath("//select[@id='months']")));
        selectMonth.selectByValue("4");

        Select selectYear = new Select(driver.findElement(By.xpath("//select[@id='years']")));

        selectYear.selectByValue("1990");

//        10. Select checkbox 'Sign up for our newsletter!'

        WebElement signUpCheckBox = driver.findElement(By.xpath("//input[@id='newsletter']"));
        if (!signUpCheckBox.isSelected()) {
            signUpCheckBox.click();
        }

//        11. Select checkbox 'Receive special offers from our partners!'

        WebElement specialOffersCheckBox = driver.findElement(By.xpath("//input[@id='optin']"));
        if (!specialOffersCheckBox.isSelected()) {
            specialOffersCheckBox.click();
        }

//        12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number

        driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys(name);
        driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys(lastName);
        driver.findElement(By.xpath("//input[@id='company']")).sendKeys("Bayer Ag");
        driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("Bahnallee 12");
        driver.findElement(By.xpath("//input[@id='address2']")).sendKeys("Bahnallee 14");


        Select selectCountry = new Select(driver.findElement(By.xpath("//select[@id='country']")));
        selectCountry.selectByValue("Canada");

        driver.findElement(By.xpath("//input[@id='state']")).sendKeys("married");
        driver.findElement(By.xpath("//input[@id='city']")).sendKeys("koln");
        driver.findElement(By.xpath("//input[@id='zipcode']")).sendKeys("12345");
        driver.findElement(By.xpath("//input[@id='mobile_number']")).sendKeys("09038283");


//        13. Click 'Create Account button'
        driver.findElement(By.xpath("//button[.='Create Account']")).click();

//        14. Verify that 'ACCOUNT CREATED!' is visible

        Assert.assertTrue(driver.findElement(By.xpath("//b[.='Account Created!']")).isDisplayed());//passed

//        15. Click 'Continue' button

        driver.findElement(By.linkText("Continue")).click();

//        16. Verify that 'Logged in as username' is visible

        Assert.assertTrue(driver.findElement(By.xpath("(//b)[1]")).isDisplayed());//passed

//        17. Click 'Delete Account' button

        //   driver.findElement(By.xpath("//a[.=' Delete Account']")).click();

//        18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button

        //  Assert.assertTrue(driver.findElement(By.xpath("//b[.='Account Deleted!']")).isDisplayed());//passed


    }

 */
    }
}