/**
 * @Author Gladson Antony
 * @Date 14-Jan-2018 
 * @Time 8:00:00 PM
 */

package pages.searchPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class GoogleSearchResultsPage extends PageObject 
{
    public GoogleSearchResultsPage(WebDriver driver) 
    {
        super(driver);
    }

    @FindBy(xpath="//div[text()='All']")
    private WebElement button_All;
    
    @FindBy(xpath="//a[text()='Images']")
    private WebElement button_Images;
    
    @FindBy(xpath="//a[text()='News']")
    private WebElement button_News;
    
    @FindBy(xpath="//a[text()='Videos']")
    private WebElement button_Videos;
    
    @FindBy(xpath="//a[text()='Books']")
    private WebElement button_Books;
    
    @FindBy(css="a[href$='preferences']")
    private WebElement button_Settings;
    
    @FindBy(xpath="//a[@id='hdtb-tls']")
    private WebElement button_Tools;
    
    
    public GoogleSearchResultsPage verifyPageElements()
    {
    	assertTrue(button_All.isDisplayed());
    	assertTrue(button_Books.isDisplayed());
    	assertTrue(button_Images.isDisplayed());
    	assertTrue(button_News.isDisplayed());
    	assertTrue(button_Settings.isDisplayed());
    	assertTrue(button_Tools.isDisplayed());
    	assertTrue(button_Videos.isDisplayed());
    	return this;
    }


	public GoogleSearchResultsPage verifyPageTitle(String string) 
	{
		assertThat(getTitle(), containsString(string));
		return this;
	}
    
    
}

