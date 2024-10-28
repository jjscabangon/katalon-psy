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

totalCtr = 15

while (totalCtr>0) {
	int randomInt = new Random().nextInt((61 - 1) + 1) + 1
	
	GlobalVariable.element = (('(//div[span[contains(text(),"Tests")]]/following-sibling::div//span[@class="check"]/preceding-sibling::input[@type="checkbox"])[' +
	randomInt) + ']')
	
	println('Qualification to Locate #' + totalCtr + ': ' + GlobalVariable.element)
	
	try {
		WebUI.callTestCase(findTestCase('Methods/GEN-001-Click by WebElement'), [:], FailureHandling.STOP_ON_FAILURE)
		
		totalCtr = totalCtr - 1
	} catch (Exception e) {
		println('Qualification Cannot Be Located #' + totalCtr + ': ' + GlobalVariable.element)
		
		totalCtr = totalCtr - 1
	}
}



