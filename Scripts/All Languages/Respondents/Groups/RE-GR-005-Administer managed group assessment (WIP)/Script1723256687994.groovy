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

WebUI.callTestCase(findTestCase('All Languages/Respondents/List/RE-LI-009-Add new group from selection'), [:], FailureHandling.STOP_ON_FAILURE)

firstEmail = WebUI.getText(findTestObject('Page-All Languages/Respondents/Groups/OR-GR-Administer managed group assessment/td_First email address'))

println('Group: ' + GlobalVariable.groupName)

println('Email: ' + firstEmail)

WebUI.callTestCase(findTestCase('All Languages/Respondents/Groups/RE-GR-001-Navigate to Groups'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Page-All Languages/Respondents/List/OR-RE-LI-Add new respondent/input_Search Respondent'), 
    GlobalVariable.groupName)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page-All Languages/Respondents/List/OR-RE-LI-Add new respondent/span_Loading respondents'), 
    3)

WebUI.waitForElementNotVisible(findTestObject('Object Repository/Page-All Languages/Respondents/List/OR-RE-LI-Add new respondent/span_Loading respondents'), 
    3)

WebUI.click(findTestObject('Page-All Languages/Respondents/Groups/OR-GR-Administer managed group assessment/div_Toggle all rows'))

WebUI.click(findTestObject('Object Repository/Page-All Languages/Respondents/Groups/OR-GR-Administer managed group assessment/span_Administer Managed Group Session'))

WebUI.click(findTestObject('Object Repository/Page-All Languages/Respondents/Groups/OR-GR-Administer managed group assessment/button_Start'))

WebUI.click(findTestObject('Object Repository/Page-All Languages/Respondents/Groups/OR-GR-Administer managed group assessment/button_Ok'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page-All Languages/Respondents/Groups/OR-GR-Administer managed group assessment/span_Bitly link'), 
    10)

GlobalVariable.bitlyLink = WebUI.getText(findTestObject('Object Repository/Page-All Languages/Respondents/Groups/OR-GR-Administer managed group assessment/span_Bitly link'))

println('Managed Group Session Link: ' + GlobalVariable.bitlyLink)

WebUI.callTestCase(findTestCase('Methods/Respondents/RE-LI-M003-Access Managed Group Session'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('All Languages/Authentication/AU-001-Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('All Languages/Respondents/Groups/RE-GR-001-Navigate to Groups'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Page-All Languages/Respondents/List/OR-RE-LI-Add new respondent/input_Search Respondent'), 
    GlobalVariable.groupName)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page-All Languages/Respondents/List/OR-RE-LI-Add new respondent/span_Loading respondents'), 
    3)

WebUI.waitForElementNotVisible(findTestObject('Object Repository/Page-All Languages/Respondents/List/OR-RE-LI-Add new respondent/span_Loading respondents'), 
    3)

WebUI.click(findTestObject('Page-All Languages/Respondents/Groups/OR-GR-Administer managed group assessment/td_First group'))

WebUI.click(findTestObject('Page-All Languages/Respondents/Groups/OR-GR-Administer managed group assessment/td_First email address'))

WebUI.click(findTestObject('Page-All Languages/Respondents/Groups/OR-GR-Administer managed group assessment/div_Authorize'))

WebUI.click(findTestObject('Page-All Languages/Respondents/Groups/OR-GR-Administer managed group assessment/button_Confirm Authorize'))

WebUI.callTestCase(findTestCase('Methods/Respondents/RE-LI-M003-Access Managed Group Session'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Methods/Respondents/RE-LI-M002-Complete 15FQ'), [:], FailureHandling.STOP_ON_FAILURE)

