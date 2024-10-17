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

WebUI.navigateToUrl(GlobalVariable.bitlyLink)

WebUI.scrollToElement(findTestObject('Object Repository/Page-All Languages/Respondents/Groups/OR-GR-Administer managed group assessment/b_End of Privacy Policy'),
	10)

WebUI.click(findTestObject('Object Repository/Page-All Languages/Respondents/Groups/OR-GR-Administer managed group assessment/b_End of Privacy Policy'))

WebUI.click(findTestObject('Object Repository/Page-All Languages/Respondents/Groups/OR-GR-Administer managed group assessment/input_Accept Privacy Policy'))

WebUI.click(findTestObject('Object Repository/Page-All Languages/Respondents/Groups/OR-GR-Administer managed group assessment/button_Continue from Privacy Policy'))

WebUI.setText(findTestObject('Object Repository/Page-All Languages/Respondents/Groups/OR-GR-Administer managed group assessment/input_Email address'),
	firstEmail)

WebUI.click(findTestObject('Page-All Languages/Respondents/Groups/OR-GR-Administer managed group assessment/button_Continue'))

WebUI.click(findTestObject('Page-All Languages/Respondents/Groups/OR-GR-Administer managed group assessment/button_Continue'))