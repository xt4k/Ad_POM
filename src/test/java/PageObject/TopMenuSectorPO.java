package PageObject;

import Model.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class TopMenuSectorPO extends BasePage {
    @FindBy(how = How.XPATH, using = "id(\"header\")//img")
    private WebElement imgLinkTopHomePage;

    @FindBy(how=How.ID, using="mainmenuamenuitem473730")
    private WebElement topMenuItemApplyPosition;

    @FindBy(how = How.XPATH, using = "id(\"mainmenuamenuitem356554\")")
    private WebElement topMenuItemFirst;


    @FindBy(how = How.XPATH, using = "id(\"mainmenuamenuitem356555\")")
    private WebElement topMenuItemSecond;


    @FindBy(how = How.XPATH, using = "id(\"mainmenuamenuitem356557\")")
    private WebElement topMenuItemThird;


    @FindBy(how = How.XPATH, using = "id(\"mainmenuamenuitem356552\")")
    private WebElement topMenuItemFourth;


    @FindBy(how = How.XPATH, using = "id(\"mainmenuamenuitem400585\")")
    private WebElement topMenuItemFifth;


    @FindBy(how = How.XPATH, using = "id(\"mainmenuamenuitem356621\")")
    private WebElement topMenuItemLast;


    public TopMenuSectorPO(WebDriver driver) {
        super( driver );
    }

    public void checkEveryTopMenuItemLinkText() {
        List<WebElement> links = driver.findElements( By.tagName( "a" ) );
        for (WebElement we : links) {
            //if("Specific link text".equals(we.getText())) {
            System.out.println( "we.text" + we.getText() );
            //}
        }
    }
}
