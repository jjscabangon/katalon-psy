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
//Import WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement

WebUI.callTestCase(findTestCase('Settings/Ideal Profile/SE-IP-001-Navigate to Settings Ideal Profile'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page-EN/Settings/Ideal Profile/OR-SE-IP-Add ideal profile using respondent data/button_Add ideal profile'))

profileName = ('Auto Respondent Data | ' + GlobalVariable.timestamp)

WebUI.setText(findTestObject('Object Repository/Page-EN/Settings/Ideal Profile/OR-SE-IP-Add ideal profile using respondent data/input_Ideal profile name'), 
    profileName)

WebUI.click(findTestObject('Object Repository/Page-EN/Settings/Ideal Profile/OR-SE-IP-Add ideal profile using respondent data/div_Respondent Data'))

WebUI.click(findTestObject('Object Repository/Page-EN/Settings/Ideal Profile/OR-SE-IP-Add ideal profile using respondent data/div_Norms List'))

WebUI.click(findTestObject('Object Repository/Page-EN/Settings/Ideal Profile/OR-SE-IP-Add ideal profile using respondent data/div_NZ Accounting Industry'))

WebUI.click(findTestObject('Object Repository/Page-EN/Settings/Ideal Profile/OR-SE-IP-Add ideal profile using respondent data/div_Groups'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page-EN/Settings/Ideal Profile/OR-SE-IP-Add ideal profile using respondent data/div_Group Menu'), 
    3)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page-EN/Settings/Ideal Profile/OR-SE-IP-Add ideal profile using respondent data/div_Select Group'), 
    3)

WebUI.click(findTestObject('Object Repository/Page-EN/Settings/Ideal Profile/OR-SE-IP-Add ideal profile using respondent data/div_Select Group'))

WebUI.click(findTestObject('Object Repository/Page-EN/Settings/Ideal Profile/OR-SE-IP-Add ideal profile using respondent data/button_Save'))

WebUI.refresh()

WebUI.waitForElementClickable(findTestObject('Page-EN/Settings/Ideal Profile/OR-SE-IP-Add complete ideal profile/input_Search'),
	3)

WebUI.setText(findTestObject('Page-EN/Settings/Ideal Profile/OR-SE-IP-Add complete ideal profile/input_Search'), profileName)

WebUI.waitForPageLoad(5)

WebUI.waitForElementVisible(findTestObject('Page-EN/Settings/Ideal Profile/OR-SE-IP-Add complete ideal profile/td_First row'), 5)

WebUI.verifyElementText(findTestObject('Page-EN/Settings/Ideal Profile/OR-SE-IP-Add complete ideal profile/td_First row'), profileName)


