package Antony;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	  WebDriver driver;

      public HomePage(WebDriver driver) {
                     this.driver = driver;
      }

      @FindBy(name = "username") private WebElement userName;
      public WebElement sendlocator() {

                     return userName;

}}