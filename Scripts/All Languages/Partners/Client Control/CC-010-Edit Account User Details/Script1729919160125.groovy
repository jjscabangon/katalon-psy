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

GlobalVariable.override = 'Auto EditU '

WebUI.callTestCase(findTestCase('All Languages/Partners/Client Control/CC-005-Add Professional User Type'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-AddNewUser/div_Email'))

WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-EditUserDetails/div_Edit user'))

GlobalVariable.firstname = ' Edit'

WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-AddNewUser/OR-CC-AddNewUser-UserDetails/input_First name'))

WebUI.sendKeys(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-AddNewUser/OR-CC-AddNewUser-UserDetails/input_First name'), 
    GlobalVariable.firstname)

GlobalVariable.lastname = ' Edit'

WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-AddNewUser/OR-CC-AddNewUser-UserDetails/input_Family name'))

WebUI.sendKeys(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-AddNewUser/OR-CC-AddNewUser-UserDetails/input_Family name'), 
    GlobalVariable.lastname)

'Go to Training Selection'
WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-AddNewUser/button_Next step'))

//Step: Training Selection
WebUI.callTestCase(findTestCase('Methods/Partners/Client Control/CC-M002-Randomize Qualification Type'), [:], FailureHandling.STOP_ON_FAILURE)

try {
    trainingDetails = ' EDIT'

    WebUI.scrollToElement(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-AddNewUser/OR-CC-AddNewUser-TrainingSelection/textarea_Training details'), 
        3)

    WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-AddNewUser/OR-CC-AddNewUser-TrainingSelection/textarea_Training details'))

    WebUI.sendKeys(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-AddNewUser/OR-CC-AddNewUser-TrainingSelection/textarea_Training details'), 
        trainingDetails)
}
catch (Exception e) {
    println('Limitation: Cannot interact with the Training Details field.')
} 

'Go to Assessments'
WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-AddNewUser/button_Next step'))

if (WebUI.verifyElementVisible(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-AddNewUser/OR-CC-AddNewUser-TrainingSelection/div_Qualification missing'), 
    FailureHandling.OPTIONAL)) {
    WebUI.callTestCase(findTestCase('Methods/Partners/Client Control/CC-M002-Randomize Qualification Type'), [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-AddNewUser/button_Next step'))
}

WebUI.callTestCase(findTestCase('Methods/Partners/Client Control/CC-M003-Randomize Assessments'), [:], FailureHandling.STOP_ON_FAILURE)

'Go to Credit Control'
WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-AddNewUser/button_Next step'))

WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-AddNewUser/OR-CC_AddNewUser-CreditControl/button_Update credits'))

amount = ('1' + new Date().format('ss'))

WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-AddNewUser/OR-CC_AddNewUser-CreditControl/input_Update amount'))

WebUI.sendKeys(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-AddNewUser/OR-CC_AddNewUser-CreditControl/input_Update amount'),
	amount)

notes = ((('Update Test Credit of ' + amount) + ' for ') + GlobalVariable.email)

WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-AddNewUser/OR-CC_AddNewUser-CreditControl/textarea_Purchase note'))

WebUI.sendKeys(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-AddNewUser/OR-CC_AddNewUser-CreditControl/textarea_Purchase note'),
	notes)

'Update User Details'
WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-EditUserDetails/button_Update'))

