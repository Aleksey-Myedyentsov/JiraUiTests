package selenide.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

//import net.serenitybdd.core.pages.PageObject;

@DefaultUrl("http://soft.it-hillel.com.ua:8080/secure/Dashboard.jspa")
public class HeaderPage extends PageObject {

    @FindBy(id="create_link")
    private WebElementFacade create;


    public void clickCreate() {
        this.create.click();
    }

}
