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

//Get Current Timestamp for Name Grouping
GlobalVariable.groupTimestamp = new Date().format('MMddhhmmss')

ctr = 1

while (ctr <= 5) {
    WebUI.waitForPageLoad(5)

    WebUI.waitForElementClickable(findTestObject('Page-All Languages/Respondents/List/OR-RE-LI-Add new respondent/button_Add new respondent'), 
        5)

    WebUI.click(findTestObject('Object Repository/Page-All Languages/Respondents/List/OR-RE-LI-Add new respondent/button_Add new respondent'))

    WebUI.callTestCase(findTestCase('Methods/Respondents/RE-LI-M001-Randomize First and Last Names'), 
        [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.waitForPageLoad(10)

	WebUI.click(findTestObject('Object Repository/Page-All Languages/Respondents/List/OR-RE-LI-Add new respondent/input_Group Membership_firstName'))
	
	WebUI.setText(findTestObject('Object Repository/Page-All Languages/Respondents/List/OR-RE-LI-Add new respondent/input_Group Membership_firstName'), 
        GlobalVariable.firstname + ' Auto Bulk ')
	
	WebUI.click(findTestObject('Object Repository/Page-All Languages/Respondents/List/OR-RE-LI-Add new respondent/input_Family name'))
	
    WebUI.setText(findTestObject('Object Repository/Page-All Languages/Respondents/List/OR-RE-LI-Add new respondent/input_Family name'), 
        GlobalVariable.lastname)

    //Get Current Timestamp for Email
    GlobalVariable.timestamp = new Date().format('MMddhhmmss')

    GlobalVariable.email = (('jjscabangon+' + GlobalVariable.timestamp) + '@gmail.com')

    WebUI.setText(findTestObject('Object Repository/Page-All Languages/Respondents/List/OR-RE-LI-Add new respondent/input_email'), 
        GlobalVariable.email)

    WebUI.click(findTestObject('Object Repository/Page-All Languages/Respondents/List/OR-RE-LI-Add new respondent/button_Save'))

    ctr = (ctr + 1)
}

WebUI.refresh()

//Search for respondents in bulk
WebUI.setText(findTestObject('Object Repository/Page-All Languages/Respondents/List/OR-RE-LI-Add new respondent/input_Search Respondent'), 
    GlobalVariable.groupTimestamp)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page-All Languages/Respondents/List/OR-RE-LI-Add new respondent/span_Loading respondents'), 
    3)

WebUI.waitForElementNotVisible(findTestObject('Object Repository/Page-All Languages/Respondents/List/OR-RE-LI-Add new respondent/span_Loading respondents'), 
    3)

WebUI.click(findTestObject('Page-All Languages/Respondents/List/OR-RE-LI-Download invites to CSV/div_Select all rows'))

