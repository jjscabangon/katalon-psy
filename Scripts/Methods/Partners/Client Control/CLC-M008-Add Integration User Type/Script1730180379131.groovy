import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable

WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CLC-AddNewUser/button_Add user'))

//Step: User Details
WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CLC-AddNewUser/OR-CLC-AddNewUser-UserDetails/input_User type integration'))

GlobalVariable.firstname = 'Auto FName'

WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CLC-AddNewUser/OR-CLC-AddNewUser-UserDetails/input_First name'))

WebUI.sendKeys(findTestObject('Page-All Languages/Partners/Client Control/OR-CLC-AddNewUser/OR-CLC-AddNewUser-UserDetails/input_First name'),
	GlobalVariable.firstname)

GlobalVariable.lastname = 'Auto FamName'

WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CLC-AddNewUser/OR-CLC-AddNewUser-UserDetails/input_Family name'))

WebUI.sendKeys(findTestObject('Page-All Languages/Partners/Client Control/OR-CLC-AddNewUser/OR-CLC-AddNewUser-UserDetails/input_Family name'),
	GlobalVariable.lastname)

GlobalVariable.email = (('jjscabangon+int' + GlobalVariable.timestamp) + '@gmail.com')

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

'Go to Assessments'
WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CLC-AddNewUser/button_Next step'))

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