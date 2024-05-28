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

WebUI.callTestCase(findTestCase('TC002-Add new respondent'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Object Repository/OR_Administer Assessment/div_First Checkbox'))

WebUI.click(findTestObject('Object Repository/OR_Administer Assessment/div_Administer assessment'))

WebUI.click(findTestObject('Object Repository/OR_Administer Assessment/button_Start'))

WebUI.click(findTestObject('Object Repository/OR_Administer Assessment/button_Yes'))

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Object Repository/OR_Administer Assessment/b_End of Privacy'))

WebUI.click(findTestObject('Object Repository/OR_Administer Assessment/input__Privacy Checkbox'))

WebUI.click(findTestObject('Object Repository/OR_Administer Assessment/button_Privacy Biodata Submit'))

WebUI.click(findTestObject('Object Repository/OR_Administer Assessment/button_Privacy Biodata Submit'))

WebUI.click(findTestObject('Object Repository/OR_Administer Assessment/button_Start Assessment'))

