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

WebUI.callTestCase(findTestCase('Respondents/List/RE-LI-013-Add bulk respondents'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page-EN/Respondents/List/OR-RE-LI-Add new group from selection/span_Add new group from selection'))

groupName = ('Auto Group ' + GlobalVariable.timestamp)

WebUI.setText(findTestObject('Object Repository/Page-EN/Respondents/List/OR-RE-LI-Add new group from selection/input_Group name'), 
    groupName)

groupDescription = 'Auto add new group from selection'

WebUI.setText(findTestObject('Object Repository/Page-EN/Respondents/List/OR-RE-LI-Add new group from selection/textarea_Group description'), 
    groupDescription)

WebUI.click(findTestObject('Object Repository/Page-EN/Respondents/List/OR-RE-LI-Add new group from selection/button_Create'))

WebUI.refresh()

WebUI.setText(findTestObject('Object Repository/Page-EN/Respondents/List/OR-RE-LI-Add new respondent/input_Search Respondent'), 
    GlobalVariable.groupTimestamp)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page-EN/Respondents/List/OR-RE-LI-Add new respondent/span_Loading respondents'), 
    3)

WebUI.waitForElementNotVisible(findTestObject('Object Repository/Page-EN/Respondents/List/OR-RE-LI-Add new respondent/span_Loading respondents'), 
    3)

WebUI.verifyElementText(findTestObject('Object Repository/Page-EN/Respondents/List/OR-RE-LI-Add new group from selection/div_Groups column'), 
    groupName)

WebUI.closeBrowser()

