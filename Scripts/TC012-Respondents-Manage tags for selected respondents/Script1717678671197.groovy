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

WebUI.callTestCase(findTestCase('TC002-Respondents-Add new respondent'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Respondents/OR-Manage tags for selected respondents/span_Manage tags for selected respondent(s)'))

newTag = ('AutoTag' + GlobalVariable.timestamp)

//WebUI.click(findTestObject('Object Repository/Respondents/OR-Manage tags for selected respondents/input_Tags'))

js = 'document.querySelector("//div//input[@id="react-select-22-input"]").value = "newTag";'

WebUI.executeJavaScript(js, null)

//WebUI.setText(findTestObject('Object Repository/Respondents/OR-Manage tags for selected respondents/input_Tags'), newTag)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ENTER))

WebUI.waitForElementVisible(findTestObject('Object Repository/Respondents/OR-Manage tags for selected respondents/div_New Tag'), 
    3)

addedTag = WebUI.getText(findTestObject('Object Repository/Respondents/OR-Manage tags for selected respondents/div_New Tag'))

if (newTag == addedTag) {
    println((('newTag:' + newTag) + ' | addedTag:') + addedTag)
}

