package pages.loginPage;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;

public class GoogleLoginPage extends PageObject 
{

    public GoogleLoginPage(WebDriver driver) 
    {
        super(driver);
    }

    @FindBy(xpath="//input[@type='email']")
    private WebElement field_EMailID;

    @FindBy(xpath="//button[text()='Forgot email?']")
    private WebElement button_ForgotEMail;

    @FindBy(xpath="//div[text()='More options']")
    private WebElement button_MoreOptions;

    @FindBy(xpath="//*[@id=\"identifierNext\"]/content/span")
    private WebElement button_Next;
        
    @FindBy(xpath="//*[@id=\"password\"]/div[1]/div/div[1]/input")
    private WebElement field_Password;

    @FindBy(xpath="//div[text()='Forgot password?']")
    private WebElement button_ForgotPassword;

	public GoogleLoginPage verifyPageElements() 
	{
		assertTrue(field_EMailID.isDisplayed());
//		assertTrue(button_ForgotEMail.isDisplayed());
		assertTrue(button_Next.isDisplayed());
		return this;
	}

	public GoogleLoginPage enterEMailAddress(String email) 
	{
		field_EMailID.sendKeys(email);
		button_Next.click();
		return this;
	}

	public GoogleLoginPage enterPassword(String password) 
	{
		waitFor(field_Password);
		assertTrue(field_Password.isDisplayed());
		field_Password.sendKeys(password);
//		button_Next.click();
		return this;
	}
}