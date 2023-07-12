package cw.tests.AutomationPracticeForUITesting;

import cw.utilities.Configuration_Reader;
import cw.utilities.Driver;
import cw.utilities.Driver1;
import org.testng.annotations.Test;

public class TestCase2_LogInUserWithCorrectEmailAndPassword {




    /*
1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Verify that home page is visible successfully
4. Click on 'Signup / Login' button
5. Verify 'Login to your account' is visible
6. Enter correct email address and password
7. Click 'login' button
8. Verify that 'Logged in as username' is visible
9. Click 'Delete Account' button
10. Verify that 'ACCOUNT DELETED!' is visible
     */




    @Test
    public void test(){

//        1. Launch browser
//        2. Navigate to url 'http://automationexercise.com'

        Driver1.getDriver().get(Configuration_Reader.getProperty("automationexerciseUrl"));


//        3. Verify that home page is visible successfully
//        4. Click on 'Signup / Login' button
//        5. Verify 'Login to your account' is visible
//        6. Enter correct email address and password
//        7. Click 'login' button
//        8. Verify that 'Logged in as username' is visible
//        9. Click 'Delete Account' button
//        10. Verify that 'ACCOUNT DELETED!' is visible



    }


}
