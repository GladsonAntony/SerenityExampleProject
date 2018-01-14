/**
 * @Author Gladson Antony
 * @Date 30-Dec-2017 
 * @Time 11:34:15 AM
 */
package controllers;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.tngtech.java.junit.dataprovider.DataProviderRunner;

import net.thucydides.core.annotations.Managed;

@RunWith(DataProviderRunner.class)
public class MainMethod extends InitMethod
{
	@Managed
	public static WebDriver driver;

}
