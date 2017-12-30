/**
 * @Author Gladson Antony
 * @Date 30-Dec-2017 
 * @Time 11:34:15 AM
 */
package controllers;

import org.openqa.selenium.WebDriver;

import net.thucydides.core.annotations.Managed;

public class MainMethod extends InitMethod
{
	@Managed
	public static WebDriver driver;

}
