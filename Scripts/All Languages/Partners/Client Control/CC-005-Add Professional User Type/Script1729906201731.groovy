import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint

GlobalVariable.override = 'Auto CPF '

WebUI.callTestCase(findTestCase('All Languages/Partners/Client Control/CC-002-Add New Client'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-SearchClient/div_First result'))

WebUI.callTestCase(findTestCase('Methods/Partners/Client Control/CC-M004-Add Profession User Type'), [:], FailureHandling.STOP_ON_FAILURE)

savedEmail = WebUI.getText(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-AddNewUser/div_Email'))

WebUI.verifyMatch(savedEmail, GlobalVariable.email, false)

