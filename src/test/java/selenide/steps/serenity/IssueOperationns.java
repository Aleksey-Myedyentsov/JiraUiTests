package selenide.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import selenide.pages.IssuePage;
import selenide.pages.LoginPage;


public class IssueOperationns extends ScenarioSteps {

    IssuePage issuePage;

    @Step
    public void goToIssue(String key, int i) {
        issuePage.open();
    }

    @Step
    public void selectMoreButton() {

        issuePage.moreButton();
    }

    @Step
    public void selectDeleteIssue() {

        issuePage.deleteInMoreDropdownButton();
    }

    @Step
    public void deleteButtonOnPopup() {

        issuePage.deleteButtonOnPopup();
    }
}
