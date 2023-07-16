package cw.pages;

import cw.utilities.Configuration_Reader;
import cw.utilities.Driver;
import org.testng.Assert;

public class TestPageTransactions extends TestPageDemoLogIn {

    public TestPageTransactions() {
        Driver.getDriver().get(Configuration_Reader.getProperty("automationexerciseUrl"));

    }



    public void homePageIsVisible() {
        Assert.assertTrue(homePage.isDisplayed());
    }

    public void newUserSignedUpMessageIsVisible(){
        Assert.assertTrue(newUserSignedUpMessage.isDisplayed());
    }


    public void logInToYourAccountIsVisible() {
        Assert.assertTrue(logInToYourAccountMessage.isDisplayed());
    }

    public void inputName(){
        nameArea.sendKeys(name);
    }

    public void inputFirstEmailArea(){
        eMailArea1.sendKeys(eMail);
    }

    public void inputEmail() {
        eMailArea.sendKeys(eMail);
    }

    public void inputPassword() {
        passwordArea.sendKeys(password);
    }


    public void loggedAsUserNameIsVisible() {
        Assert.assertTrue(loggedAsUserName.isDisplayed());
    }

    public void enterAccou8ntInformationMessageIsVisible(){
        Assert.assertTrue(enterAccou8ntInformationMessage.isDisplayed());
    }


    public void accountDeletedTextIsVisible() {
        Assert.assertTrue(accountDeletedText.isDisplayed());
    }


    @Override
    public String toString() {
        return "TestPageTransactions{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", eMail='" + eMail + '\'' +
                ", password='" + password + '\'' +
                ", homePage=" + homePage +
                ", signUp1=" + signUp1 +
                ", signUp=" + signUp +
                ", newUserSignedUpMessage=" + newUserSignedUpMessage +
                ", logInToYourAccountMessage=" + logInToYourAccountMessage +
                ", enterAccou8ntInformationMessage=" + enterAccou8ntInformationMessage +
                ", nameArea=" + nameArea +
                ", eMailArea1=" + eMailArea1 +
                ", eMailArea=" + eMailArea +
                ", passwordArea=" + passwordArea +
                ", logInButton=" + logInButton +
                ", loggedAsUserName=" + loggedAsUserName +
                ", deleteAccountButton=" + deleteAccountButton +
                ", accountDeletedText=" + accountDeletedText +
                '}';
    }
}
