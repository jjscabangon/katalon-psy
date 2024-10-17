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
//Start a counter for Question and Answer logs
//Initiate a Text File for Storage
import java.io.File as File

WebUI.callTestCase(findTestCase('EN/EN-Respondents/EN-List/EN-RE-LI-001-Add new respondent'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Object Repository/Page-CN/CN-Respondents/CN-OR-Administer Assessment/div_Administer assessment'))

WebUI.click(findTestObject('Page-CN/CN-Respondents/CN-OR-Administer Assessment/div_Select language'))

WebUI.click(findTestObject('Page-All Languages/Respondents/List/OR-RE-LI-Administer assessment/div_Select English'))

WebUI.click(findTestObject('Object Repository/Page-CN/CN-Respondents/CN-OR-Administer Assessment/button_Start'))

WebUI.click(findTestObject('Object Repository/Page-CN/CN-Respondents/CN-OR-Administer Assessment/button_Yes'))

WebUI.callTestCase(findTestCase('Methods/Respondents/RE-LI-M002-Complete 15FQ'), [:], FailureHandling.STOP_ON_FAILURE)

