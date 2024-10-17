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

WebUI.waitForPageLoad(5)

WebUI.waitForElementClickable(findTestObject('Page-All Languages/Respondents/List/OR-RE-LI-Add new respondent/button_Add new respondent'), 
    5)

WebUI.click(findTestObject('Object Repository/Page-All Languages/Respondents/List/OR-RE-LI-Add new respondent/button_Add new respondent'))

//Get Current Timestamp
GlobalVariable.timestamp = new Date().format('MMddhhmmss')

println(GlobalVariable.timestamp)

WebUI.callTestCase(findTestCase('Methods/Respondents/RE-LI-M001-Randomize First and Last Names'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Page-All Languages/Respondents/List/OR-RE-LI-Add new respondent/input_Group Membership_firstName'), 
    GlobalVariable.firstname + ' Auto ')

WebUI.setText(findTestObject('Object Repository/Page-All Languages/Respondents/List/OR-RE-LI-Add new respondent/input_Family name'), 
    GlobalVariable.lastname)

WebUI.click(findTestObject('Object Repository/Page-All Languages/Respondents/List/OR-RE-LI-Add new respondent/svg_Sex'))

WebUI.click(findTestObject('Object Repository/Page-All Languages/Respondents/List/OR-RE-LI-Add new respondent/div_Male'))

WebUI.setText(findTestObject('Object Repository/Page-All Languages/Respondents/List/OR-RE-LI-Add new respondent/input_title'), 'Mr.')

//Generate Email
GlobalVariable.email = (('jjscabangon+' + GlobalVariable.timestamp) + '@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page-All Languages/Respondents/List/OR-RE-LI-Add new respondent/input_email'), GlobalVariable.email)

WebUI.setText(findTestObject('Object Repository/Page-All Languages/Respondents/List/OR-RE-LI-Add new respondent/input_reference'), 
    'Automation Reference 参考 for ' + GlobalVariable.firstname)

WebUI.click(findTestObject('Object Repository/Page-All Languages/Respondents/List/OR-RE-LI-Add new respondent/div_Date of Birth'))

if (WebUI.verifyElementPresent(findTestObject('Object Repository/Page-All Languages/Respondents/List/OR-RE-LI-Add new respondent/div_S_DateSelect_Start of Month'), 
    3, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Object Repository/Page-All Languages/Respondents/List/OR-RE-LI-Add new respondent/div_S_DateSelect_Start of Month'))
}

WebUI.click(findTestObject('Object Repository/Page-All Languages/Respondents/List/OR-RE-LI-Add new respondent/div_Extra Details'))

WebUI.setText(findTestObject('Object Repository/Page-All Languages/Respondents/List/OR-RE-LI-Add new respondent/input_Group Membership_company'), 
    'Company 公司 for ' + GlobalVariable.lastname)

/* Currently failing due to dynamic element identifiers
WebUI.click(findTestObject('Object Repository/Page-All Languages/Respondents/List/OR-RE-LI-Add new respondent/div_Ethnicity'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Page-All Languages/Respondents/List/OR-RE-LI-Add new respondent/div_Ethnicity-African American'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Page-All Languages/Respondents/List/OR-RE-LI-Add new respondent/div_Education'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Page-All Languages/Respondents/List/OR-RE-LI-Add new respondent/div_Education-Secondary School'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Page-All Languages/Respondents/List/OR-RE-LI-Add new respondent/div_Job Area'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Page-All Languages/Respondents/List/OR-RE-LI-Add new respondent/div_Job Area-Chief executive'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Page-All Languages/Respondents/List/OR-RE-LI-Add new respondent/div_Sector'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Page-All Languages/Respondents/List/OR-RE-LI-Add new respondent/div_Sector-Other'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Page-All Languages/Respondents/List/OR-RE-LI-Add new respondent/div_Industry'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Page-All Languages/Respondents/List/OR-RE-LI-Add new respondent/div_Industry-Agriculture, Forestry and Fishing'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Page-All Languages/Respondents/List/OR-RE-LI-Add new respondent/div_Language'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Page-All Languages/Respondents/List/OR-RE-LI-Add new respondent/div_Language-Bengali'), FailureHandling.OPTIONAL)
*/
WebUI.click(findTestObject('Object Repository/Page-All Languages/Respondents/List/OR-RE-LI-Add new respondent/button_Save'))

WebUI.setText(findTestObject('Object Repository/Page-All Languages/Respondents/List/OR-RE-LI-Add new respondent/input_Search Respondent'), 
    GlobalVariable.email)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page-All Languages/Respondents/List/OR-RE-LI-Add new respondent/span_Loading respondents'), 
    3)

WebUI.waitForElementNotVisible(findTestObject('Object Repository/Page-All Languages/Respondents/List/OR-RE-LI-Add new respondent/span_Loading respondents'), 
    3)

println('Respondent Email: ' + GlobalVariable.email)

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('Object Repository/Page-All Languages/Respondents/List/OR-RE-LI-Administer answer sheet/div_First Checkbox'))

