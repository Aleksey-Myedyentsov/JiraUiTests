package selenide.features.search;


import net.serenitybdd.core.pages.PageUrls;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.PageObject;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import selenide.pages.IssuePageObject;
import selenide.steps.serenity.IssueOperationns;
import selenide.steps.serenity.LoginPageUser;

import static net.serenitybdd.core.pages.PageObject.withParameters;
import static org.mockito.Mockito.verify;

@RunWith(SerenityRunner.class)
public class DeleteIssueTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public LoginPageUser loginPageUser;

    @Steps
    public IssueOperationns issueOperationns;


    @Test
    public void issueDelete(String issueNumber){
        PageObject page = new IssuePageObject(webdriver);
        page.open(withParameters(issueNumber));

        issueOperationns.selectMoreButton();
        issueOperationns.selectDeleteIssue();
        issueOperationns.deleteButtonOnPopup();
    }

    @Before
    public void setUp(){
        successfuly_login();
    }

    public void successfuly_login(){
        loginPageUser.goToLoginPage();
        loginPageUser.enterUserName("Myedyentsov Alexey");
        loginPageUser.enterUserPassword("myedyentsov");
        loginPageUser.clickLogin();
        //dashBoardPageUser.verifyIsOnDashBoardPage();

    }
}
