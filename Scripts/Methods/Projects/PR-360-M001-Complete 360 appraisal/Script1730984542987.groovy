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

WebUI.click(findTestObject('Page-All Languages/Projects/360 Appraisal/OR-PR-360-Complete 360 appraisal/OR-PR-360-Question Engine/button_Continue confirm session details'))

WebUI.switchToWindowIndex(1)

WebUI.maximizeWindow()

WebUI.scrollToElement(findTestObject('Page-All Languages/Projects/360 Appraisal/OR-PR-360-Complete 360 appraisal/OR-PR-360-Question Engine/b_End of Privacy Policy'), 
    10)

WebUI.click(findTestObject('Page-All Languages/Projects/360 Appraisal/OR-PR-360-Complete 360 appraisal/OR-PR-360-Question Engine/b_End of Privacy Policy'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page-All Languages/Projects/360 Appraisal/OR-PR-360-Complete 360 appraisal/OR-PR-360-Question Engine/input_Accept privacy policy'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page-All Languages/Projects/360 Appraisal/OR-PR-360-Complete 360 appraisal/OR-PR-360-Question Engine/button_Continue privacy policy'), 
    FailureHandling.STOP_ON_FAILURE)

'Instructions Subject'
WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ENTER))

'Instructions Controls'
WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ENTER))

'Instructions Prior Examples'
WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ENTER))

int randomInt = new Random().nextInt((7 - 1) + 1) + 1

'Select Answer for Sample Question'
WebUI.sendKeys(findTestObject(null), Keys.chord(randomInt.toString()))

'Submit Sample Question'
WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ENTER))

'Instructions Pretest'
WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ENTER))

while (WebUI.verifyElementNotPresent(findTestObject('Page-All Languages/Projects/360 Appraisal/OR-PR-360-Complete 360 appraisal/OR-PR-360-Question Engine/span_Item count'), 
    3, FailureHandling.OPTIONAL)) {
    randomInt = (new Random().nextInt((7 - 1) + 1) + 1)

    WebUI.sendKeys(findTestObject(null), Keys.chord(randomInt.toString()))

    WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ENTER))
}

randomInt = (new Random().nextInt((7 - 1) + 1) + 1)

WebUI.sendKeys(findTestObject(null), Keys.chord(randomInt.toString()))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page-All Languages/Projects/360 Appraisal/OR-PR-360-Complete 360 appraisal/OR-PR-360-Question Engine/button_Continue submit 360 appraisal'), 
    FailureHandling.STOP_ON_FAILURE)

