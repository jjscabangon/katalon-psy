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

WebUI.callTestCase(findTestCase('All Languages/Respondents/List/RE-LI-001-Add new respondent'), [:], FailureHandling.STOP_ON_FAILURE)

//WebUI.waitForPageLoad(3)
//
//WebUI.click(findTestObject('Object Repository/Page-CN/CN-Respondents/CN-OR-Invite respondent to assessment/div_First Checkbox'))
WebUI.click(findTestObject('Object Repository/Page-CN/CN-Respondents/CN-OR-Invite respondent to assessment/div_Invite respondent(s) to assessment'))

WebUI.click(findTestObject('Page-All Languages/Respondents/List/OR-RE-LI-Invite respondent with empty biodata/span_Biodata template dropdown'))

WebUI.click(findTestObject('Page-All Languages/Respondents/List/OR-RE-LI-Invite respondent with empty biodata/div_Empty biodata option'))

WebUI.click(findTestObject('Object Repository/Page-CN/CN-Respondents/CN-OR-Invite respondent to assessment/button_Create invite and go next'))

WebUI.click(findTestObject('Object Repository/Page-CN/CN-Respondents/CN-OR-Invite respondent to assessment/button_Copy link'))

WebUI.click(findTestObject('Object Repository/Page-CN/CN-Respondents/CN-OR-Invite respondent to assessment/svg_Close Lightbox'))

WebUI.clearText(findTestObject('Object Repository/Page-CN/CN-Respondents/CN-OR-Invite respondent to assessment/input_Search'))

WebUI.sendKeys(findTestObject('Object Repository/Page-CN/CN-Respondents/CN-OR-Invite respondent to assessment/input_Search'), 
    Keys.chord(Keys.CONTROL, 'v'))

WebUI.waitForPageLoad(3)

GlobalVariable.assessment15fq = WebUI.getAttribute(findTestObject('Object Repository/Page-CN/CN-Respondents/CN-OR-Invite respondent to assessment/input_Search'), 
    'value')

if (GlobalVariable.assessment15fq == '') {
	WebUI.sendKeys(findTestObject('Object Repository/Page-CN/CN-Respondents/CN-OR-Invite respondent to assessment/input_Search'),
		Keys.chord(Keys.COMMAND, 'v'))
	
	WebUI.waitForPageLoad(3)
	
	GlobalVariable.assessment15fq = WebUI.getAttribute(findTestObject('Object Repository/Page-CN/CN-Respondents/CN-OR-Invite respondent to assessment/input_Search'),
		'value')
}

println(GlobalVariable.assessment15fq)

WebUI.navigateToUrl(GlobalVariable.assessment15fq)

