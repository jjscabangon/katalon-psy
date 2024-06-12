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

WebUI.callTestCase(findTestCase('Settings/Ideal Profile/SE-IP-001-Navigate to Settings Ideal Profile'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Settings/Ideal Profile/OR-Manually configured ideal profile/button_Add ideal profile'))

WebUI.click(findTestObject('Object Repository/Settings/Ideal Profile/OR-Manually configured ideal profile/span_Manually select the values'))

profileName = ('Auto Manually Configured | ' + GlobalVariable.timestamp)

WebUI.setText(findTestObject('Object Repository/Settings/Ideal Profile/OR-Manually configured ideal profile/input_Ideal profile name'),
	profileName)

WebUI.click(findTestObject('Object Repository/Settings/Ideal Profile/OR-Manually configured ideal profile/button_Save'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Settings/Ideal Profile/OR-Manually configured ideal profile/div_Ideal profile type'),
	3)

//Scale Item
int scale = 1
println (scale)

while (scale<17) {
	//Randomize Rating
	int rating = (new Random().nextInt((10 - 1) + 1) + 1)
	println('ScaleNo: ' + scale + ' | RatingNo: '  + rating)
	selectedRating = "//div[contains(@class,'IdealProfileScales__ScaleItem')][" + scale + "]//span[@class='rc-slider-dot'][" + rating + "]"
	element = WebUI.modifyObjectProperty(findTestObject('Object Repository/Settings/Ideal Profile/OR-Manually configured ideal profile/div_Rating'), 'xpath', 'equals', selectedRating, false)
	println("Element : " + selectedRating)
	WebUI.click(element)
	scale = scale + 1
	println (scale)
}