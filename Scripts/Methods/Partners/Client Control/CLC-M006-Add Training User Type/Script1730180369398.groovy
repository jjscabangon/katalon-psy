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

WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CLC-AddNewUser/button_Add user'))

//Step: User Details
WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CLC-AddNewUser/OR-CLC-AddNewUser-UserDetails/input_User type training'))

GlobalVariable.firstname = 'Auto FName'

WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CLC-AddNewUser/OR-CLC-AddNewUser-UserDetails/input_First name'))

WebUI.sendKeys(findTestObject('Page-All Languages/Partners/Client Control/OR-CLC-AddNewUser/OR-CLC-AddNewUser-UserDetails/input_First name'), 
    GlobalVariable.firstname)

GlobalVariable.lastname = 'Auto FamName'

WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CLC-AddNewUser/OR-CLC-AddNewUser-UserDetails/input_Family name'))

WebUI.sendKeys(findTestObject('Page-All Languages/Partners/Client Control/OR-CLC-AddNewUser/OR-CLC-AddNewUser-UserDetails/input_Family name'), 
    GlobalVariable.lastname)

GlobalVariable.email = (('jjscabangon+train' + GlobalVariable.timestamp) + '@gmail.com')

WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CLC-AddNewUser/OR-CLC-AddNewUser-UserDetails/input_Email address'))

WebUI.sendKeys(findTestObject('Page-All Languages/Partners/Client Control/OR-CLC-AddNewUser/OR-CLC-AddNewUser-UserDetails/input_Email address'), 
    GlobalVariable.email)

GlobalVariable.password = 'Test1234'

WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CLC-AddNewUser/OR-CLC-AddNewUser-UserDetails/input_Password'))

WebUI.sendKeys(findTestObject('Page-All Languages/Partners/Client Control/OR-CLC-AddNewUser/OR-CLC-AddNewUser-UserDetails/input_Password'), 
    GlobalVariable.password)

GlobalVariable.pin = '1111'

WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CLC-AddNewUser/OR-CLC-AddNewUser-UserDetails/input_Pin'))

WebUI.sendKeys(findTestObject('Page-All Languages/Partners/Client Control/OR-CLC-AddNewUser/OR-CLC-AddNewUser-UserDetails/input_Pin'), 
    GlobalVariable.pin)

WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CLC-AddNewUser/OR-CLC-AddNewUser-UserDetails/input_Receive email no'))

'Go to Training Selection'
WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CLC-AddNewUser/button_Next step'))

//Step: Training Selection
//Randomize the Qualification Type
WebUI.callTestCase(findTestCase('Methods/Partners/Client Control/CLC-M002-Randomize Qualification Type'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CLC-AddNewUser/OR-CLC-AddNewUser-TrainingSelection/input_Training provider name dropdown'))

WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CLC-AddNewUser/OR-CLC-AddNewUser-TrainingSelection/li_Training provider psytech'))

WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CLC-AddNewUser/OR-CLC-AddNewUser-TrainingSelection/input_Training provider year dropdown'))

WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CLC-AddNewUser/OR-CLC-AddNewUser-TrainingSelection/li_Training provider first year'))

WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CLC-AddNewUser/OR-CLC-AddNewUser-TrainingSelection/textarea_Training details'))

trainingDetails = ('Training Details for ' + GlobalVariable.email)

WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CLC-AddNewUser/OR-CLC-AddNewUser-TrainingSelection/textarea_Training details'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Page-All Languages/Partners/Client Control/OR-CLC-AddNewUser/OR-CLC-AddNewUser-TrainingSelection/textarea_Training details'), 
    trainingDetails)

'Go to Assessments'
WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CLC-AddNewUser/button_Next step'))

if (WebUI.verifyElementVisible(findTestObject('Page-All Languages/Partners/Client Control/OR-CLC-AddNewUser/OR-CLC-AddNewUser-TrainingSelection/div_Qualification missing'), 
    FailureHandling.OPTIONAL)) {
    WebUI.callTestCase(findTestCase('Methods/Partners/Client Control/CLC-M002-Randomize Qualification Type'), [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CLC-AddNewUser/button_Next step'))
}

//Step: Assessments
WebUI.callTestCase(findTestCase('Methods/Partners/Client Control/CLC-M003-Randomize Assessments'), [:], FailureHandling.STOP_ON_FAILURE)

'Go to Credit Control'
WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CLC-AddNewUser/button_Next step'))

//Step: Credit Control
WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CLC-AddNewUser/OR-CLC-AddNewUser-CreditControl/button_Update credits'))

amount = ('1' + new Date().format('ss'))

WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CLC-AddNewUser/OR-CLC-AddNewUser-CreditControl/input_Update amount'))

WebUI.sendKeys(findTestObject('Page-All Languages/Partners/Client Control/OR-CLC-AddNewUser/OR-CLC-AddNewUser-CreditControl/input_Update amount'), 
    amount)

notes = ((('Test Credit of ' + amount) + ' for ') + GlobalVariable.email)

WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CLC-AddNewUser/OR-CLC-AddNewUser-CreditControl/textarea_Purchase note'))

WebUI.sendKeys(findTestObject('Page-All Languages/Partners/Client Control/OR-CLC-AddNewUser/OR-CLC-AddNewUser-CreditControl/textarea_Purchase note'), 
    notes)

WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CLC-AddNewUser/OR-CLC-AddNewUser-CreditControl/button_Create user'))

