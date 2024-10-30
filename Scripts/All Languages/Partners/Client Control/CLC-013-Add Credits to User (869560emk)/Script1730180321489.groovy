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

WebUI.callTestCase(findTestCase('All Languages/Partners/Client Control/CLC-005-Add Professional User Type'), [:], FailureHandling.STOP_ON_FAILURE)

println('Client Name: ' + GlobalVariable.partnersClientName)

currentCredits = WebUI.getText(findTestObject('Page-All Languages/Partners/Client Control/OR-CLC-AddCreditsToUser/span_Credits'))

println('Current Credits: ' + currentCredits)

WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CLC-AddCreditsToUser/button_Add credits'))

GlobalVariable.amount = ('1' + new Date().format('ss'))

println('Additional Credits: ' + GlobalVariable.amount)

WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CLC-AddCreditsToUser/input_Credit amount'))

WebUI.sendKeys(findTestObject('Page-All Languages/Partners/Client Control/OR-CLC-AddCreditsToUser/input_Credit amount'), 
    GlobalVariable.amount)

notes = ((('Test Credit of ' + GlobalVariable.amount) + ' for ') + GlobalVariable.email)

WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CLC-AddCreditsToUser/textarea_Purchase notes'))

WebUI.sendKeys(findTestObject('Page-All Languages/Partners/Client Control/OR-CLC-AddCreditsToUser/textarea_Purchase notes'), 
    notes)

WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CLC-AddCreditsToUser/button_Submit'))

newCredits = (Integer.parseInt(currentCredits) + Integer.parseInt(GlobalVariable.amount))

println('New Credits: ' + newCredits)

WebUI.callTestCase(findTestCase('Methods/Partners/Client Control/CLC-M001-Search Client'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CLC-SearchClient/div_First result'))

updatedCredits = WebUI.getText(findTestObject('Page-All Languages/Partners/Client Control/OR-CLC-AddCreditsToUser/span_Credits'))

println('Updated Credits: ' + updatedCredits)

WebUI.verifyMatch(updatedCredits, newCredits.toString(), false)

