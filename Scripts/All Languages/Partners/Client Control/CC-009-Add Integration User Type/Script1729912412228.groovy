import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint

GlobalVariable.override = 'Auto CI '

WebUI.callTestCase(findTestCase('All Languages/Partners/Client Control/CC-002-Add New Client'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-SearchClient/div_First result'))

WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-AddNewUser/button_Add user'))

//Step: User Details
WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-AddNewUser/OR-CC-AddNewUser-Step1/input_User type integration'))

GlobalVariable.firstname = 'Auto FName'

WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-AddNewUser/OR-CC-AddNewUser-Step1/input_First name'))

WebUI.sendKeys(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-AddNewUser/OR-CC-AddNewUser-Step1/input_First name'), 
    GlobalVariable.firstname)

GlobalVariable.lastname = 'Auto FamName'

WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-AddNewUser/OR-CC-AddNewUser-Step1/input_Family name'))

WebUI.sendKeys(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-AddNewUser/OR-CC-AddNewUser-Step1/input_Family name'), 
    GlobalVariable.lastname)

GlobalVariable.email = (('jjscabangon+int' + GlobalVariable.timestamp) + '@gmail.com')

WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-AddNewUser/OR-CC-AddNewUser-Step1/input_Email address'))

WebUI.sendKeys(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-AddNewUser/OR-CC-AddNewUser-Step1/input_Email address'), 
    GlobalVariable.email)

GlobalVariable.password = 'Test1234'

WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-AddNewUser/OR-CC-AddNewUser-Step1/input_Password'))

WebUI.sendKeys(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-AddNewUser/OR-CC-AddNewUser-Step1/input_Password'), 
    GlobalVariable.password)

GlobalVariable.pin = '1111'

WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-AddNewUser/OR-CC-AddNewUser-Step1/input_Pin'))

WebUI.sendKeys(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-AddNewUser/OR-CC-AddNewUser-Step1/input_Pin'), 
    GlobalVariable.pin)

WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-AddNewUser/OR-CC-AddNewUser-Step1/input_Receive email no'))

'Go to Assessments'
WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-AddNewUser/button_Next step'))

//Step: Assessments
//Select only the defaults
'Go to Credit Control'
WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-AddNewUser/button_Next step'))

//Step: Credit Control
WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-AddNewUser/OR-CC_AddNewUser-Step4/button_Update credits'))

amount = ('1' + new Date().format('ss'))

WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-AddNewUser/OR-CC_AddNewUser-Step4/input_Update amount'))

WebUI.sendKeys(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-AddNewUser/OR-CC_AddNewUser-Step4/input_Update amount'), 
    amount)

notes = ((('Test Credit of ' + amount) + ' for ') + GlobalVariable.email)

WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-AddNewUser/OR-CC_AddNewUser-Step4/textarea_Purchase note'))

WebUI.sendKeys(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-AddNewUser/OR-CC_AddNewUser-Step4/textarea_Purchase note'), 
    notes)

WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-AddNewUser/OR-CC_AddNewUser-Step4/button_Create user'))

savedEmail = WebUI.getText(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-AddNewUser/div_Email'))

WebUI.verifyMatch(savedEmail, GlobalVariable.email, false)

