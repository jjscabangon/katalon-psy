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

WebUI.callTestCase(findTestCase('All Languages/Partners/Client Control/CC-002-Add New Client'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-SearchClient/div_First result'))

WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-EditAccountDetails/div_Edit account'))

WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-AddNewClient/textarea_Client details'))

clientDetails = ('Updated Details for ' + GlobalVariable.partnersClientName)

WebUI.sendKeys(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-AddNewClient/textarea_Client details'), 
    Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-AddNewClient/textarea_Client details'), 
    Keys.chord(Keys.DELETE))

WebUI.sendKeys(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-AddNewClient/textarea_Client details'), 
    clientDetails)

WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-AddNewClient/textarea_Client address'))

clientAddress = ('Updated Address for ' + GlobalVariable.partnersClientName)

WebUI.sendKeys(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-AddNewClient/textarea_Client address'), 
    Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-AddNewClient/textarea_Client address'), 
    Keys.chord(Keys.DELETE))

WebUI.sendKeys(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-AddNewClient/textarea_Client address'), 
    clientAddress)

WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-EditAccountDetails/button_Update'))

WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-EditAccountDetails/button_Account details tab'))

savedDescription = WebUI.getText(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-EditAccountDetails/div_Notes'))

WebUI.verifyMatch(savedDescription, clientDetails, false)

savedAddress = WebUI.getText(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-EditAccountDetails/address_Address'))

WebUI.verifyMatch(savedAddress, clientAddress, false)

