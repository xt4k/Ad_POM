package SiteTests;

import Model.BaseTest;
import PageObject.TopMenuSectorPO;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends BaseTest {

    @Test
    public void checkTopMenuItemLinks() {

        //1) open Homepage
        driver.get( "https://www.adonis.no/" );
        // 2) check every top menu item link - is it contains text according to data in external storage (where described top menu)
        TopMenuSectorPO topMenu = new TopMenuSectorPO( driver );
        topMenu.checkEveryTopMenuItemLinkText();

        // 3) click on each top menu item and check title on opened page - it should be shown as expected (for example - external storage)


        //  4) click back and check next top menu item


        String actualTitle = driver.getTitle();
        Assert.assertEquals( actualTitle, "Adonis - Adonis AS" );
        System.out.println( "1st test adonis site" );


    }
}
