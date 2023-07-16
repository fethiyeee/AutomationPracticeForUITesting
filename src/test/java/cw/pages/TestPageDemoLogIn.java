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
    protected static String company="Bayer Ag";
    protected static String adress1="Bahnallee 12";
    protected static String adress2="Bahnallee 14";
    protected static String state="Turkisch";
    protected static String city="Koln";
    protected static String zipCode="12345";
    protected static String mobilePhone="01605346564";



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

    @FindBy(xpath ="//input[@id='first_name']")
    public WebElement firstNameArea;

    @FindBy(xpath = "//input[@id='last_name']")
    public WebElement lastNamArea;

    @FindBy(id ="uniform-id_gender2")
    public WebElement genderArea;

    @FindBy(xpath = "//select[@id='days']")
    public WebElement selectDay;

    @FindBy(xpath = "\"//select[@id='months']\"")
    public WebElement selectMonth;

    @FindBy(xpath = "\"//select[@id='years']\"")
    public WebElement selectYear;

    @FindBy(xpath = "//input[@id='newsletter']")
    public WebElement selectNewsLetter;

    @FindBy(xpath = "//input[@id='optin']")
    public WebElement selectSpecialOffers;

    @FindBy(xpath = "//input[@id='company']")
    public WebElement companyArea;

    @FindBy(xpath = "//input[@id='address1']")
    public WebElement adress1Area;

    @FindBy(xpath = "//input[@id='address2']")
    public WebElement adress2Area;

    @FindBy(xpath = "//select[@id='country']")
    public WebElement selectCountry;

    @FindBy(xpath = "//input[@id='state']" )
    public WebElement stateArea;

    @FindBy(xpath = "//input[@id='city']")
    public WebElement cityArea;

    @FindBy(xpath = "//input[@id='zipcode']")
    public WebElement zipCodeArea;

    @FindBy(xpath = "//input[@id='mobile_number']")
    public WebElement mobilePhoneArea;

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
