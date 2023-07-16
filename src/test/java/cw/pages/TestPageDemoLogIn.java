package cw.pages;
import cw.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestPageDemoLogIn {


    protected static String name="Fethiye";
    protected static String lastName="Ay";
    protected static String eMail="fay.23@gmail.com";
    protected static String password="password";



    public TestPageDemoLogIn() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[.=' Home']")
    public WebElement homePage;


    @FindBy(xpath = "//button[.='Signup']")
    public WebElement signUp1;

    @FindBy(xpath = "//a[.=' Signup / Login']")
    public WebElement signUp;

    @FindBy(xpath = "//h2[.='New User Signup!']")
    public WebElement newUserSignedUpMessage;

    @FindBy(xpath = "//h2[.='Login to your account']")
    public WebElement logInToYourAccountMessage;

    @FindBy(xpath = "//b[.='Enter Account Information']")
    public WebElement enterAccou8ntInformationMessage;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement nameArea;

    @FindBy(xpath = "(//input[@name='email'])[2]")
    public WebElement eMailArea1;

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


}
