import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable

WebUI.navigateToUrl(GlobalVariable.bitlyLink)

WebUI.scrollToElement(findTestObject('Object Repository/Page-All Languages/Respondents/Groups/OR-GR-Administer managed group assessment/b_End of Privacy Policy'),
	10)

WebUI.click(findTestObject('Object Repository/Page-All Languages/Respondents/Groups/OR-GR-Administer managed group assessment/b_End of Privacy Policy'))

WebUI.click(findTestObject('Object Repository/Page-All Languages/Respondents/Groups/OR-GR-Administer managed group assessment/input_Accept Privacy Policy'))

WebUI.click(findTestObject('Object Repository/Page-All Languages/Respondents/Groups/OR-GR-Administer managed group assessment/button_Continue from Privacy Policy'))

WebUI.setText(findTestObject('Object Repository/Page-All Languages/Respondents/Groups/OR-GR-Administer managed group assessment/input_Email address'),
	GlobalVariable.firstEmail)

WebUI.click(findTestObject('Page-All Languages/Respondents/Groups/OR-GR-Administer managed group assessment/button_Continue'))

WebUI.click(findTestObject('Page-All Languages/Respondents/Groups/OR-GR-Administer managed group assessment/button_Continue'))