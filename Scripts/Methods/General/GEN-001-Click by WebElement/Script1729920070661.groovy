import org.openqa.selenium.By
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebDriver
import org.openqa.selenium.interactions.Actions

import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

println('Element to Locate: ' + GlobalVariable.element)

WebDriver driver = DriverFactory.getWebDriver()

object = driver.findElement(By.xpath(GlobalVariable.element))

//Scroll to Element via Actions
Actions actions = new Actions(driver);
actions.moveToElement(object);
actions.perform();

WebUI.delay(3)

//Click object
object.click()

