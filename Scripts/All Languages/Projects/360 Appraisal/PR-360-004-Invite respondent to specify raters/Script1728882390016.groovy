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

WebUI.callTestCase(findTestCase('All Languages/Projects/360 Appraisal/PR-360-001-Add standard 360 project (8694hw1va)'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page-All Languages/Projects/360 Appraisal/OR-PR-360-Send invites to 360 project raters/div_Check all rows'))

WebUI.click(findTestObject('Page-All Languages/Projects/360 Appraisal/OR-PR-360-Invite specify own raters/button_Kebab'))

WebUI.click(findTestObject('Page-All Languages/Projects/360 Appraisal/OR-PR-360-Invite specify own raters/li_Kebab invite own raters'))

WebUI.click(findTestObject('Page-All Languages/Projects/360 Appraisal/OR-PR-360-Invite specify own raters/button_Send'))

WebUI.click(findTestObject('Page-All Languages/Projects/360 Appraisal/OR-PR-360-Invite specify own raters/div_Invites tab'))

WebUI.verifyElementPresent(findTestObject('Page-All Languages/Projects/360 Appraisal/OR-PR-360-Invite specify own raters/td_Column scheduled'), 
    3)

