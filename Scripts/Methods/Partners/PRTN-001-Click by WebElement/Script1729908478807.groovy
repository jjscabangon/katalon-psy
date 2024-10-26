import org.openqa.selenium.By
import org.openqa.selenium.WebDriver

import com.kms.katalon.core.webui.driver.DriverFactory

import internal.GlobalVariable

WebDriver driver = DriverFactory.getWebDriver();
object = driver.findElement(By.xpath(GlobalVariable.element))
object.click();