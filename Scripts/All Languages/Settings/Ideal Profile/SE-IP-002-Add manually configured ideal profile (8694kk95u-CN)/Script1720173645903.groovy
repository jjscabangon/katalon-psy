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
//Import WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement

WebUI.callTestCase(findTestCase('All Languages/Settings/Ideal Profile/SE-IP-001-Navigate to Settings Ideal Profile'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page-EN/Settings/Ideal Profile/OR-SE-IP-Add manually configured ideal profile/button_Add ideal profile'))

WebUI.click(findTestObject('Object Repository/Page-EN/Settings/Ideal Profile/OR-SE-IP-Add manually configured ideal profile/span_Manually select the values'))

profileName = ('Auto Manually Configured | ' + GlobalVariable.timestamp)

WebUI.setText(findTestObject('Object Repository/Page-EN/Settings/Ideal Profile/OR-SE-IP-Add manually configured ideal profile/input_Ideal profile name'), 
    profileName)

WebUI.click(findTestObject('Object Repository/Page-EN/Settings/Ideal Profile/OR-SE-IP-Add manually configured ideal profile/button_Save'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page-EN/Settings/Ideal Profile/OR-SE-IP-Add manually configured ideal profile/div_Manually select the values'), 
    3)

//Select Scale
scale = 1

while (scale <= 16) {
	selectedRating = ((('//div[contains(@class,\'IdealProfileScales__ScaleItem\')][') + scale) + ']')
	
	//Randomize Rating
	int rating = (new Random().nextInt((9 - 1) + 1) + 1)
	
	selectedRating = (((selectedRating + '//span[@class=\'rc-slider-dot\'][') + rating) + ']')
	
	println(selectedRating)

	WebDriver driver = DriverFactory.getWebDriver()

	elementAnswer = driver.findElement(By.xpath(selectedRating))

	elementAnswer.click()
    
    scale = (scale + 1)
}

WebUI.click(findTestObject('Object Repository/Page-EN/Settings/Ideal Profile/OR-SE-IP-Add manually configured ideal profile/button_Save Update'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page-EN/Settings/Ideal Profile/OR-SE-IP-Add manually configured ideal profile/span_Ideal profile updated'))

WebUI.click(findTestObject('Page-EN/Settings/Ideal Profile/OR-SE-IP-Add complete ideal profile/button_Back'))

WebUI.waitForElementClickable(findTestObject('Page-EN/Settings/Ideal Profile/OR-SE-IP-Add complete ideal profile/input_Search'),
	3)

WebUI.setText(findTestObject('Page-EN/Settings/Ideal Profile/OR-SE-IP-Add complete ideal profile/input_Search'), profileName)

WebUI.waitForPageLoad(5)

WebUI.waitForElementVisible(findTestObject('Page-EN/Settings/Ideal Profile/OR-SE-IP-Add complete ideal profile/td_First row'), 5)

WebUI.verifyElementText(findTestObject('Page-EN/Settings/Ideal Profile/OR-SE-IP-Add complete ideal profile/td_First row'), profileName)
