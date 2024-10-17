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

WebUI.click(findTestObject('Page-All Languages/Projects/360 Appraisal/OR-PR-360-Add raters to 360 project/button_Add rater'))

//Add manager
WebUI.click(findTestObject('Page-All Languages/Projects/360 Appraisal/OR-PR-360-Add raters to 360 project/div_Rater dropdown'))

WebUI.click(findTestObject('Page-All Languages/Projects/360 Appraisal/OR-PR-360-Add raters to 360 project/div_Rater option'))

WebUI.click(findTestObject('Page-All Languages/Projects/360 Appraisal/OR-PR-360-Add raters to 360 project/div_Role dropdown'))

WebUI.click(findTestObject('Page-All Languages/Projects/360 Appraisal/OR-PR-360-Add raters to 360 project/div_Role manager'))

WebUI.click(findTestObject('Page-All Languages/Projects/360 Appraisal/OR-PR-360-Add raters to 360 project/button_Add role'))

//Add peer
WebUI.click(findTestObject('Page-All Languages/Projects/360 Appraisal/OR-PR-360-Add raters to 360 project/div_Rater dropdown'))

WebUI.click(findTestObject('Page-All Languages/Projects/360 Appraisal/OR-PR-360-Add raters to 360 project/div_Rater option'))

WebUI.click(findTestObject('Page-All Languages/Projects/360 Appraisal/OR-PR-360-Add raters to 360 project/div_Role dropdown'))

WebUI.click(findTestObject('Page-All Languages/Projects/360 Appraisal/OR-PR-360-Add raters to 360 project/div_Role peer'))

WebUI.click(findTestObject('Page-All Languages/Projects/360 Appraisal/OR-PR-360-Add raters to 360 project/button_Add role'))

//Add direct report
WebUI.click(findTestObject('Page-All Languages/Projects/360 Appraisal/OR-PR-360-Add raters to 360 project/div_Rater dropdown'))

WebUI.click(findTestObject('Page-All Languages/Projects/360 Appraisal/OR-PR-360-Add raters to 360 project/div_Rater option'))

WebUI.click(findTestObject('Page-All Languages/Projects/360 Appraisal/OR-PR-360-Add raters to 360 project/div_Role dropdown'))

WebUI.click(findTestObject('Page-All Languages/Projects/360 Appraisal/OR-PR-360-Add raters to 360 project/div_Role direct report'))

WebUI.click(findTestObject('Page-All Languages/Projects/360 Appraisal/OR-PR-360-Add raters to 360 project/button_Add role'))

//Add other
WebUI.click(findTestObject('Page-All Languages/Projects/360 Appraisal/OR-PR-360-Add raters to 360 project/div_Rater dropdown'))

WebUI.click(findTestObject('Page-All Languages/Projects/360 Appraisal/OR-PR-360-Add raters to 360 project/div_Rater option'))

WebUI.click(findTestObject('Page-All Languages/Projects/360 Appraisal/OR-PR-360-Add raters to 360 project/div_Role dropdown'))

WebUI.click(findTestObject('Page-All Languages/Projects/360 Appraisal/OR-PR-360-Add raters to 360 project/div_Role other'))

WebUI.click(findTestObject('Page-All Languages/Projects/360 Appraisal/OR-PR-360-Add raters to 360 project/button_Add role'))

WebUI.click(findTestObject('Page-All Languages/Projects/360 Appraisal/OR-PR-360-Add raters to 360 project/button_Confirm'))

WebUI.waitForElementVisible(findTestObject('Page-All Languages/Projects/360 Appraisal/OR-PR-360-Add raters to 360 project/td_Column manager'), 
    3)

WebUI.waitForElementVisible(findTestObject('Page-All Languages/Projects/360 Appraisal/OR-PR-360-Add raters to 360 project/td_Column peer'), 
    3)

WebUI.waitForElementVisible(findTestObject('Page-All Languages/Projects/360 Appraisal/OR-PR-360-Add raters to 360 project/td_Column direct report'), 
    3)

WebUI.waitForElementVisible(findTestObject('Page-All Languages/Projects/360 Appraisal/OR-PR-360-Add raters to 360 project/td_Column other'), 
    3)

