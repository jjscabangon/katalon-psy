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

WebUI.callTestCase(findTestCase('All Languages/Projects/360 Appraisal/PR-360-003-Send invites to 360 raters'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page-All Languages/Projects/360 Appraisal/OR-PR-360-Send invites to 360 project raters/div_Check all rows'))

WebUI.click(findTestObject('Page-All Languages/Projects/360 Appraisal/OR-PR-360-Complete 360 appraisal/div_Row for self checkbox'))

email = WebUI.getText(findTestObject('Page-All Languages/Projects/360 Appraisal/OR-PR-360-Complete 360 appraisal/td_Email self'))

WebUI.click(findTestObject('Page-All Languages/Projects/360 Appraisal/OR-PR-360-Complete 360 appraisal/div_Invites tab'))

GlobalVariable.element = (('//td[contains(normalize-space(),"' + email) + '")]/preceding-sibling::td')

WebUI.callTestCase(findTestCase('Methods/General/GEN-001-Click by WebElement'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page-All Languages/Projects/360 Appraisal/OR-PR-360-Complete 360 appraisal/div_Copy invite link to clipboard'))

WebUI.click(findTestObject('Page-All Languages/Projects/360 Appraisal/OR-PR-360-Complete 360 appraisal/div_Raters tab'))

WebUI.callTestCase(findTestCase('Methods/General/GEN-002-Navigate to Copied Invite Link'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Methods/Projects/PR-360-M001-Complete 360 appraisal'), [:], FailureHandling.STOP_ON_FAILURE)

