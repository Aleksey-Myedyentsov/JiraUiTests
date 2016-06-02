package selenide.features.search;


import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.PageObject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import selenide.pages.IssuePageObject;
import selenide.steps.serenity.DashBoardPageUser;
import selenide.steps.serenity.IssueOperationns;
import selenide.steps.serenity.LoginPageUser;

import static net.serenitybdd.core.pages.PageObject.withParameters;

@RunWith(SerenityRunner.class)
public class CreateIssueTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public LoginPageUser loginPageUser;

    @Steps
    public DashBoardPageUser dashBoardPageUser;

    @Steps
    public IssueOperationns issueOperationns;

    @Test
    public void create_issue() {
        dashBoardPageUser.clickOnCreateNewIssue();
        dashBoardPageUser.entersIssueType("Bug");
        dashBoardPageUser.enterSummary("My bug created");
        dashBoardPageUser.clicksOnSubmit();
        dashBoardPageUser.checkPopupBeforeCreateIssue();

        String xpath = "//*[@id='aui-flag-container']/div/div/a";
        WebElement webElement = webdriver.findElement(By.xpath(xpath));
        String key = webElement.getAttribute("data-issue-key");
        //return key;

        PageObject page = new IssuePageObject(webdriver);
        page.open(withParameters(key));

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
        dashBoardPageUser.verifyIsOnDashBoardPage();
    }

   /* @After
   public void issuesDelete(){
        cleaningTask(key);
    }

    public void cleaningTask(String issueNumber){
        PageObject page = new IssuePageObject(webdriver);
        page.open(withParameters(issueNumber));

        issueOperationns.selectMoreButton();
        issueOperationns.selectDeleteIssue();
        issueOperationns.deleteButtonOnPopup();
    }
*/

}
