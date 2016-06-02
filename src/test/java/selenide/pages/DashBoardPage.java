package selenide.pages;


import javafx.beans.DefaultProperty;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;


@DefaultProperty("http://soft.it-hillel.com.ua:8080/secure/Dashboard.jspa")
public class DashBoardPage extends PageObject {
    @FindBy(xpath = "//*[@class='aui-page-header-main']//h1")
    private WebElementFacade pageHeader;

    public String isOnDashBoardPage(){
        return pageHeader.getText();
    }

}
