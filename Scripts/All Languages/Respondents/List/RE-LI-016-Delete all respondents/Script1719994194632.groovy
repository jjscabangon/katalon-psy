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

WebUI.callTestCase(findTestCase('All Languages/Authentication/AU-001-Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Page-All Languages/Respondents/List/OR-RE-LI-Add new respondent/input_Search Respondent'),
	'Auto')

WebUI.waitForElementVisible(findTestObject('Object Repository/Page-All Languages/Respondents/List/OR-RE-LI-Add new respondent/span_Loading respondents'),
	3)

WebUI.waitForElementNotVisible(findTestObject('Object Repository/Page-All Languages/Respondents/List/OR-RE-LI-Add new respondent/span_Loading respondents'),
	3)

while (WebUI.verifyElementVisible(findTestObject('Object Repository/Page-All Languages/Respondents/List/OR-RE-LI-Delete all respondents/div_First row'), FailureHandling.OPTIONAL)) {

    WebUI.click(findTestObject('Object Repository/Page-All Languages/Respondents/List/OR-RE-LI-Delete all respondents/div_Select all rows'))

    WebUI.click(findTestObject('Object Repository/Page-All Languages/Respondents/List/OR-RE-LI-Delete all respondents/span_Remove selected respondents'))

    WebUI.click(findTestObject('Object Repository/Page-All Languages/Respondents/List/OR-RE-LI-Delete all respondents/button_Yes'))

    WebUI.waitForPageLoad(5)
	
	if (WebUI.verifyElementVisible(findTestObject('Object Repository/Page-All Languages/Respondents/List/OR-RE-LI-Delete all respondents/p_Empty search result'))) {
		break;
	}
}

WebUI.closeBrowser()
