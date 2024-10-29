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

WebUI.callTestCase(findTestCase('All Languages/Partners/Dashboard/DB-001-Navigate to Dashboard'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page-All Languages/Partners/Credit Control/OR-CRC-NavigateToCreditControl/a_Credit control menu'))

WebUI.click(findTestObject('Page-All Languages/Partners/Credit Control/OR-CRC-NavigateToCreditControl/div_Credit transactions tab'))

WebUI.click(findTestObject('Page-All Languages/Partners/Credit Control/OR-CRC-TopUpCredits/div_Top up credits button'))

currentCredits = WebUI.getText(findTestObject('Page-All Languages/Partners/Credit Control/OR-CRC-TopUpCredits/p_Current credits'))

println('Current Credits: ' + currentCredits)

amount = ('1' + new Date().format('ss'))

println('Additional Credits: ' + amount)

WebUI.click(findTestObject('Page-All Languages/Partners/Credit Control/OR-CRC-TopUpCredits/input_Credit amount'))

WebUI.sendKeys(findTestObject('Page-All Languages/Partners/Credit Control/OR-CRC-TopUpCredits/input_Credit amount'), amount)

notes = (('Top Up Credit of ' + amount) + ' for ')

WebUI.click(findTestObject('Page-All Languages/Partners/Credit Control/OR-CRC-TopUpCredits/textarea_Purchase notes'))

WebUI.sendKeys(findTestObject('Page-All Languages/Partners/Credit Control/OR-CRC-TopUpCredits/textarea_Purchase notes'), 
    notes)

WebUI.click(findTestObject('Page-All Languages/Partners/Credit Control/OR-CRC-TopUpCredits/button_Submit'))

WebUI.verifyElementVisible(findTestObject('Page-All Languages/Partners/Credit Control/OR-CRC-TopUpCredits/div_Success message'))

WebUI.click(findTestObject('Page-All Languages/Partners/Credit Control/OR-CRC-TopUpCredits/div_Top up credits button'))

newCredits = (Integer.parseInt(currentCredits) + Integer.parseInt(amount))

updatedCredits = WebUI.getText(findTestObject('Page-All Languages/Partners/Credit Control/OR-CRC-TopUpCredits/p_Current credits'))

WebUI.verifyMatch(updatedCredits, newCredits.toString(), false)

