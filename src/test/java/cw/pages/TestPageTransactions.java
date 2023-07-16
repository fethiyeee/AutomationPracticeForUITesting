package cw.pages;

import cw.utilities.Configuration_Reader;
import cw.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class TestPageTransactions extends TestPageDemoLogIn {

    public TestPageTransactions() {
        Driver.getDriver().get(Configuration_Reader.getProperty("automationexerciseUrl"));

    }

    public void homePageIsVisible() {
        Assert.assertTrue(homePage.isDisplayed());
    }

    public void newUserSignUpMessageIsVisible() {
        Assert.assertTrue(newUserSignUpMessage.isDisplayed());
    }

    public void logInToYourAccountIsVisible() {
        Assert.assertTrue(logInToYourAccountMessage.isDisplayed());
    }

    public void inputName() {
        nameArea.sendKeys(name);
    }

    public void inputLastName() {
        lastNamArea.sendKeys(lastName);
    }

    public void inputEmail1() {
        eMailArea1.sendKeys(eMail);
    }

    public void inputEmail() {
        eMailArea.sendKeys(eMail);
    }

    public void inputFirstName() {
        firstNameArea.sendKeys(name);
    }

    public void inputPassword() {
        passwordArea.sendKeys(password);
    }

    public void selectingDay() {
        Select select = new Select(selectDay);
        select.selectByValue("24");
    }

    public void selectingMonth() {
        Select select = new Select(selectMonth);
        select.selectByValue("4");
    }


    public void selectingYear() {
        Select select = new Select(selectYear);
        select.selectByValue("1990");
    }

    public void inputCompany() {
        companyArea.sendKeys(company);
    }

    public void inputAdress1() {

        adress1Area.sendKeys(adress1);

    }

    public void inputAdress2() {

        adress2Area.sendKeys(adress2);

    }

    public void selectingCountry() {

        Select select = new Select(selectCountry);
        select.selectByValue("Canada");
    }

    public void inputState() {
        stateArea.sendKeys(state);
    }

    public void inputCity() {
        cityArea.sendKeys(city);
    }

    public void inputZipCode() {
        zipCodeArea.sendKeys(zipCode);
    }

    public void inputMobilePhone() {
        mobilePhoneArea.sendKeys(mobilePhone);
    }

    public void accountCreatedMessageIsDisplay() {
        Assert.assertTrue(accountCreatedMessage.isDisplayed());
    }


    public void loggedAsUserNameIsVisible() {
        Assert.assertTrue(loggedAsUserName.isDisplayed());
    }

    public void enterAccountInformationMessageIsVisible() {
        Assert.assertTrue(enterAccountInformationMessage.isDisplayed());
    }


    public void accountDeletedMessageIsVisible() {
        Assert.assertTrue(accountDeletedMessage.isDisplayed());
    }


}
