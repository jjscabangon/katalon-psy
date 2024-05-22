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

WebUI.callTestCase(findTestCase('Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/OR_Add new respondent/button_Add new respondent'))

//Get Current Timestamp
timestamp = new Date().format('MMddhhmmss')

println(timestamp)

//
WebUI.setText(findTestObject('Object Repository/OR_Add new respondent/input_Group Membership_firstName'), '名字 (Míngzì) Auto - ' + 
    timestamp)

WebUI.setText(findTestObject('Object Repository/OR_Add new respondent/input_First Name_familyName'), '姓 (Xìng) Testing')

WebUI.click(findTestObject('Object Repository/OR_Add new respondent/svg_Sex'))

WebUI.click(findTestObject('Object Repository/OR_Add new respondent/div_Male'))

WebUI.setText(findTestObject('Object Repository/OR_Add new respondent/input_title'), 'Mr.')

//Generate Email
email = 'jjscabangon+' + timestamp + '@gmail.com'
//

WebUI.setText(findTestObject('Object Repository/OR_Add new respondent/input_email'), email)

WebUI.setText(findTestObject('Object Repository/OR_Add new respondent/input_reference'), 'Automation Reference 参考 ' + timestamp)

WebUI.click(findTestObject('Object Repository/OR_Add new respondent/div_Date of Birth'))

WebUI.click(findTestObject('Object Repository/OR_Add new respondent/div_S_DateSelect_Start of Month'))

WebUI.click(findTestObject('Object Repository/OR_Add new respondent/div_Extra Details'))

WebUI.setText(findTestObject('Object Repository/OR_Add new respondent/input_Group Membership_company'), 'Company 公司')

WebUI.click(findTestObject('Object Repository/OR_Add new respondent/div_Education'))

WebUI.click(findTestObject('Object Repository/OR_Add new respondent/div_Secondary School'))

WebUI.click(findTestObject('Object Repository/OR_Add new respondent/div_Ethnicity'))

WebUI.click(findTestObject('Object Repository/OR_Add new respondent/div_African American'))

WebUI.click(findTestObject('Object Repository/OR_Add new respondent/div_Job Area'))

WebUI.click(findTestObject('Object Repository/OR_Add new respondent/div_- Chief executive'))

WebUI.click(findTestObject('Object Repository/OR_Add new respondent/div_Sector'))

WebUI.click(findTestObject('Object Repository/OR_Add new respondent/div_Other'))

WebUI.click(findTestObject('Object Repository/OR_Add new respondent/div_Industry'))

WebUI.click(findTestObject('Object Repository/OR_Add new respondent/div_Agriculture, Forestry and Fishing'))

WebUI.click(findTestObject('Object Repository/OR_Add new respondent/div_Language'))

WebUI.click(findTestObject('Object Repository/OR_Add new respondent/div_Bengali'))

WebUI.click(findTestObject('Object Repository/OR_Add new respondent/button_Save'))

//WebUI.waitForElementVisible(findTestObject('Object Repository/OR_Add new respondent/td_email'), 10)
//
//WebUI.verifyElementText(findTestObject('Object Repository/OR_Add new respondent/td_email'), email)

WebUI.closeBrowser()

