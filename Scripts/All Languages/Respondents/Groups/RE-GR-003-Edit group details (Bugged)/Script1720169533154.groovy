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

WebUI.callTestCase(findTestCase('All Languages/Respondents/Groups/RE-GR-002-Add new group'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page-EN/Respondents/Groups/OR-RE-GR-Edit group/span_Edit group details'))

WebUI.clearText(findTestObject('Object Repository/Page-EN/Respondents/Groups/OR-RE-GR-Edit group/input_Name'))

GlobalVariable.timestamp = new Date().format('MMddhhmmss')

groupName = ('EDIT Auto Group ' + GlobalVariable.timestamp)

WebUI.setText(findTestObject('Object Repository/Page-EN/Respondents/Groups/OR-RE-GR-Edit group/input_Name'), groupName)

WebUI.clearText(findTestObject('Object Repository/Page-EN/Respondents/Groups/OR-RE-GR-Edit group/input_Description'))

groupDescription = ('Description for ' + groupName)

WebUI.setText(findTestObject('Object Repository/Page-EN/Respondents/Groups/OR-RE-GR-Edit group/input_Description'), groupDescription)

WebUI.click(findTestObject('Object Repository/Page-EN/Respondents/Groups/OR-RE-GR-Edit group/button_Save'))

WebUI.waitForPageLoad(5)

<<<<<<< Updated upstream:Scripts/Respondents/Groups/RE-GR-003-Edit group details (Bugged)/Script1720169533154.groovy
WebUI.waitForElementClickable(findTestObject('Page-EN/Respondents/Groups/OR-RE-GR-Add group/input_Search'), 3)

=======
>>>>>>> Stashed changes:Scripts/Respondents/Groups/RE-GR-003-Edit group details/Script1719820315351.groovy
WebUI.clearText(findTestObject('Object Repository/Respondents/Groups/OR-Add group/input_Search'))

WebUI.setText(findTestObject('Object Repository/Respondents/Groups/OR-Add group/input_Search'), groupName)

WebUI.waitForPageLoad(5)

//To allow row to be properly displayed
WebUI.delay(3)

WebUI.verifyElementText(findTestObject('Object Repository/Respondents/Groups/OR-Edit group/td_Row name'), groupName)

WebUI.setText(findTestObject('Object Repository/Page-EN/Respondents/Groups/OR-RE-GR-Add group/input_Search'), groupName)

WebUI.waitForPageLoad(5)

<<<<<<< Updated upstream:Scripts/Respondents/Groups/RE-GR-003-Edit group details (Bugged)/Script1720169533154.groovy
WebUI.verifyElementText(findTestObject('Object Repository/Page-EN/Respondents/Groups/OR-RE-GR-Edit group/td_Row name'), 
    groupName)

WebUI.verifyElementText(findTestObject('Object Repository/Page-EN/Respondents/Groups/OR-RE-GR-Edit group/td_Row description'), 
    groupDescription)
=======
WebUI.verifyElementText(findTestObject('Object Repository/Page-EN/Respondents/Groups/OR-RE-GR-Edit group/td_Row name'), groupName)

WebUI.verifyElementText(findTestObject('Object Repository/Page-EN/Respondents/Groups/OR-RE-GR-Edit group/td_Row description'), groupDescription)
>>>>>>> Stashed changes:Scripts/Respondents/Groups/RE-GR-003-Edit group details/Script1719820315351.groovy

