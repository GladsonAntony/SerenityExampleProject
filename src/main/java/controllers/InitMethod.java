/**
 * @Author Gladson Antony
 * @Date 30-Dec-2017 
 * @Time 11:34:15 AM
 */

package controllers;

import java.awt.Robot;
import java.io.File;
import java.net.URI;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class InitMethod
{
	public static String FS = File.separator;

	public static String OSName = System.getProperty("os.name");
	public static String OSArchitecture = System.getProperty("os.arch");
	public static String OSVersion = System.getProperty("os.version");
	public static String OSBit = System.getProperty("sun.arch.data.model");

	public static String ProjectWorkingDirectory = System.getProperty("user.dir");
	
	public static String ExcelFiles = "./src/test/resources/Excel Files/";
	public static String TestData = "./src/test/resources/TestData/";
	public static String PropertiesFiles = "./src/test/resources/Properties Files";
	public static String Reports = "./src/test/resources/Reports";
	
	public static String Images = Reports + FS + "Images" + FS;
	public static String Videos = "./src/test/resources/Reports/Videos/";
	
	public static Robot re;
	public static Alert al;
	public static String robotImageName;
	public static Select se;
	public static String FileToUpload;
	public static Actions ac;
	public static WebDriver augmentedDriver;
	public static URI uri;		
}
