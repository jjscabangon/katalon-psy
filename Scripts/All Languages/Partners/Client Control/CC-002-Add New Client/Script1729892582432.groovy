import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('All Languages/Partners/Client Control/CC-001-Navigate to Client Control'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.executeJavaScript('document.body.style.zoom=\'75%\'', null)

WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-AddNewClient/button_Create new client account'))

WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-AddNewClient/input_Client name'))

if (GlobalVariable.override == '') {
	GlobalVariable.partnersClientName = ('Auto Client ' + GlobalVariable.timestamp)
} else {
	GlobalVariable.partnersClientName = GlobalVariable.override + GlobalVariable.timestamp
}


WebUI.setText(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-AddNewClient/input_Client name'), GlobalVariable.partnersClientName)

WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-AddNewClient/textarea_Client details'))

clientDetails = ('Details for ' + GlobalVariable.partnersClientName)

WebUI.sendKeys(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-AddNewClient/textarea_Client details'), 
    clientDetails)

WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-AddNewClient/textarea_Client address'))

clientAddress = ('Address for ' + GlobalVariable.partnersClientName)

WebUI.sendKeys(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-AddNewClient/textarea_Client address'), 
    clientAddress)

WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-AddNewClient/button_Create account'))

WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CC-NavigateToClientControl/a_Client control menu'))

WebUI.callTestCase(findTestCase('Methods/Partners/Client Control/CC-M001-Search Client'), [:], FailureHandling.STOP_ON_FAILURE)

