package selenide.features.search;


import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import selenide.pages.IssuePage;
import selenide.steps.serenity.DashBoardPageUser;
import selenide.steps.serenity.EndUserSteps;
import selenide.steps.serenity.LoginPageUser;

@RunWith(SerenityRunner.class)
public class LoginTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public LoginPageUser loginPageUser;

    @Steps
    public DashBoardPageUser dashBoardPageUser;

    @Test
    public void successfuly_login(){
        loginPageUser.goToLoginPage();
        loginPageUser.enterUserName("Myedyentsov Alexey");
        loginPageUser.enterUserPassword("myedyentsov");
        loginPageUser.clickLogin();
        dashBoardPageUser.verifyIsOnDashBoardPage();

    }


}
