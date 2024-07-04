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

WebUI.callTestCase(findTestCase('Respondents/List/RE-LI-001-Add new respondent'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page-EN/Respondents/List/OR-RE-LI-Add to existing group/span_Add to existing group'))

WebUI.click(findTestObject('Page-EN/Respondents/List/OR-RE-LI-Add to existing group/div_Dropdown'))

groupName = WebUI.getText(findTestObject('Object Repository/Page-EN/Respondents/List/OR-RE-LI-Add to existing group/div_Select group'))

WebUI.click(findTestObject('Object Repository/Page-EN/Respondents/List/OR-RE-LI-Add to existing group/div_Select group'))

WebUI.click(findTestObject('Object Repository/Page-EN/Respondents/List/OR-RE-LI-Add to existing group/button_Save'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Object Repository/Page-EN/Respondents/List/OR-RE-LI-Add to existing group/div_Groups column'), 
    groupName)

WebUI.closeBrowser()

