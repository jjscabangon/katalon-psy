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

WebUI.click(findTestObject('Object Repository/Page-All Languages/Respondents/List/OR-RE-LI-Import respondents without errors and duplicates/button_Import respondents'))

fileDirectory = (com.kms.katalon.core.configuration.RunConfiguration.getProjectDir() + '/Data Files/PsytechImportRespondents.csv')

println(fileDirectory)

if (WebUI.uploadFileWithDragAndDrop(findTestObject('Object Repository/Page-All Languages/Respondents/List/OR-RE-LI-Import respondents without errors and duplicates/input_File upload'), 
    fileDirectory, FailureHandling.OPTIONAL)) {
	println('')
} else {
	fileDirectory = fileDirectory.replaceAll('/','\\\\\\\\\\\\\\\\')
	println(fileDirectory)
	WebUI.uploadFile(findTestObject('Object Repository/Page-All Languages/Respondents/List/OR-RE-LI-Import respondents without errors and duplicates/input_File upload'),
		fileDirectory, FailureHandling.OPTIONAL)
}

WebUI.click(findTestObject('Page-All Languages/Respondents/List/OR-RE-LI-Import respondents without errors and duplicates/div_First line field header'))

WebUI.click(findTestObject('Page-All Languages/Respondents/List/OR-RE-LI-Import respondents without errors and duplicates/button_Next'))

WebUI.click(findTestObject('Page-All Languages/Respondents/List/OR-RE-LI-Import respondents without errors and duplicates/div_Toggle all rows'))

WebUI.click(findTestObject('Page-All Languages/Respondents/List/OR-RE-LI-Import respondents without errors and duplicates/button_Import'))

