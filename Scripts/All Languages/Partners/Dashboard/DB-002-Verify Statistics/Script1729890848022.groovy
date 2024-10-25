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

WebUI.callTestCase(findTestCase('All Languages/Partners/Dashboard/DB-001-Navigate to Dashboard'), [:], FailureHandling.STOP_ON_FAILURE)

println('Lifetime Active Users: ' + WebUI.getText(findTestObject('Page-All Languages/Partners/Dashboard/OR-DB-VerifyStatistics/h1_Lifetime active users')))

println('Total Dormant Accounts: ' + WebUI.getText(findTestObject('Page-All Languages/Partners/Dashboard/OR-DB-VerifyStatistics/h1_Total dormant accounts')))

println('Lifetime Report Generation: ' + WebUI.getText(findTestObject('Page-All Languages/Partners/Dashboard/OR-DB-VerifyStatistics/h1_Lifetime report generation')))

println('Lifetime Credit Updates: ' + WebUI.getText(findTestObject('Page-All Languages/Partners/Dashboard/OR-DB-VerifyStatistics/h1_Lifetime credit updates')))

println('Lifetime Invitations Sent: ' + WebUI.getText(findTestObject('Page-All Languages/Partners/Dashboard/OR-DB-VerifyStatistics/h1_Lifetime invitations sent')))

println('Lifetime Respondents Assessed: ' + WebUI.getText(findTestObject('Page-All Languages/Partners/Dashboard/OR-DB-VerifyStatistics/h1_Lifetime respondents assessed')))

