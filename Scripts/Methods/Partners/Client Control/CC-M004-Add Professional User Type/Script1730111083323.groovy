import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable

WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-AddNewUser/button_Add user'))

//Step: User Details
WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-AddNewUser/OR-CC-AddNewUser-UserDetails/input_User type professional'))

GlobalVariable.firstname = 'Auto FName'

WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-AddNewUser/OR-CC-AddNewUser-UserDetails/input_First name'))

WebUI.sendKeys(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-AddNewUser/OR-CC-AddNewUser-UserDetails/input_First name'),
	GlobalVariable.firstname)

GlobalVariable.lastname = 'Auto FamName'

WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-AddNewUser/OR-CC-AddNewUser-UserDetails/input_Family name'))

WebUI.sendKeys(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-AddNewUser/OR-CC-AddNewUser-UserDetails/input_Family name'),
	GlobalVariable.lastname)

GlobalVariable.email = (('jjscabangon+prof' + GlobalVariable.timestamp) + '@gmail.com')

WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-AddNewUser/OR-CC-AddNewUser-UserDetails/input_Email address'))

WebUI.sendKeys(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-AddNewUser/OR-CC-AddNewUser-UserDetails/input_Email address'),
	GlobalVariable.email)

GlobalVariable.password = 'Test1234'

WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-AddNewUser/OR-CC-AddNewUser-UserDetails/input_Password'))

WebUI.sendKeys(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-AddNewUser/OR-CC-AddNewUser-UserDetails/input_Password'),
	GlobalVariable.password)

GlobalVariable.pin = '1111'

WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-AddNewUser/OR-CC-AddNewUser-UserDetails/input_Pin'))

WebUI.sendKeys(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-AddNewUser/OR-CC-AddNewUser-UserDetails/input_Pin'),
	GlobalVariable.pin)

WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-AddNewUser/OR-CC-AddNewUser-UserDetails/input_Receive email no'))

'Go to Training Selection'
WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-AddNewUser/button_Next step'))

//Step: Training Selection
WebUI.callTestCase(findTestCase('Methods/Partners/Client Control/CC-M002-Randomize Qualification Type'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-AddNewUser/OR-CC-AddNewUser-TrainingSelection/input_Training provider name dropdown'))

WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-AddNewUser/OR-CC-AddNewUser-TrainingSelection/li_Training provider psytech'))

WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-AddNewUser/OR-CC-AddNewUser-TrainingSelection/input_Training provider year dropdown'))

WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-AddNewUser/OR-CC-AddNewUser-TrainingSelection/li_Training provider first year'))

trainingDetails = ('Training Details for ' + GlobalVariable.email)

WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-AddNewUser/OR-CC-AddNewUser-TrainingSelection/textarea_Training details'))

WebUI.sendKeys(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-AddNewUser/OR-CC-AddNewUser-TrainingSelection/textarea_Training details'),
	trainingDetails)

'Go to Assessments'
WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-AddNewUser/button_Next step'))

if (WebUI.verifyElementVisible(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-AddNewUser/OR-CC-AddNewUser-TrainingSelection/div_Qualification missing'),
	FailureHandling.OPTIONAL)) {
	WebUI.callTestCase(findTestCase('Methods/Partners/Client Control/CC-M002-Randomize Qualification Type'), [:], FailureHandling.STOP_ON_FAILURE)

	WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-AddNewUser/button_Next step'))
}

//Step: Assessments
WebUI.callTestCase(findTestCase('Methods/Partners/Client Control/CC-M003-Randomize Assessments'), [:], FailureHandling.STOP_ON_FAILURE)

'Go to Credit Control'
WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-AddNewUser/button_Next step'))

//Step: Credit Control
WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-AddNewUser/OR-CC_AddNewUser-CreditControl/button_Update credits'))

amount = ('1' + new Date().format('ss'))

WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-AddNewUser/OR-CC_AddNewUser-CreditControl/input_Update amount'))

WebUI.sendKeys(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-AddNewUser/OR-CC_AddNewUser-CreditControl/input_Update amount'),
	amount)

notes = ((('Test Credit of ' + amount) + ' for ') + GlobalVariable.email)

WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-AddNewUser/OR-CC_AddNewUser-CreditControl/textarea_Purchase note'))

WebUI.sendKeys(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-AddNewUser/OR-CC_AddNewUser-CreditControl/textarea_Purchase note'),
	notes)

WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-AddNewUser/OR-CC_AddNewUser-CreditControl/button_Create user'))