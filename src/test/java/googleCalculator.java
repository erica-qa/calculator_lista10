import java.net.MalformedURLException;
import java.net.URL;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.options.BaseOptions;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class googleCalculator {

  private AndroidDriver driver;

  private URL getUrl() {
    try {
      return new URL("https://EricaQA:fc45caa2-a42a-4878-babb-b6b4b31e8f1a@ondemand.us-west-1.saucelabs.com:443/wd/hub");
    } catch (MalformedURLException e) {
      e.printStackTrace();
    }
    return null;
  }

  @BeforeEach
  public void setUp(){
    var options = new BaseOptions()
      .amend("platformName", "Android")
      .amend("appium:platformVersion", "9.0")
      .amend("appium:deviceName", "Samsung Galaxy S9 FHD GoogleAPI Emulator")
      .amend("appium:deviceOrientation", "portrait")
      .amend("appium:app", "storage:filename=Calculator_8.6.1 (625857114)_APKPure.apk")
      .amend("appium:appPackage", "com.google.android.calculator")
      .amend("appium:appActivity", "com.android.calculator2.Calculator")
      .amend("appium:automationName", "UiAutomator2")
      .amend("browserName", "")
      .amend("appium:ensureWebviewsHavePages", true)
      .amend("appium:nativeWebScreenshot", true)
      .amend("appium:newCommandTimeout", 3600)
      .amend("appium:connectHardwareKeyboard", true);

      driver = new AndroidDriver(this.getUrl(), options);
  }

  @Test @Order(1)
  public void somarTest() throws InterruptedException{
    var btn1= driver.findElement(AppiumBy.id("com.google.android.calculator:id/digit_5"));
    btn1.click();
    var btnOp= driver.findElement(AppiumBy.id("com.google.android.calculator:id/op_add"));
    btnOp.click();
    var btn2= driver.findElement(AppiumBy.id("com.google.android.calculator:id/digit_2"));
    btn2.click();
    var btnEq= driver.findElement(AppiumBy.id("com.google.android.calculator:id/eq"));
    btnEq.click();
    Thread.sleep(500); // Aguardar 500ms
  }

  @Test @Order(2)
  public void subtrairTest() throws InterruptedException{
    var btn1= driver.findElement(AppiumBy.id("com.google.android.calculator:id/digit_1"));
    btn1.click();
    var btn2= driver.findElement(AppiumBy.id("com.google.android.calculator:id/digit_8"));
    btn2.click();
    var btnOp= driver.findElement(AppiumBy.id("com.google.android.calculator:id/op_sub"));
    btnOp.click();
    var btn3= driver.findElement(AppiumBy.id("com.google.android.calculator:id/digit_7"));
    btn3.click();
    var btnEq= driver.findElement(AppiumBy.id("com.google.android.calculator:id/eq"));
    btnEq.click(); 
    Thread.sleep(500); // Aguardar 500ms 
  }

  @Test @Order(3)
  public void multiplicarTest() throws InterruptedException{
    var btn1= driver.findElement(AppiumBy.id("com.google.android.calculator:id/digit_3"));
    btn1.click();
    var btnOp= driver.findElement(AppiumBy.id("com.google.android.calculator:id/op_mul"));
    btnOp.click();
    var btn2= driver.findElement(AppiumBy.id("com.google.android.calculator:id/digit_4"));
    btn2.click();
    var btn3= driver.findElement(AppiumBy.id("com.google.android.calculator:id/dec_point"));
    btn3.click();
    var btn4= driver.findElement(AppiumBy.id("com.google.android.calculator:id/digit_6"));
    btn4.click();
    var btnEq= driver.findElement(AppiumBy.id("com.google.android.calculator:id/eq"));
    btnEq.click();
    Thread.sleep(500); // Aguardar 500ms
  }

  @Test @Order(4)
  public void dividirTest() throws InterruptedException{
    var btn1= driver.findElement(AppiumBy.id("com.google.android.calculator:id/digit_9"));
    btn1.click();
    var btnOp= driver.findElement(AppiumBy.id("com.google.android.calculator:id/op_div"));
    btnOp.click();
    var btn2= driver.findElement(AppiumBy.id("com.google.android.calculator:id/digit_3"));
    btn2.click();
    var btnEq= driver.findElement(AppiumBy.id("com.google.android.calculator:id/eq"));
    btnEq.click();
    Thread.sleep(500); // Aguardar 500ms
  }

   @AfterEach
  public void tearDown(){
    driver.quit();
  }

}
