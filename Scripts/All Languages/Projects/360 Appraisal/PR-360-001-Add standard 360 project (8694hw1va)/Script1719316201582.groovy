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

WebUI.callTestCase(findTestCase('All Languages/Projects/PR-001-Navigate to projects'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page-All Languages/Projects/360 Appraisal/OR-PR-360-Navigate to Projects/button_Add new project'))

WebUI.click(findTestObject('Object Repository/Page-All Languages/Projects/360 Appraisal/OR-PR-360-Add standard 360 project/div_360 Appraisal option'))

WebUI.click(findTestObject('Object Repository/Page-All Languages/Projects/360 Appraisal/OR-PR-360-Add standard 360 project/button_Continue'))

projectName = ('Auto Standard 360 Project | ' + GlobalVariable.timestamp)

WebUI.setText(findTestObject('Object Repository/Page-All Languages/Projects/360 Appraisal/OR-PR-360-Add standard 360 project/input_Project name'), 
    projectName)

WebUI.setText(findTestObject('Object Repository/Page-All Languages/Projects/360 Appraisal/OR-PR-360-Add standard 360 project/textarea_Description'), 
    'Description for: ' + projectName)

WebUI.click(findTestObject('Object Repository/Page-All Languages/Projects/360 Appraisal/OR-PR-360-Add standard 360 project/input_Expiry date'))

WebUI.click(findTestObject('Object Repository/Page-All Languages/Projects/360 Appraisal/OR-PR-360-Add standard 360 project/div_First available date'))

WebUI.click(findTestObject('Object Repository/Page-All Languages/Projects/360 Appraisal/OR-PR-360-Add standard 360 project/li_Time'))

expiryDate = WebUI.getAttribute(findTestObject('Object Repository/Page-All Languages/Projects/360 Appraisal/OR-PR-360-Add standard 360 project/input_Expiry date'), 
    'value')

WebUI.click(findTestObject('Object Repository/Page-All Languages/Projects/360 Appraisal/OR-PR-360-Add standard 360 project/button_Add'))

//Bug: 8694hw1va
//WebUI.verifyTextPresent(expiryDate, false)

WebUI.delay(3)

WebUI.click(findTestObject('Page-All Languages/Projects/360 Appraisal/OR-PR-360-Add standard 360 project/button_Add session'))

WebUI.click(findTestObject('Page-All Languages/Projects/360 Appraisal/OR-PR-360-Add standard 360 project/div_Search self'))

WebUI.click(findTestObject('Page-All Languages/Projects/360 Appraisal/OR-PR-360-Add standard 360 project/div_Search first option'))

WebUI.click(findTestObject('Page-All Languages/Projects/360 Appraisal/OR-PR-360-Add standard 360 project/button_Confirm add session'))

WebUI.waitForElementVisible(findTestObject('Page-All Languages/Projects/360 Appraisal/OR-PR-360-Add standard 360 project/td_Row self'), 
    5)

