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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.assessment15fq)

WebUI.waitForPageLoad(30)

if (WebUI.verifyElementVisible(findTestObject('Object Repository/OR_Complete 15FQ assessment/span_Unexpected Problem'), FailureHandling.OPTIONAL)) {
	WebUI.click(findTestObject('Object Repository/OR_Complete 15FQ assessment/button_Continue'))
} else {
	WebUI.scrollToElement(findTestObject('Object Repository/OR_Complete 15FQ assessment/b_End of Privacy Policy'), 10)
	
	WebUI.click(findTestObject('Object Repository/OR_Complete 15FQ assessment/b_End of Privacy Policy'))
	
	WebUI.click(findTestObject('Object Repository/OR_Complete 15FQ assessment/input__Accept Checkbox'))
	
	WebUI.click(findTestObject('Object Repository/OR_Complete 15FQ assessment/button_OK'))
	
	WebUI.click(findTestObject('Object Repository/OR_Complete 15FQ assessment/button_OK'))
	
	if (WebUI.verifyElementVisible(findTestObject('Object Repository/OR_Complete 15FQ assessment/label_Invitation Id'), FailureHandling.OPTIONAL)) {
		//Input Invitation Id and Respondent Id
		WebUI.setText(findTestObject('Object Repository/OR_Complete 15FQ assessment/label_Invitation Id'), GlobalVariable.invitation15fq)
	
		WebUI.setText(findTestObject('Object Repository/OR_Complete 15FQ assessment/input_Respondent Id'), GlobalVariable.respondent15fq)
	
		WebUI.click(findTestObject('Object Repository/OR_Complete 15FQ assessment/button_Continue'))
	
		WebUI.click(findTestObject('Object Repository/OR_Complete 15FQ assessment/button_Continue'))
	
		WebUI.switchToWindowIndex(1)
	
		//WebUI.navigateToUrl('https://genesys2020.genesysonline.cn/login/042010018220/3VKCAJPZ')
		WebUI.waitForPageLoad(30)
	
		WebUI.scrollToElement(findTestObject('Object Repository/OR_Complete 15FQ assessment/b_End of Privacy Policy'), 10)
	
		WebUI.click(findTestObject('Object Repository/OR_Complete 15FQ assessment/b_End of Privacy Policy'))
	
		WebUI.click(findTestObject('Object Repository/OR_Complete 15FQ assessment/input__Accept Checkbox'))
	
		WebUI.click(findTestObject('Object Repository/OR_Complete 15FQ assessment/button_OK'))
	}
	
	WebUI.click(findTestObject('Object Repository/OR_Complete 15FQ assessment/button_Continue'))
	
	WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ENTER))
	
	WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.RIGHT))
	
	WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.PAGE_DOWN))
	
	WebUI.click(findTestObject('Object Repository/OR_Complete 15FQ assessment/div_Next'))
	
	WebUI.click(findTestObject('Object Repository/OR_Complete 15FQ assessment/div_Next'))
	
	WebUI.click(findTestObject('Object Repository/OR_Complete 15FQ assessment/div_Next'))
	
	WebUI.click(findTestObject('Object Repository/OR_Complete 15FQ assessment/div_Next'))
	
	WebUI.click(findTestObject('Object Repository/OR_Complete 15FQ assessment/div_Next'))
	
	WebUI.click(findTestObject('Object Repository/OR_Complete 15FQ assessment/span_Progress'))
}

while (WebUI.verifyElementVisible(findTestObject('Object Repository/OR_Complete 15FQ assessment/span_Progress'), FailureHandling.OPTIONAL)) {
	//Randomize Answer
	randomInt = (new Random().nextInt((3 - 1) + 1) + 1)
	
	switch (randomInt) {
		case 1:
			WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.NUMPAD1))
			break
		case 2:
			WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.NUMPAD2))
			break
		default:
			WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.NUMPAD3))
			break
	}
	
	//Go to next Question
	switch (randomInt) {
		case 1:
			WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ENTER))
			break
		case 2:
			WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.RIGHT))
			break
		default:
			WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.PAGE_DOWN))
			break
	}
}




