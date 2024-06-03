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

WebUI.callTestCase(findTestCase('TC002-Add new respondent'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('Object Repository/OR_Administer answer sheet/div_First Checkbox'))

WebUI.click(findTestObject('Object Repository/OR_Administer answer sheet/div_Administer answer sheet'))

WebUI.click(findTestObject('Object Repository/OR_Administer answer sheet/button_Next'))

//Initiate Logger
GlobalVariable.timestamp = new Date().format('MMddhhmmss')
qaLog = new File(((GlobalVariable.fileDir + '\\TC007 Log') + GlobalVariable.timestamp) + '.txt')
qaLog.append('Test Case: Administer answer sheet' + ' , ')
qaLog.append(('Respondent Email:' + GlobalVariable.email) + ' , ')

//Select Column
columnCtr = 1
while (columnCtr<=4) {
	
	//Select Row
	rowCtr = 1
	while (rowCtr<=50) {
		objAnswer = "//div[contains(@class,'AnswersStep__QuestionsColumn')][" + columnCtr + "]//div[contains(@class,'AnswersStep__QuestionItem')][" + rowCtr + "]"
		println(objAnswer)
		
		//Select Answer
		randomInt = (new Random().nextInt((3 - 1) + 1) + 1)
		objAnswer = objAnswer + "/div/div[" + randomInt + "]"
		println(objAnswer)
		WebDriver driver = DriverFactory.getWebDriver();
		elementAnswer = driver.findElement(By.xpath(objAnswer))
		elementAnswer.click()
		rowCtr = rowCtr + 1
	}
	
	//Record Answer
	qaLog.append(('Col:' + columnCtr) + ' , ' + ('Row:' + rowCtr) + ' , ' + ('Ans:' + randomInt) + ' , ' )
	
	columnCtr = columnCtr + 1
}

WebUI.closeBrowser()

