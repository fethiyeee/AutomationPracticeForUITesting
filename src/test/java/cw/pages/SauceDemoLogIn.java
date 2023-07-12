package cw.pages;

import cw.utilities.Driver1;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SauceDemoLogIn {

    public SauceDemoLogIn() {
        PageFactory.initElements(Driver1.getDriver(), this);
    }

    @FindBy(xpath = "//a[.=' Home']")
    public WebElement homePage;

    @FindBy(xpath = "//a[.=' Signup / Login']")
    public WebElement signUp;

    @FindBy(xpath = "//h2[.='Login to your account']")
    public WebElement logInToYourAccount;

    @FindBy(xpath = "(//input[@name='email'])[1]")
    public WebElement eMailArea;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordArea;

    @FindBy(xpath = "//button[.='Login']")
    public WebElement logInButton;

    @FindBy(xpath = "(//b)[1]")
    public WebElement loggedAsUserName;

    @FindBy(xpath = "//a[.=' Delete Account']")
    public WebElement deleteAccountButton;

    @FindBy(xpath = "//b[.='Account Deleted!']")
    public WebElement accountDeletedText;

    public void homePageIsVisible() {
        Assert.assertTrue(homePage.isDisplayed());
    }

    public void signUpClick() {
        signUp.click();
    }

    public void logInToYourAccountIsVisible() {
        Assert.assertTrue(logInToYourAccount.isDisplayed());
    }

    public void inputEmail(String email) {
        eMailArea.sendKeys(email);
    }

    public void inputPassword(String password) {
        passwordArea.sendKeys(password);
    }

    public void logInButtonClick() {
        logInButton.click();
    }

    public void loggedAsUserNameIsVisible() {
        Assert.assertTrue(loggedAsUserName.isDisplayed());
    }

    public void deleteAccountButtonClick() {
        deleteAccountButton.click();
    }

    public void accountDeletedTextIsVisible() {
        Assert.assertTrue(accountDeletedText.isDisplayed());
    }

}
