package SiteTests;

import com.academy.framework.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTitleTest extends BaseTest {
    @Test
    public void homePageTitleTest() {
        driver.get( "https://www.adonis.no/" );
        String actualTitle = driver.getTitle();
        Assert.assertEquals( actualTitle, "Adonis - Adonis AS" );
        System.out.println( "1st test adonis site" );


    }
}
