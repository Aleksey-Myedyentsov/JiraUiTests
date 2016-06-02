package selenide.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;

//import net.serenitybdd.core.pages.PageObject;

@DefaultUrl("http://soft.it-hillel.com.ua:8080/secure/Dashboard.jspa")
public class CreateIssuePage extends PageObject {

    @FindBy(id = "issuetype-field")
    private WebElementFacade issueType;

    @FindBy(id = "summary")
    private WebElementFacade summary;

    @FindBy(id = "create-issue-submit")
    private WebElementFacade createIssue;

    @FindBy(xpath = "//*[@id='aui-flag-container']/div/div/text()[\"has been successfully created.\"]")
    private WebElementFacade checkPopup;

    public void enterIssueType(String issueType) {

        this.issueType.type(issueType).sendKeys(Keys.RETURN);
    }

    public void enterIssueSummary(String summary) {

        this.summary.type(summary);
    }

    public void clickOnCreateIssue() {

        createIssue.click();
    }

    public void checkPopup() {

        this.checkPopup.isVisible();
    }
}
