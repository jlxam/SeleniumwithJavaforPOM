package Antony;

import static org.testng.Assert.assertEquals;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Base64;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Antony.Allurelist;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
@Listeners({ Allurelist.class })
public class SeleniumTest extends Util {
	@Test
	
	@Description("Verify Login")
	@Severity(SeverityLevel.BLOCKER)
@Story(value = "Requiremnet id 7887665")
	@Feature("Signin")
	
    public void init() throws Exception {
	 
                   HomePage homepage = PageFactory.initElements(driver, HomePage.class);
                   basepage ba = PageFactory.initElements(driver, basepage.class);
                   WebElement s = homepage.sendlocator();
                   WebElement nextbutton=homepage.Next();
                   WebElement password=homepage.Password();
                   WebElement NextButton=homepage.verifyPassword();
                   Thread.sleep(2000);
                   String vv=ba.username();  
                   String pass=ba.password();
                   String dash=ba.dashurl();
                   //System.out.println(vv);
                   Thread.sleep(2000);
                   ba.sendkeys(s,vv);
                   
                   
                  ba.Click(nextbutton);
                  ba.sendkeys(password,pass);
                  ba.Click(NextButton);
                 
Assert.assertEquals(driver.getCurrentUrl(), dash);
 



Thread.sleep(10000);

    }
	
	 
	
	
	
	
	
}