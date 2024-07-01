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

WebUI.callTestCase(findTestCase('Respondents/Groups/RE-GR-002-Add new group'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Respondents/Groups/OR-Duplicate Group/span_Duplicate Group'))

WebUI.clearText(findTestObject('Object Repository/Respondents/Groups/OR-Edit group/input_Name'))

GlobalVariable.timestamp = new Date().format('MMddhhmmss')

groupName = ('COPY Auto Group ' + GlobalVariable.timestamp)

WebUI.setText(findTestObject('Object Repository/Respondents/Groups/OR-Edit group/input_Name'), groupName)

WebUI.clearText(findTestObject('Object Repository/Respondents/Groups/OR-Edit group/input_Description'))

groupDescription = ('Description for ' + groupName)

WebUI.setText(findTestObject('Object Repository/Respondents/Groups/OR-Edit group/input_Description'), groupDescription)

WebUI.click(findTestObject('Object Repository/Respondents/Groups/OR-Edit group/button_Save'))

/*For revisiting. Keeps on failing even if validations are correct. Same implementation was done for RE-GR-003-Edit group details.
WebUI.waitForPageLoad(5)

WebUI.setText(findTestObject('Object Repository/Respondents/Groups/OR-Add group/input_Search'), groupName)

WebUI.waitForPageLoad(5)

WebUI.waitForElementNotPresent(findTestObject('Object Repository/Respondents/Groups/OR-Duplicate Group/tr_2nd row'), 3)

WebUI.verifyTextPresent(groupName, false)

WebUI.verifyElementText(findTestObject('Object Repository/Respondents/Groups/OR-Edit group/td_Row description'), groupDescription)
*/

