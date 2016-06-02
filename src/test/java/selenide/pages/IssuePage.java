package selenide.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.NamedUrl;
import net.thucydides.core.annotations.NamedUrls;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;



//@NamedUrls({
//        @NamedUrl(name = "key", url = "281{1}")
//})

    public class IssuePage extends PageObject {

        @FindBy(id = "opsbar-operations_more")
        private WebElementFacade moreOptionIssueButton;

        @FindBy(id = "delete-issue")
        private WebElementFacade selectDeleteIssue;

        @FindBy(id = "delete-issue-submit")
        private WebElementFacade deleteButton;


        public void moreButton() {

            this.moreOptionIssueButton.click();
        }

        public void deleteInMoreDropdownButton() {

            this.selectDeleteIssue.click();
        }

        public void deleteButtonOnPopup() {

            this.deleteButton.click();
        }
    }