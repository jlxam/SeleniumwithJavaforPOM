package Antony;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SeleniumTest extends Util {
	@Test

    public void init() throws Exception {

                   HomePage homepage = PageFactory.initElements(driver, HomePage.class);

                   basepage ba = PageFactory.initElements(driver, basepage.class);

                   WebElement s = homepage.sendlocator();
                   String vv=ba.username();
                   System.out.println(vv);
                   ba.sendkeys(s,vv);
                

                   Thread.sleep(10000);

    }}