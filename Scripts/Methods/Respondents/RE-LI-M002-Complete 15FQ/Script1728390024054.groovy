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

WebUI.waitForPageLoad(10)

while (WebUI.verifyElementPresent(findTestObject('Object Repository/Page-CN/CN-Respondents/CN-OR-Administer Assessment/b_End of Privacy'),
	3, FailureHandling.OPTIONAL)) {
	WebUI.scrollToElement(findTestObject('Object Repository/Page-CN/CN-Respondents/CN-OR-Administer Assessment/b_End of Privacy'),
		0)
	
	WebUI.click(findTestObject('Object Repository/Page-CN/CN-Respondents/CN-OR-Administer Assessment/input__Privacy Checkbox'))
	
	WebUI.click(findTestObject('Page-All Languages/Respondents/List/OR-RE-LI-Administer assessment/button_Privacy continue'))
}

WebUI.click(findTestObject('Page-All Languages/Respondents/List/OR-RE-LI-Administer assessment/button_Biodata continue'))

WebUI.click(findTestObject('Page-All Languages/Respondents/List/OR-RE-LI-Administer assessment/button_Start Assessment'))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ENTER))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.RIGHT))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.PAGE_DOWN))

WebUI.click(findTestObject('Object Repository/Page-CN/CN-Respondents/CN-OR-Administer Assessment/div_Next'))

WebUI.click(findTestObject('Object Repository/Page-CN/CN-Respondents/CN-OR-Administer Assessment/div_Next'))

WebUI.click(findTestObject('Object Repository/Page-CN/CN-Respondents/CN-OR-Administer Assessment/div_Next'))

WebUI.click(findTestObject('Object Repository/Page-CN/CN-Respondents/CN-OR-Administer Assessment/div_Next'))

WebUI.click(findTestObject('Object Repository/Page-CN/CN-Respondents/CN-OR-Administer Assessment/div_Next'))

ctr = 1

String path = System.getProperty('user.dir')

println(path)

GlobalVariable.fileDir = (path + '/Data Files/QALogs/')

qaLog = new File((((GlobalVariable.fileDir + '\\TC006 Log - ') + GlobalVariable.timestamp) + ' (MMddhhmmss)') + '.txt')

//Record URL
url = WebUI.getUrl()

qaLog.append('Test Case: Administer assessment' + ',')

qaLog.append(('Assessment URL: ' + url) + ',')

while (WebUI.verifyElementVisible(findTestObject('Page-All Languages/Respondents/List/OR-RE-LI-Administer assessment/span_Progress'),
	FailureHandling.OPTIONAL)) {
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
	
	//Log Answers
	qaLog.append(((('Question' + ctr) + ':') + randomInt) + ',')

	ctr = (ctr + 1)

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

WebUI.click(findTestObject('Page-All Languages/Respondents/List/OR-RE-LI-Administer assessment/button_Submit assessment'))

try {
	WebUI.setText(findTestObject('Object Repository/Page-CN/CN-Respondents/CN-OR-Administer Assessment/input__pin'), GlobalVariable.assessmentPin)

	WebUI.click(findTestObject('Object Repository/Page-CN/CN-Respondents/CN-OR-Administer Assessment/button_Submit PIN'))

	WebUI.waitForElementVisible(findTestObject('Object Repository/Page-CN/CN-Respondents/CN-OR-Administer Assessment/a_Respondents'),
		5)
}
catch (Exception e) {
	println('PIN is not required.')
}
