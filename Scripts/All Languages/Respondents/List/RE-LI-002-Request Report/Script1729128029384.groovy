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

WebUI.callTestCase(findTestCase('EN/EN-Respondents/EN-List/EN-RE-LI-003-Administer answer sheet'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.refresh()

WebUI.waitForElementVisible(findTestObject('Page-All Languages/Respondents/List/OR-RE-LI-Add new respondent/input_Search Respondent'), 
    10)

WebUI.setText(findTestObject('Object Repository/Page-All Languages/Respondents/List/OR-RE-LI-Add new respondent/input_Search Respondent'), 
    GlobalVariable.email)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page-All Languages/Respondents/List/OR-RE-LI-Add new respondent/span_Loading respondents'), 
    3)

WebUI.waitForElementNotVisible(findTestObject('Object Repository/Page-All Languages/Respondents/List/OR-RE-LI-Add new respondent/span_Loading respondents'), 
    3)

WebUI.click(findTestObject('Object Repository/Page-All Languages/Respondents/List/OR-RE-LI-Request Report/div_First Checkbox'))

WebUI.click(findTestObject('Object Repository/Page-All Languages/Respondents/List/OR-RE-LI-Request Report/div_Request report(s)'))

WebUI.click(findTestObject('Object Repository/Page-All Languages/Respondents/List/OR-RE-LI-Request Report/div_Available Reports_Set 1'))

WebUI.click(findTestObject('Object Repository/Page-All Languages/Respondents/List/OR-RE-LI-Request Report/button_Request'))

WebUI.click(findTestObject('Page-All Languages/Respondents/List/OR-RE-LI-Request Report/div_Select norm'))

WebUI.click(findTestObject('Page-All Languages/Respondents/List/OR-RE-LI-Request Report/div_First norm'))

WebUI.click(findTestObject('Page-All Languages/Respondents/List/OR-RE-LI-Request Report/div_Ideal profile dropdown'))

WebUI.click(findTestObject('Page-All Languages/Respondents/List/OR-RE-LI-Request Report/div_Ideal profile option 1'))

WebUI.click(findTestObject('Page-All Languages/Respondents/List/OR-RE-LI-Request Report/button_Footer request'))

WebUI.click(findTestObject('Object Repository/Page-All Languages/Respondents/List/OR-RE-LI-Request Report/button_Yes'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page-All Languages/Respondents/List/OR-RE-LI-Request Report/span_Report request created'))

