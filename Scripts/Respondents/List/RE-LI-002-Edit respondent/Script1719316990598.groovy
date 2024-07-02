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

WebUI.click(findTestObject('Object Repository/Page-EN/Respondents/List/OR-RE-LI-Edit respondent/td_First Respondent'))

currentFName = WebUI.getAttribute(findTestObject('Object Repository/Page-EN/Respondents/List/OR-RE-LI-Edit respondent/input_First Name_firstName'), 'value')

WebUI.setText(findTestObject('Object Repository/Page-EN/Respondents/List/OR-RE-LI-Edit respondent/input_First Name_firstName'), currentFName + ' EDITED')

currentLName = WebUI.getAttribute(findTestObject('Object Repository/Page-EN/Respondents/List/OR-RE-LI-Edit respondent/input_Family Name_familyName'), 'value')

WebUI.setText(findTestObject('Object Repository/Page-EN/Respondents/List/OR-RE-LI-Edit respondent/input_Family Name_familyName'), currentLName + ' EDITED')

WebUI.setText(findTestObject('Page-EN/Respondents/List/OR-RE-LI-Edit respondent/input_reference'), (('Updated Reference 参考 for ' + GlobalVariable.firstname) + 
    ' last ') + GlobalVariable.timestamp)

WebUI.click(findTestObject('Object Repository/Page-EN/Respondents/List/OR-RE-LI-Edit respondent/button_Save changes'))

WebUI.closeBrowser()

