package selenide.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;

@DefaultUrl("http://soft.it-hillel.com.ua:8080/browse/{1}")
public class IssuePageObject extends PageObject {
    public IssuePageObject(WebDriver webdriver) {
        super(webdriver);
    }
}
