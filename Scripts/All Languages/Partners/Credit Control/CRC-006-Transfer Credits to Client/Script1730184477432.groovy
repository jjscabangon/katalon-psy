import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('All Languages/Partners/Client Control/CLC-007-Add Training User Type'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('All Languages/Partners/Dashboard/DB-001-Navigate to Dashboard'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page-All Languages/Partners/Credit Control/OR-CRC-NavigateToCreditControl/a_Credit control menu'))

WebUI.click(findTestObject('Page-All Languages/Partners/Credit Control/OR-CRC-NavigateToCreditControl/div_Credit transactions tab'))

WebUI.click(findTestObject('Page-All Languages/Partners/Credit Control/OR-CRC-TransferCreditsToClient/div_Transfer credits to client button'))

WebUI.click(findTestObject('Page-All Languages/Partners/Credit Control/OR-CRC-TransferCreditsToClient/div_Select client dropdown'))

GlobalVariable.element = (('//li[contains(normalize-space(),"' + GlobalVariable.partnersClientName) + '")]')

WebUI.callTestCase(findTestCase('Methods/General/GEN-001-Click by WebElement'), [:], FailureHandling.STOP_ON_FAILURE)

additionalAmount = ('1' + new Date().format('ss'))

println('Additional Credits: ' + additionalAmount)

WebUI.click(findTestObject('Page-All Languages/Partners/Credit Control/OR-CRC-TransferCreditsToClient/input_Credit amount'))

WebUI.sendKeys(findTestObject('Page-All Languages/Partners/Credit Control/OR-CRC-TransferCreditsToClient/input_Credit amount'), 
    additionalAmount)

notes = ((('Test Transfer Credit of ' + GlobalVariable.amount) + ' for ') + GlobalVariable.partnersClientName)

WebUI.click(findTestObject('Page-All Languages/Partners/Credit Control/OR-CRC-TransferCreditsToClient/textarea_Purchase notes'))

WebUI.sendKeys(findTestObject('Page-All Languages/Partners/Credit Control/OR-CRC-TransferCreditsToClient/textarea_Purchase notes'), 
    notes)

WebUI.click(findTestObject('Page-All Languages/Partners/Credit Control/OR-CRC-TransferCreditsToClient/button_Submit'))

newCredits = (Integer.parseInt(GlobalVariable.amount) + Integer.parseInt(additionalAmount))

println('New Credits: ' + newCredits)

WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CLC-NavigateToClientControl/a_Client control menu'))

WebUI.callTestCase(findTestCase('Methods/Partners/Client Control/CLC-M001-Search Client'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page-All Languages/Partners/Client Control/OR-CLC-SearchClient/div_First result'))

updatedCredits = WebUI.getText(findTestObject('Page-All Languages/Partners/Client Control/OR-CLC-AddCreditsToUser/span_Credits'))

println('Updated Credits: ' + updatedCredits)

WebUI.verifyMatch(updatedCredits, newCredits.toString(), false)

