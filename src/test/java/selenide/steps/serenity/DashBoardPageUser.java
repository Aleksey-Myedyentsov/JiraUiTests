package selenide.steps.serenity;


import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import selenide.pages.CreateIssuePage;
import selenide.pages.DashBoardPage;
import selenide.pages.HeaderPage;

import static org.junit.Assert.assertEquals;

public class DashBoardPageUser extends ScenarioSteps {
    DashBoardPage dashBoardPage;
    HeaderPage headerPage;
    CreateIssuePage createIssuePage;

    @Step
    public void verifyIsOnDashBoardPage(){

        assertEquals(dashBoardPage.isOnDashBoardPage(), "System Dashboard");
    }

    @Step
    public void clickOnCreateNewIssue(){

        headerPage.clickCreate();
    }

    @Step
    public void entersIssueType(String issueType){

        createIssuePage.enterIssueType(issueType);
    }

    @Step
    public void enterSummary(String issueSummary){

        createIssuePage.enterIssueSummary(issueSummary);
    }

    @Step
    public void clicksOnSubmit(){

        createIssuePage.clickOnCreateIssue();
    }

    @Step
    public void checkPopupBeforeCreateIssue(){

        createIssuePage.checkPopup();
    }

}
