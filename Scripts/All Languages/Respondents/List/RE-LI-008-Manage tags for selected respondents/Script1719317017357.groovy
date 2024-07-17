import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
//WebElement
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.testng.Assert as Assert
import com.kms.katalon.core.annotation.Keyword as Keyword
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.callTestCase(findTestCase('All Languages/Respondents/List/RE-LI-013-Add bulk respondents'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page-All Languages/Respondents/List/OR-RE-LI-Manage tags for selected respondents/span_Manage tags for selected respondent(s)'))

newTag = ('utoTag' + GlobalVariable.timestamp)

WebUI.click(findTestObject('Object Repository/Page-All Languages/Respondents/List/OR-RE-LI-Manage tags for selected respondents/div_Select from existing tags or add new'))

//Execute JS to change value attribute
WebElement element = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/Page-All Languages/Respondents/List/OR-RE-LI-Manage tags for selected respondents/input_Tags'), 
    30)

WebUI.executeJavaScript(('arguments[0].setAttribute(\'value\',\'' + newTag) + '\');', Arrays.asList(element))

//This JS is already working but not reflecting in the FE
//Add another text to reflect tag name in FE
WebUI.sendKeys(findTestObject('Object Repository/Page-All Languages/Respondents/List/OR-RE-LI-Manage tags for selected respondents/input_Tags'), 
    'A')

WebUI.sendKeys(findTestObject('Object Repository/Page-All Languages/Respondents/List/OR-RE-LI-Manage tags for selected respondents/input_Tags'), 
    Keys.chord(Keys.TAB))

WebUI.click(findTestObject('Page-All Languages/Respondents/List/OR-RE-LI-Manage tags for selected respondents/button_Save'))

WebUI.verifyElementVisible(findTestObject('Page-All Languages/Respondents/List/OR-RE-LI-Manage tags for selected respondents/span_Tag Updated'), 
    FailureHandling.STOP_ON_FAILURE)

updatedTag = WebUI.getText(findTestObject('Page-All Languages/Respondents/List/OR-RE-LI-Manage tags for selected respondents/td_First row tag'))

if (updatedTag.contains(newTag)) {}

