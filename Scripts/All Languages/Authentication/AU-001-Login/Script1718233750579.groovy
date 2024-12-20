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

WebUI.openBrowser(GlobalVariable.url)

WebUI.maximizeWindow()

//Switch Lanuguage
switch (GlobalVariable.language) {
    case 'en':
        WebUI.setText(findTestObject('Object Repository/Page-All Languages/Respondents/List/OR-RE-LI-Login/input_email'), 
            GlobalVariable.loginEmail)

        WebUI.click(findTestObject('Object Repository/Page-All Languages/Respondents/List/OR-RE-LI-Login/button_Login'))

        break
    case 'sc':
        WebUI.click(findTestObject('Object Repository/Page-All Languages/Respondents/List/OR-RE-LI-Login/div_Language Selector'))

        WebUI.click(findTestObject('Object Repository/Page-All Languages/Respondents/List/OR-RE-LI-Login/div_Chinese(Simplified)'))

        WebUI.setText(findTestObject('Object Repository/Page-All Languages/Respondents/List/OR-RE-LI-Login/input_email'), 
            GlobalVariable.loginEmail)

        WebUI.click(findTestObject('Object Repository/Page-All Languages/Respondents/List/OR-RE-LI-Login/button_Login SC'))

        break
    case 'pre-prod-cn':
		WebUI.click(findTestObject('Object Repository/Page-All Languages/Respondents/List/OR-RE-LI-Login/button_Continue'))
	
		break
	case 'prod-cn':
        WebUI.click(findTestObject('Object Repository/Page-All Languages/Respondents/List/OR-RE-LI-Login/button_Continue'))

        break
    default:
        WebUI.setText(findTestObject('Object Repository/Page-All Languages/Respondents/List/OR-RE-LI-Login/input_email'), 
            GlobalVariable.loginEmail)

        WebUI.click(findTestObject('Object Repository/Page-All Languages/Respondents/List/OR-RE-LI-Login/button_Login'))

        break
}

GlobalVariable.timestamp = new Date().format('MMddhhmmss')

println(GlobalVariable.timestamp)

WebUI.setText(findTestObject('Object Repository/Page-All Languages/Respondents/List/OR-RE-LI-Login/input_password'), GlobalVariable.loginPassword)

WebUI.click(findTestObject('Object Repository/Page-All Languages/Respondents/List/OR-RE-LI-Login/button_Continue'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page-All Languages/Respondents/List/OR-RE-LI-Login/leftside_menu'), 30)

WebUI.waitForPageLoad(5)

